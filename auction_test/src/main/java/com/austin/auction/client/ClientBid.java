package com.austin.auction.client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Date;
public class ClientBid {
	private String name;
	private Long freeTimeLast=new Date().getTime();
	private Socket s;
	private boolean isLogon=false;
	
	public ClientBid(){
		BufferedReader in=new BufferedReader( 
				new InputStreamReader(System.in));
		
		try {
			System.out.println("请输入服务器的IP:");
			String serverIP=in.readLine();
			System.out.println("请输入服务器端口号:");
			int serverPort=Integer.parseInt(in.readLine());
			s=new Socket(serverIP,serverPort);
			new Thread(){
				public void run (){
					while(true){
						boolean b=new Date().getTime()-freeTimeLast>=2*60*1000;
						if(b){
							System.out.println("您太长进间没有操作，系统自动关闭了！");
							System.exit(1);
						}
					}
				}
			}.start();
		} catch (Exception e) {
			System.out.println("建立连接失败，请检查网络！");
			e.printStackTrace();
			System.exit(0);
		}
		new Thread(){
			public void run(){
				BufferedReader br=null;
				try {
					br=new BufferedReader(new InputStreamReader(s.getInputStream()));
					while(true){
						String str=br.readLine();
						if(str.startsWith("%")){
							String[] action=str.split("%");
							if(action[1].equals("loginres")){
								if(action[2].endsWith("true")){
									isLogon=true;
									System.out.println("登录成功！");
								}else{
									System.out.println("登录失败！");
								}
								
							}else if(action[1].equals("exitres")){
								
								if(action[2].equals("0")){
									System.out.println("本次拍卖已结束，系统自动关闭！");
									printActionMessage("%exitreq");
									System.exit(1);
								}
							}
						}else{
						System.out.println(str+"\n");
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}.start();
		PrintStream ps=null;
		while (true) {

			try {
				if (ps == null) {
					ps = new PrintStream(s.getOutputStream());
				}
				
				
				if(!isLogon){
					
					System.out.println("请输入姓名:");
					name = in.readLine();
					System.out.println("请输入密码:");
					String pwd = in.readLine();
					ps.println( "%loginreq" +"%"+ name + "%" + pwd);
					ps.flush();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					System.out.println("请选择操作：(buy/exit)");
					String action = in.readLine();
					if (action.equals("buy")) {
						System.out.println("请输入你的出价:");
						String str = in.readLine();
						System.out.println("请输入你的数量：");
						String str0 = in.readLine();

						ps.println("%buyreq"+"%"+name + "%" + str + "%" + str0);
						resetTime();
						ps.flush();
					} else if (action.equals("exit")) {
						System.exit(0);
					}
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void resetTime(){
		freeTimeLast=new Date().getTime();
	}
	public void printActionMessage(String mes){
		try {
			PrintStream ps=new PrintStream(s.getOutputStream());
			ps.println("%exitreq");
			ps.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ClientBid();
	}

}

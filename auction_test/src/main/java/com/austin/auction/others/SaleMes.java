package com.austin.auction.others;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SaleMes {
private String username;
private Long l=100L;
private Map<Long,String> mes=new TreeMap<Long,String>();
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public void addMes(String mes){
	l=l+1;
	System.out.println("add mes:"+l+"-"+mes);
	this.mes.put(l, mes);
}
public List<String> getMes(){
	Iterator<Long> it=this.mes.keySet().iterator();
	List<String> meses=new ArrayList<String>();
	while(it.hasNext()){
		Long l=it.next();
		String str=this.mes.get(l);
		this.mes.remove(l);
		meses.add(str);
	}
	return meses;
}
}

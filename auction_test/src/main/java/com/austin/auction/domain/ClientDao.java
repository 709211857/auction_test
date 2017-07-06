package com.austin.auction.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ClientDao {
	private String serverIP;
	private String serverPort;

	public String getServerIP() {
		return serverIP;
	}

	public void setServerIP(String serverIP) {
		this.serverIP = serverIP;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setMes(Map<Long, String> mes) {
		this.mes = mes;
	}

	public String getServerPort() {
		return serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

	private String username;
	private String password;
	private Long l = 100L;
	private Map<Long, String> mes = new TreeMap<Long, String>();

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void addMes(String mes) {
		l = l + 1;
		System.out.println("add mes:" + l + "-" + mes);
		this.mes.put(l, mes);
	}

	public List<String> getMes() {
		Iterator<Long> it = this.mes.keySet().iterator();
		List<String> meses = new ArrayList<String>();
		while (it.hasNext()) {
			Long l = it.next();
			String str = this.mes.get(l);
			this.mes.remove(l);
			meses.add(str);
		}
		return meses;
	}
}

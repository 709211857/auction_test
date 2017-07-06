package com.austin.auction.domain;

import java.net.Socket;

public class BidDao {
	private Socket s;
	private Double price;
	private String name;
	private int num;

	public BidDao(Socket s, Double price, String name, int num) {
		super();
		this.s = s;
		this.price = price;
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Socket getS() {
		return s;
	}

	public void setS(Socket s) {
		this.s = s;
	}

}

package com.austin.auction.others;

import java.net.Socket;

public class SaleRecord {
private Socket s;
private Double price;
private String name;
private int num;

public SaleRecord(Socket s, Double price, String name, int num) {
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

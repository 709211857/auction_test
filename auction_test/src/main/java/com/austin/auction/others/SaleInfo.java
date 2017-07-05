package com.austin.auction.others;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class SaleInfo {
private String sName;
private int sNum;
private String sInfo;
private Calendar start;
private Calendar end;
private int sometime;
private int left;
private double realPrice;
private Set saleMes=new LinkedHashSet();
public SaleInfo(String sName,String sNum,String sInfo,String end){
	this.sName=sName;
	this.sNum=new Integer(sNum);
	this.left=new Integer(sNum);
	this.sInfo=sInfo;
	Calendar c=Calendar.getInstance();
	Calendar e=Calendar.getInstance();
	this.sometime=new Integer(end);
	e.add(Calendar.MINUTE, new Integer(end));
	Date d=new Date();
	c.setTime(d);
	this.start=c;
	this.end=e;
}
public String getSInfo() {
	return sInfo;
}
public void setSInfo(String info) {
	sInfo = info;
}
public String getSName() {
	return sName;
}
public void setSName(String name) {
	sName = name;
}
public int getSNum() {
	return sNum;
}
public void setSNum(int num) {
	sNum = num;
}
public Calendar getEnd() {
	return end;
}
public void setEnd(Calendar end) {
	this.end = end;
}
public Calendar getStart() {
	return start;
}
public void setStart(Calendar start) {
	this.start = start;
}
public int getSometime() {
	return sometime;
}
public void setSometime(int sometime) {
	this.sometime = sometime;
}
public int getLeft() {
	return left;
}
public void setLeft(int left) {
	this.left = left;
}
public Set getSaleMes() {
	return saleMes;
}
public void setSaleMes(Set saleMes) {
	this.saleMes = saleMes;
}
public double getRealPrice() {
	return realPrice;
}
public void setRealPrice(double realPrice) {
	this.realPrice = realPrice;
}
public void sale(int num){
	left=left-num;
}
}

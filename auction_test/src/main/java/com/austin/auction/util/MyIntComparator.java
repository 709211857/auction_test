package com.austin.auction.util;

import java.util.Comparator;

public class MyIntComparator implements Comparator{

	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		Double d1=(Double)arg0;
		Double d2=(Double)arg1;
		int o=0;
		if(d1>d2){
			o=-1;
		}else if(d1<d2){
			o=1;
		}
		return o;
	}

}

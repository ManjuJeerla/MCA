package com.nt.minidatabase;

import java.util.ArrayList;

public class CollectionDB {
	
	ArrayList<Object> al=new ArrayList<>();
	
	public void addAccount(AccountBean ab) {
		al.add(ab);
	}
	
	public AccountBean getAccount(long accNum,String accType) {
		AccountBean resAccBean=null,searchBean=null;
		
		searchBean.setAccNum(3256489L);
		searchBean.setAccType("savings");
		int index=al.indexOf(searchBean);
		if(index!=-1) {
			resAccBean=(AccountBean)al.get(index);
		}
		return resAccBean;
	}
}
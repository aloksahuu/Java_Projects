package com.aurionpro.Transactions.model;

import java.util.Comparator;

public class SortByAmountAndId  implements Comparator<Transaction>{

	@Override
	public int compare(Transaction t1, Transaction t2) {
		if(Double.compare(t2.getAmount(), t1.getAmount())!=0) {
			return Double.compare(t2.getAmount(), t1.getAmount());
		}
	
		return Integer.compare(t1.getId(), t2.getId());
	}
	
}

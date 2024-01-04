package com.interview.hashmap;

public class Account {
	private Integer accountNumber;
	private String holderName;
	private String accountType;

	public Account() {
		
	}
	
	public Account(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	
	public Account(Integer accountNumber, String holderName, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.accountType = accountType;
	}


	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	
	public void setAccountNumber(Integer accountNumber) {
		 this.accountNumber=accountNumber;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


//	@Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
//        return result;
//    }
	
	
	//Depends only on account number
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		return result;
	}
   
	//Compare only account numbers
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNumber != other.accountNumber)
			return false;
		return true;
	}
}

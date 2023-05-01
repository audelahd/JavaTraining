package mo05.day01;

public class Account {
	private String name;
	private String no;
	private long balance;
	
	Account(String n, String num, long z){
		name = n;
		no = num;
		balance =z;
	}
	
	String getName() {
		return name;
	}
	
	String getNo() {
		return no;
	}
	
	long getBalance() {
		return balance;
	}
	
	void deposit (long k) {
		balance += k;
	}
	
	void withdraw(long k) {
		balance -=k;
	}

}

package Cucumber.Cucumber;


public class Withdraw {
int balance;
public Withdraw(int b) {
	balance = b;
}

public void deposit(int amount) {
	balance = balance + amount;
}

public void withdraw(int amount) {
	balance = balance - amount;
}
public int getBalance() {
	return balance;
}

}

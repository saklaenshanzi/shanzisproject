package Cucumber.Cucumber;

public class Bank {
int balance;
public Bank(int b) {
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

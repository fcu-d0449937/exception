package fcu.iecs.oop;

public class Bank {

	public void deposit(Account account, int amount) throws DepositException {

		try {

			if (amount < 0) {
				throw new DepositException("The deposit amount must be great than 0 ");

			}

			int newBalance = account.getBalance() + amount;
			account.setBalance(newBalance);

		} catch (DepositException e) {
			e.printStackTrace();
		}

		System.out.println("Balance: " + account.getBalance());
	}
}

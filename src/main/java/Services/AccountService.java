package Services;

import Beans.Account;

public interface AccountService {
	public void transferMoney(long sourceAccountID, long targetAccountID, double amount);
	public void depositMOney(long accountID, double amount) throws Exception;
	public Account getAccount(long accountID);
}

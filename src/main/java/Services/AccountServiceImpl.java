package Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Beans.Account;
import Dao.AccountDao;

@Service
public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	
	@Autowired
	public void setAccountDao(AccountDao accountDao){
		this.accountDao = accountDao;
	}
	
	@Override
	public void transferMoney(long sourceAccountId, long targetAccountId, double amount) {
		Account sourceAccount = accountDao.find(sourceAccountId);
		Account targetAccount = accountDao.find(targetAccountId);
		sourceAccount.setBalance(sourceAccount.getBalance() - amount);
		targetAccount.setBalance(targetAccount.getBalance() + amount);
		accountDao.update(sourceAccount);
		accountDao.update(targetAccount);
	}

	@Override
	public void depositMOney(long accountID, double amount) throws Exception {
		Account account = accountDao.find(accountID);
		account.setBalance(account.getBalance() + amount);
		accountDao.update(account);
	}

	@Override
	public Account getAccount(long accountID) {
		return accountDao.find(accountID);
	}

}

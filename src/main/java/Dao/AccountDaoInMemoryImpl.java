package Dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import Beans.Account;
@Repository
public class AccountDaoInMemoryImpl implements AccountDao {

	private Map<Long, Account> accountsMap = new HashMap<>();
	{
		Account account1 = new Account();
		Account account2 = new Account();
		
		account1.setId(1L);
		account2.setId(2L);
		
		account1.setOwnerName("Dennis");
		account2.setOwnerName("Victor");
		
		account1.setBalance(20.0);
		account2.setBalance(30.0);
		
		accountsMap.put(account1.getId(), account1);
		accountsMap.put(account2.getId(), account2);
	}
	
	
	@Override
	public void insert(Account account) {
		accountsMap.put(account.getId(), account);
	}

	@Override
	public void update(Account account) {
		accountsMap.put(account.getId(), account);
	}

	@Override
	public void update(List<Account> accounts) {
		for(Account account:accounts) {
			update(account);
		}
	}

	@Override
	public void delete(long accountId) {
		accountsMap.remove(accountId);
	}

	@Override
	public Account find(long accountId) {
		return accountsMap.get(accountId);
	}

	@Override
	public List<Account> find(List<Long> accountIds) {
		List<Account> accounts = new ArrayList<>();
		for(Long id:accountIds) {
			accounts.add(accountsMap.get(id));
		}
		return accounts;
	}

	@Override
	public List<Account> find(String ownerName) {
		List<Account> accounts = new ArrayList<>();
		for(Account account:accountsMap.values()) {
			if(ownerName.equals(account.getOwnerName())) {
				accounts.add(account);
			}
		}
		return accounts;
	}

	@Override
	public List<Account> find(boolean locked) {
		List<Account> accounts = new ArrayList<>();
		for(Account account:accountsMap.values()) {
			if(locked == account.isLocked()) {
				accounts.add(account);
			}
		}
		return accounts;
	}

}
package Dao;

import java.util.List;

import Beans.Account;

public class AccountDaoJdbcImpl implements AccountDao {

	@Override
	public void insert(Account account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(List<Account> accounts) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(long accountId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Account find(long accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> find(List<Long> accountIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> find(String ownerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> find(boolean locked) {
		// TODO Auto-generated method stub
		return null;
	}

}

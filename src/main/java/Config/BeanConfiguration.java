package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Dao.AccountDao;
import Dao.AccountDaoInMemoryImpl;
import Services.AccountService;
import Services.AccountServiceImpl;

@Configuration
public class BeanConfiguration {

	@Bean
	public AccountService accountService(){
		AccountServiceImpl bean = new AccountServiceImpl();
		bean.setAccountDao(accountDao());
		return bean;
	}
	
	@Bean
	public AccountDao accountDao(){
		AccountDaoInMemoryImpl bean = new AccountDaoInMemoryImpl();
		return bean;
	}
}

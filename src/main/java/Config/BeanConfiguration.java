package Config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Dao.AccountDao;
import Dao.AccountDaoInMemoryImpl;
import Dao.AccountDaoJdbcImpl;
import Services.AccountService;
import Services.AccountServiceImpl;

@Configuration
public class BeanConfiguration {

	@Bean(autowire=Autowire.BY_NAME)
	public AccountService accountService(){
		AccountServiceImpl bean = new AccountServiceImpl();
		//bean.setAccountDao(accountDao()); --Removed when we set the autowire value of the annotation
		return bean;
	}
	
	@Bean
	public AccountDao accountDao(){
		AccountDaoInMemoryImpl bean = new AccountDaoInMemoryImpl();
		return bean;
	}
	
	@Bean
	public AccountDao accountDaoJdbc(){
		AccountDaoJdbcImpl bean = new AccountDaoJdbcImpl();
		return bean;
	}
}

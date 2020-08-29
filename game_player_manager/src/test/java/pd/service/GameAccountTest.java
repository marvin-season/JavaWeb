package pd.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GameAccountTest {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IGameAccountService gameAccountService = context.getBean("gameAccountService", IGameAccountService.class);
        gameAccountService.findAll();
    }
}

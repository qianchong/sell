package cn.com.free.ryan.shop.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SellApplicationTests {
    @Test
    public void contextLoads() {
        String name = "ryan";
        String password = "123456";

        log.debug("debug...");
        log.info("info...");
        log.info("name:{},password:{}", name, password);
        log.error("error...");
    }

}

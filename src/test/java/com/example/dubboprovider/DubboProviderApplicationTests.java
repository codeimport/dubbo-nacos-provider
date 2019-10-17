package com.example.dubboprovider;

import com.example.dubboprovider.service.HelloDubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboProviderApplicationTests {

    @Reference
    private HelloDubboService helloDubboService;

    @Test
    public void contextLoads() {
        System.out.println(helloDubboService.say());
    }

}

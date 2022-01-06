package com.example.dubboprovider.service;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcException;

/**
 * @description:
 * @author: chengang6
 * @create: 2019/5/10 10:38
 **/
//@Service(retries = 3,onconnect = "onconnect",ondisconnect = "ondisconnect",stub = "com.example.dubboprovider.stub.HelloDubboServiceStub")
//@Service(parameters={"key1","value1"},onconnect = "onconnect",ondisconnect = "ondisconnect")
@Service
public class HelloDubboServiceImpl implements HelloDubboService {
    @Override
    public String say() {
        System.out.println(">>>>>>>>>>>provider>>>>>>>>>>>>");
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String name = "say-provider";
        return name;
    }

    @Override
    public String hello() {
        return "hello";
    }

    @Override
    public String post(String key) {
        return "post-provider";
    }

    public void onconnect() {
        System.out.println(">>>>>>>>>>>>>>>>>>onconnect");
    }

    public void ondisconnect() {
        System.out.println(">>>>>>>>>>>>>>>>>>ondisconnect");
    }
}

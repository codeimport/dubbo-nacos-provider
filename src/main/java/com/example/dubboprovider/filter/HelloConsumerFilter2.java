package com.example.dubboprovider.filter;

import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;

/**
 * @description:
 * @author: chengang6
 * @create: 2019/5/21 11:53
 **/
//@Activate(order = 2)
public class HelloConsumerFilter2 implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation inv) throws RpcException {
        System.out.println(">>>>>>>>>>>HelloConsumerFilter2:invoke");
        return invoker.invoke(inv);
    }

    @Override
    public Result onResponse(Result result, Invoker<?> invoker, Invocation invocation) {
        System.out.println(">>>>>>>>>>>>HelloConsumerFilter2:onResponse");
        return result;
    }
}

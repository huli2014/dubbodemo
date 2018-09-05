package com.dubbo.demo;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author admin
 * @Title: DemoServiceImpl
 * @ProjectName dubbodemo
 * @Description: TODO
 * @date 2018/9/314:45
 */
@Component
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String demoPrint() {
        String hostAddress = "";
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            hostAddress = localHost.getHostAddress();
            Thread.sleep(6000L);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-----------测试");

        return hostAddress;
    }
}

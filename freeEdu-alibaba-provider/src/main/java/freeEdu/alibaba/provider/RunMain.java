package freeEdu.alibaba.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Wd
 */
@SpringBootApplication
@EnableDiscoveryClient // 开启服务发现
public class RunMain {


    public static void main(String[] args) {
        SpringApplication.run(RunMain.class, args);
    }


}

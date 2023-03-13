package freeEdu.alibaba.provider;

import com.alibaba.csp.sentinel.init.InitExecutor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Wd
 */
@SpringBootApplication
@EnableDiscoveryClient // 开启服务发现
public class RunMain {


    public static void main(String[] args) {
        SpringApplication.run(RunMain.class, args);
//        ConfigurableApplicationContext context = SpringApplication.run(RunMain.class, args);
//        System.setProperty("project.name",
//                context.getEnvironment().getProperty("spring.application.name", "freeEdu-alibaba-provider"));
//        System.setProperty("csp.sentinel.dashboard.server",
//                context.getEnvironment().getProperty("sentinel.dashboard.server", "localhost:8080"));
//        InitExecutor.doInit();
    }


}

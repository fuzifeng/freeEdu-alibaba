package freeEdu.alibaba.consumer;

import com.alibaba.csp.sentinel.init.InitExecutor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class RunMain {

    public static void main(String[] args) {

//        ConfigurableApplicationContext context = SpringApplication.run(RunMain.class, args);
//        System.setProperty("project.name",
//                context.getEnvironment().getProperty("spring.application.name", "freeEdu-alibaba-comsumer"));
//        System.setProperty("csp.sentinel.dashboard.server",
//                context.getEnvironment().getProperty("sentinel.dashboard.server", "localhost:8080"));
//        InitExecutor.doInit();
        SpringApplication.run(RunMain.class, args);
    }
}

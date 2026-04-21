package example.smallest;

import io.harness.cf.client.api.CfClient;
import io.harness.cf.client.api.Config;
import io.harness.cf.client.dto.Target;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application extends SpringBootServletInitializer {

    private static CfClient cfClient;

    public static void main(String[] args) {
        cfClient = new CfClient("YOUR_SDK_KEY");
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/")
    public String hello() {
        Target target = Target.builder()
            .identifier("user1")
            .name("User One")
            .build();

        boolean newGreeting = cfClient.boolVariation(
            "new_greeting_feature", target, false
        );

        if (newGreeting) {
            return "Hello World v2 - New Feature! 🎉";
        } else {
            return "Hello World";
        }
    }
}

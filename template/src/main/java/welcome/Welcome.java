package welcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Welcome {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Welcome to Spring Boot on OpenShift";
    }
  
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Welcome.class, args);
    }
}
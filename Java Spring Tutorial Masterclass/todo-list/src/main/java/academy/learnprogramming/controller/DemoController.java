package academy.learnprogramming.controller;

import academy.learnprogramming.config.WebAppInitializer;
import academy.learnprogramming.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService){
        this.demoService = demoService;
    }

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }


    //don't need @ResponseBody, the viewResolver will take care of rendering for us
    // localhost:8080/todo-list/welcome
    // localhost:8080/todo-list/welcome?user=Kris //queried parameter, passing data from broswer to controller
    // localhost:8080/todo-list/welcome?user=Anyname&age=23432
    @GetMapping("welcome")
    public String welcome(@RequestParam String user, @RequestParam int age, Model model){
//        model.addAttribute("user", "Kris"); //hardcode
//        model.addAttribute("helloMessage", demoService.getHelloMessage("Kris")); //using a service, but still hardcoded name
        model.addAttribute("helloMessage", demoService.getHelloMessage(user));
        model.addAttribute("age", age);

        log.info("model = {}", model);

        //prefix and suffix defined in viewResolver bean
        // /WEB-INF/view/welcome.jsp
        return "welcome"; //returns the logical view name aka the jsp file name
    }

    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("welcomeMessage() called");

//        return "Welcome to this Demo application using @ModelAttribute annotation for the welcomeMessage() method";
        return demoService.getWelcomeMessage();
    }
}

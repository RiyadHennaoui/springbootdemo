package fr.afpa.springboot.demo.springbootdemo.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello(){

        return "Hello World! Time on server is " + LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){

        return "Run Run Run";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){

        return "12400000000000 €";
    }


    @GetMapping("/test")
    public String getTest(){

        return "test";
    }


    @GetMapping("/test2")
    public String getTest2(){

        return "test2";
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

}

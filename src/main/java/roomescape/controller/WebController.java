package roomescape.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/")
    public String Home (){
        return "/home";
    }

    @GetMapping("/reservation")
    public String reservation(){
        return "/new-reservation";
    }

    @GetMapping("/time")
    public String time(){
        return "/time";
    }
}

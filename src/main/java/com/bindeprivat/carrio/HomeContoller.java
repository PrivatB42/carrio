package com.bindeprivat.carrio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static com.bindeprivat.carrio.utils.Constants.APP_ROOT;
import static com.bindeprivat.carrio.utils.Constants.USER_ROOT;

@Controller
public class HomeContoller {

    @GetMapping("/")
    public String home(){
        return "redirect:/"+APP_ROOT;
    }

    @GetMapping(APP_ROOT)
    public String trhome(){
        return "admin/index";
    }

    @GetMapping(USER_ROOT)
    public String userhome(){
        return "user/index";
    }




}

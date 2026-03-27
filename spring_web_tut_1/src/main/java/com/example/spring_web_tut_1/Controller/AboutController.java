package com.example.spring_web_tut_1.Controller;

import com.example.spring_web_tut_1.Model.About;
import com.example.spring_web_tut_1.Services.AboutServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class AboutController {
    @Autowired
    AboutServices aboutservices;

    @RequestMapping("/about")
   public List<About> getAbout(){
       return aboutservices.getAbout();
   }
}

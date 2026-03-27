package com.example.spring_web_tut_1.Services;

import com.example.spring_web_tut_1.Model.About;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AboutServices {

    List<About> about = Arrays.asList(
            new About("Ayaan", 2004),
            new About("Abrar",2005)
    );

    public List<About> getAbout(){
        return about;
    }
}

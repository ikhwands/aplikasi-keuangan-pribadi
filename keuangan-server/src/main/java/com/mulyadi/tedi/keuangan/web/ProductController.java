package com.mulyadi.tedi.keuangan.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    
    @RequestMapping("/hallo")
    public String hallo(){
        return "hallo dunia";
    }
    
}

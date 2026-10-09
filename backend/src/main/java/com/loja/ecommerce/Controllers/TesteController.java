package com.loja.ecommerce.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/teste")//end point
    public String teste() {
        return "API funcionando!";
    }
}
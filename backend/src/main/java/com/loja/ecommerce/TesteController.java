package com.loja.ecommerce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/teste")//end point
    public String teste() {
        return "API funcionando!";
    }
}
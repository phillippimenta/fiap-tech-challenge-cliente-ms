package br.com.fiap.postech.techchallenge.phillippimentafood.cliente.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes")
public class ClienteRestController {

    @GetMapping
    public String hello() {
        return "Hello World";
    }
}

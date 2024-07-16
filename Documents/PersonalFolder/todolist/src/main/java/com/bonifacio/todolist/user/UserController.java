package com.bonifacio.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/")
    public void create(@RequestBody UserModal UserModal) {
        System.out.println(UserModal.getUsername());
        System.out.println(UserModal.getName());
        System.out.println(UserModal.getPassword());
        
    }

    //String
    //Integer
    //Double - numeros com casas decimais
    //Float - numeros com casas decimais - menos preciso que o Double
    //char - caracter
    //Date - data
    //void - nao tem retorno do metodo 
    
}

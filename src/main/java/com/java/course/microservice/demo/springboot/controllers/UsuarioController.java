package com.java.course.microservice.demo.springboot.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.course.microservice.demo.springboot.models.Usuarios;



@Controller
public class UsuarioController {


    @GetMapping("/vistaUsuarios_nuevo")
    public String listarUsers(ModelMap model) {
        model.addAttribute("title", "Usuarios becados:");
        return "vistaUsuarios_nuevo";
    }

    @ModelAttribute("listaUsuarios_nuevo")
    public List<Usuarios> ModelList(){
        return Arrays.asList(
            new Usuarios ("Juanito", "Perez", "juan123@gmail.com"),
            new Usuarios ("Pepe", "Olvera", "pepeO@gmail.com")

        );
    }
    

}

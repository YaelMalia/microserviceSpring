package com.java.course.microservice.demo.springboot.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.course.microservice.demo.springboot.models.Usuarios;

@RestController
@RequestMapping("/api")
public class UsuariosRestController {

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

    @GetMapping(path="/dataUsers_nuevo")
    
    public Map<String, Object> returnData(){
        Usuarios usuarioRest = new Usuarios("Uri Yael", "Covarrubias Cruz", "yaelcruz417@gmail.com");
        Usuarios usuarioRest2 = new Usuarios("Pepe", "Aguilar", "pepe@gmail.com");
        
        Map<String, Object> body = new HashMap<>();
        
        body.put("title", "Usuarios becados: ");
        body.put("usuario1",  usuarioRest);
        body.put("usuario2",  usuarioRest2);
        return body;
    }
}

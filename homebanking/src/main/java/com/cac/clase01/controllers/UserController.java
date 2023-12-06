package com.cac.clase01.controllers;

import com.cac.clase01.models.dtos.UserDTO;
import com.cac.clase01.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 @RestController: Esta anotación indica al framework que esta clase es un Controller, encargado de procesar las request y devolver una response
 Recibira peticiones en formato JSON, nos va a permitir trabajar con HTTP, las respuestas de estado, etc.

 @RequestMapping: se utiliza para asignar solicitudes web a clases de controlador específicas y/o métodos de
 controlador.
 Cuando @RequestMapping se usa en el nivel de clase, crea un URI base para el que se usará el controlador.

 @GetMapping: Esta anotación se utiliza para asignar solicitudes HTTP GET a métodos de controlador específicos.
 @GetMapping es una anotación compuesta que actúa como un acceso directo para @RequestMapping (method = RequestMethod.GET).
*/
@RestController
@RequestMapping("/api")
public class UserController {

    //Generar una instancia del Service(UserService) -> Inyectar una dependencia mediante Spring Boot
    @Autowired
    private UserService service;




    //Definir la url de origen para cada solicitud
    //Para cada metodo HTTP permitido debemos realizar una acción
    //Definir el DTO y el Service (Inyección de Dependencia)

    //TODO: Refactorizar el método para que retorne un Response entity
    @GetMapping(value = "/users")
    public List<String> getUsers(){
        List<String> lista = service.getUsers();
        return lista;
        //llamar al servicio de usuarios para obtener la lista desde la base de datos
//        return List.of("flor", "sole", "jose");
    }
    @GetMapping(value = "/users/{id}") //Para indicar al framework q quiero ESTE {id} utilizamos la notación @PathVariable
    public void getUserById( @PathVariable Long id ){} //Para obtener el valor de lo que haya escrito el usuario en la URL y guardarlo
    //y me lo guardo en esta variable(parametro del metodo)

    @PostMapping(value ="/users")
    public void createUser( @RequestBody UserDTO user ){ //Obtiene el body de la request y lo convierte en un userDTO

    }

    public void updateAllUser(){}

    public void updateUser(){}

    public void deleteUser(){}


}


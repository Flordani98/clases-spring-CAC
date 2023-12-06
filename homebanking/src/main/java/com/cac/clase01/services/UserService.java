package com.cac.clase01.services;

import com.cac.clase01.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*Indicamos que esta clase es un servicio*/
@Service
public class UserService {

    //inyectar una instancia del Repositorio
    @Autowired
    private UserRepository repository;

    //Metodos
    public List<String> getUsers(){
        List<String> nombres = List.of("Cristian", "luis", "pepe");
        return nombres;
    }

}

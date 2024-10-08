package com.apirest.desafio.controlador;

import com.apirest.desafio.Entidade.Usuario;
import com.apirest.desafio.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping(value = "/tarefas")
public class Controller {


    @Autowired
    private Service service;

    @PostMapping
    @ResponseBody
    public Usuario criar(@RequestBody Usuario usuario){
         return service.criar(usuario);
    }

    @PutMapping ("/{usuarioId}")
    @ResponseBody
    public Usuario atualizar(@PathVariable("usuarioId") Long usuarioId,
                             @RequestBody Usuario usuario){
        return service.atualizar(usuario, usuarioId);
    }

    @GetMapping
    @ResponseBody
    public List<Usuario> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/{usuarioId}")
    @ResponseBody
    public String deletar (@PathVariable("usuarioId") Long usuarioId){
        return service.deletar(usuarioId);
    }

}

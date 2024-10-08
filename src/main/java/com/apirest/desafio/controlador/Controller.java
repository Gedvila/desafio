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

//    @PostMapping
//    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario){
//        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(usuario));
//    }
//
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity<Void> delete(@PathVariable Long id){
//        service.delete(id);
//        return ResponseEntity.noContent().build();
//    }
//
//    @GetMapping(value = "/{id}")
//    public ResponseEntity<Usuario> getId(@PathVariable Long id){
//        return ResponseEntity.ok().body(service.getById(id));
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Usuario>> getAll(){
//        return ResponseEntity.ok().body(service.getAll());
//    }
//
//    @PutMapping(value = "/{id}")
//    public  ResponseEntity<Usuario> update(@PathVariable Long id,@RequestBody Usuario usuario){
//        usuario.setId(id);
//        return ResponseEntity.ok().body(service.update(usuario));
//    }
}

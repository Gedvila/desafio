package com.apirest.desafio.api;

import com.apirest.desafio.dto.Usuario;
import com.apirest.desafio.facade.TarefasFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/tarefas", produces = MediaType.APPLICATION_JSON_VALUE)
public class ServicoApi {

    @Autowired
    private TarefasFacade tarefasFacade;

//    @PostMapping
//    @ResponseBody
//    public Usuario criar(@RequestBody Usuario usuario){
//         return tarefasFacade.criar(usuario);
//    }
//
//    @PutMapping ("/{usuarioId}")
//    @ResponseBody
//    public Usuario atualizar(@PathVariable("usuarioId") Long usuarioId,
//                             @RequestBody Usuario usuario){
//        return tarefasFacade.atualizar(usuario, usuarioId);
//    }
//
//    @GetMapping
//    @ResponseBody
//    public List<Usuario> getAll(){
//        return tarefasFacade.getAll();
//    }
//
//    @DeleteMapping("/{usuarioId}")
//    @ResponseBody
//    public String deletar (@PathVariable("usuarioId") Long usuarioId){
//        return tarefasFacade.deletar(usuarioId);
//    }

}

package com.apirest.desafio.service;

import com.apirest.desafio.Entidade.Usuario;
import com.apirest.desafio.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private UsuarioRepository repository;

    private static final Map<   Long, Usuario> registros = new HashMap<>();

    public Usuario criar(Usuario usuario){
        long proximoId = registros.size() + 1;
        usuario.setId(proximoId);
        registros.put(proximoId,usuario);
        return usuario;
    }

    public Usuario atualizar(Usuario usuario, Long usuarioId){
        registros.put(usuarioId, usuario);
        return usuario;
    }

    public Usuario getById (Long usuarioId){
        return  registros.get(usuarioId);
    }

    public List<Usuario> getAll(){
        return new ArrayList<>(registros.values());
    }

    public String deletar (Long usuarioId){
        registros.remove(usuarioId);
        return "Deletado";
    }


}

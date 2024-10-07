package com.apirest.desafio.facade;

import com.apirest.desafio.dto.Usuario;
import com.apirest.desafio.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TarefasFacade {

    @Autowired
    private UsuarioRepository repository;

//    private static final Map<   Long, Usuario> registros = new HashMap<>();
//
//    public Usuario criar(Usuario usuario){
//        long proximoId = registros.size() + 1;
//        usuario.setId(proximoId);
//        registros.put(proximoId,usuario);
//        return usuario;
//    }
//
//    public Usuario atualizar(Usuario usuario, Long usuarioId){
//        registros.put(usuarioId, usuario);
//        return usuario;
//    }
//
//    public Usuario getById (Long usuarioId){
//        return  registros.get(usuarioId);
//    }
//
//    public List<Usuario> getAll(){
//        return new ArrayList<>(registros.values());
//    }
//
//    public String deletar (Long usuarioId){
//        registros.remove(usuarioId);
//        return "Deletado";
//    }

    public void create(Usuario usuario){
        repository.save(usuario);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Usuario getById(Long id){
        Optional<Usuario> usuario =  repository.findById(id);
        return usuario.get();
    }

    public List<Usuario> getAll(){
        return repository.findAll();
    }

    public Usuario update(Usuario usuario){
        Optional<Usuario> newObj = repository.findById(usuario.getId());
        updateUsuario(newObj, usuario);
        return repository.save(newObj.get());

    }

    private void updateUsuario(Optional<Usuario> newObj, Usuario usuario) {
        newObj.get().setNome(usuario.getNome());
    }

}

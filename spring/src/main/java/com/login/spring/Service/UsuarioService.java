package com.login.spring.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository){
        super();
        this.repository = repository;
    }

    //Métodos
    public Usuario cadastrar(Usuario usuario){
        return repository.save(usuario);
    }

    public Usuario buscarPorEmail(String email){
        return repository.findByEmail(email).orElse(null);
    }
    
}

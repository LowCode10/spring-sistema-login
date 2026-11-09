package com.login.spring.Repository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findbyEmail(String email);
}

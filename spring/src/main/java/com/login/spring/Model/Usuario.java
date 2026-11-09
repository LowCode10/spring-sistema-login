package com.login.spring.Model;

@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GeneratedType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String senha;

    public Usuario(){

    };
}

package com.login.spring.Controller;

public class CadastroController {

    private final UsuarioService service;
    public CadastroController(UsuarioService service) {
        super();
        this.service = service;
    }

    @GetMapping("/cadastro")
    public String cadastro(){
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String cadastrar(@ModelAttribute Usuario usuario){
        service.cadastrar(usuario);
        return "redirect:/login";
    }
}

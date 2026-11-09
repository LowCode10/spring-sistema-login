package com.login.spring.Controller;

@Controller
public class LoginController {
    private final UsuarioService service;

    public LoginController(UsuarioService service){
        super();
        this.service = service;
    }

    @GetMapping("/")
    public String inicio(){
        return "login";
    }

    @PostMapping("/login")
    public String entrar(@RequestParam String email, @RequestParam String senha, Model model){
        Usuario usuario = service.buscarPorEmail(email);
        if(usuario != null && usuario.getSenha().equals(senha)){
            model.addAttribute("usuario", usuario);
            return "home";
        }
        model.addAttribute("erro", "E-mail ou senha inválidos");
        return "login";
    }
}

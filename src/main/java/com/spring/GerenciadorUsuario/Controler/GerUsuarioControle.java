package com.spring.GerenciadorUsuario.Controler;


import com.spring.GerenciadorUsuario.Model.Usuario;
import com.spring.GerenciadorUsuario.Service.GerUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
public class GerUsuarioControle {

    @Autowired
    GerUsuarioService gerUsuarioService;

    @RequestMapping(value = "/newUsuario", method = RequestMethod.GET)
    public String getUsuarioForm() {
        return "usuariosForm";
    }

    @RequestMapping(value = "/newUsuario", method = RequestMethod.POST)
    public String saveUsuarios(@Validated Usuario usuario, BindingResult result, RedirectAttributes attributes) {
        if(result.hasErrors()) {
            return "redirect:/newUsuario";
        }
        usuario.setData(LocalDate.now());
        gerUsuarioService.save(usuario);
        return "redirect:/usuarios";
    }

}

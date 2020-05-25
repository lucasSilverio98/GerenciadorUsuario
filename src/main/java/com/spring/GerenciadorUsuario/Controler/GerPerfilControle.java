package com.spring.GerenciadorUsuario.Controler;

import com.spring.GerenciadorUsuario.Model.Perfil;
import com.spring.GerenciadorUsuario.Service.GerPerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class GerPerfilControle {

    @Autowired
    GerPerfilService gerPerfilService;

    public ModelAndView getPerfil() {
        ModelAndView mv = new ModelAndView("perfil");
        List<Perfil> listaPerfil = gerPerfilService.findAll();
        mv.addObject("perfis", listaPerfil);
        return mv;
    }

    @RequestMapping(value = "/newPerfil", method = RequestMethod.GET)
    public String getPerfilForm() {
        return "perfilForm";
    }

    @RequestMapping(value = "newPerfil", method = RequestMethod.POST)
    public String savePerfil(@Validated Perfil perfil, BindingResult result, RedirectAttributes attributes)  {
        if(result.hasErrors()) {
            return "redirect:/newPerfil";
        }
        gerPerfilService.save(perfil);
        return "redirect:/perfil";
    }

}

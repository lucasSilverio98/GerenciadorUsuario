package com.spring.GerenciadorUsuario.Controler;

import com.spring.GerenciadorUsuario.Model.Cargo;
import com.spring.GerenciadorUsuario.Service.GerCargoService;
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
public class GerCargoControle {

    @Autowired
    GerCargoService gerCargoService;

    @RequestMapping(value = "/cargos", method = RequestMethod.GET)
    public ModelAndView getCargo() {
        ModelAndView mv = new ModelAndView("cargos");
        List<Cargo> listaCargos = gerCargoService.findAll();
        mv.addObject("cargos", listaCargos);
        return mv;
    }

    @RequestMapping(value = "/newCargo", method = RequestMethod.GET)
    public String getCargoForm() {
        return "cargosForm";
    }

    @RequestMapping(value = "/newCargo", method = RequestMethod.POST)
    public String saveCargos(@Validated Cargo cargo, BindingResult result, RedirectAttributes attributes) {
        if(result.hasErrors()) {
            return "redirect:/newCargo";
        }
        gerCargoService.save(cargo);
        return "redirect:/cargos";
    }
}

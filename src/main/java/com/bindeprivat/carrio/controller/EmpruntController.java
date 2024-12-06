package com.bindeprivat.carrio.controller;

import com.bindeprivat.carrio.controller.Interface.EmpruntInterface;
import com.bindeprivat.carrio.entity.Emprunt;
import com.bindeprivat.carrio.service.EmpruntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class EmpruntController implements EmpruntInterface {

    @Autowired
    private EmpruntService service;

    @Override
    public String DemandeEnpruntList(Model model) {
        List<Emprunt> list = service.AllEmpruntDM();
        model.addAttribute("demandeEnpruntList", list);
        return "admin/demande_emprunt";
    }

    @Override
    public String DemandeEnpruntValid(Model model) {
        List<Emprunt> list = service.AllEmpruntValid();
        model.addAttribute("demandeEnpruntValid", list);
        return "admin/emprunt_valid";
    }
}

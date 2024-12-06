package com.bindeprivat.carrio.controller;

import com.bindeprivat.carrio.controller.Interface.FiliereInterface;
import com.bindeprivat.carrio.entity.Filiere;
import com.bindeprivat.carrio.service.FiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

import static com.bindeprivat.carrio.utils.Constants.FILIERE_ENDPOINT;

@Controller
public class FiliereContoller implements FiliereInterface {

    @Autowired
    private FiliereService service;

    @Override
    public String ListFiliere(Model model) {
        List<Filiere> list_filiere = service.AllFiliere();
        model.addAttribute("filiere", new Filiere());
        model.addAttribute("listfifiere", list_filiere);
        return "admin/gestion_filiere";
    }

    @Override
    public String SaveFiliere(Filiere filiere, RedirectAttributes ra) {
        service.SaveFiliere(filiere);
        return "redirect:/"+FILIERE_ENDPOINT;
    }

    @Override
    public String DeleteFiliere(int id) {
        service.DeleteFiliere(id);
        return "redirect:/"+FILIERE_ENDPOINT;
    }
}

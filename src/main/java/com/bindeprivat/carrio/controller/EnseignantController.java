package com.bindeprivat.carrio.controller;


import com.bindeprivat.carrio.controller.Interface.EnseignantInterface;
import com.bindeprivat.carrio.entity.Enseignant;
import com.bindeprivat.carrio.service.EnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

import static com.bindeprivat.carrio.utils.Constants.CREATE_ENSEIGNANTS_ENDPOINT;

@Controller
public class EnseignantController implements EnseignantInterface {

    @Autowired
    private EnseignantService service;

    @Override
    public String ListEnseignant(Model model) {
        List<Enseignant> list_Enseignant = service.AllEnseignant();
        model.addAttribute("listEnseignant", list_Enseignant);
        return "admin/listeenseignant";
    }

    @Override
    public String CreateEnseignant(Model model) {
        model.addAttribute("Enseignant", new Enseignant());
        return "admin/creer_enseignant";
    }

    @Override
    public String SaveEnseignant(Enseignant enseignant, RedirectAttributes ra) {

        if (enseignant != null) {
            service.SaveEnseignant(enseignant);
            ra.addFlashAttribute("success", "Enseignant enregistrée avec succes");
        }else{
            ra.addFlashAttribute("error", "l'enseignant n'as pas pu etre enregistré");
        }
        return"redirect:/" + CREATE_ENSEIGNANTS_ENDPOINT;
    }

    @Override
    public String DeleteEnseignant(int id) {
        service.DeleteEnseignant(id);
        return"redirect:/" + CREATE_ENSEIGNANTS_ENDPOINT;
    }

}

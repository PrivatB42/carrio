package com.bindeprivat.carrio.controller;


import com.bindeprivat.carrio.controller.Interface.EtudiantInterface;
import com.bindeprivat.carrio.entity.Etudiant;
import com.bindeprivat.carrio.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

import static com.bindeprivat.carrio.utils.Constants.CREATE_ETUDIANTS_ENDPOINT;

@Controller
public class EtudiantController implements EtudiantInterface {

    @Autowired
    private EtudiantService service;

    @Override
    public String ListEtudiant(Model model) {
        List<Etudiant> list_Etudiant = service.AllEtudiant();
        model.addAttribute("listEtudiant", list_Etudiant);
        return "admin/listeetudiant";
    }


    @Override
    public String CreateEtudiant(Model model) {
        model.addAttribute("etudiant", new Etudiant());
        return "admin/creer_etudiant";
    }

    @Override
    public String SaveEtudiant(Etudiant etudiant, RedirectAttributes ra) {

        if (etudiant != null) {
            service.SaveEtudiant(etudiant);
            ra.addFlashAttribute("success", "Etudiant enregistrée avec succes");
        }else{
            ra.addFlashAttribute("error", "l'etudiant n'as pas pu etre enregistre");
        }

        return"redirect:/" + CREATE_ETUDIANTS_ENDPOINT;
    }

    @Override
    public void DeleteEtudiant(int id) {
        service.DeleteEtudiant(id);
    }


}

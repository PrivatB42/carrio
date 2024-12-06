package com.bindeprivat.carrio.controller;

import com.bindeprivat.carrio.controller.Interface.InscriptionInterface;
import com.bindeprivat.carrio.entity.Filiere;
import com.bindeprivat.carrio.entity.Etudiant;
import com.bindeprivat.carrio.entity.Inscription;
import com.bindeprivat.carrio.service.FiliereService;
import com.bindeprivat.carrio.service.EtudiantService;
import com.bindeprivat.carrio.service.InscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

import static com.bindeprivat.carrio.utils.Constants.INSCRIPTION_ENDPOINT;

@Controller
public class InscriptionController implements InscriptionInterface {

    @Autowired
    private InscriptionService inscriptionService;
    @Autowired
    private EtudiantService etudiantService;
    @Autowired
    private FiliereService filiereService;

    @Override
    public String Inscription(Model model) {
        List<Inscription> List_Isncription = inscriptionService.AllInscription();
        List<Etudiant> list_etudiant = etudiantService.AllEtudiant();
        List<Filiere> list_filiere = filiereService.AllFiliere();

        model.addAttribute("inscription", new Inscription());
        model.addAttribute("listInscription", List_Isncription);
        model.addAttribute("listFiliere", list_filiere);
        model.addAttribute("listEtudiant", list_etudiant);
        return "admin/inscription";
    }

    @Override
    public String SaveInscription(Inscription inscription) {
        inscriptionService.SaveInscription(inscription);
        return "redirect:/" + INSCRIPTION_ENDPOINT;
    }

    @Override
    public void DeleteInscription(int id) {
        inscriptionService.DeleteInscription(id);
    }

}

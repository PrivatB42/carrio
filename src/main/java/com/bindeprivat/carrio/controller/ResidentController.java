package com.bindeprivat.carrio.controller;

import com.bindeprivat.carrio.controller.Interface.ResidentInterface;
import com.bindeprivat.carrio.entity.*;
import com.bindeprivat.carrio.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

import static com.bindeprivat.carrio.utils.Constants.RESIDENT_ENDPOINT;

@Controller
public class ResidentController implements ResidentInterface {

    @Autowired
    private ResidentService service;
    @Autowired
    private LogementService serviceLogement;
    @Autowired
    private EtudiantService serviceetu;

    @Override
    public String ListResident(Model model) {

        List<Resident> residentList = service.AllResident();
        List<Logement> logementList = serviceLogement.AllLogement();
        List<Etudiant> etudiants = serviceetu.AllEtudiant();

        model.addAttribute("logementlist", logementList);
        model.addAttribute("etudiantlist", etudiants);
        model.addAttribute("residentList", residentList);
        model.addAttribute("resident", new Resident());
        return "admin/attribution_chambre";
    }

    @Override
    public String SaveResident(Resident logement, RedirectAttributes ra) {
        service.SaveResident(logement);
        return "redirect:/"+RESIDENT_ENDPOINT;
    }

    @Override
    public String DeleteResident(int id) {
        service.DeleteResident(id);
        return "redirect:/"+RESIDENT_ENDPOINT;
    }
}

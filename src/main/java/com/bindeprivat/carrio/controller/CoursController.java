package com.bindeprivat.carrio.controller;

import com.bindeprivat.carrio.controller.Interface.CoursInterface;
import com.bindeprivat.carrio.entity.Cours;
import com.bindeprivat.carrio.service.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

import static com.bindeprivat.carrio.utils.Constants.COURS_ENDPOINT;

@Controller
public class CoursController implements CoursInterface {

    @Autowired
    private CoursService service;

    @Override
    public String ListCours(Model model) {
        List<Cours> cours = service.AllCours();
        model.addAttribute("cours", new Cours());
        model.addAttribute("listcours", cours);
        return "admin/gestion_cours";
    }

    @Override
    public String SaveCours(Cours cours, RedirectAttributes ra) {
        service.SaveCours(cours);
        return "redirect:/" + COURS_ENDPOINT;
    }

    @Override
    public String DeleteCours(int id) {
        return "redirect:/" + COURS_ENDPOINT;
    }
}

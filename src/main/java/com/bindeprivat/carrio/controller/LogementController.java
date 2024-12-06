package com.bindeprivat.carrio.controller;

import com.bindeprivat.carrio.controller.Interface.LogementInterface;
import com.bindeprivat.carrio.entity.Logement;
import com.bindeprivat.carrio.service.LogementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

import static com.bindeprivat.carrio.utils.Constants.LOGEMENT_ENDPOINT;

@Controller
public class LogementController implements LogementInterface {

    @Autowired
    private LogementService service;

    @Override
    public String Logement(Model model) {
        List<Logement> logs = service.AllLogement();
        model.addAttribute("logement", new Logement());
        model.addAttribute("alllogments", logs);
        return "admin/logement";
    }

    @Override
    public String ListeLogement(Model model) {
        List<Logement> logs = service.AllLogement();
        model.addAttribute("logement", new Logement());
        model.addAttribute("alllogments", logs);
        return "admin/listelogement";
    }

    @Override
    public String SaveLogement(Logement logement, RedirectAttributes ra) {
        service.SaveLogement(logement);
        return "redirect:/" + LOGEMENT_ENDPOINT;
    }

    @Override
    public String DeleteLogement(int id) {
        service.DeleteLogement(id);
        return "redirect:/" + LOGEMENT_ENDPOINT;
    }
}

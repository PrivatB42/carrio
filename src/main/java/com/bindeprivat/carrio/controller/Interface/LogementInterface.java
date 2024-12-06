package com.bindeprivat.carrio.controller.Interface;

import com.bindeprivat.carrio.entity.Logement;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import static com.bindeprivat.carrio.utils.Constants.*;

public interface LogementInterface {

    @GetMapping(LOGEMENT_ENDPOINT)
    String Logement(Model model);
    @GetMapping(LOGEMENT_LISTE_ENDPOINT)
    String ListeLogement(Model model);
    @PostMapping(SAVE_LOGEMENT_ENDPOINT)
    String SaveLogement(Logement logement, RedirectAttributes ra);
    @PostMapping(DELETE_LOGEMENT_ENDPOINT)
    String DeleteLogement(@PathVariable int id);
    
}

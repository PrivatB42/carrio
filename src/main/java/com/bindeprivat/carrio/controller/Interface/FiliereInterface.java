package com.bindeprivat.carrio.controller.Interface;

import com.bindeprivat.carrio.entity.Filiere;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import static com.bindeprivat.carrio.utils.Constants.*;
import static com.bindeprivat.carrio.utils.Constants.DELETE_ETUDIANTS_ENDPOINT;

public interface FiliereInterface {

    @GetMapping(FILIERE_ENDPOINT)
    String ListFiliere(Model model);
    @PostMapping(SAVE_FILIERE_ENDPOINT)
    String SaveFiliere(Filiere filiere, RedirectAttributes ra);
    @PostMapping(DELETE_FILIERE_ENDPOINT)
    String DeleteFiliere(@PathVariable int id);
    
}

package com.bindeprivat.carrio.controller.Interface;

import com.bindeprivat.carrio.entity.Cours;
import com.bindeprivat.carrio.entity.Etudiant;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import static com.bindeprivat.carrio.utils.Constants.*;
import static com.bindeprivat.carrio.utils.Constants.DELETE_ETUDIANTS_ENDPOINT;

public interface CoursInterface {

    @GetMapping(COURS_ENDPOINT)
    String ListCours(Model model);
    @PostMapping(SAVE_COURS_ENDPOINT)
    String SaveCours(Cours cours, RedirectAttributes ra);
    @PostMapping(DELETE_COURS_ENDPOINT)
    String DeleteCours(@PathVariable int id);

}

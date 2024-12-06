package com.bindeprivat.carrio.controller.Interface;

import com.bindeprivat.carrio.entity.Etudiant;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import static com.bindeprivat.carrio.utils.Constants.*;

public interface EtudiantInterface {

    @GetMapping(LISTE_ETUDIANTS_ENDPOINT)
    String ListEtudiant(Model model);
    @GetMapping(CREATE_ETUDIANTS_ENDPOINT)
    String CreateEtudiant(Model model);
    @PostMapping(SAVE_ETUDIANTS_ENDPOINT)
    String SaveEtudiant(Etudiant etudiant, RedirectAttributes ra);
    @PostMapping(DELETE_ETUDIANTS_ENDPOINT)
    void DeleteEtudiant(@PathVariable int id);



}

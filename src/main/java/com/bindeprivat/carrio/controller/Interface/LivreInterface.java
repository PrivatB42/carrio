package com.bindeprivat.carrio.controller.Interface;

import com.bindeprivat.carrio.entity.Categorie;
import com.bindeprivat.carrio.entity.Exemplaire;
import com.bindeprivat.carrio.entity.Inscription;
import com.bindeprivat.carrio.entity.Livre;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import static com.bindeprivat.carrio.utils.Constants.*;

public interface LivreInterface {

    @GetMapping(LIVRE_ENDPOINT)
    String Livre(Model model);
    @PostMapping(SAVE_LIVRE_ENDPOINT)
    String SaveLivre(Livre livre);
    @GetMapping(DELETE_LIVRE_ENDPOINT)
    String DeleteLivre(@PathVariable int id);


    @GetMapping(EXEMPLAIRE_ENDPOINT)
    String Exemplaire(Model model);
    @PostMapping(SAVE_EXEMPLAIRE_ENDPOINT)
    String SaveExemplaire(Exemplaire exemplaire);
    @GetMapping(DELETE_EXEMPLAIRE_ENDPOINT)
    String DeleteExemplaire(@PathVariable int id);


    @GetMapping(CATEGORIE_ENDPOINT)
    String Categorie(Model model);
    @PostMapping(SAVE_CATEGORIE_ENDPOINT)
    String SaveCategorie(Categorie categorie);
    @GetMapping(DELETE_CATEGORIE_ENDPOINT)
    String DeleteCategorie(@PathVariable int id);

}

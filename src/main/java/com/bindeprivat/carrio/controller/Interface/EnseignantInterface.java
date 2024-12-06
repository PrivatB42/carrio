package com.bindeprivat.carrio.controller.Interface;

import com.bindeprivat.carrio.entity.Enseignant;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import static com.bindeprivat.carrio.utils.Constants.*;

public interface EnseignantInterface {

    @GetMapping(LISTE_ENSEIGNANTS_ENDPOINT)
    String ListEnseignant(Model model);
    @GetMapping(CREATE_ENSEIGNANTS_ENDPOINT)
    String CreateEnseignant(Model model);
    @PostMapping(SAVE_ENSEIGNANTS_ENDPOINT)
    String SaveEnseignant(Enseignant Enseignant, RedirectAttributes ra);
    @PostMapping(DELETE_ENSEIGNANTS_ENDPOINT)
    String DeleteEnseignant(@PathVariable int id);
   


}

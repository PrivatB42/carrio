package com.bindeprivat.carrio.controller.Interface;

import com.bindeprivat.carrio.entity.Inscription;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import static com.bindeprivat.carrio.utils.Constants.*;

public interface InscriptionInterface {

    @GetMapping(INSCRIPTION_ENDPOINT)
    String Inscription(Model model);
    @PostMapping(SAVE_INSCRIPTION_ENDPOINT)
    String SaveInscription(Inscription inscription);
    @GetMapping(DELETE_INSCRIPTION_ENDPOINT)
    void DeleteInscription(@PathVariable int id);

}

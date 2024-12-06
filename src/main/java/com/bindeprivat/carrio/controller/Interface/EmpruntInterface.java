package com.bindeprivat.carrio.controller.Interface;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static com.bindeprivat.carrio.utils.Constants.DEMANDE_EMPRUNT_ENDPOINT;
import static com.bindeprivat.carrio.utils.Constants.LIVRE_EMPRUNT_ENDPOINT;

public interface EmpruntInterface {

    @GetMapping(DEMANDE_EMPRUNT_ENDPOINT)
    String DemandeEnpruntList(Model model);
    @GetMapping(LIVRE_EMPRUNT_ENDPOINT)
    String DemandeEnpruntValid(Model model);

}

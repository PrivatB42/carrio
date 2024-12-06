package com.bindeprivat.carrio.controller;

import com.bindeprivat.carrio.controller.Interface.LivreInterface;
import com.bindeprivat.carrio.entity.Categorie;
import com.bindeprivat.carrio.entity.Exemplaire;
import com.bindeprivat.carrio.entity.Livre;
import com.bindeprivat.carrio.service.CategorieService;
import com.bindeprivat.carrio.service.ExemplaireService;
import com.bindeprivat.carrio.service.LivreService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

import static com.bindeprivat.carrio.utils.Constants.*;

@Controller
public class LivreController implements LivreInterface {


    private final LivreService livreService;
    private final CategorieService categorieService;
    private final ExemplaireService exemplaireService;

    public LivreController(LivreService livreService, CategorieService categorieService, ExemplaireService exemplaireService) {
        this.livreService = livreService;
        this.categorieService = categorieService;
        this.exemplaireService = exemplaireService;
    }


    @Override
    public String Livre(Model model) {
        List<Livre> livrelist = livreService.AllLivre();
        List<Categorie> categorieList = categorieService.AllCategorie();
        List<Exemplaire> exemplairelist = exemplaireService.AllExemplaire();

        model.addAttribute("livre", new Livre());
        model.addAttribute("listlivre", livrelist);
        model.addAttribute("listcategorie", categorieList);
        model.addAttribute("listexemplaire", exemplairelist);

        return "admin/gestion_biblio";
    }

    @Override
    public String SaveLivre(Livre livre) {
        livreService.SaveLivre(livre);
        return "redirect:/"+LIVRE_ENDPOINT;
    }

    @Override
    public String DeleteLivre(int id) {
        livreService.DeleteLivre(id);
        return "redirect:/"+LIVRE_ENDPOINT;
    }



    @Override
    public String Exemplaire(Model model) {
        List<Exemplaire> exemplaireList = exemplaireService.AllExemplaire();
        List<Livre> listlivre = livreService.AllLivre();

        model.addAttribute("exemplaire",new Exemplaire());
        model.addAttribute("list_exemplaire", exemplaireList);
        model.addAttribute("listlivre", listlivre);

        return "admin/gestion_exemplaire";
    }

    @Override
    public String SaveExemplaire(Exemplaire exemplaire) {
        exemplaireService.SaveExemplaire(exemplaire);
        return "redirect:/"+EXEMPLAIRE_ENDPOINT;
    }

    @Override
    public String DeleteExemplaire(int id) {
        exemplaireService.DeleteExemplaire(id);
        return "redirect:/"+EXEMPLAIRE_ENDPOINT;
    }

    @Override
    public String Categorie(Model model) {
        List<Categorie> listcategorie = categorieService.AllCategorie();

        model.addAttribute("categorie", new Categorie());
        model.addAttribute("categorielist", listcategorie);
        return "admin/gestion_categorie";
    }

    @Override
    public String SaveCategorie(Categorie categorie) {
        categorieService.SaveCategorie(categorie);
        return "redirect:/"+CATEGORIE_ENDPOINT ;
    }

    @Override
    public String DeleteCategorie(int id) {
        categorieService.DeleteCategorie(id);
        return "redirect:/"+CATEGORIE_ENDPOINT;
    }
}

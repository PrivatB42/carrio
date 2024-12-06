package com.bindeprivat.carrio.controller.Interface;

import com.bindeprivat.carrio.entity.Resident;
import com.bindeprivat.carrio.utils.Constants;
import org.apache.tomcat.util.bcel.classfile.Constant;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import static com.bindeprivat.carrio.utils.Constants.*;

public interface ResidentInterface {

    @GetMapping(RESIDENT_ENDPOINT)
    String ListResident(Model model);
    @PostMapping(SAVE_RESIDENT_ENDPOINT)
    String SaveResident(Resident logement, RedirectAttributes ra);
    @PostMapping(DELETE_RESIDENT_ENDPOINT)
    String DeleteResident(@PathVariable int id);
    
}

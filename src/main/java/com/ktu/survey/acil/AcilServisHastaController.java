package com.ktu.survey.acil;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ktu.survey.models.AcilServisHastaAnketi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.json.JSONException;

@RestController
@RequestMapping("/ktu/survey/acil")
public class AcilServisHastaController {
    
    @Autowired
    private AcilServisHastaService acilServisHastaService;

    @PostMapping
    @ResponseBody
    private String setAcilAnket(@RequestBody AcilServisHastaAnketi acilServisHastaAnketi) throws JSONException{

        return acilServisHastaService.setAcilAnket(acilServisHastaAnketi).toString();
    }

}

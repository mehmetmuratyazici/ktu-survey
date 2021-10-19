package com.ktu.survey.acil;

import com.ktu.survey.models.AcilServisHastaAnketi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import org.json.JSONObject;

import org.json.JSONException;

@Service
public class AcilServisHastaService {

    @Autowired 
    private AcilServisHastaRepository acilServisRepository;

    public JSONObject setAcilAnket(AcilServisHastaAnketi acilServisHastaAnketi) throws JSONException {
        System.out.println(acilServisHastaAnketi.toString());
        Optional<AcilServisHastaAnketi> resultQuery = acilServisRepository.findAcilServisHastaAnketiById(acilServisHastaAnketi.getId());

        if(resultQuery.isPresent()){
            throw new IllegalStateException("This person answered the current survey");
        }

        JSONObject result = new JSONObject();
        
        result.put("success",true);
        try {
            acilServisRepository.save(acilServisHastaAnketi);
        }catch(Exception e){
            result.put("success",false);
        }

        return result;
    }
    


}

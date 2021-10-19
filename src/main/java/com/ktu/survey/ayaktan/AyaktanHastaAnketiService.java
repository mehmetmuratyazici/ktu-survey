package com.ktu.survey.ayaktan;

import com.ktu.survey.models.AyaktanHastaAnketi;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AyaktanHastaAnketiService {

    private final AyaktanHastaAnketiRepository ayaktanHastaAnketiRepository;

    @Autowired
    public AyaktanHastaAnketiService(AyaktanHastaAnketiRepository ayaktanHastaAnketiRepository) {
        this.ayaktanHastaAnketiRepository = ayaktanHastaAnketiRepository;
    }

    public List<AyaktanHastaAnketi> getAnketList() {
        return ayaktanHastaAnketiRepository.findAll();
    }

    public JSONObject setAnket(AyaktanHastaAnketi ayaktanHastaAnketi) {

        //Burada jwt parse edilip kişi tekil numarasıyla anket cevabnın varlığı kontrol edilecek şekilde revize edilecek
        /*
               i will type here code
        */
        System.out.println(ayaktanHastaAnketi.toString());
        Optional<AyaktanHastaAnketi> opt = ayaktanHastaAnketiRepository.findAyaktanHastaAnketiById(ayaktanHastaAnketi.getId());
        if(opt.isPresent()){
            throw new IllegalStateException("This person answered the current survey");
        }

        JSONObject result = new JSONObject();

        try {
            result.put("success", true);
            ayaktanHastaAnketiRepository.save(ayaktanHastaAnketi);
        }catch(JSONException e){

            try {
                result.put("success", false);
                result.put("message", e.getMessage());
            } catch (JSONException jsonException) {
                jsonException.printStackTrace();
            }
        }


        return result;
    }

}

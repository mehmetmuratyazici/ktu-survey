package com.ktu.survey.yatan;

import com.ktu.survey.models.AyaktanHastaAnketi;
import com.ktu.survey.models.YatanHastaAnketi;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class YatanHastaAnketiService {
    @Autowired
    private YatanHastaAnketiRepostory yatanHastaAnketiRepostory;

    public List<YatanHastaAnketi> getYatanHastaAnketler() {
        return yatanHastaAnketiRepostory.findAll();
    }

    public JSONObject setYatanlar(YatanHastaAnketi yatanHastaAnketi) {

        //Burada jwt parse edilip kişi tekil numarasıyla anket cevabnın varlığı kontrol edilecek şekilde revize edilecek
        /*
               i will type here code
        */
        System.out.println(yatanHastaAnketi.toString());
        Optional<YatanHastaAnketi> opt = yatanHastaAnketiRepostory.findYatanHastaAnketiById(yatanHastaAnketi.getId());
        if(opt.isPresent()){
            throw new IllegalStateException("This person answered the current survey");
        }

        JSONObject result = new JSONObject();

        try {
            result.put("success", true);
            yatanHastaAnketiRepostory.save(yatanHastaAnketi);
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

package com.ktu.survey.ayaktan;


import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ktu.survey.models.AyaktanHastaAnketi;
import java.util.List;

@RestController
@RequestMapping(path = "/ktu/survey/ayaktan")
public class AyaktanHastaAnketiController {

    private final AyaktanHastaAnketiService ayaktanHastaAnketiService;

    @Autowired
    public AyaktanHastaAnketiController(AyaktanHastaAnketiService ayaktanHastaAnketiService) {
        this.ayaktanHastaAnketiService = ayaktanHastaAnketiService;
    }

    /*
        Kişisel kontrol amaçlı eklenen bir method genel amaç için kullanılmayacak
    */
    @RequestMapping(path="/getAnketList.ajax" , method = RequestMethod.GET , produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<AyaktanHastaAnketi>> getAnketList(){
        return ResponseEntity.ok(ayaktanHastaAnketiService.getAnketList());
    }

    @RequestMapping(path="/setAnket.ajax" , method = RequestMethod.POST , produces = "application/json")
    @ResponseBody
    public String setAnket(@RequestBody AyaktanHastaAnketi ayaktanHastaAnketi){

        return ayaktanHastaAnketiService.setAnket(ayaktanHastaAnketi).toString();
    }

}

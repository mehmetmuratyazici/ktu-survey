package com.ktu.survey.yatan;

import com.ktu.survey.models.YatanHastaAnketi;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/ktu/survey/yatan")
public class YatanHastaAnketiController {

    @Autowired
    private YatanHastaAnketiService yatanHastaAnketiService;

    @RequestMapping(path = "getYatanlar.ajax", method = RequestMethod.GET, produces = "application/json")
    public List<YatanHastaAnketi> getYatanHastaAnketler(){
        return yatanHastaAnketiService.getYatanHastaAnketler();
    }

    @RequestMapping(path = "setYatanlar.ajax", method = RequestMethod.POST, produces = "application/json")
    public String setYatanlar(@RequestBody YatanHastaAnketi yatanHastaAnketi){
        return yatanHastaAnketiService.setYatanlar(yatanHastaAnketi).toString();
    }

}

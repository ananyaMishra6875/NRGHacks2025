package nrghacks2025;

import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ananya,joy,emily,claire
 */

public class Survey {
    public HashMap<String, Integer> muscles = new HashMap<String, Integer>();
    public Survey(){
        muscles.put("leftArm", 0);
        muscles.put("rightArm",0);
        muscles.put("leftLeg",0);
        muscles.put("rightLeg",0);
        muscles.put("back",0);
        muscles.put("abdominal",0);
        muscles.put("chest",0);
    }
    
    public void updatePainLevel(String key){
        int painLevel = muscles.get(key);
        painLevel++;
        muscles.replace(key, painLevel);
    }
}
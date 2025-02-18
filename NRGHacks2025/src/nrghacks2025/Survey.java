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
    public String[] abs = {"0abs","1abs","2abs","3abs","4abs","5abs"};
    public String[] larm = {"0larm","1larm","2larm","3larm","4larm","5larm"};
    public String[] rarm = {"0rarm","1rarm","2rarm","3rarm","4rarm","5rarm"};
    public String[] lleg = {"0lleg","1lleg","2lleg","3lleg","4lleg","5lleg"};
    public String[] rleg = {"0rleg", "1rleg", "2rleg", "3rleg", "4rleg", "5rleg"};
    public String[] back = {"0back","1back","2back","3back","4back","5back"};
    public String[] chest = {"0chest","1chest","2chest","3chest","4chest","5chest"};
    
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
package com.example.jenniferliu.inclassassignment07_zhijingl;

import java.io.Serializable;

/**
 * Created by jenniferliu on 2018/4/1.
 */

public class Animal implements Serializable {
    private String animalName;
    private String kind;
    private int legs;
    private boolean hasFur;

    public Animal(String animalName, String kind, int legs, boolean hasFur){
        this.animalName = animalName;
        this.kind = kind;
        this.legs = legs;
        this.hasFur = hasFur;
    }

    public String getAnimalName(){return animalName;}
    public void setAnimalName(String animalName){this.animalName = animalName;}

    public String getKind(){return kind;}
    public void setKind(String kind){this.kind = kind;}

    public int getLegs(){return legs;}
    public void setLegs(){this.legs = legs;}

    public boolean isHasFur(){return hasFur;}
    public void setHasFur(boolean hasFur){this.hasFur = hasFur;}

}

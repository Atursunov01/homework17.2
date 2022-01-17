package com.company;

import java.awt.*;

public class Farm  {
   private String address;
   private   int cows;
   private int  hors;
    private int  sheep;
   private String OwnerName;

    public Farm (String address,int cows, int hors, int sheep, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.hors = hors;
        this.sheep = sheep;
        this.OwnerName = ownerName;

    }
    public Farm () {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    public int getHors() {
        return hors;
    }

    public void setHors(int hors) {
        this.hors = hors;
    }

    public int getSheep() {
        return sheep;
    }

    public void setSheep(int sheep) {
        this.sheep = sheep;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;


    }

    @Override
    public String toString() {
        return getAddress() + "," + getSheep() + "," + getHors() + "," + getCows() + "," + getOwnerName()  ;
    }


}



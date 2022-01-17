package com.company;

public abstract class Anymal  {
    private int weight;
    private int age;
    private String gender;
    private String niceName;


    public Anymal(int weight, int age, String gender, String niceName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.niceName = niceName;

    }

    public Anymal(int weight, int age, String gender) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }

    public Anymal(String gender, String niceName) {
        this.gender = gender;
        this.niceName = niceName;
    }

    public Anymal (int age) {
        this.age = age;

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNiceName() {
        return niceName;
    }

    public void setNiceName(String niceName) {
        this.niceName = niceName;
    }

    @Override
    public String toString() {
        return getWeight() + "," + getAge() +"," + getGender() + "," + getNiceName();
    }
}


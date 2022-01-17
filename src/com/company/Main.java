package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {


        Cow cow1 = new Cow(150,4,"m","Gabriel");
        Cow cow2 = new Cow(150,4,"m","Gabriel");
        Cow cow3 = new Cow(150,4,"m","Gabriel");
        Cow cow4 = new Cow(150,4,"m","Gabriel");
        Cow cow5 = new Cow(150,4,"m","Gabriel");
        Cow cow6 = new Cow(150,4,"m","Gabriel");

        Sheep sheep1 = new Sheep(30,2,"j","алакой");
        Sheep sheep2 = new Sheep(30,2,"j","алакой");
        Sheep sheep3 = new Sheep(30,2,"j","алакой");
        Sheep sheep4 = new Sheep(30,2,"j","алакой");

        Horse horse1 = new Horse(200,3, "black" , "m","Mustang");
        Horse horse2 = new Horse(200,3,"black" , "m","Mustang");
        Horse horse3 = new Horse(200,3,"black" , "m","Mustang");

        Farm farm4 = new Farm("снежная 14",6,3,4,"AKZHOL");

        Anymal anymal = new Sheep(14);

       Sheep[] sheep = {sheep1, sheep2,sheep3};
        Cow [] cows = {cow1,cow2,cow3,cow4,cow5};
        Horse [] horses = {horse1,horse2};
        Sheep[] sheep0 = {sheep4};
        Cow [] cow0 = {cow6};
        Horse [] horse0 = {horse3};


        Farm[] farm = new Farm []{ farm4};
        String [] farm1 = new String[] {Arrays.toString(sheep) + "," + Arrays.toString(cows) + "," + Arrays.toString(horses)};
       String [] farm2 = new String[] {Arrays.toString(sheep0) + "," + Arrays.toString(cow0) + "," + Arrays.toString(horse0)};


        for (Farm s:farm ) {
            System.out.println( "farm: " + s);
        }

        for (String a:farm1) {
                System.out.println( "farm1: " + a);
            }

        for (String b:farm2) {
            System.out.println("farm2: " + b);
        }
    }
        }


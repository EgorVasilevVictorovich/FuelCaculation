package com.example.myapplication;

public class Algorithm {
    private static final int earth = (int) 980665;
    private static final int mars = (int)  372100;

    public Algorithm (){



    }
    public static float calculation1(){
        return mars;


    }
    public static float calculation2(){
        return earth;


    }
    public static float calculation(){
    return (calculation1/calculation2)*100;


    }
    public static float fuelCalculation(String input){
        if (input.contains(",")){
            String inputMod = input.replace(",",".");
            float inputFloat = Float.parseFloat(inputMod);
            return(inputFloat * calculation());
        }else{
            float inputFloat = Float.parseFloat(input);
            return(inputFloat * calculation());

        }
    }

}

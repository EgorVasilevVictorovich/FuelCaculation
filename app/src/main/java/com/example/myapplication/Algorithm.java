package com.example.myapplication;

public class Algorithm {
    private static final long earth = (long) 9.80665;
    private static final long mars = (long) 3.721;

    public Algorithm (){



    }
    public static float calculation(){
    return ((mars*100)/earth);


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

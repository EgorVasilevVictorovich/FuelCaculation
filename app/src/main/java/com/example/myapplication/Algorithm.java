package com.example.myapplication;

public class Algorithm {
    private static final float earth = (float) 9.80665;//или 9,8
    private static final float mars =  (float) 3.72100;// или 3,7

    public Algorithm (){



    }
    public static float calculation(){
    return (mars/earth)*100;


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

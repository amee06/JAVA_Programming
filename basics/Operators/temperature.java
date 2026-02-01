package Operator;


public class temperature {
    

       
        double F;
        double C;
        double K;

    
    //Fahrenheit to Celsius and Kelvin
    public double f_toCelsius(double F){
        
        return (F - 32) * 5/9;
        
    }

    public double f_toKelvin(double F){
       
        return (F - 32) * 5/9 + 273.15;
    }

    public double c_fahrenheit(double C){
        return (C*9/5) + 32;
    }

    public double c_kelvin(double C){
        return C + 273.15;
    }

    public double k_celsius(double K){
        return K - 273.15;
    }

    public double k_fahrenheit(double K){
        return (K - 273.15) * 9/5 + 32;
    }
}


class disply {

    public static void main(String[] args){

        System.out.println("Fahrenheit to Celsius and Kelvin");
        
        temperature t = new temperature();
        System.out.println(("Fahrenheit to Celsius = " + t.f_toCelsius(40.2) ));
        System.out.println(("Fahrenheit to Kelvin = " + t.f_toKelvin(40.2) ));

        System.out.println(("\nCelsius to Fahrenheit = " + t.c_fahrenheit(40.2) ));
        System.out.println(("Celsius to Kelvin = " + t.c_kelvin(40.2) ));
        
        System.out.println(("\nKelvin to Celsius = " + t.k_celsius(40.2) ));
        System.out.println(("Kelvin to Fahrenheit = " + t.k_fahrenheit(40.2) ));

    }

}
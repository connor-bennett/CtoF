package com.example.ctof;

public class Util {
    static double cToF(double celsius){
        double fahrenheit = 0.0;
        fahrenheit = (celsius * (9.0)/(5.0)) + 32;
        return fahrenheit;
    }

    static double fToC(double fahrenheit){
        double celsius = 0.0;
        celsius = (fahrenheit-32) * (5.0/9.0);
        return celsius;
    }
}

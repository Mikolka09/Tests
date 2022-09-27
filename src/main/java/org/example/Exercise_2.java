package org.example;

public class Exercise_2 {

    double kurz;

    public String changeUSD(double grn) {
        this.kurz = 36.94;
        return String.format("%.2f", grn / this.kurz);
    }

    public String changeEUR(double grn) {
        this.kurz = 35.44;
        return String.format("%.2f", grn / this.kurz);
    }

    public String changeGBR(double grn) {
        this.kurz = 39.60;
        return String.format("%.2f", grn / this.kurz);
    }

    public String changeYER(double grn) {
        this.kurz = 0.15;
        return String.format("%.2f", grn / this.kurz);
    }

}

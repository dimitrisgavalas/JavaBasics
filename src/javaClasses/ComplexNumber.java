package javaClasses;
//exercise
public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber comp){
        this.real = this.real + comp.getReal();
        this.imaginary = this.imaginary + comp.getImaginary();
    }

    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber comp2){
        this.real = this.real - comp2.getReal();
        this.imaginary = this.imaginary - comp2.getImaginary();
    }
}

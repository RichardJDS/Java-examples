package org.richard.tema4ClasesObjetos;

public class SmartDevice {
    protected int size;
    protected String display;
    protected String input;
    protected String batery;

    protected String brand;

    public SmartDevice() {
    }

    public SmartDevice(int size, String display, String input, String batery, String brand) {
        this.size = size;
        this.display = display;
        this.input = input;
        this.batery = batery;
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getBatery() {
        return batery;
    }

    public void setBatery(String batery) {
        this.batery = batery;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "size=" + size +
                ", display='" + display + '\'' +
                ", input='" + input + '\'' +
                ", batery='" + batery + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}

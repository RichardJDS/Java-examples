package org.richard.tema4ClasesObjetos;

public class SmartPhone extends SmartDevice{
    private String programs;
    private String telephoneLine;

    public SmartPhone() {
    }

    public SmartPhone(String programs, String telephoneLine) {
        this.programs = programs;
        this.telephoneLine = telephoneLine;
    }

    public SmartPhone(int size, String display, String input, String batery, String brand) {
        super(size, display, input, batery, brand);
    }

    public String getPrograms() {
        return programs;
    }

    public void setPrograms(String programs) {
        this.programs = programs;
    }

    public String getTelephoneLine() {
        return telephoneLine;
    }

    public void setTelephoneLine(String telephoneLine) {
        this.telephoneLine = telephoneLine;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "programs='" + programs + '\'' +
                ", telephoneLine='" + telephoneLine + '\'' +
                ", size=" + size +
                ", display='" + display + '\'' +
                ", input='" + input + '\'' +
                ", batery='" + batery + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}

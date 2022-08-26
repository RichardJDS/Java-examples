package org.richard.tema4ClasesObjetos;

public class PruebasConObjetos {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone(12, "Grande", "Tactil","Mediana", "Samsung" );
        smartPhone.setPrograms("Android");
        smartPhone.setTelephoneLine("Entel");
        System.out.println("smartPhone = " + smartPhone);
        SmartWatch smartWatch = new SmartWatch(5,"pequeño", "buttons","Pequeñas", "Toshiba");
        System.out.println("smartWatch = " + smartWatch);
        smartWatch.setTensileMaterials("Cuero");
    }
}

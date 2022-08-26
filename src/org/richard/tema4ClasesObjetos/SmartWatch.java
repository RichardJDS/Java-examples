package org.richard.tema4ClasesObjetos;

public class SmartWatch extends SmartDevice{
    private boolean waterProof;
    private String tensileMaterials;

    public SmartWatch(boolean waterProof, String tensileMaterials) {
        this.waterProof = waterProof;
        this.tensileMaterials = tensileMaterials;
    }

    public SmartWatch(int size, String display, String input, String batery, String brand) {
        super(size, display, input, batery, brand);
    }

    public boolean isWaterProof() {

        return waterProof;
    }

    public void setWaterProof(boolean waterProof) {
        this.waterProof = waterProof;
    }

    public String getTensileMaterials() {
        return tensileMaterials;
    }

    public void setTensileMaterials(String tensileMaterials) {
        this.tensileMaterials = tensileMaterials;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "waterProof=" + waterProof +
                ", tensileMaterials='" + tensileMaterials + '\'' +
                ", size=" + size +
                ", display='" + display + '\'' +
                ", input='" + input + '\'' +
                ", batery='" + batery + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}

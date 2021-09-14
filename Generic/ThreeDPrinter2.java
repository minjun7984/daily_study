package ch06;

public class ThreeDPrinter2 {

    private Plastic material;

    public Plastic a() {
        return material;
    }

    public void setMaterial(Plastic material) {
        this.material = material;
    }

    public String toString(){
        return "재료는 powder 입니다";
    }
}

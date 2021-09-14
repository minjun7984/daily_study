package ch06;

public class GenericPrinter<T> {
    //형변환 필요 없다 T부분에 대체됨

    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString(){
        return material.toString();
    }
}

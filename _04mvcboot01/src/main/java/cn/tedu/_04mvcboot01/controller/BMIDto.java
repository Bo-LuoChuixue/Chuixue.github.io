package cn.tedu._04mvcboot01.controller;

public class BMIDto {
    private Double height;
    private Double weight;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "BMIDto{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}

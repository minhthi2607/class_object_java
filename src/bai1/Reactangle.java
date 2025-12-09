package bai1;

public class Reactangle {
    double width;
    double height;

    public Reactangle(){

    }

    public Reactangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }

    public String display(){
        return "Reactangle: width :" + width + ", height :" + height;
    }
}

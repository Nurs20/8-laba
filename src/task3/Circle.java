package task3;

public class Circle extends Shape {

    public Circle(){
        type = "Круг";
    }

    @Override
    public void draw() {
        System.out.println("Внутри метода Круг::draw()");
    }
}

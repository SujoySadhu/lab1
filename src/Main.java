



public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        if(shape1!=null)shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        if(shape2!=null)shape2.draw();
    }
}

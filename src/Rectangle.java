public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

    private static Rectangle ins = null;
    private Rectangle(){}
    public static Rectangle getInstance()
    {
        if (ins == null)
            ins = new Rectangle();
        return ins;
    }
}
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
    private static Square ins = null;
    private Square(){}
    public static Square getInstance()
    {
        if (ins == null)
            ins = new Square();
        return ins;
    }
}

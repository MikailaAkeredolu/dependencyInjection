public class Application {
    //Create a draw method instead that takes any kind of shape

//    public  static void myDrawMethod(Shapes shape){
//        shape.draw();
//    }

    public static void main(String[] args) {

        //Make it Polymorphic
        Shapes circle = new Circle();
        Shapes triangle = new Triangle();

//        circle.draw();
//        triangle.draw();

//        myDrawMethod(circle);
//        myDrawMethod(triangle);

        System.out.println("==============================");

        DrawingClass drawingClass = new DrawingClass();
        drawingClass.setShape(circle);
        drawingClass.drawShape();

    }
}

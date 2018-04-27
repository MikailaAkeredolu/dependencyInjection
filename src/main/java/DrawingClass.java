public class DrawingClass {
    //The dependency a dawing class has to a shape is injected by some other class
    //No need for instance of a specific shape
    //Drawing class will never have to be modified
    //Separating dependency ...it does not know what it is drawing it just draws a shape
    private Shapes shapes;

    //setter - DI - takes any shape
    public void setShape(Shapes shapes){
        this.shapes = shapes;
    }

    public void drawShape(){
        this.shapes.draw();
    }


}

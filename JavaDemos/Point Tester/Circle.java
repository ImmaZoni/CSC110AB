public class Circle
{
    //data
    private int centerX;
    private int centerY;
    private int radius;

    //default constructors
    public Circle(){
        this(5,7,5);
    }
    //parameterized constructors
    public  Circle(int firstX, int firstY, int firstRadius){
        if(firstRadius < 0){
            throw new IllegalArgumentException("Radius cannot be negative!");
        }
        this.x = firstX;
        this.y = firstY;
        this.radius = firstRadius;
    }
    
    //MEATHODS
    //toSting
    public String toString(){
        return ("Circle with center (" + x + ", " + y + ") and radius " + radius);
    }
    //getDiameter
    public int getDiameter(){
        return 2*radius;
    }
    //getArea
    public double getArea(){
        return Math.PI * radius * radius;
    }
    //translate
    public void translate(int xMove, int yMove){
        x += xMove;
        y += yMove;
    }
    //sameAs
    public boolean sameAs(Circle another){
        return this.x == another.x &&
               this.y == another.y &&

    }
}

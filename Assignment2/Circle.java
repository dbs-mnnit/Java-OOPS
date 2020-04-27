public class Circle
{
    private double radius;
    private String color;

    public Circle()
    {
        this.radius=1.0;
        this.color="Red";
    }
    public Circle(double radius)
    {
        this.radius=radius;
        this.color="RED";
    }
    public String toString()
    {
        return "Circle [radius = "+radius+" color = "+color+"]";
    }
    public double getRadius()
    {
        return this.radius;
    }
    public double getCircumference()
    {
        return radius*Math.PI*2;
    }
    public String getColor()
    {
        return this.color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }

}

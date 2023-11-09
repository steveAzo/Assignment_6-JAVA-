abstract class Shape {
    public abstract double calculateArea(); 
    public abstract double calculatePerimeter();
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    //setter for radius
    public void setRadius(double radius){
        if(radius > 0) {
            this.radius = radius;
        }
    }

    //getter for radius
    public double getRadius(){
        return radius;
    }

    //area for the circle
    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    //perimeter for the circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

}

class Triangle extends Shape {
    private double height;
    private double base;
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double height, double base, double firstSide, double secondSide, double thirdSide) {
        this.height = height;
        this.base = base;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    //setter for height
    public void setHeight(double height) {
        if(height > 0) {
            this.height = height;
        }
    }
    //setter for base
    public void setBase(double base) {
        if(base > 0){
            this.base = base;
        }
    }


    //setter for firstSide 
    public void setFirstSide(double firstSide) {
        if (firstSide > 0) {
            this.firstSide = firstSide;
        }
    }

    //setter for second side
    public void setSecondSide(double secondSide) {
        if(secondSide > 0) {
            this.secondSide = secondSide;
        }
    }

    //setter for third side
    public void setThirdSide(double thirdSide) {
        if(thirdSide > 0) {
            this.thirdSide = thirdSide;
        }
    }

    //getter for height
    public double getHeight() {
        return height;
    }

    //getter for base
    public double getBase() {
        return base;
    }

    @Override
    public double calculateArea(){
        double area = (1/2) * base * height;
        return area;
    }
    
    //calculate the perimeter of the triangle
    public double calculatePerimeter() {
        return firstSide + secondSide + thirdSide;
    }
}

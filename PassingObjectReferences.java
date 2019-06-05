abstract class Draw{
    abstract public void drawing();
}

class Line extends Draw{
    public void drawing(){
        System.out.println("Draw a line");
    }
}

class Circle extends Draw{
    public void drawing(){
        System.out.println("Draw a circle");
    }
}

class PassingObjectReferences{
    public static void main (String abc[]){
        Line line1 = new Line();
        letsDraw(line1);
        Circle circle1 = new Circle();
        letsDraw(circle1);
    }

    public static void letsDraw(Draw d){
        d.drawing();
    }
}

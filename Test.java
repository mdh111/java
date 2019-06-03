class First{
    int x;
    int y;
}

class Test {
    public static void main (String abc[]){
        First ref;
        ref = new First();
        ref.x=10;
        ref.y=20;
        System.out.println("The result is: " + (ref.x + ref.y));
    }
    
}

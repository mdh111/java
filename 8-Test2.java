class Second{
    int x,y;
    public void message(){
        System.out.println("hello");
        System.out.println("this is a test");
    }
}

class Test2 {
    public static void main (String abc[]){
        Second a;
        a = new Second();
        a.x=20;
        a.message();
        System.out.println(a.x + "..." + a.y);
    }
}

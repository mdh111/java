class Exceptions{
    public void divide(int a, int b){
            int c=0;
            int d=3;
            int f=0;
            try{
                System.out.println("test");
                f=9;
                c=a/b;
                System.out.println("Result: " + c);
            } 
            catch (ArithmeticException e){
                System.out.println("Can't divide by zero");
                System.out.println(d);
                System.out.println(f);
            } 
    }
}

class ExceptionsTest{
    public static void main (String abc[]){
        Exceptions sample = new Exceptions();
        sample.divide(8,0);
    }
}

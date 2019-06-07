class Exceptions{
    public void divide(int a, int b){
            int c=0;
            try{
                c=a/b;
                System.out.println("Result: " + c);
            } 
            catch (ArithmeticException e){
                System.out.println("Can't divide by zero");
            } 
    }
}

class ExceptionsTest{
    public static void main (String abc[]){
        Exceptions sample = new Exceptions();
        sample.divide(8,0);
    }
}

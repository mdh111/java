class Maths2 extends Maths{

    public void multiplication(int a, int b){
        int result;
        result = a*b;
        System.out.println("Result is: " + result);
    }

    @Override
    public int subtraction(int a, int b){
        int result;
        result = a-b;
        return result;
    }
}

class MathsTest2{
    public static void main (String abc[]){
        Maths2 x = new Maths2();
        x.addition(14,20);
        System.out.println("The new subtraction result is: " + x.subtraction(30,12));
        x.multiplication(4,9);
    }
}

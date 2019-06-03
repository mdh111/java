class Maths{

    public void addition(int a, int b){
        int result;
        result = a+b;
        System.out.println("Result is: " + result);
    }

    public int subtraction(int a, int b){
        int result;
        result = a-b;
        return result;
    }
}

class MathsTest{
    public static void main (String abc[]){
        Maths x = new Maths();
        x.addition(14,20);
        System.out.println("Result is: " + x.subtraction(30,12));
    }
}

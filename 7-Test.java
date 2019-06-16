import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Add;

class Addition{
    int number1;
    int number2;
}

class Test{
    public static void main (String abc[]){
        Addition add;
        add = new Addition();
        add.number1=10;
        add.number2=20;
        System.out.println("The result is: " + (add.number1 + add.number2));
    }
}

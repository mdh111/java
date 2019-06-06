class Test{
    int a;
}

class TestChild extends Test{
    public void print(){
        this.a = 20;
        int a = 12;
        System.out.println(this.a);
    }
}

class This{
    public static void main (String abc[]){
        TestChild test = new TestChild();
        test.print();
    }
}

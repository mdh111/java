class School{
    public void msg1(){
        System.out.println("This is the school class");
    }
}

class School_1{
    public void msg2(){
        System.out.println("This is the school_1 class");
    }
}

class Inheritance{
    public static void main (String abc[]){
        School a = new School();
        a.msg1();
        School b = new School_1(); 
        b.msg2(); //unable to call this method as the reference variable (b) is created from the parent class
    }
}

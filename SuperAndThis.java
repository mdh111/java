class One{
    public One(){
        System.out.println(1);
        }
    public One(int a){
        this();
        System.out.println(a);
        }
}

class Two extends One{
    public Two(){
        super(10);
        System.out.println(2);
        }
}
class Three extends Two{
    public Three(){
        System.out.println(3);
        }
}

class SuperAndThis{
    public static void main (String abc[]){
        Three test = new Three();
    }
}

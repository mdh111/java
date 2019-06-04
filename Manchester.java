class Towns{
    public Towns(int a){
        System.out.println("Town created with 1 parameter");
    }
    public Towns(int a, int b){
        System.out.println("Town created with 2 parameters");
    }
}

class Manchester{
    public static void main (String abc[]){
        Towns manc1 = new Towns(4);
        Towns manc2 = new Towns(5,1);
    }
}

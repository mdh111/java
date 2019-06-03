class Loop4 {
    public static void main (String abc[]){
        int a;
        int b;
        int c;
        //Inside the for loop: 
        //3 initialisitions
        //1 condition with multiple boolean operators
        //3 updates
        for(a=1,b=10,c=100;a<=10 && b<=100 && c<=1000;a++,b+=10,c+=100){
            System.out.println(a + "..." + b + "..." + c);
        }
    }
}

class TimesTables2{
    public static void main (String abc[]){
        int count;
        int i;
        for(count=2;count<=10;count++){
            i = 1;
            System.out.println("Table of " + count);
            for(;i<=10;i++){
                System.out.println(count + "x" + i + "=" + (count*i));
            }
            System.out.println("------------------");
        }
    }
}

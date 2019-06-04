class TimesTables{
    public static void main (String abc[]){
        int count;
        int i;
        for(count=2;count<=10;count++){
            i = 1;
            switch(i){
                case 1: System.out.println("Table of " + count);
                case 2: System.out.println(count + "x" + 1 + "=" + (count*1));
                case 3: System.out.println(count + "x" + 2 + "=" + (count*2));
                case 4: System.out.println(count + "x" + 3 + "=" + (count*3));
                case 5: System.out.println(count + "x" + 4 + "=" + (count*4));
                case 6: System.out.println(count + "x" + 5 + "=" + (count*5));
                case 7: System.out.println(count + "x" + 6 + "=" + (count*6));
                case 8: System.out.println(count + "x" + 7 + "=" + (count*7));
                case 9: System.out.println(count + "x" + 8 + "=" + (count*8));
                case 10: System.out.println(count + "x" + 9 + "=" + (count*9));
                case 11: System.out.println(count + "x" + 10 + "=" + (count*10));
                case 12: System.out.println("------------------");
            }
        }
    }
}

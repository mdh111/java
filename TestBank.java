class Bank{
    static int dollar;
    public void setDollar(int a){
        dollar=a;
    }
    public void amount(int b){
        System.out.println("Amount is : " + b*dollar);
    }
}

class TestBank{
    public static void main (String abc[]){
        Bank HSBC,Natwest,NBS;
        HSBC = new Bank();
        Natwest = new Bank();
        NBS = new Bank();
        HSBC.setDollar(50); //sets static variable to 50
        NBS.amount(10); //uses static variable of 50 with instance variable of NBS object
        HSBC.amount(20); //uses static variable of 50 with instance variable of HSBC object
        HSBC.setDollar(25); //updates static variable to 25
        Natwest.amount(30); //uses overwritten static variable of 25 with instance variable of Natwest object
    }
}

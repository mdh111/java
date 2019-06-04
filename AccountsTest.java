class Accounts{
    public void tax(){
        System.out.println("Tax rate is: " + 22.7);
    }
    public void tax(int salary){
        double tax;
        tax=(double)salary*22.7/100;
        System.out.println("Your tax is: " + tax);
    }
    public void tax(int salary, float taxRate){
        float tax;
        tax=salary*taxRate/100;
        System.out.println("Your tax is: " + tax);
    }
}

class AccountsTest{
    public static void main (String abc[]){
        Accounts acc1 = new Accounts();
        acc1.tax();
        acc1.tax(3002);
        acc1.tax(4002,18.2f);
    }
}

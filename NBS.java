class Bank{
    private int amount;

    public Bank(){
        System.out.println("New bank created");
    }

    public void deposit(int money){
        amount+=money;
    }

    public void withdraw(int money){
        if (money<=amount){
            amount-=money;
        }
        else{
            System.out.println("Not enough funds");
        }
    }

    public void balance(){
        System.out.println("Your balance is: \u00A3" + amount);
    }
}


class NBS{
    public static void main (String abc[]){
        Bank bank1 = new Bank();
        bank1.deposit(200);
        bank1.balance();
    }
}

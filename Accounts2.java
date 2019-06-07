class Accounts2{
    public static void main (String args[]){
        Bonus bonus1 = new Bonus();
        Bonus bonus2 = new Bonus();
        try{
            bonus1.bonusCalc(2000,3);
        }
        catch(BonusException e){
            System.out.println("Not enough awards for a bonus - bonus1");
        }
        try{
            bonus2.bonusCalc(3000,6);
        }
        catch(BonusException e){
            System.out.println("Not enough awards for a bonus - bonus2");
        }
    }
}

class BonusException extends Exception{}

class Bonus{
    public void bonusCalc(int salary, int awards) throws BonusException{
        double bonus=0;
        if(awards>=10){
            bonus=salary*0.05;
            System.out.println(bonus);
        }
        else{
            BonusException e = new BonusException();
            throw e;
        }
    }
}

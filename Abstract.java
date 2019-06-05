abstract class Tax{
    abstract public void tax(int salary);
}

class Tax_NewYork extends Tax{
    public void tax(int salary){
        double tax = salary * 0.21;
        System.out.println("Tax is : " + tax);
    }
}

class Tax_SanFrancisco extends Tax{
    public void tax(int salary){
        double tax = salary * 0.15;
        System.out.println("Tax is : " + tax);
    }
}

class Abstract{
    public static void main (String abc[]){
        Tax_NewYork ny = new Tax_NewYork();
        ny.tax(3250);
        Tax_SanFrancisco sf = new Tax_SanFrancisco();
        sf.tax(3250);
    }
}

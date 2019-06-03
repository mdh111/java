class Results{
    private int phy,che,mat;

    public void physics(int marks){
        if(marks>=0 && marks<=150){
            phy=marks;
        }
        else{
            phy=-1;
            System.out.println("Invalid mark for Physics.");
        }
    }

    public void chemistry(int marks){
        if(marks>=0 && marks<=150){
            che=marks;
        }
        else{
            che=-1;
            System.out.println("Invalid mark for Chemistry.");
        }
    }

    public void maths(int marks){
        if(marks>=0 && marks<=150){
            mat=marks;
        }
        else{
            mat=-1;
            System.out.println("Invalid mark for Maths.");
        }
    }

    public void showResults(){
        int total;
        total = phy+che+mat;
        if (phy<0 || che<0 || mat<0){
            System.out.println("Enter valid marks for all 3 subjects to gain a result.");
        }
        else{
            System.out.println("Total score: " + total);
            if(total>250){
                System.out.println("Pass!");
            }
            else{
                System.out.println("Fail!");
            }
        }
    }
}

class School{
    public static void main (String abc[]){
        Results person1;
        person1 = new Results();
        person1.maths(140);
        person1.physics(1000);
        person1.chemistry(100);
        person1.showResults();
    }
}

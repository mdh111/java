class Results{
    private int phy,che,mat,total;
    private float totalPercentage;

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

    private void calculations(){
        total=phy+che+mat;
        totalPercentage=total*100/450;
    }

    public void showResults(){
        if (phy<0 || che<0 || mat<0){
            System.out.println("Enter valid marks for all 3 subjects to gain a result.");
        }
        else{
            calculations();
            System.out.println("Total marks: " + total);
            System.out.println("Percentage: " + totalPercentage + "%");
            }
    }
}

class College{
    public static void main (String abc[]){
        Results person1;
        person1 = new Results();
        person1.maths(2);
        person1.physics(76);
        person1.chemistry(58);
        person1.showResults();
    }
}

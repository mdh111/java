class Results{
    int phy,che,mat;
    public void showResults(){
        int total;
        total = phy+che+mat;
        System.out.println("Total score: " + total);
        if(total>250){
            System.out.println("Pass!");
        }
        else{
            System.out.println("Fail!");
        }
    }
}

class School{
    public static void main (String abc[]){
        Results person1,person2;
        person1 = new Results();
        person2 = new Results();
        person1.mat=60;
        person1.phy=50;
        person1.che=80;
        person2.mat=70;
        person2.che=100;
        person2.phy=90;
        person1.showResults();
        person2.showResults();
    }
}

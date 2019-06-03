class Result {
    public static void main (String abc[]){
        int phy,che,mat,total;
        float per;
        phy=100;
        che=120;
        mat=80;
        total=phy+che+mat;
        per=total*100/450;
        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + per);
        if (per>=60){
            System.out.println("Congratulations! You have passed!");
        }
        else{
            System.out.println("You have not passed.");
        }
    }
}

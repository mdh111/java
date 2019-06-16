class Result {
    public static void main (String abc[]){
        int physics,chemistry,maths,total;
        float percentage;
        physics=100;
        chemistry=120;
        maths=80;
        total=physics+chemistry+maths;
        percentage=total*100/450;
        System.out.println("Total marks (out of 450): " + total);
        System.out.println("Percentage: " + percentage);
        if (percentage>=60){
            System.out.println("Congratulations! You have passed!");
        }
        else{
            System.out.println("You have not passed.");
        }
    }
}

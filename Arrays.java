class Arrays{
    public static void main (String abc[]){
        //create array with numbers 1-10 and then print each line
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int i;
        for(i=0;i<10;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("-------------");
        //create an array of length 10. Then iterate adding to the array. Then iterate printing the array
        int[] numbers2 = new int[10];
        for(i=0;i<10;i++){
            numbers2[i] = (i+1)*10;
        }
        for(int num : numbers2){
            System.out.println(num);
        } 
    }
}

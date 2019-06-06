class StringProcessing{
    public void wordCount(String s){
        int count = 0;
        int i = 0;
        for(;i<s.length();i++){
            if(s.substring(i,i+1).equals(" ")){
                count += 1;
            }
        }
        count += 1;
        System.out.println("Words: " + count);
    }
}

class StringProcessingTest{
    public static void main (String abc[]){
        StringProcessing sample = new StringProcessing();
        sample.wordCount("Shafeeq is back");
    }
}

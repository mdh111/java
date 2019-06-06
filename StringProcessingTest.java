class StringProcessing{
    public void wordCount(String msg){
        int count = 0;
        int i = 0;
        for(;i<msg.length();i++){
            if(msg.substring(i,i+1).equals(" ")){
                count += 1;
            }
        }
        count += 1;
        System.out.println("Words: " + count);
    }
    public void printWords(String msg){
        int i = 0;
        String word = "";
        for(;i<msg.length();i++){
            if(msg.substring(i,i+1).equals(" ")){
                System.out.println(word);
                word="";
            }
            else{
                word += msg.substring(i,i+1);
            }
        }
        System.out.println(word);
    }
    public void printWordsReverse(String msg){
        int i = msg.length();
        String word = "";
        for(;i>0;i--){
            if(msg.substring(i-1,i).equals(" ")){
                System.out.println(word);
                word="";
            }
            else{
                word = msg.substring(i-1,i) + word;
            }
        }
        System.out.println(word);
    }
    public void printWordsReverseLine(String msg){
        int i = 0;
        String word = "";
        String newMsg = "";
        for(;i<msg.length();i++){
            if(msg.substring(i,i+1).equals(" ")){
                newMsg += word + " ";
                word="";
            }
            else{
                word = msg.substring(i,i+1) + word;
            }
        }
        newMsg += word;
        System.out.println(newMsg);
    }
    public boolean findWord(String msg, String word){
        boolean found = false;
        int i = 0;
        String currentWord = "";
        for(;i<msg.length();i++){
            if(msg.substring(i,i+1).equals(" ")){
                if(currentWord.equals(word)){
                    found = true;
                }
                currentWord="";
            }
            else{
                currentWord += msg.substring(i,i+1);
            }
        }
        return found;
    }
    public void removeDuplicates(String msg){
        int i = 0;
        msg+=" ";
        String word = "";
        String newMsg = "";
        for(;i<msg.length();i++){
            if(msg.substring(i,i+1).equals(" ")){
                if(findWord(newMsg,word)){
                    //break;
                }
                else{
                    newMsg += word + " ";
                }
                word="";
            }
            else{
                word += msg.substring(i,i+1);
            }
        }
        System.out.println(newMsg);
    }
}



class StringProcessingTest{
    public static void main (String abc[]){
        StringProcessing sample = new StringProcessing();
        //sample.wordCount("Shafeeq is back");
        //System.out.println("-----------");
        //sample.printWords("hello my friends");
        //System.out.println("-----------");
        //sample.printWordsReverse("hello my friends");
        //System.out.println("-----------");
        //sample.printWordsReverseLine("hello my friends");
        //System.out.println("-----------");
        sample.removeDuplicates("hello my friends hello friends my shafeeq");
    }
}

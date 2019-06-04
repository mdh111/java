class DigitsToWords{
    private String convertSingle(int a){
        switch(a){
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "unknown";
        }
    }

    private String convertDouble(int a){
        switch(a){
            case 20: return "twenty";
            case 30: return "thirty";
            case 40: return "forty";
            case 50: return "fifty";
            case 60: return "sixty";
            case 70: return "seventy";
            case 80: return "eighty";
            case 90: return "ninety";
            default: return "unknown";
        }
    }

    public String convertNumber(int a){
        int toConvert=a;
        String result = "";
        if (toConvert == 0){
            result = "zero";
        }
        if(toConvert>=1000 && toConvert<=9999){
            result += convertSingle(toConvert/1000);
            result += " thousand ";
            toConvert=toConvert%1000;
        }
        if(toConvert>=100){
            result += convertSingle(toConvert/100);
            result += " hundred ";
            toConvert=toConvert%100;
        }
        if(toConvert>=20){
            result += convertDouble((toConvert/10)*10);
            result += " ";
            toConvert=toConvert%10;
        }
        if(toConvert>0 && toConvert<=19){
            result += convertSingle(toConvert);
        }
    return result;
    }
}

class TestDigitsToWords{
    public static void main (String abc[]){
        DigitsToWords test = new DigitsToWords();
        System.out.println(test.convertNumber(3246));
    }
}

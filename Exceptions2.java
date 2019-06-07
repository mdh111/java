class Exceptions2{
    public static void main (String args[]){
        int first,second,result;
        first=second=result=0;
        try {
            first = Integer.parseInt(args[0]);
            second = Integer.parseInt(args[1]);
            result = first/second;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        } catch (NumberFormatException e) {
            System.out.println("Only digits can be entered");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Not enough numbers entered");
        } finally {
            System.out.println("Finally.....Bye!!");
        }
    }
}

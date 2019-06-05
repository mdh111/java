//final class can not be inherited from
final class School{
    public void msg(){
        System.out.println("This is the final school class");
    }
}
//final method can not be overridden in any class inheriting this class
class College{
    final public void msg(){
        System.out.println("Final method in the college class");
    }
}

class Final{
    public static void main (String abc[]){
        School school1 = new School();
        school1.msg();
        College college1 = new College();
        college1.msg();
    }
}

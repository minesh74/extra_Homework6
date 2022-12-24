package extra_homework;
         //Write a java program which remove extra space from both side “    I love java    ”

public class Extra_Space {
    static String name = "         I love java        ";        //static variables

    static String name1 = "I love java";
    public static void main(String [] args){      //Main method
        System.out.println(name);                 // direct used static
        System.out.println(name.trim());        //string trim used

    }

}

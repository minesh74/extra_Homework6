package quastion1;

public class Quastion4 {
    /* 4.1 Declare two instance and two static variables.
       4.2 Declare one instance method.
       4.3 Declare one static method.
       4.4 Call all four instance and static variables into both instance and static methods inside the
           print statement.
       4.5 Declare the Main method.
       4.6 Call both instance and static methods into the Main method and run the programme.   */


    String name = "Minesh"; // Instance variable v1
    String name1 = "Patel";  // Instance variable v2
    static String city = "London";  //Static variable v1
    static int age=45;               //Static variable v2

    // Instance method
    public void m1(){
        System.out.println(name);
        System.out.println(name1);
    }
    //Static method
    public static void m2() {
        Quastion4 t= new Quastion4();                         //Object
        System.out.println("City name is:" + city);
        System.out.println("Age is :" + age);
    }
        // main method
        public static void main(String [] args){
            System.out.println("City name is:" + city);       //Calling Static
            System.out.println("Age is :" + age);
            Quastion4 t=new Quastion4();                      //Object
           t.m1();                                           //Calling Instance method

        }



        }














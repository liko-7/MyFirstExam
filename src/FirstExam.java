public class FirstExam {

    public static void main(String[] args) {

        //ამოცანა1
        greetUser("Lika");


        //ამოცანა2
        int result =  sum(7, 20);
        System.out.println("jami aris " + result);


        //ამოცანა3
        System.out.println(isEven(11));
        System.out.println(isEven(8));


        //ამოცანა4
        int intNumber = convertToInt(10.73);
        System.out.println(intNumber);


        //ამოცანა5
        System.out.println(maxNumber(35, 17));
        System.out.println(maxNumber(5, 82));


        //ამოცანა6
        System.out.println(getLength("testing"));


        //ამოცანა7
        System.out.println("namravlia " + multiply(3, 5));
        System.out.println("namravlia " + multiply(3, 5, 4));


}




        // ამოცანა1
    public static void greetUser(String name) {
        System.out.println("Hello " + name);
    }


        // ამოცანა2
    public static int sum(int a, int b) {
        return a + b;
    }

    
       // ამოცანა3
    public static boolean isEven (int number) {
        return number % 2 == 0;
    }


      // ამოცანა4
    public static int convertToInt (double number) {
        return (int) number;
    }


      //ამოცანა5
    public static int maxNumber (int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }


      //ამოცანა6
    public static int getLength (String text) {
        return text.length();
    }


      //ამოცანა7
    public static int multiply (int a, int b) {
        return a * b;
    }

    public static int multiply (int a, int b, int c) {
        return a * b * c;
    }



}

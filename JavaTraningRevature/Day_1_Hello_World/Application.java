public class Application {
    // Main method - is the special method that instructs the jvm 
    // where to begin executing 
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Printing my own method," + " I am writing my own method");
        myOwnMethod();
    }

    public static void myOwnMethod(){
        System.out.println("Printing my own method");
    }

}
import java.util.Scanner; // Import the Scanner class

class ProvaInput {
    public static void main(String[] args) {
        Scanner myObjs = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObjs.nextLine(); // Read user input

        Scanner myObjn = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter age");

        String age = myObjn.nextLine(); // Read user input

        System.out.println("Username is: " + userName + " and has age: "+ age);
        
    }
} // Output user input

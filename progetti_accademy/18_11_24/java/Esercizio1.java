import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        
        Scanner myObjs = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter username:");
        String userName = myObjs.nextLine(); // Read user input
        myObjs = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter password:");
        String password = myObjs.nextLine();
        System.out.println("Enter age:");
        Scanner myObjn = new Scanner(System.in); // Create a Scanner object
        int age = myObjs.nextInt();

        //controlla se username è maggiore di 2
        if(userName.length() > 2){
            System.err.println(userName + " è maggiore di 2");
        }
        else{
            System.err.println(userName + " è minore di 2");
        }

        //controlla se username è diverso da password
        if ( !userName.equals(password) ){
            System.err.println(password +" è diverso da " + userName);
        }
        else {
            System.err.println("Devi scegliere una password diversa dallo username!");
        }

        //controlla se l'età è maggiore di 50
        if(age > 50){
            System.err.println("L\'età è maggiore di 50");
        }
        else if (age < 50){
            System.err.println("L\'età è minore di 50");
        }

        //finchè età è minore di 60 aumenta age di 1
        while (age < 60) {
            System.err.println(age + ", l\'età è ancora minore di 60");
            age++;
        }
        System.err.println(age + " l\'età è uguale a 60");
    }
}

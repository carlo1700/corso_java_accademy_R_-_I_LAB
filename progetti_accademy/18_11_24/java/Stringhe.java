public class Stringhe {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase()); // Outputs "HELLO WORLD"
        System.out.println(txt1.toLowerCase()); // Outputs "hello world"

        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // Outputs 7

        String firstName = "Pasquale";
        String lastName = "Rossi";
        System.out.println(firstName + " " + lastName);

        String firstName1 = "John ";
        String lastName1 = "Doe";
        System.out.println(firstName1.concat(lastName1));

        String txt3 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt3);



    }
}
public class Condizioni {
    public static void main(String[] args) {
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }
        int x = 20;

        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        } // Outputs "Good evening."

        int time1 = 22;
        if (time1 < 10) {
            System.out.println("Good morning.");
        } else if (time1 < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        // Outputs "Good evening."

        int time2 = 20;
        String result = (time2 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        //controlla qual è il caso di un intero che ha valore 6
        int day = 6;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}

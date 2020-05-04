public class ControlFlowExercises {
    public static void main (String[] args) {
        // Loop Basics
        // a. While
        int i = 5;
        while(i <= 15) {
            System.out.println("While: i = " + i);
            i++;
        }
        // b. Do While

        int a = 0;
        do {
            System.out.println("Do while: a = " + a);
            a+=2;
        } while (a <= 100);

        int b = 100;
        do {
            System.out.println("Count backwards: b = " + b);
            b-=5;
        } while (b >= -10);
    }
}

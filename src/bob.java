import java.util.Scanner;

public class bob {
    public static void main(String[] args) {
//        Create a class named Bob with a main method for the following exercise.
//
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.

        Scanner input = new Scanner(System.in);
        String userResponse = "";
        do {
            System.out.println("Ask Bob something.");
            String askBobSomething = input.nextLine();
            if(askBobSomething.endsWith("?")) {
                System.out.println("Sure.");
            } else if(askBobSomething.endsWith("!")) {
                System.out.println("Whoa, Chill out!");
            } else if (askBobSomething.equals("")){
                System.out.println("Fine. be that way!");
            } else {
                System.out.println("Whatever...");
            }
            System.out.println("Want to ask bob something else? [y/n]");
            userResponse = input.nextLine();
        } while(userResponse.equals("y"));
    }
}

import java.util.Random;

public class ServerNameGenerator {
   public static String[] adjectives = {"stinky", "little", "colossus", "lousy", "crazy", "wild", "outrageous", "goofy", "angry", "interesting", "whimsical", "knee-slapper"};
   public static String[] nouns = {"banana", "laptop", "bean", "cannibal", "cheetah", "toilet", "panties", "monkey", "tree", "bush", "hornet", "virus", "code", "potato", "goat"};

   public static void main(String[] args) {
        randomServerName();
   }

   public static void randomServerName() {
       Random random = new Random();
       int randomAdjective = random.nextInt(adjectives.length);
       int randomNoun = random.nextInt(nouns.length);
       System.out.println("Here is your server name: ");
       System.out.println(adjectives[randomAdjective] + "-" +nouns[randomNoun]);
   }
}

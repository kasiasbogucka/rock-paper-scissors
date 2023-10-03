import java.util.Objects;

public class PlayGame {
    public static String playGame(User realUser, User generatedUser) {
        String result = "lose";
        String realUserMove= realUser.userMove();
        System.out.println("You chose " + realUserMove);
        String generatedUserMove= generatedUser.userMove();
        System.out.println(((GeneratedUser) generatedUser).getGeneratedName() + " chose " + generatedUserMove);

        if (realUserMove.equals("rock") && generatedUserMove.equals( "scissors") ||
            realUserMove.equals("scissors") && generatedUserMove.equals("paper") ||
            realUserMove.equals("paper") && generatedUserMove.equals("rock")){
            result="win";
        } else if (realUserMove.equals(generatedUserMove)) {
            result="draw";
        } else {
            result="lose";
        }
        return result;
    }
}

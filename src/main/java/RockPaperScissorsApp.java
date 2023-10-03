public class RockPaperScissorsApp {
    public static void main(String[] args) {
        String userName= RealUser.getNameFromInput();
        System.out.println("Hello " + userName + ", welcome to Rock, Paper, Scissors!");
        RealUser player1 = new RealUser(userName);

        GeneratedUser user = new GeneratedUser("Computer");

        while(true) {
            String result = PlayGame.playGame(player1,user);
            if (result.equals("win")) {
                System.out.println("Congratulations " + userName + "! You won");
                break;
            } else if (result.equals("draw")) {
                System.out.println("Draw, playing again");
            } else {
                System.out.println("Oh no! " + user.getGeneratedName() + " won!");
                break;
            }
        }
    }
}

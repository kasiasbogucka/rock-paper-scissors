import java.util.Random;

public class GeneratedUser implements User{
    private String generatedName;
    public GeneratedUser(String name) {
        this.generatedName = name;
    }
    public String getGeneratedName() {
        return generatedName;
    }

    public String userMove() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String randomMove = "";
        switch (randomNumber) {
            case 0:
                randomMove = "rock";
                break;
            case 1:
                randomMove = "scissors";
                break;
            case 2:
                randomMove = "paper";
                break;
        }
        return randomMove;
    }
}

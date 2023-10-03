import java.util.Scanner;

public class RealUser implements User{
    private static String name;
    public RealUser(String name){
        this.name = name;
    }
    public static String getname() {
        return name;
    }
    private static Scanner user_input = new Scanner(System.in);

    public static String getNameFromInput(){
        System.out.println("Please enter your name");
        String userName = user_input.next();
        return userName;
    }

    public String userMove() {
        Scanner scanner = new Scanner(System.in);

        String choice;

        while (true) {
            System.out.print("What's your move?: ");
            choice = scanner.nextLine();
            choice = choice.toLowerCase();
            if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")){
                break;
            }
            System.out.println("Invalid choice");
        }
        return choice;

    }
}

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
        System.out.print("What's your move?: ");
        String choice = scanner.nextLine();
        String move= choice.toLowerCase();
        return move;
    }
}

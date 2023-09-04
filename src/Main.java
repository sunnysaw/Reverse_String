import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int lenght = name.length();
        for (int start = lenght - 1; start >= 0; start--){
            System.out.print( " " + name.charAt(start));
        }
    }
}
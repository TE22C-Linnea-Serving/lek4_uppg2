import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Skriv in en text: ");
        String text = tangentbord.nextLine();
        System.out.println("The length of \""+text+"\" is: "+text.length()+" letters");



    }
}

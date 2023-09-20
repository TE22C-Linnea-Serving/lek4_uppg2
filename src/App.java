import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Skriv in en text: ");
        String text = tangentbord.nextLine();
        System.out.println("The length of \""+text+"\" is: "+text.length()+" letters");

        System.out.println("Write a letter that you want to locate in your text: ");
        String locate = tangentbord.nextLine();
        System.out.println("The position of letter \"" +locate+"\" is in the: "+text.indexOf(locate)+" position");
    }
}

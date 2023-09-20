import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Skriv in en text: ");
        String text = tangentbord.nextLine();
        System.out.println("The length of \""+text+"\" is: "+text.length()+" letters");

        System.out.println("Write a letter that you want to locate in your text: ");
        String locate = tangentbord.nextLine();
        System.out.println("The first position of the letter \"" +locate+"\" is in the: "+text.indexOf(locate)+" position");
        
        System.out.println("You will take out a part of the text.");
        System.out.println("Type the number of the position you want to start from: ");
        int first_position = tangentbord.nextInt();
        System.out.println("Type the number of the position you want to end on: ");
        int second_position = tangentbord.nextInt();
        System.out.println("This part of the text is: \""+text.substring(first_position, second_position)+"\"");
    }
}

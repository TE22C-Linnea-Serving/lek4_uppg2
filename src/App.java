import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner tangentbord = new Scanner(System.in);

        //The user types their text
        System.out.println("Skriv in en text: ");
        String text = tangentbord.nextLine();
        System.out.println("The length of \""+text+"\" is: "+text.length()+" letters");

        //Locating a letter in the text
        System.out.println("Write a letter that you want to locate in your text: ");
        String locate = tangentbord.nextLine();
        System.out.println("The first position of the letter \"" +locate+"\" is in the: "+text.indexOf(locate)+" position");
        
        //Showing what part of the text is between two chosen positions
        System.out.println("You will take out a part of the text.");
        System.out.println("Type the number of the position you want to start from: ");
        int first_position = tangentbord.nextInt();
        System.out.println("Type the number of the position you want to end on: ");
        int second_position = tangentbord.nextInt();
        System.out.println("The text between position "+first_position+" and position "+second_position+" is: \""+text.substring(first_position, second_position)+"\"");

        //Seeing if a text contained something
        System.out.println("Write something to see if your text contains it or not: ");
        String space = tangentbord.nextLine(); //to get rid of the "enter"
        String t_f = tangentbord.nextLine();
        System.out.println(text.contains(t_f));

        //Replacing a part of the text
        System.out.println("Write a part of the text \""+text+"\" you want replaced: ");
        String oldText = tangentbord.nextLine();
        System.out.println("Write a new text for the part of the text you wanted to replaced: ");
        String newText = tangentbord.nextLine();
        System.out.println("This is the new text: ");
        System.out.println(text.replace(oldText, newText));

    }
}

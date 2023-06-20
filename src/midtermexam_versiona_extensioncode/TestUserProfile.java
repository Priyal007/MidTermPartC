
package midtermexam_versiona_extensioncode;

/**
 *
 * @author Gurpriyal
 */

import java.util.Scanner;
public class TestUserProfile {
    public static void main(String[]args) {
        
        //new Scanner object created
        Scanner input = new Scanner(System.in);
        
        //prompts the user to enter the name, take input and store in givenId
        System.out.println("Enter your name");
        String givenId = input.nextLine();
        
        //genres array is created
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        
        //prompts the user to choose genre, and display the list
        System.out.println("Choose the genre:");
        for (int i = 0; i < genres.length; i++) {
            System.out.println(genres[i]);
        }
        
        //take user input for genre and store in givenGenre
        String givenGenre = input.nextLine();
        
        //UserProfile object the user is created
        UserProfile user = new UserProfile(givenId, givenGenre);
        
        //prompts the message to user that their profile has been created
        System.out.println("Your profile has been created.");
    }
}

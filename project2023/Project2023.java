
package project2023;
import java.util.Scanner;
public class Project2023 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
        
        ShowManager showManager = new ShowManager();
        
      
        UserManager userManager = new UserManager();
        
    
        RatingManager ratingManager = new RatingManager();
        

        boolean isRunning = true;
        while (isRunning) {
            
            System.out.println("========== JavaEntertainment App ==========");
            System.out.println("1. Register a show");
            System.out.println("2. Search for a show");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
        
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    showManager.registerShow();
                    break;
                case 2:              
                    showManager.searchShow();
                    break;
                case 3:             
                     isRunning = false;
                     break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        
        // Close the scanner
        scanner.close();
    }
       
}
    


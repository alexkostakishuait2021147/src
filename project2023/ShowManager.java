
package project2023;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

        
public class ShowManager {
    private List<Show> shows;
    private Scanner scanner;
    
    public ShowManager() {
        shows = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    public void registerShow() {
        System.out.println("show details");
        
        // Get show details from the user
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        
        System.out.print("Enter the year of the first screening  ");
        int yearOfFirstScreening = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        System.out.print("Enter genres: ");
        String type = scanner.nextLine();
        
        System.out.print("Enter country : ");
        String countryOfProduction = scanner.nextLine();
        
        System.out.print("Enter director's name: ");
        String directorName = scanner.nextLine();
        
        System.out.print("Enter number of actors: ");
        int numActors = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        List<String> actorNames = new ArrayList<>();
        for (int i = 1; i <= numActors; i++) {
            System.out.print("Enter actor " + i + "'s name: ");
            String actorName = scanner.nextLine();
            actorNames.add(actorName);
        }
        
        // Create the show object
        Show show = new Show(title, yearOfFirstScreening, type, countryOfProduction, directorName, actorNames);
        
        // Add the show to the list
        shows.add(show);
        
        // Display the show's information
        System.out.println("Show registered successfully:");
        System.out.println("ID: " + show.getId());
        System.out.println("Title: " + show.getTitle());
        System.out.println("Type: " + show.getType());
        System.out.println("Director: " + show.getDirectorName());
    }
    
    public void searchShow() {
        System.out.println("========== Search for a Show ==========");
        System.out.print("Enter title or year of first screening: ");
        String searchQuery = scanner.nextLine();
        
        List<Show> searchResults = new ArrayList<>();
        
        // Search for the show based on the title or year of first screening
        for (Show show : shows) {
            if (show.getTitle().equalsIgnoreCase(searchQuery) || show.getYearOfFirstScreening() == Integer.parseInt(searchQuery)) {
                searchResults.add(show);
            }
        }
        
        if (searchResults.isEmpty()) {
            System.out.println("No shows found matching the search criteria.");
        } else {
            System.out.println("Search results:");
            for (Show show : searchResults) {
                System.out.println("ID: " + show.getId());
                System.out.println("Title: " + show.getTitle());
                System.out.println("Year of First Screening: " + show.getYearOfFirstScreening());
                System.out.println("Type: " + show.getType());
                System.out.println("Director: " + show.getDirectorName());
                
                if (show.getNumberOfSeasons() > 0) {
                    System.out.println("Number of Seasons: " + show.getNumberOfSeasons());
                    System.out.println("Episodes per Season: " + show.getEpisodesPerSeason());
                    System.out.println("Year Last Aired: " + show.getYearLastAired());
                }
                
                System.out.println("-----------------------------");
            }
        }
    }
}

    



package project2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RatingManager {
    private List<Rating> ratings;
    private Scanner scanner;
    
    public RatingManager() {
        ratings = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    public void addRating(User user, Show show) {
        System.out.println("========== Add Rating ==========");
        
        // Get rating details from the user
        System.out.print("Enter rating score (1-10): ");
        int score = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        // Create the rating object
        Rating rating = new Rating(user.getName(), show, score);
        
        // Add the rating to the list
        ratings.add(rating);
        
        System.out.println("Rating added successfully.");
    }
    
    public void viewAllRatings() {
        System.out.println("========== All Ratings ==========");
        
        if (ratings.isEmpty()) {
            System.out.println("No ratings found.");
        } else {
            for (Rating rating : ratings) {
                System.out.println("Username: " + rating.getUsername());
                System.out.println("Show: " + rating.getShow().getTitle());
                System.out.println("Rating: " + rating.getScore());
                System.out.println("-----------------------------");
            }
        }
    }
    
    public List<Rating> getRatingsForShow(Show show) {
        List<Rating> showRatings = new ArrayList<>();
        
        for (Rating rating : ratings) {
            if (rating.getShow().equals(show)) {
                showRatings.add(rating);
            }
        }
        
        return showRatings;
    }
}

    


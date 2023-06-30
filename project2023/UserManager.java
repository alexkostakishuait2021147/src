
package project2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManager {
    
private List<User> users;
    private Scanner scanner;
    
    public UserManager() {
        users = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    public void registerUser() {
        System.out.println("User Registration ");
        
        // Get user details from the user
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        // Create the user object
        User user = new User(name, email, password);
        
        // Add the user to the list
        users.add(user);
        
        System.out.println("User registered successfully.");
    }
    
    public User loginUser() {
        System.out.println("========== User Login ==========");
        
        // Get user credentials from the user
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        // Find the user with matching credentials
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                System.out.println("Login successful.");
                return user;
            }
        }
        
        System.out.println("Invalid credentials. Login failed.");
        return null;
    }
}

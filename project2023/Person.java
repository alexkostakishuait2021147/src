
package project2023;


public class Person {
    private static int nextId = 1;
    
    private int id;
    private String name;
    private String dateOfBirth;
    private String countryOfBirth;
    private String website;
    
    public Person(String name, String dateOfBirth, String countryOfBirth, String website) {
        this.id = nextId++;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.countryOfBirth = countryOfBirth;
        this.website = website;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    
    public String getCountryOfBirth() {
        return countryOfBirth;
    }
    
    public String getWebsite() {
        return website;
    }
    
}

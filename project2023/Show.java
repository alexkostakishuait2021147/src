
package project2023;
import java.util.ArrayList;
import java.util.List;



public class Show {
    private static int nextId = 1;
    
    private int id;
    private String title;
    private int yearOfFirstScreening;
    private String type;
    private String countryOfProduction;
    private String directorName;
    private List<String> actorNames;
    private int numberOfSeasons;
    private int episodesPerSeason;
    private int yearLastAired;
    
    public Show(String title, int yearOfFirstScreening, String type, String countryOfProduction, String directorName, List<String> actorNames) {
        this.id = nextId++;
        this.title = title;
        this.yearOfFirstScreening = yearOfFirstScreening;
        this.type = type;
        this.countryOfProduction = countryOfProduction;
        this.directorName = directorName;
        this.actorNames = actorNames;
    }
    
    public int getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getYearOfFirstScreening() {
        return yearOfFirstScreening;
    }
    
    public String getType() {
        return type;
    }
    
    public String getCountryOfProduction() {
        return countryOfProduction;
    }
    
    public String getDirectorName() {
        return directorName;
    }
    
    public List<String> getActorNames() {
        return actorNames;
    }
    
    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }
    
    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }
    
    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }
    
    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }
    
    public int getYearLastAired() {
        return yearLastAired;
    }
    
    public void setYearLastAired(int yearLastAired) {
        this.yearLastAired = yearLastAired;
    }
}
   
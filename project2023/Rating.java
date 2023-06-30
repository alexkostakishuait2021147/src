
package project2023;


public class Rating {
    private  String username;
    private  Show show;
    private int score;
    
    public Rating(String username, Show show, int score) {
        this.username = username;
        this.show = show;
        this.score = score;
    }
    
    public String getUsername() {
        return username;
    }
    
    public Show getShow() {
        return show;
    }
    
    public int getScore() {
        return score;
    }
}
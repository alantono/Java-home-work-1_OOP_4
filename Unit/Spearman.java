package Unit;
public class Spearman extends Characters {

// копейщик
    protected String name;

    public Spearman(int x, int y, int teams, String name, Vector2D coords, String state) {
        super(4, 5, 1, 3, 10, 10, 4, x, y, teams, coords.x, coords.y, state);
        this.name = name;
    }

    public String getInfo() {
        return String.format("Team: %d; %s  ; %s; speed: %d; state: %s; x: %d; y: %d",
       teams, this.getClass().getSimpleName(), this.name, speed, state, coords.x, coords.y);
   }
    
}
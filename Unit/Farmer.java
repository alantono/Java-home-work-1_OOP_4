package Unit;
public class Farmer extends Characters {

    // крестьянин
    protected String name;
    protected int shots;


    public Farmer(int x, int y, int teams, String name, int shots, Vector2D coords, String state) {
        super(1, 1, 1, 1, 1, 1, 3, x, y, teams, coords.x, coords.y, state);
        this.name = name;
        this.shots = shots;
    }

    public int getShotsFarmer () {
        return this.shots;
    }
    public void setShotsFarmer (int shots) {
        this.shots = shots;
    }
@Override
    public String getInfo() {

        return String.format("Team: %d; %s    ; %s; speed: %d; state: %s; x: %d; y: %d",
       teams, this.getClass().getSimpleName(), this.name, speed, state, coords.x, coords.y);
   }
}

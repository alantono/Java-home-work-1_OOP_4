package Unit;
public class Arbalester extends Archer {

// Арбалетчик
    protected String name;

    

    public Arbalester(int attack, int defense, int damage_min, int damage_max, float hp, float hp_max, int speed, int x,
    int y, int shots, int teams, String state, Vector2D coords, String name) {
        super(6, 3, 2, 3, 10, 10, 4, 16, x, y, teams, coords, state);
        this.name = name;
    }

    // public Arbalester(int x, int y, int teams, int shots, String name, Vector2D coords, String state) {
    //     super(6, 3, 2, 3, 10, 10, 4, x, y, 16, teams, coords.x, coords.y, state);
    //     this.name = name;
    // }
    @Override
    public String getInfo() {
        return String.format("Team: %d; %s; %s; speed: %d; state: %s; x: %d; y: %d",
       teams, this.getClass().getSimpleName(), this.name, speed, state, coords.x, coords.y);
   }
   
}


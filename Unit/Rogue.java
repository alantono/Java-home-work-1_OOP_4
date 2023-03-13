package Unit;
public class Rogue extends Characters {

    // Разбойник
    protected String name;

    public Rogue(int x, int y, int teams, String name, Vector2D coords, String state) {
        super(8, 3, 2, 4, 10, 10, 6, x, y, teams, coords.x, coords.y, state);
        this.name = name;
    }
    // public Bandit(String name, Vector2D coords) { super(name, 70.f, 70, 10, 2, 6, 7,6, coords.posX, coords.posY);
    //     this.disguise = 50;
    // }
    public String getInfo() {
        return String.format("Team: %d; %s     ; %s; speed: %d; state: %s; x: %d; y: %d",
       teams, this.getClass().getSimpleName(), this.name, speed, state, coords.x, coords.y);
   }
        
    }
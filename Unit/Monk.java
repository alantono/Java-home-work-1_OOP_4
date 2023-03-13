package Unit;
public class Monk extends Characters{
    // монах
    protected String name;
    protected float mana = 1;
    protected float mana_max = 1;
    

    public Monk(int x, int y, int teams, String name, float mana, float mana_max, Vector2D coords, String state) {
        super(12, 7, 4, 0, 30, 30, 5, x, y, teams, coords.x, coords.y, state);
        this.name = name;
        this.mana = mana;
        this.mana_max = mana_max;
    }


    public String getInfo() {
        return String.format("Team: %d; %s      ; %s; speed: %d; state: %s; x: %d; y: %d",
       teams, this.getClass().getSimpleName(), this.name, speed, state, coords.x, coords.y);
   }
}

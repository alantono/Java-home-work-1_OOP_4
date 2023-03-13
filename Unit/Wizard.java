package Unit;
public class Wizard extends Characters{

    // Колдун

    protected String name;
    protected float mana = 1;
    protected float mana_max = 1;

    public Wizard(int x, int y, int teams, String name, float mana, float mana_max, Vector2D coords, String state) {
        super(17, 12, 5, 0, 30, 30, 9, x, y, teams, coords.x, coords.y, state);
        this.name = name;
        this.mana = mana;
        this.mana_max = mana_max;
    }

    public String getInfo() {

        return String.format("Team: %d; %s    ; %s; speed: %d; state: %s; x: %d; y: %d",
       teams, this.getClass().getSimpleName(), this.name, speed, state, coords.x, coords.y);
   }

}
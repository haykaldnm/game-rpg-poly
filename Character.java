public class Character {
    private String name;
    private double hp = 250;
    private double atk;
    public int position;
    
    public Character(String name, double atk) {
        this.name = name;
        this.atk = atk;
    }
    public String getName() {
        return name;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getHp() {
        return hp;
    }

    public double getAtk() {
        return atk;
    }

    public void move(Character other){
        other.setHp(other.getHp()-getAtk());
    }
}
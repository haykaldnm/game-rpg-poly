public class Witch extends Enemy{
    public Witch(String name, double atk) {
        super(name, atk);
    }

    public void move(Character other){
        other.setHp(other.getHp()-getAtk());
    }
}

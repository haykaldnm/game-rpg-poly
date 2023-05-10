public class Fighter extends Hero{
    public Fighter(String name, double atk) {
        super(name, atk);
    }

    public void move(Character other){
        other.setHp(other.getHp()-getAtk());
    }
}

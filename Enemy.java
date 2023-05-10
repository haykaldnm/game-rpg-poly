public class Enemy extends Character {

    public Enemy(String name, double atk) {
        super(name, atk);
    }

    public void move(Character other){
        if (other.position - position == 1 || position - other.position == 1) {
            other.setHp(other.getHp()-getAtk());
            System.out.println("HIT!");
        }
        else{
            System.out.println("Enemies out of range!");
        }
    }
    
    public void move(int step){
        position += step;
    }
}

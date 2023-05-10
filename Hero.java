public class Hero extends Character {
    public Hero(String name, double atk) {
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
    
    public void move(String direction){
        String move[] = direction.split(" ");
        if (move[0].equals("kanan")) {
            position += Integer.parseInt(move[1]);
        }
        else if(move[0].equals("kiri")) {
            position -= Integer.parseInt(move[1]);       
        }
    }
}

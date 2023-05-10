import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //Dynamic Polimorfism
        Character hero = new Hero("Hero", 22);
        Character enemy = new Enemy("Enemy", 20);
        Character fighter = new Fighter("Fighter", 25);
        Character witch = new Witch("Witch", 24);

        hero.position = 1;
        enemy.position = 2;

        while (true) {
            showPosition(hero, enemy);
            System.out.println("Input Move for A! (ex. kanan 3)");
            ((Hero)hero).move(input.nextLine());
            hero.move(enemy);
            System.out.println("Input Move for B! (ex. 3 or -3)");
            ((Enemy)enemy).move(input.nextInt()); input.nextLine();
            enemy.move(hero);
            showHP(hero, enemy);

            if (hero.getHp() <= 0 || enemy.getHp() <= 0) {
                break;
            }
        }
        System.out.println("Game End");
    }

    public static void showHP(Character A, Character B){
        System.out.println("====================");
        System.out.println("HP A    : " + A.getHp());
        System.out.println("HP B    : " + B.getHp());
    }

    public static void showPosition(Character A, Character B){
        int left = 0, right = 0;  
        if (A.position < B.position) {
            left = A.position; 
            right = B.position;
        }
        else{
            right = A.position; 
            left = B.position;
        }
        for (int i = left - 1; i <= right + 1; i++) {
            if (i == A.position && i == B.position) {
                System.out.print("AB ");
            }
            else if (i == A.position) {
                System.out.print("A ");
            }
            else if(i == B.position){
                System.out.print("B ");
            }
            else{
                System.out.print("_ ");
            }
        }
        System.out.println();
    }
}

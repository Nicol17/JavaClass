package oop.basics;

public class testPoke {
    public static void main(String[] args) {


        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 35, 55);
        Pokemon mewtwo = new Pokemon("Mewtwo", "Psychic", 50, 35);

        pikachu.attack(mewtwo);

        System.out.println(pikachu.name + " HP: " + pikachu.healthPoint);
        System.out.println(pikachu.name + " AP: " + pikachu.attackPoint);
        pikachu.evolve();
        System.out.println(pikachu.name + " HP: " + pikachu.healthPoint);
        System.out.println(pikachu.name + " AP: " + pikachu.attackPoint);

    }

}
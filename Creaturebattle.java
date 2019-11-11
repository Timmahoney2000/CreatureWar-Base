
/**
 * Battle class
 *
 * @author Tim Mahoney
 * @version 11-10-2019
 */
public class Creaturebattle
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
      int round = 0;
    /**
     * Constructor for objects of class Creaturebattle (Name, health, damage, strength)
     */
    
    Creature creature 1 = new Creature("Human", 30, 10, 18);
    Creature creature 2 = new Creature("Elf", 25, 8, 18);
    Creature creature 3 = new Creature("Demon", 25, 8, 18);
    Creature creature 4 = new Creature("Cyberdemon", 100, 25, 40);
    Creature creature 5 = new Creature("Balrog", 200, 50, 80);
    
        // If alive, keep fighting
       while( creature1.health > 0 && creature2.health > 0)
       {
    
           round++;
           System.out.println("\nRound " + round);
           // Print result
           System.out.println( creature1.attack(creature2) );
           System.out.println( creature2.attack(creature1) );
        }
        System.out.println("\nEnd Combat: ");
        if( creature.health < 1 && creature2.health < 1)
        System.out.printf("The %s and the %s died fighting each other!", creature1.name, creature2.name);
        else if( creature1.health > 0 ) {
            System.out.printf("%s wins!", creature1.name);
        }
        else {
            System.out.printf("%s wins!", creature2.name);
        }
    }
}


/**
 * Top of the hierarchy of classes for all creatures
 * 
 * @author Tim Mahoney
 * @version 11-10-2019
 */
public class Creature
{
   public String name = "Creature";
   private int hp = 1;
   private int strength = 1;
   private int damage = 1;
   
   public Creature(){
       
   }
    
    /**
     * Constructor
     **/
    Creature(String Name, int hp, int strength)
    {
        this.name = Name;
        this.hp = hp;
        this.strength = strength;
        this.damage = damage;
    }

    /**
     * Attack Method
     */
    public String attack(Creature target)
    {
        target.hp -= this.damage;
        return String.format("%s attacks %s for %d damage!", this.name, target.name, this.damage);
    }

    public int damage(){
       //TODO: change this
       return 0;
    }
    
}

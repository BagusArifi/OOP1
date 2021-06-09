package game;

public class Hero extends GameObject{
   int ID;
    public void setName(String name){
        super.name=name;
    }
    public String getName(){
        return name;
    }
    public void setHP(int HP){
        super.HP=HP;
    }
    public int getHP(){
        return HP;
    }
    public void setDamage(int damage){
        super.damage=damage;
    }
    public int getDamage(){
        return damage;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public int getID(){
        return ID;
    }
   @Override
    public void display(){
        System.out.println("nama= "+getName());
        System.out.println("HP = "+getHP());
        System.out.println("Damage = "+getDamage());
        System.out.println("ID = "+getID());
    }
    
}
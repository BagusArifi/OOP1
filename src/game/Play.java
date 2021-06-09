/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Mr.Good
 */
import java.util.Scanner;
public class Play {
    public static void main(String[] args) {
        GameObject Run = new GameObject();
        Hero Fighter = new Hero();
        Enemy minion = new Enemy567();
        Run.display();
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan ID Hero = ");
        Fighter.setID(input.nextInt());
        System.out.print("masukkan nama Hero = ");
        Fighter.setName(input.next());
        
        System.out.print("masukkan Damage Hero = ");
        Fighter.setDamage(input.nextInt());
        
        System.out.print("masukkan HP hero = ");
        Fighter.setHP(input.nextInt());
        
        System.out.println("------------------");
        
        System.out.print("masukkan nama Enemy = ");
        minion.setName(input.next());
        
        System.out.print("masukkan Damage Enemy = ");
        minion.setDamage(input.nextInt());
        
        System.out.print("masukkan HP Enemy = ");
        minion.setHP(input.nextInt());
        
        Fighter.display();
        minion.display();
        
        if (Fighter.HP>minion.HP){
            System.out.println(Fighter.getName()+" winner from "+ minion.getName());
        }
        else {
            System.out.println(Fighter.getName()+" lose from "+ minion.getName());
        }
        
    }
    
}

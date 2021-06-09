/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal1;

/**
 *
 * @author Mr.Good
 */
import java.util.Scanner;
public class mainbos {

    public static void main(String[] args) {
        lingkaran htling = new lingkaran();
        persegi htpersegi = new persegi();
        Scanner input = new Scanner(System.in);
        System.out.println("masukan pilihan anda : ");
        int a= input.nextInt();
        
        if (a==1){
            htling.hitung(8);
        }
        
        else if (a==2) {
            htpersegi.hitung(5, 6);
        }
        
        
        
        // TODO code application logic here
    }
    
}

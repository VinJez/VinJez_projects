/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojistench;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vitje
 */
public class Evidence {
      
      
    private Databaze databaze;
    private Scanner sc = new Scanner(System.in, "Windows-1250");

    public Evidence() {
        databaze = new Databaze();
    }
    
    public void pridejZaznam() {
        System.out.println("Zadejte jméno: ");
        String jmeno = sc.nextLine();
        System.out.println("Zadejte příjmení: ");
        String prijmeni = sc.nextLine();
        System.out.println("Zadejte telefonní číslo: ");
        int telefon = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte věk: ");
        int vek = Integer.parseInt(sc.nextLine());        
        databaze.pridejZaznam(jmeno, prijmeni, vek, telefon);
    }
    public void vypisZaznamy() {
        ArrayList<Zaznam> zaznamy = databaze.getZaznamy();
        for (Zaznam z : zaznamy) {
            System.out.println(z);
        }
        System.out.println("Pokračujte libovolnou klávesou...");
        sc.nextLine();
    }
    public void najdiZaznamy(){
        System.out.println("Zadejte jméno: ");
        String jmeno = sc.nextLine();
        System.out.println("Zadejte příjmení: ");
        String prijmeni = sc.nextLine();
        ArrayList<Zaznam> zaznamy = databaze.najdiZaznamy(jmeno, prijmeni);
        
        if(!zaznamy.isEmpty()) {
            for (Zaznam z: zaznamy) {
                System.out.println(z);
            }
            System.out.println("Pokračujte libovolnou klávesou...");
            sc.nextLine();
        } else {
            System.out.println("Nenalezen žádný pojistění.");
            System.out.println("Pokračujte libovolnou klávesou...");
            sc.nextLine();
        }
    }
    public void vypisUvodniObrazovku() {
        System.out.println("--------------------------");
        System.out.println("Evidence pojistěných");
        System.out.println("--------------------------");
    }
    }
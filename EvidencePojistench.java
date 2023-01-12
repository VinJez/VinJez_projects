/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cz.itnetwork.evidencepojistench;
import java.util.*;
/**
 *
 * @author vitje
 */
public class EvidencePojistench {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");

        
        Evidence evidence = new Evidence();
        String volba = "";
        // hlavní cyklus
        while (!volba.equals("4")) {
            evidence.vypisUvodniObrazovku();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojistěného");
            System.out.println("2 - Vypsat všechny pojistěné");
            System.out.println("3 - Vyhledat pojistěného");
            System.out.println("4 - Konec");
        
            volba = sc.nextLine();
            System.out.println();
            // reakce na volbu
            switch (volba) {
                case "1":
                    evidence.pridejZaznam();
                    break;
                case "2":
                    evidence.vypisZaznamy();
                    break;
                case "3":
                    evidence.najdiZaznamy();
                    break;
                case "4":
                    System.out.println(" Data byla uložena. Pokračujte libovolnou klávesou...");
                    break;
                default:
                System.out.println("Pokračujte libovolnou klávesou...");
                    break;
            }
        }
    }
}


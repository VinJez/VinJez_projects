/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojistench;

import java.util.ArrayList;

/**
 *
 * @author vitje
 */
public class Databaze {
    private ArrayList<Zaznam> zaznamy;
    
    public Databaze() {
        zaznamy = new ArrayList<>();
    }
    
    public void pridejZaznam(String jmeno, String prijmeni, int vek, int telefon) {
        zaznamy.add(new Zaznam(jmeno, prijmeni, vek, telefon));
    }
    public ArrayList<Zaznam> najdiZaznamy(String jmeno, String prijmeni) {
        ArrayList<Zaznam> nalezene = new ArrayList<>();
        for (Zaznam z : zaznamy) {
            if (z.getJmeno().equals(jmeno) || z.getPrijmeni().equals(prijmeni)) {
                nalezene.add(z);
            }
        }
        return nalezene;
    }

    ArrayList<Zaznam> getZaznamy() {
        return zaznamy;
    }
}
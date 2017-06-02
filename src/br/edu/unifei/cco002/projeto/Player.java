/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco002.projeto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gouvea
 */
public abstract class Player {
    private int hp;
    private int armor;
    private int kills;
    private int deaths;
    private int assists;
    List<Grenade> grenades = new ArrayList<Grenade>();
    private PrimaryWeapon primaryWeapon;
    private SecondaryWeapon secondaryWeapon;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public List<Grenade> getGrenades() {
        return grenades;
    }

    public void setGrenades(List<Grenade> grenades) {
        this.grenades = grenades;
    }

    public PrimaryWeapon getPrimaryWeapon() {
        return primaryWeapon;
    }

    public void setPrimaryWeapon(PrimaryWeapon primaryWeapon) {
        this.primaryWeapon = primaryWeapon;
    }

    public SecondaryWeapon getSecondaryWeapon() {
        return secondaryWeapon;
    }

    public void setSecondaryWeapon(SecondaryWeapon secondaryWeapon) {
        this.secondaryWeapon = secondaryWeapon;
    }
    
}

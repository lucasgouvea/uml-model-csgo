/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.cco002.projeto;

/**
 *
 * @author gouvea
 */
public class App {

    public static void main(String[] args)
    {
        Skin skin = new Skin();
        FactoryNew fn = new FactoryNew();
        skin.setState(fn);
        skin.setKills(50);
        System.out.println(" Kills = " + skin.getKills() + " State = " + skin.getState());
        skin.setKills(100);
        System.out.println(" Kills = " + skin.getKills() + " State = " + skin.getState());
        skin.setKills(150);
        System.out.println( " Kills = " + skin.getKills() + " State = " + skin.getState());
        skin.setKills(1000);
        System.out.println(" Kills = " + skin.getKills() + " State = " + skin.getState());
        skin.setKills(1050);
        System.out.println(" Kills = " + skin.getKills() + " State = " + skin.getState());
        skin.setKills(10000);
        System.out.println(" Kills = " + skin.getKills() + " State = " + skin.getState());
        skin.setKills(500000);
        System.out.println(" Kills = " + skin.getKills() + " State = " + skin.getState());
    }
}

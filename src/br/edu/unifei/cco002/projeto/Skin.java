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
public class Skin {
    private int kills;
    private String name;
    private State state;
    private double worth;

    public double getWorth() {
        return worth;
    }

    public void setWorth(double worth) {
        this.worth = worth;
    }
    
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
        state.update(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

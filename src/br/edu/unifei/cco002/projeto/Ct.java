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
public class Ct extends Player{
    private boolean hasDefuse;
    private int defuses;

    public boolean isHasDefuse() {
        return hasDefuse;
    }

    public void setHasDefuse(boolean hasDefuse) {
        this.hasDefuse = hasDefuse;
    }

    public int getDefuses() {
        return defuses;
    }

    public void setDefuses(int defuses) {
        this.defuses = defuses;
    }

}

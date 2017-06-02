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
public class PrimaryWeapon extends Weapon{
    private final PrimaryModel model;
    
    public PrimaryWeapon (PrimaryModel model){
        this.model = model;
    }

    public PrimaryModel getModel() {
        return model;
    }
    
}

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
public class SecondaryWeapon extends Weapon{
    private final SecondaryModel model;
    
    public SecondaryWeapon(SecondaryModel model){
        this.model = model;
    }

    public SecondaryModel getModel() {
        return model;
    }
}

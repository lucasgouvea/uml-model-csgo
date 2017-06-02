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
public class BattleScarred implements State{

    @Override
    public void update(Skin skin) {
        float worth = (float) (1 - (skin.getKills()*0.00001)); //fórmula para cálculo do valor da skin
        skin.setWorth(worth);
    }


    
}

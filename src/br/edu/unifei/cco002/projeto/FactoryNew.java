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
public class FactoryNew implements State{
    
    
    public FactoryNew(State state)
    {
        
    }

    FactoryNew() {

    }
    @Override
    public void update(Skin skin) {
        float worth = (float) (10 - (skin.getKills()*0.05)); //fórmula para cálculo do valor da skin
        skin.setWorth(worth);
        if(skin.getWorth() <= 5) 
        {
            skin.setState(new FieldTested());
        }
    }
    
}

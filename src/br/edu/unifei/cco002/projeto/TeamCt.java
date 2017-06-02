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
public class TeamCt extends Team {
    
    
    List<Ct> cts = new ArrayList<Ct>();
    @Override
    public int totalObjectives(){
        int totalDefuses = 0;
        for(int i = 0; i < cts.size() ; i++)
        {
            totalDefuses += cts.get(i).getDefuses();
        }
        return totalDefuses;
    }
}

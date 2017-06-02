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
public class TeamTr extends Team{
   
    List<Terrorist> trs = new ArrayList<Terrorist>();
    @Override
    public int totalObjectives(){
        int totalPlants = 0;
        for(int i = 0; i < trs.size() ; i++)
        {
            totalPlants += trs.get(i).getPlants();
        }
        return totalPlants;
       
    }
}

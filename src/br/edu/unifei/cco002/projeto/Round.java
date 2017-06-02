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
public class Round {
    private Team winner;
    private TeamCt teamCt;
    private TeamTr teamTr;
    public Round(TeamCt teamCt, TeamTr teamTr ){
        this.teamCt = teamCt;
        this.teamTr = teamTr;
    }
}

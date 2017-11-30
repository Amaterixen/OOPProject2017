/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playersapp;

import java.io.Serializable;

/**
 * Dota2.java
 * 
 * @author dell
 */
public class Dota2 extends Players implements Serializable{
    private String team;
    private String role;
    private String main;
    private String sponsor;
    
    public Dota2(){
        super();
        team = "";
        role = "";
        main = "";
        sponsor = "";        
    }

    public Dota2(String name, String region, String status, String winrate, String team, String role, String main, String sponsor) {
        super(name, region, status, winrate);
        this.team = team;
        this.role = role;
        this.main = main;
        this.sponsor = sponsor;
    }

    public String getTeam() {
        return team;
    }

    public String getRole() {
        return role;
    }

    public String getMain() {
        return main;
    }
    
    public String getSponsor() {
        return sponsor;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }
    
    
}

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
 * Initially created 15/11/2017
 * 
 * Date last modified 27/11/2017
 * 
 * @author Ting Hao Chang (x16370076)
 */

//The Extends command lets the programmer bring over information from the superclass.
//The Serializable command allows for Polymorphism
public class Dota2 extends Players implements Serializable{
    private String team;
    private String role;
    private String main;
    private String sponsor;
    
    public Dota2(){
        //Pulls variables from Players superclass
        super();
        team = "";
        role = "";
        main = "";
        sponsor = "";        
    }

    //This constructor is Inheriting variables from the Players class.
    public Dota2(String name, String region, String status, String winrate, String team, String role, String main, String sponsor) {
        //Inherits variables from the Players superclass
        super(name, region, status, winrate);
        this.team = team;
        this.role = role;
        this.main = main;
        this.sponsor = sponsor;
    }

    //Here are the getters
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

    //Here are the setters
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

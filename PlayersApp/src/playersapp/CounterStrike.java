/*
 *CounterStrike.java
 *@author Ciaran Brady x16348791
 * created: 15/11/17
 *last modified: 22/11/17
 */
package playersapp;

import java.io.Serializable;

public class CounterStrike extends Players implements Serializable {
    private String teamCS;
    private String roleCS;
    private String sponsorCS;
    
    public CounterStrike(){
        super();
        teamCS ="";
        roleCS ="";
        sponsorCS ="";
    }
    
   //this constructor conects the variables to the super class Player.java - ciaran x16348791
    public CounterStrike(String teamCS, String roleCS, String sponsor, String name, String region, String status, String winrate) {
        super(name, region, status, winrate);
        this.teamCS = teamCS;
        this.roleCS = roleCS;
        this.sponsorCS = sponsor;
    }

   //Setters and Getters for CounterStrike variables - ciaran x16348791
    public String getTeamCS() {
        return teamCS;
    }

    public void setTeamCS(String teamCS) {
        this.teamCS = teamCS;
    }

    public String getRoleCS() {
        return roleCS;
    }

    public void setRoleCS(String roleCS) {
        this.roleCS = roleCS;
    }

    public String getSponsorCS() {
        return sponsorCS;
    }

    public void setSponsorCS(String sponsor) {
        this.sponsorCS = sponsorCS;
    }
    
    
}

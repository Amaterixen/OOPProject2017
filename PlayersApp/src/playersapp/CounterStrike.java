/*
 *CounterStrike.java
 *@author Ciaran Brady x16348791
 *22/11/17
 */
package playersapp;

import java.io.Serializable;

public class CounterStrike extends Players implements Serializable {
    private String teamCS;
    private String roleCS;
    private String sponsor;
    
    public CounterStrike(){
        super();
        teamCS ="";
        roleCS ="";
        sponsor ="";
    }

    public CounterStrike(String teamCS, String roleCS, String sponsor, String name, String region, String status, String winrate) {
        super(name, region, status, winrate);
        this.teamCS = teamCS;
        this.roleCS = roleCS;
        this.sponsor = sponsor;
    }

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

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }
    
    
}

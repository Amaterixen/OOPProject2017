/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playersapp;

import java.io.Serializable;

/**
 *
 * @author dell
 */
public class Players implements Serializable{
    protected String name;
    protected String region;
    protected String status;
    protected String winrate;

    public Players(String name, String region, String status, String winrate) {
        this.name = name;
        this.region = region;
        this.status = status;
        this.winrate = winrate;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setWinrate(String winrate) {
        this.winrate = winrate;
    }

    public String getName() {
        return name;
    }
    
    public String getRegion() {
        return region;
    }

    public String getStatus() {
        return status;
    }

    public String getWinrate() {
        return winrate;
    }
    
    
}

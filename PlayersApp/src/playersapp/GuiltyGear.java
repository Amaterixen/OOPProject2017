/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playersapp;

import java.io.Serializable;

/**
 *GuiltyGear.java
 * 
 * Date Initially Created: 15/11/2017
 * 
 * Date last modified: 29/11/2017
 * 
 * @author Joshua Cassidy (x16465134)
 */

//Extends the Players superclass, so that data can be pulled from it and used.
//Making the class Serializable 
public class GuiltyGear extends Players implements Serializable{
    private String main;
    private String controller;
    private String sponsor;

    public GuiltyGear(){
        super();
        main = "";
        controller = "";
        sponsor = "";
    }
    
    //Retrieves variables and data types from the Players superclass
    public GuiltyGear(String name, String region, String status, String winrate, String main, String controller, String sponsor) {
        //Initialises the pulled variables
        super(name, region, status, winrate);
        this.main = main;
        this.controller = controller;
        this.sponsor = sponsor;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getMain() {
        return main;
    }

    public String getController() {
        return controller;
    }

    public String getSponsor() {
        return sponsor;
    }
    
    
}

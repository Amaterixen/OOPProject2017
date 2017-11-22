/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playersapp;

/**
 *
 * @author dell
 */
public class GuiltyGear extends Players{
    private String main;
    private String controller;
    private String sponsor;

    public GuiltyGear(String name, String region, String status, String winrate,String main, String controller, String sponsor) {
        super(name, region, status, winrate);
        this.main = main;
        this.controller = controller;
        this.sponsor = sponsor;
    }
    
    public void GuiltyGear(){
        main = "";
        controller = "";
        sponsor = "";
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

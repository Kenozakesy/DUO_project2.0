package com.example.gebruiker.androidproject20.ActivityClasses;

/**
 * Created by Casper Somers on 08/04/2017.
 */

public class ListProvider {
    private String count, playero, playertw, playerth, playerf;

    public ListProvider(String count, String playero, String playertw, String playerth, String playerf){
        this.setCount(count);
        this.setPlayero(playero);
        this.setPlayertw(playertw);
        this.setPlayerth(playerth);
        this.setPlayerf(playerf);

    }

    public String getCount(){
        return count;
    }

    public void setCount(String count){
        this.count = count;
    }

    public String getPlayero(){
        return playero;
    }

    public void setPlayero(String playero){
        this.playero = playero;
    }

    public String getPlayertw(){
        return playertw;
    }

    public void setPlayertw(String playertw){
        this.playertw = playertw;
    }
    public String getPlayerth(){
        return playerth;
    }

    public void setPlayerth(String playerth){
        this.playerth = playerth;
    }
    public String getPlayerf(){
        return playerf;
    }

    public void setPlayerf(String playerf){
        this.playerf = playerf;
    }

}

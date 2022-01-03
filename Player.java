/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cloud
 */

import java.util.Arrays;

public class Player {
    
    private String playerName = "";
    private String playerPosition = "";
    SeasonRecord record = new SeasonRecord();
    
    public Player(String playerName, String playerPosition)
    {
        this.playerName = playerName;
        this.playerPosition = playerPosition;
        
    }
    
    public void setPlayerName(String newName)
    {
        this.playerName = newName;
    }
    
    public void setPlayerPosition(String newPosition)
    {
        this.playerPosition = newPosition;
        
    }
    public String getPlayerName()
    {
        return this.playerName;
    }
    public void addScore(double score)
    {
        record.addScore(score);
    }
    
    public void viewStats()
    {
        Double[] stats = record.getScores();
        
        System.out.println("Stats for " + playerName + ":");
        System.out.println("----------------------------------");
        for (double value : stats) 
        {
            System.out.println("Score: " + value);
                    
        }
    }
    
}

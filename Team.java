
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cloud
 */
public class Team
{    
    String teamName = "";
    int teamID;
    Player teamRoster[] = new Player[1];
    
    public Team(String teamName, int teamID)
    {
        this.teamName = teamName;
        this.teamID = teamID;
    }
    
    public void setTeamName(String newName)
    {
        this.teamName = newName;
    }
    public int getTeamID()
    {
        return this.teamID;
    }
    
    public void addToRoster(Player player)
    {
        if (teamRoster.length == 1)
                {
                    teamRoster[0] = player;
                }
        else 
                {
                    teamRoster = Arrays.copyOf(teamRoster, teamRoster.length + 1);
                    teamRoster[teamRoster.length - 1] = player;
                }
    }
    public void checkRoster()
    {
        
    }
    
}

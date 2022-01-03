
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cloud
 */
public class SeasonRecord 
{
    private Double[] stats = {0.0};
    
    public SeasonRecord()
    {
        
    }
    
    public void addScore(double score)
    {
        if (stats[0] == 0.0)
                {
                    stats[0] = score;
                }
        else 
                {
                    stats = Arrays.copyOf(stats, stats.length + 1);
                    stats[stats.length - 1] = score;
                }
        
    }
    
    public Double[] getScores()
    {
        return this.stats;
    }
}

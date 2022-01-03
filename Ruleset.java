/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cloud
 */
public class Ruleset {
    
   private double receivingMod = 0.1;
   private double passingMod = .04;
   private double intMod = -2.0;
   private double rushingMod = 0.1;
   private double tdPassMod = 4.0;
   private double tdCatchMod = 6.0;
   private double tdRunMod = 6.0;
   private double twoPointMod = 2.0;
   private double fumbleMod = -2.0;
   private double catchMod = 0; 
   private int rulesetSetting = 1;
  
   public int getRulesetSetting()
   {
       return this.rulesetSetting;
   }
   
   public void setRulesetSetting(int i)
           
   {
       this.rulesetSetting = i;
   }
   
   public void setRuleset(int input)
   {
       //1 = standard
       //2 = PPR
       //3 = .5 PPR
       switch (input)
       {
           case 1: 
               this.catchMod = 0;
               break;
           case 2:
               this.catchMod = 1;
               break;
           case 3:
               this.catchMod = 0.5;
               break;
       }
   }
   
   public double getReceivingMod()
   {
       return this.receivingMod;
   }
    public double getPassingMod()
   {
       return this.passingMod;
   }
   public double getIntMod()
   {
        return this.intMod;
   }
   public double getRushingMod()
   {
       return this.rushingMod;
   }
   public double gettdPassMod()
   {
       return this.tdPassMod;
   }
   public double gettdCatchMod()
   {
       return this.tdCatchMod;
   }
   public double gettdRunMod()
   {
       return this.tdRunMod;
   }
   public double gettwoPointMod()
   {
       return this.twoPointMod;
   }
   public double getfumbleMod()
   {
       return this.fumbleMod;
   }
   public double getCatchMod()
   {
       return this.catchMod;
   }
}

package kap9.kap_9_3_12;

import java.util.Random;

class Main
{
  public static void main(String[] args)
  {
    Random rgen = new Random(55); // immer gleichen Ablauf forcieren
    Division d = new Division();
    try
    {
      while(true)
      {
        double zaehler = rgen.nextInt(2);
        double nenner = rgen.nextInt(2);
        
        System.out.print(zaehler+" / "+nenner+" = ");
        
        double quotient = d.dividiere(zaehler, nenner);
        System.out.println(quotient);
      }
    }
    catch (IllegalArgumentException e)
    {
      System.out.println(e.getMessage());
    }
  }
}

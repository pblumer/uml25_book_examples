package kap9.kap_9_3_9;

import java.util.concurrent.TimeUnit;

public class Zaehler extends Thread
{
  private int zahl;
  
  Zaehler(String name, int z)
  {
    super(name);
    zahl = z;
  }
  
  @Override
  public void run() 
  {
    for (int i = 1; i <= zahl; i++) 
    {
      System.out.println(getName()+": " + i);
      try 
      {
        TimeUnit.MILLISECONDS.sleep(100);
      } 
      catch (InterruptedException ignore) {}
    }
  }
}

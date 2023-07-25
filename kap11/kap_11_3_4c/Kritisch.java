package kap11.kap_11_3_4c;

import java.util.concurrent.TimeUnit;

class Kritisch extends Thread
{
  private String name;
  private Konto konto;
  
  Kritisch(String name, Konto konto)
  {
    this.name = name;
    this.konto = konto;
  }
  
  private void incKontostand()
  {
    synchronized(konto) //Kommentieren Sie diese Zeile aus, um einen unsynchronisierten Zugriff zu erhalten
    {
      System.out.println(name+": kontostand = " + konto.kontostand);
    
      // sleep() innerhalb einer kritischen Sektion nur dur Demo!
      try {
        TimeUnit.MILLISECONDS.sleep(100);
      } catch(InterruptedException ignore) {};
    
      konto.kontostand += 1;
      
      System.out.println(name+": kontostand = " + konto.kontostand +"\n"); 
    }
  }
  
  @Override
  public void run()
  {
    for(int z=0; z < 5; ++z)
    {
      incKontostand();
    }
  }
}

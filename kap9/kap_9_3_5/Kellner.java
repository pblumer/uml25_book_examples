package kap9.kap_9_3_5;

import java.util.Observable;
import java.util.Observer;

public class Kellner implements Observer
{
  protected String name;
  
  public String getName()
  {
    return name;
  }
  
  Kellner(String n)
  {
    name = n;
  }
  
  @Override
  public void update(Observable subject, Object signal)
  {
    var gast = (Gast)subject;
    System.out.println(gast.getName()+" => "+name+": "+signal);
  }
}

package kap9.kap_9_3_5;

import java.util.Observable;

class Gast extends Observable
{
  protected String name;
  
  public String getName()
  {
    return name;
  }
  
  Gast(String n)
  {
    name = n;
  }
  
  public void notify(Object signal)
  {
    setChanged();
    notifyObservers(signal);
  }
  
  void kellnerRufen()
  {
    notify("Kellner!");
  }
}

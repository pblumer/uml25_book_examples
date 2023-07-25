package kap2.kap_2_3_15;

import java.util.List;
import java.util.ArrayList;

class Kollektion<T>
{
  protected List<T> inhalt = new ArrayList<>();
  public void hinzufuegen(T elem)
  {
    inhalt.add(elem);
  }
  public void entfernen(T elem)
  {
    inhalt.remove(elem);
  }
  public void praesentieren()
  {
    for (var temp : inhalt) {
      System.out.println(temp);
    }
  }
}
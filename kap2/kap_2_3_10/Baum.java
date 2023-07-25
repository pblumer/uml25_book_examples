package kap2.kap_2_3_10;

import java.util.List;
import java.util.ArrayList;

class Baum
{
  private List<Blatt> bl = new ArrayList<>();

  public void addBlatt(int nr)
  {
    bl.add(new Blatt(nr));
  }
  public Blatt getBlatt()
  {
    var blatt = bl.get(bl.size()-1);
    return new Blatt(blatt.blattNr);
  }
  
  public static void main(String[] args)
  {
    Baum b = new Baum();
    Blatt blatt;
    
    for(int i = 0; i < 20; i++)
      b.addBlatt(i);
    blatt = b.getBlatt();
    System.out.println(blatt.blattNr);
    
  }
}

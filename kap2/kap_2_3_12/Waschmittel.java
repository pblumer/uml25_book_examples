package kap2.kap_2_3_12;

import java.util.ArrayList;
import java.util.List;

class Waschmittel
{
  public String farbe = "Weiß";
  protected int pulvergroesse = 3;
  private List<String> bestandteil = new ArrayList<>() {{
    add("Waschpulver");
  }};
    
  public void reinigen()
  {
    System.out.println("Reinigung durch Waschmittel");
  }
}

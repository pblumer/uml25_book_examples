package kap2.kap_2_3_9;

import java.util.List;
import java.util.ArrayList;

class Restaurant
{
  List<Stuhl> stuhl = new ArrayList<>();
  
  void addStuhl(Stuhl s)
  {
    stuhl.add(s);
  }
  Stuhl removeStuhl()
  {
    return stuhl.remove(stuhl.size()-1);
  }

  public static void main(String[] args)
  {
    Restaurant r = new Restaurant();
    Stuhl[] reservoir = { new Stuhl(1), new Stuhl(5) };
    for(var s : reservoir) {
      r.addStuhl(s);
    }
    for(int i = 0; i < 2; i++) {
      var s = r.removeStuhl();
      System.out.println(s.stuhlNr);
    }
  }
}


package kap9.kap_9_3_5;

class Main
{
  public static void main(String[] args)
  {
    Kellner kellner1 = new Kellner("Kellner1");
    Kellner kellner2 = new Kellner("Kellner2");
    Gast gast1 = new Gast("Gast1");
    Gast gast2 = new Gast("Gast2");
    
    gast1.addObserver(kellner1);
    gast1.addObserver(kellner2);
    
    gast2.addObserver(kellner2);
    
    gast1.kellnerRufen();
    gast2.kellnerRufen();
  }
}

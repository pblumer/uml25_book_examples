
package kap3.kap_3_3_1;

class Gast
{
  public static String status = "König";
  
  private EUR geldbetrag;
  protected boolean hunger;
  
  public Gast(EUR g, boolean h)
  {
    geldbetrag = g;
    hunger = h;
  }
  public Gast(EUR g)
  {
    this(g, true);
  }
}

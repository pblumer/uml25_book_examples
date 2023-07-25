package kap2.kap_2_3_16;

class Main
{
  public static void main(String[] args)
  {
    Gast gast = new Gast();
    gast.mittagessen = new Gericht("Wiener-Schnitzel");
    gast.mittagessen.wirdGegessen();
  }
}

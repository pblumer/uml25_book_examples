package kap2.kap_2_3_6;

import java.util.List;

class Menue
{
  Vorspeise vorspeise;
  Hauptgericht hauptgericht;
  Dessert dessert;
  
  Menue(Vorspeise v, Hauptgericht h, Dessert d)
  {
    vorspeise = v;
    hauptgericht = h;
    dessert = d;
  }

  // ==========================
  // Beispielnutzung
  public static void main(String[] args) {
    Vorspeise v = new Vorspeise();
    Hauptgericht h1 = new Hauptgericht();
    Hauptgericht h2 = new Hauptgericht();
    Dessert d = new Dessert();

    Menue m1 = new Menue(v, h1, d);
    Menue m2 = new Menue(v, h2, d);

    v.menue.add(m1);
    v.menue.add(m2);
    h1.menue.add(m1);
    h2.menue.add(m2);
    d.menue.add(m1);
  }
}

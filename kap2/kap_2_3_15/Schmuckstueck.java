package kap2.kap_2_3_15;

class Schmuckstueck
{
  public String bezeichnung;

  Schmuckstueck(String bez)
  {
    bezeichnung = bez;
  }
  
  @Override
  public String toString() {
    return bezeichnung;
  }
}

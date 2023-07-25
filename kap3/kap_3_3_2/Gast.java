package kap3.kap_3_3_2;

class Gast
{
  Kellner bedienung;
  
  void setKellner(Kellner k)
  {
    bedienung = k;
    k.kunde = this;
  }

  // ======================
  // zur Demonstration
  @Override
  public String toString() {
    return "Gast [bedienung=" + bedienung.hashCode() + "]";
  }
}


package kap3.kap_3_3_2;

class Kellner
{
  Gast kunde;
  
  void setGast(Gast g)
  {
    kunde = g;
    g.bedienung = this;
  }

  // ======================
  // zur Demonstration
  @Override
  public String toString() {
    return "Kellner [kunde=" + kunde.hashCode() + "]";
  }
}

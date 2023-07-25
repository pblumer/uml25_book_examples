package kap2.kap_2_3_12;

class WollWaschmittel extends Waschmittel
{
  @Override
  public void reinigen()
  {
    super.reinigen();
    System.out.println("Reinigung durch WollWaschmittel");
  }
  
  public void wollePflegen()
  {
    System.out.println("Woll-Pflege durch WollWaschmittel");
  }
}

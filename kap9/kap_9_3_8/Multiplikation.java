package kap9.kap_9_3_8;

class Multiplikation
{
  int multipliziere(int multiplikator, int multiplikand)
  {
    int produkt = 0;    
    for(int i=0; i < Math.abs(multiplikand); i++)
    {
      if(multiplikand >= 0)
        produkt += multiplikator;
      else
        produkt -= multiplikator;
    }
    return produkt;
  }
  
  public static void main(String[] args)
  {
    var m = new Multiplikation();    
    var produkt = m.multipliziere(-10,20);
    System.out.println(produkt);
  }
}

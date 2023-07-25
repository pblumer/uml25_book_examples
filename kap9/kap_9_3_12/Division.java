package kap9.kap_9_3_12;

class Division
{  
  double dividiere(double zaehler, double nenner)
    throws IllegalArgumentException
  {
    if(nenner == 0.0)
      throw new IllegalArgumentException("Nenner ist gleich 0.0");    
    return zaehler/nenner;
  }
}

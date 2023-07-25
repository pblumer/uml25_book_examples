package kap2.kap_2_3_15;

class Main
{
  public static void main(String[] args)
  {
    var s1 = new Schmuckstueck("Ohrring");
    var s2 = new Schmuckstueck("Halskette");
    var s3 = new Schmuckstueck("Diamant-Ring");
  
    Kollektion<Schmuckstueck> schmuckKollektion= new Kollektion<>();
  
    schmuckKollektion.hinzufuegen(s1);
    schmuckKollektion.hinzufuegen(s2);
    schmuckKollektion.hinzufuegen(s3);
  
    schmuckKollektion.praesentieren();
  }  
}

package kap2.kap_2_3_5;

class Mitarbeiter
{
  Mitarbeiter vorgesetzter;
  Mitarbeiter[] unterstellter;

  Mitarbeiter(int mx) {
    unterstellter = new Mitarbeiter[mx];
  }
  
  // ==============================
  // Beispielnutzung
  public static void main(String[] args)
  {
    Mitarbeiter v = new Mitarbeiter(10);
    v.vorgesetzter = new Mitarbeiter(1);
    for(int i=0; i<10; ++i) {
      v.unterstellter[i] = new Mitarbeiter(1);
    }
  }
}

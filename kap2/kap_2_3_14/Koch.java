package kap2.kap_2_3_14;

class Koch extends Mitarbeiter
{ 
  Koch(int paNr)
  {
    super(paNr);
  }

  @Override
  public void arbeiten()
  {
    System.out.println("Ich arbeite");
  }

  public static void main(String[] args)
  {
    Koch k = new Koch(12345);
    System.out.println(k.persAusweisNr);
    System.out.println(k.gehalt);
    k.arbeiten();
  }
}

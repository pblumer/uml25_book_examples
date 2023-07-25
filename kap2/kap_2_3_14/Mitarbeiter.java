package kap2.kap_2_3_14;

abstract class Mitarbeiter
{
  protected int persAusweisNr;
  protected int gehalt;

  protected Mitarbeiter(int paNr)
  {
    persAusweisNr = paNr;
    gehalt = 1500;
  }

  public abstract void arbeiten();
}


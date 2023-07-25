package kap2.kap_2_3_2;

class Gast
{
  public static final double MIN = 200.0;
  public static String status = "König";
  private double geldbetrag;
  boolean hunger = true;
  protected String[] freunde = new String[10];
  public char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
  public boolean freundeEinladen() {
    return geldbetrag > MIN;
  }
}

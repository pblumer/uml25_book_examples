package kap2.kap_2_3_3;

import java.io.IOException;

class Gast {
  public static final double MIN = 200.0;
  public static String status = "König";
  private double geldbetrag;
  boolean hunger = true;
  protected String[] freunde = new String[10];
  public char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

  public boolean freundeEinladen() {
    return geldbetrag > MIN;
  }

  public void setGeldbetrag(double geldbetrag) {
    if (geldbetrag > 0.0)
      this.geldbetrag = geldbetrag;
  }

  public double getGeldbetrag() {
    return geldbetrag;
  }

  public static String getMINAsString() {
    return "Mindestgeldbetrag: " + MIN;
  }

  public void setFreund(final String freund, int pos) {
    if (pos <= 9 && pos >= 0)
      freunde[pos] = freund;
  }

  protected void getBesterFreund(Appendable freund) {
    try {
      freund.append(freunde[0]);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public String[] getFreunde()
  {
    return freunde;
  }

  public String getAlphabet(int start, int end)
  {
    return new String(alphabet, start, end-start);
  }

  public Gericht bestellt(Menuepunkt menuepunkt)
  {
    var koch = new Koch();
    return koch.kocht(menuepunkt);
  }

  public Gericht bestellt(int nummer)
  {
    return bestellt(new Menuepunkt(nummer));
  }

  public double zahlt(double d)
  {
    return 0.0;  
  }

  // =================================
  // für Tests
  public static void main(String[] args) 
  {
    System.out.println(new Gast().getAlphabet(0, 26));
  }

}

// ====================================
// Platzhalter Code
class Gericht {
}
class Menuepunkt {
  public Menuepunkt(int num) {}
}
class Koch {
  public Gericht kocht(Menuepunkt m) { return new Gericht(); }
}
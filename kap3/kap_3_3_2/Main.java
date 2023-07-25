package kap3.kap_3_3_2;

class Main
{
  public static void main(String[] args)
  {
    Gast maren = new Gast();
    Kellner mathias = new Kellner();
    
    maren.setKellner(mathias);
    //mathias.setGast(maren); nicht nötig

    System.out.println("Gast: " + maren);
    System.out.println("Kellner: " + mathias);
  }
}

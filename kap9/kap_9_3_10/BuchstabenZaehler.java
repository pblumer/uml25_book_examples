package kap9.kap_9_3_10;

class BuchstabenZaehler
{
  void zaehleBuchstaben(String text)
  {
    int klein = 0;
    int gross = 0;
  
    for(int i = 0; 
        i < text.length();
        i++ )
    {
      if(Character.isUpperCase(text.charAt(i)))
        gross++;
      else
        klein++;
    }
    
    System.out.println("Grossbuchstaben: "+gross);
    System.out.println("Kleinbuchstaben: "+klein);
  }
  
  public static void main(String[] args)
  {
    BuchstabenZaehler b = new BuchstabenZaehler();
    
    b.zaehleBuchstaben("RheinwerkComputing");
  }
}

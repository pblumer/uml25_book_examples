package kap2.kap_2_3_16;

class Gericht implements Nahrung
{
  public String name;
  
  public Gericht(String n)
  {
    name = n;
  }

  @Override
  public void wirdGegessen()
  {
    System.out.println("Gericht "+name+" wird gegessen");
  }
}

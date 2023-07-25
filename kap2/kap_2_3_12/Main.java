package kap2.kap_2_3_12;

class Main
{
  public static void main(String[] args)
  {
    System.out.println("ColorWaschmittel:");
    ColorWaschmittel cw = new ColorWaschmittel();
    System.out.println(cw.colorpflege);
    System.out.println("Pulvergroesse: "+cw.pulvergroesse);
    cw.reinigen();
    System.out.println();
    
    System.out.println("WollWaschmittel:");
    WollWaschmittel ww = new WollWaschmittel();
    System.out.println("Farbe: "+ww.farbe);
    ww.wollePflegen();
    ww.reinigen();
  }
}

package kap9.kap_9_3_4;

import java.io.Console;

class Objektfluss
{
  Eingabe eingabeLesen()
  {
    Console console = System.console();
    Eingabe eingabe = new Eingabe(console.readLine("Eingabe: "));
    return eingabe;
  }

  void eingabeAusgeben(Eingabe eing)
  {
    System.out.println("Ausgabe: " + eing.e);
  }

  public static void main(String[] args)
  {
    Objektfluss o = new Objektfluss();
    Eingabe eing = o.eingabeLesen();
    o.eingabeAusgeben(eing);
  }
}

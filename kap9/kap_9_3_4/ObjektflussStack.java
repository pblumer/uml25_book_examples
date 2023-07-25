package kap9.kap_9_3_4;

import java.util.Stack;

class ObjektflussStack
{
  Eingabe eingabeLesen()
  {
    return new Eingabe(System.console().readLine("Eingabe: "));
  }

  void eingabeAusgeben(Eingabe eing)
  {
    System.out.println("Ausgabe: " + eing.e);
  }

  public static void main(String[] args)
  {
    ObjektflussStack o = new ObjektflussStack();
    Stack<Eingabe> s = new Stack<>();
    
    for(int i = 0; i < 5; i++)
    {
      s.push(o.eingabeLesen());
    }
    
    for(int i = 0; i < 5; i++)
    {
      o.eingabeAusgeben(s.pop());
    }
  }
}

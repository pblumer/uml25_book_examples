package kap10.kap_10_3_9;

import java.io.Console;

class Parkautomat
{
  protected enum ZustandsWerte {
    RUHE,
    BARZAHLUNG,
    RUECKZAHLUNG,
    BELEGDRUCK,
  }

  /** Nur zu Demo-Zwecken. */
  protected enum ZustandHandler {
    RUHE {
      @Override void handle(Event e) { /*...*/}
    },
    BARZAHLUNG {
      @Override void handle(Event e) { /*...*/}
    },
    RUECKZAHLUNG {
      @Override void handle(Event e) { /*...*/}
    },
    BELEGDRUCK {
      @Override void handle(Event e) { /*...*/}
    };
    abstract void handle(Event e);
  }

  private ZustandsWerte zustand = null;  
  private int betrag = 0;
  
  private Console console = System.console();
  
  protected Event getEvent()
  {     
    while(true)
    {
      String input = console.readLine("Event: ");
      char c0 = input.length()>=1 ? input.charAt(0) : 0;
      char c1 = input.length()>=2 ? input.charAt(1) : 0;
      switch(c0)
      {
      case 'M':
        switch(c1)  {
          case '1': case '2': case '5':
            return new Event(c0, c1-'0');
        }
        break;
      case 'G':
      case 'R':
        return new Event(c0, 0);
      }
    }
  }
  
  private ZustandsWerte RUHE()
  {
    console.printf("\nZustand: RUHE\n");
    betrag = 0;
    while(zustand.equals(ZustandsWerte.RUHE))
    {
      Event e = getEvent();   
      switch (e.msg) {
        case 'M':
          betrag += e.value;
          return ZustandsWerte.BARZAHLUNG;
        default:
          break;
      }
    }
    return ZustandsWerte.RUHE;
  }
  
  private ZustandsWerte BARZAHLUNG()
  {
    console.printf("\nZustand: BARZAHLUNG\n");
    console.printf("Betrag: %d\n", betrag);
    while(zustand.equals(ZustandsWerte.BARZAHLUNG))
    {
      Event e = getEvent();
      switch (e.msg) {
        case 'M':
          betrag += e.value;
          return ZustandsWerte.BARZAHLUNG;
        case 'G':
          return ZustandsWerte.BELEGDRUCK;
        case 'R':
          return ZustandsWerte.RUECKZAHLUNG;
        default:
          break;
      }
    }
    return ZustandsWerte.RUHE;
  }
  
  private ZustandsWerte BELEGDRUCK()
  {
    console.printf("\nZustand: BELEGDRUCK\n");
    console.printf("Parkzeit: %.1f h\n", betrag/2.0);
    return ZustandsWerte.RUHE;
  }
  
  private ZustandsWerte RUECKZAHLUNG()
  {
    console.printf("\nZustand: RUECKZAHLUNG\n");
    console.printf("Rückzahlung: %d\n", betrag);
    return ZustandsWerte.RUHE;
  }
  
  public void start()
  {
    zustand = ZustandsWerte.RUHE;    
    while(true)
    {
      switch (zustand) {
        case RUHE:
          zustand = RUHE();
          break;
        case BARZAHLUNG:
        zustand = BARZAHLUNG();
          break;
        case BELEGDRUCK:
          zustand = BELEGDRUCK();
          break;
        case RUECKZAHLUNG:
          zustand = RUECKZAHLUNG();
          break;
        default:
          console.printf("FEHLER\n");
          zustand = ZustandsWerte.RUHE;
          break;
      }
    }
  }
}

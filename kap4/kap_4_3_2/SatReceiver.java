package kap4.kap_4_3_2;

class SatReceiver
{
  private String signalSender1 = "Fernsehsignal von Sender1";
  private String signalSender2 = "Fernsehsignal von Sender2";

  private String getSignalSender1()
  {
    return signalSender1;
  }
  private String getSignalSender2()
  {
    return signalSender2;
  }

  public Fernsehsignal scartanschluss = new ScartPort();
  
  private class ScartPort implements Fernsehsignal {
    @Override public String getFernsehsignal(String sender)
    {
      switch(sender) {
        case "sender1": return getSignalSender1();
        case "sender2": return signalSender2;
        default: return "Schnee";
      }
    }    
  };

}

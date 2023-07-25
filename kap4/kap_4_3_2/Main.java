package kap4.kap_4_3_2;

class Main {
  public static void main(String[] args) {
    SatReceiver sat = new SatReceiver();

    System.out.println(sat.scartanschluss.getFernsehsignal("sender1"));
    System.out.println(sat.scartanschluss.getFernsehsignal("sender2"));
    System.out.println(sat.scartanschluss.getFernsehsignal("sender3"));
    // System.out.println(sat.sender1); //Compiler-Fehler
  }
}

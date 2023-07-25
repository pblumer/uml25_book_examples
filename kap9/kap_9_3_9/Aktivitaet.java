package kap9.kap_9_3_9;

class Aktivitaet {
  public static void main(String[] args) {
    System.out.println("Zählen beginnt");

    var z1 = new Zaehler("Thread A", 3);
    var z2 = new Zaehler("Thread B", 6);
    z1.start();
    z2.start();

    try {
      z1.join();
      z2.join();
    }
    catch (InterruptedException ignore) {}
    
    System.out.println("Zählen beendet");
  }
}

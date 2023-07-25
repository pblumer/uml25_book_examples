package kap11.kap_11_3_4c;

class Main
{
  public static void main(String[] args) throws InterruptedException
  {
    Konto konto = new Konto(); // gemeinsam
    new Kritisch("Thread 1", konto)
      .start();
    new Kritisch("Thread 2", konto)
      .start();
  } // JVMs impliziter join() auf allen Threads
}

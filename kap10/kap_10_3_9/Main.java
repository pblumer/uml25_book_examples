package kap10.kap_10_3_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** Demo Klasse. */
class Main
{

  /** Um statt getEvent() von der Konsole lesen zu lassen, schreiben
   * wir für diese Demo einen Parkautomat-Simulator, der stattdessen
   * seine Events aus seinen Konstruktorargumenten erzeugt.
   */
  private static class ParkautomatSim extends Parkautomat {
    List<Event> events;

    /** @param args -- je ein string mit 2 Buchstaben. */
    ParkautomatSim(String ...args) {
      var ls = Arrays.stream(args)
        .map((String arg) -> new Event(arg.charAt(0), arg.charAt(1)-'0'))
        .collect(Collectors.toList());
      events = new ArrayList<>(ls); // klonen
    }

    /** Da der eine Endlosschleife nutzt, werfen wir zum Beenden
     * der Simulation eine Exception.
     * @throws ArrayIndexOutOfBoundsException
     */
    @Override protected Event getEvent() {
      if(events.size() == 0)
        throw new ArrayIndexOutOfBoundsException("Programmende");
      return events.remove(0);
    }
  }

  public static void main(String[] args)
  {
    Parkautomat p = new ParkautomatSim("M5", "M2", "G0", "R0");
    try {
      p.start();
    } catch(ArrayIndexOutOfBoundsException ex) {
      System.console().printf("\nProgrammende\n");
    }
  }
}


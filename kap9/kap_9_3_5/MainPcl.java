package kap9.kap_9_3_5;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class MainPcl
{

  static class Kellner implements PropertyChangeListener {
    protected String name;
    Kellner(String n) {
      name = n;
    }
    public String getName() {
      return name;
    }
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
      var source = (Gast)evt.getSource();
      System.out.println(source.getName()+" => "+name+": "+evt.getNewValue());
  }
}

  static class Gast {
    private PropertyChangeSupport support;
    protected String name;
    Gast(String n) {
      name = n;
      support = new PropertyChangeSupport(this);
    }
    public String getName() {
      return name;
    }
    void addObserver(PropertyChangeListener pcl) {
      support.addPropertyChangeListener(pcl);
    }
    void removeObserver(PropertyChangeListener pcl) {
      support.removePropertyChangeListener(pcl);
    }
    void kellnerRufen() {
      support.firePropertyChange("Kellner!", null, name);
    }
  }

  public static void main(String[] args)
  {
    Kellner kellner1 = new Kellner("Kellner1");
    Kellner kellner2 = new Kellner("Kellner2");
    Gast gast1 = new Gast("Gast1");
    Gast gast2 = new Gast("Gast2");
    
    gast1.addObserver(kellner1);
    gast1.addObserver(kellner2);
    
    gast2.addObserver(kellner2);
    
    gast1.kellnerRufen();
    gast2.kellnerRufen();
  }
}

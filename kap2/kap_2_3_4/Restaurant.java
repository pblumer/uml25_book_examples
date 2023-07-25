package kap2.kap_2_3_4;
 
class Restaurant
{
  Gast[] kunde = new Gast[50];
    
  // =================================
  // für Tests
  public static void main(String[] args)
  {
    Restaurant r = new Restaurant();
    Gast g = new Gast(r);
  }
}

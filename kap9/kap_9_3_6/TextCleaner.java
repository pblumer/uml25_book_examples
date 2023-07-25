package kap9.kap_9_3_6;

class TextCleaner
{
  String entferneLeerzeichen(String text)
  {
    return text.replaceAll("[ ]+"," ").trim();
  }
  
  String beginnGross(String text)
  {
    return text.replaceFirst(text.substring(0,1),text.substring(0,1).toUpperCase());
  }
  
  String beendeMitPunkt(String text)
  {
    return text+".";
  }
  
  String textSaeubern(String text)
  {
    if(text != null)
    {
      text = entferneLeerzeichen(text);
      text = beginnGross(text);
      text = beendeMitPunkt(text);
    }
    return text;
  }
  
  public static void main(String[] args)
  {
    var text = "  rheinwerk     Computing    ";
    System.out.println("Vorher: "+text);
    
    var tc = new TextCleaner();
    text = tc.textSaeubern(text);
    
    System.out.println("Nachher: "+text);
  }
}

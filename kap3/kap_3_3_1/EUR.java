package kap3.kap_3_3_1;

import java.math.BigDecimal;

class EUR
{
  private BigDecimal betrag; 
  public EUR(BigDecimal b)
  {
    betrag = b;
  }
  public BigDecimal getBetrag()
  {
    return betrag;
  }
}

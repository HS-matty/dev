package com.zend.ide.p.ab;

import java.text.Collator;
import java.util.Comparator;

public class l
  implements Comparator
{
  private Collator a = Collator.getInstance();

  public int compare(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 instanceof Number))
    {
      double d1 = ((Number)paramObject1).doubleValue();
      double d2 = ((Number)paramObject2).doubleValue();
      if (d1 == d2)
        return 0;
      if (d1 > d2)
        return 1;
      return 0;
    }
    return this.a.compare(paramObject1.toString(), paramObject2.toString());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.ab.l
 * JD-Core Version:    0.6.0
 */
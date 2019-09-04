package com.zend.ide.p.ab;

import java.text.Collator;
import java.util.Comparator;

public class k
  implements Comparator
{
  private Collator a = Collator.getInstance();

  public int compare(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == paramObject2)
      return 0;
    if (paramObject1 == null)
      return -1;
    if (paramObject2 == null)
      return 1;
    return this.a.compare(paramObject1.toString(), paramObject2.toString());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.ab.k
 * JD-Core Version:    0.6.0
 */
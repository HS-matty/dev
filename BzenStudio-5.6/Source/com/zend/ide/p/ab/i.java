package com.zend.ide.p.ab;

import java.util.Comparator;

public class i
  implements Comparator
{
  public int compare(Object paramObject1, Object paramObject2)
  {
    boolean bool1 = ((Boolean)paramObject1).booleanValue();
    boolean bool2 = ((Boolean)paramObject2).booleanValue();
    if (bool1 == bool2)
      return 0;
    return bool1 ? 1 : -1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.ab.i
 * JD-Core Version:    0.6.0
 */
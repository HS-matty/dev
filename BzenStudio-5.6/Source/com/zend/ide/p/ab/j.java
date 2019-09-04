package com.zend.ide.p.ab;

import java.util.Comparator;

public class j
  implements Comparator
{
  public int compare(Object paramObject1, Object paramObject2)
  {
    return ((Comparable)paramObject1).compareTo(paramObject2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.ab.j
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.f.a;

import com.zend.ide.f.gd;
import java.util.Comparator;

class e
  implements Comparator
{
  final d a;

  e(d paramd)
  {
  }

  public int compare(Object paramObject1, Object paramObject2)
  {
    return ((gd)paramObject1).c().compareToIgnoreCase(((gd)paramObject2).c());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.a.e
 * JD-Core Version:    0.6.0
 */
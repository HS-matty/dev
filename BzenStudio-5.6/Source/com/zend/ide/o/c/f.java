package com.zend.ide.o.c;

import com.zend.ide.o.a;
import java.util.Comparator;

class f
  implements Comparator
{
  private f()
  {
  }

  public int a(a parama1, a parama2)
  {
    a locala1 = parama1;
    a locala2 = parama2;
    try
    {
      int i = Integer.parseInt(locala1.b());
      int j = Integer.parseInt(locala2.b());
      if (i == j)
        return 0;
      if (i > j)
        return 1;
      return -1;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return locala1.toString().compareToIgnoreCase(locala2.toString());
  }

  public int compare(Object paramObject1, Object paramObject2)
  {
    return a((a)paramObject1, (a)paramObject2);
  }

  f(e parame)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.f
 * JD-Core Version:    0.6.0
 */
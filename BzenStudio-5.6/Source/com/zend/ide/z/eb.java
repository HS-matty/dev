package com.zend.ide.z;

import java.util.Comparator;

class eb
  implements Comparator
{
  final bl a;

  eb(bl parambl)
  {
  }

  public int compare(Object paramObject1, Object paramObject2)
  {
    double d1 = ((t)paramObject1).b();
    double d2 = ((t)paramObject2).b();
    if (d1 == d2)
      return 0;
    if (d1 > d2)
      return 1;
    return -1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.eb
 * JD-Core Version:    0.6.0
 */
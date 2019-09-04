package com.zend.ide.gb.a;

import java.util.Comparator;

class x
  implements Comparator
{
  final rb a;

  x(rb paramrb)
  {
  }

  public int compare(Object paramObject1, Object paramObject2)
  {
    String str1 = (String)paramObject1;
    String str2 = (String)paramObject2;
    return str1.compareToIgnoreCase(str2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.x
 * JD-Core Version:    0.6.0
 */
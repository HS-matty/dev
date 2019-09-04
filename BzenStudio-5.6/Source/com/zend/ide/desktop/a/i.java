package com.zend.ide.desktop.a;

import com.zend.ide.v.p;
import java.util.Comparator;

class i
  implements Comparator
{
  private i()
  {
  }

  public int compare(Object paramObject1, Object paramObject2)
  {
    p localp1 = (p)paramObject1;
    p localp2 = (p)paramObject2;
    return localp1.e().compareTo(localp2.e());
  }

  i(j paramj)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.a.i
 * JD-Core Version:    0.6.0
 */
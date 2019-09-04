package com.zend.ide.hb;

import com.zend.ide.f.gd;
import java.util.Comparator;

class nc
  implements Comparator
{
  final wc a;

  nc(wc paramwc)
  {
  }

  public int compare(Object paramObject1, Object paramObject2)
  {
    return ((gd)paramObject1).c().compareToIgnoreCase(((gd)paramObject2).c());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.nc
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.f;

import com.zend.ide.b.m;
import com.zend.ide.m.ba;
import java.util.Comparator;

class hd
  implements Comparator
{
  public int a(ba paramba1, ba paramba2)
  {
    if (((paramba1 instanceof ba)) && ((paramba2 instanceof ba)))
      return paramba1.f().d() - paramba2.f().d();
    return 0;
  }

  public int compare(Object paramObject1, Object paramObject2)
  {
    return a((ba)paramObject1, (ba)paramObject2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.hd
 * JD-Core Version:    0.6.0
 */
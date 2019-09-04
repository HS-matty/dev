package com.zend.ide.n;

import com.zend.ide.util.cl;
import com.zend.ide.v.x;
import java.util.ArrayList;
import java.util.Iterator;

class ed extends x
{
  final bu b;

  public ed(bu parambu)
  {
    parambu.c().a(this);
  }

  public void a(dz paramdz, boolean paramBoolean)
  {
    try
    {
      ArrayList localArrayList = bu.a(this.b, paramdz.k());
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        bv localbv = (bv)localIterator.next();
        localbv.b(paramdz);
      }
      bu.a(this.b, paramdz);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  public void b(dz paramdz, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      ArrayList localArrayList = bu.a(this.b, paramdz.k());
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        bv localbv = (bv)localIterator.next();
        localbv.a(paramdz);
      }
    }
  }

  public void a(String paramString1, String paramString2)
  {
    bu.a(this.b, paramString1, paramString2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ed
 * JD-Core Version:    0.6.0
 */
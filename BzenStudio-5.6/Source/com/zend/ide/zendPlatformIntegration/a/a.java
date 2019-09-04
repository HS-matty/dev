package com.zend.ide.zendPlatformIntegration.a;

import com.zend.ide.p.ab.h;
import com.zend.ide.p.ab.j;
import com.zend.ide.p.ab.l;
import com.zend.ide.zendPlatformIntegration.b.a.p;
import com.zend.ide.zendPlatformIntegration.b.a.q;
import java.util.Comparator;

public class a extends h
{
  public Comparator a(int paramInt, Class paramClass)
  {
    Object localObject = null;
    q[] arrayOfq = p.a;
    if (arrayOfq.length > paramInt)
      localObject = arrayOfq[paramInt];
    if (localObject != null)
      return localObject;
    if (Comparable.class.isAssignableFrom(paramClass))
      return new j();
    return new l();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.a.a
 * JD-Core Version:    0.6.0
 */
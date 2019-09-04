package com.zend.ide.zendPlatformIntegration.a;

import com.zend.ide.zendPlatformIntegration.b.a.p;
import com.zend.ide.zendPlatformIntegration.b.a.q;
import com.zend.ide.zendPlatformIntegration.b.e;

public class d extends c
  implements fb
{
  private q[] c = p.a;
  private e d;

  public d(e parame)
  {
    super(parame);
    this.d = parame;
  }

  protected Object[] a(Object paramObject)
  {
    if ((paramObject instanceof com.zend.ide.zendPlatformIntegration.b.d))
    {
      com.zend.ide.zendPlatformIntegration.b.d locald = (com.zend.ide.zendPlatformIntegration.b.d)paramObject;
      return locald.a();
    }
    return this.d.c();
  }

  public int getChildCount(Object paramObject)
  {
    Object[] arrayOfObject = a(paramObject);
    return arrayOfObject == null ? 0 : arrayOfObject.length;
  }

  public Object getChild(Object paramObject, int paramInt)
  {
    com.zend.ide.zendPlatformIntegration.b.c[] arrayOfc = ((e)paramObject).c();
    return arrayOfc[paramInt];
  }

  public boolean isLeaf(Object paramObject)
  {
    return (paramObject instanceof com.zend.ide.zendPlatformIntegration.b.c);
  }

  public int a()
  {
    return this.c.length;
  }

  public String a(int paramInt)
  {
    return this.c[paramInt].a();
  }

  public Class b(int paramInt)
  {
    return this.c[paramInt].getClass();
  }

  public Object a(Object paramObject, int paramInt)
  {
    if ((paramObject instanceof com.zend.ide.zendPlatformIntegration.b.c))
    {
      if ((this.c == null) || (paramInt < 0) || (paramInt >= this.c.length))
        return "";
      return this.c[paramInt].a(paramObject);
    }
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.a.d
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.desktop.b;

import com.zend.ide.t.g;
import com.zend.ide.util.c.e;
import com.zend.ide.util.c.h;

public class l
{
  private com.zend.ide.util.d.a a = new com.zend.ide.util.d.a();

  public void a(g paramg)
  {
    c localc = (c)paramg;
    a(localc.g(), localc.b());
  }

  public void a(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, new Integer(paramInt2));
  }

  private void a(int paramInt, Object paramObject)
  {
    com.zend.ide.util.c.a locala = a(paramInt, paramObject);
    h.c().a(locala);
  }

  private com.zend.ide.util.c.a a(int paramInt, Object paramObject)
  {
    Integer localInteger = (Integer)this.a.b(paramInt);
    com.zend.ide.util.c.a locala = e.b().a(localInteger.intValue());
    locala.a(paramObject);
    return locala;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.b.l
 * JD-Core Version:    0.6.0
 */
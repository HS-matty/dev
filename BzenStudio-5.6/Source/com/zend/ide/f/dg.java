package com.zend.ide.f;

import com.zend.ide.b.m;
import com.zend.ide.m.g;
import com.zend.ide.m.l;
import com.zend.ide.m.z;
import com.zend.ide.util.cz;

class dg extends cu
  implements z
{
  private int h;
  private String i;

  private dg(String paramString1, int paramInt, String paramString2, g paramg, m paramm)
  {
    super(paramString1, paramg, paramm);
    this.h = paramInt;
    this.i = paramString2;
  }

  public int d()
  {
    return this.h;
  }

  public String c()
  {
    return this.i;
  }

  public void a(cz paramcz)
  {
    ((l)paramcz).a(this);
  }

  dg(String paramString1, int paramInt, String paramString2, g paramg, m paramm, dj paramdj)
  {
    this(paramString1, paramInt, paramString2, paramg, paramm);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.dg
 * JD-Core Version:    0.6.0
 */
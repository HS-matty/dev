package com.zend.ide.f;

import com.zend.ide.b.m;
import com.zend.ide.m.bi;
import com.zend.ide.m.l;
import com.zend.ide.util.cz;

class dh extends cu
  implements bi
{
  private boolean h;
  private boolean i;
  private String j;
  private String k;

  private dh(String paramString1, m paramm, boolean paramBoolean1, boolean paramBoolean2, String paramString2, String paramString3)
  {
    super(paramString1, null, paramm);
    this.h = paramBoolean1;
    this.i = paramBoolean2;
    this.j = paramString2;
    this.k = paramString3;
  }

  public boolean c()
  {
    return this.h;
  }

  public boolean d()
  {
    return this.i;
  }

  public String g()
  {
    return this.j;
  }

  public void a(String paramString)
  {
    this.j = paramString;
  }

  public String h()
  {
    return this.k;
  }

  public void a(cz paramcz)
  {
    ((l)paramcz).a(this);
  }

  dh(String paramString1, m paramm, boolean paramBoolean1, boolean paramBoolean2, String paramString2, String paramString3, dj paramdj)
  {
    this(paramString1, paramm, paramBoolean1, paramBoolean2, paramString2, paramString3);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.dh
 * JD-Core Version:    0.6.0
 */
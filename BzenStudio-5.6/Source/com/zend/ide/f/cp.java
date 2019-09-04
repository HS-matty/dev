package com.zend.ide.f;

import com.zend.ide.m.l;
import com.zend.ide.m.s;
import com.zend.ide.util.cz;

class cp extends br
  implements s
{
  private String g;
  private int h;

  private cp(String paramString1, String paramString2, int paramInt)
  {
    super(paramString1, null, null);
    this.g = paramString2;
    this.h = paramInt;
  }

  public String c()
  {
    return this.g;
  }

  public int d()
  {
    return this.h;
  }

  public void a(cz paramcz)
  {
    ((l)paramcz).a(this);
  }

  cp(String paramString1, String paramString2, int paramInt, dj paramdj)
  {
    this(paramString1, paramString2, paramInt);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.cp
 * JD-Core Version:    0.6.0
 */
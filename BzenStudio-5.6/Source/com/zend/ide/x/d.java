package com.zend.ide.x;

import com.zend.ide.b.e;
import com.zend.ide.util.cz;

class d extends e
  implements h
{
  private l[] c;
  boolean d;

  private d(String paramString1, String paramString2, l[] paramArrayOfl)
  {
    super(paramString1, paramString2);
    this.c = paramArrayOfl;
    this.d = true;
  }

  private d(String paramString1, String paramString2)
  {
    super(paramString1, paramString2);
    this.d = false;
  }

  public l[] c()
  {
    return this.c;
  }

  public boolean d()
  {
    return this.d;
  }

  public void a(cz paramcz)
  {
    ((i)paramcz).a(this);
  }

  d(String paramString1, String paramString2, l[] paramArrayOfl, m paramm)
  {
    this(paramString1, paramString2, paramArrayOfl);
  }

  d(String paramString1, String paramString2, m paramm)
  {
    this(paramString1, paramString2);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.x.d
 * JD-Core Version:    0.6.0
 */
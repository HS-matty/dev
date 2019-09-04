package com.zend.ide.cb.a;

import com.zend.ide.cb.f;
import com.zend.ide.cb.q;

class r
{
  private String a;
  private String b;
  private String c;

  public r()
  {
    this("", null, null);
  }

  public r(String paramString)
  {
    this(paramString, null, null);
  }

  public r(String paramString, q paramq, f paramf)
  {
    this.a = paramString;
    this.b = (paramq != null ? paramq.a() : "");
    this.c = (paramf != null ? paramf.a() : "");
  }

  public String a()
  {
    if (this.a == null)
      this.a = "";
    return this.a;
  }

  public String toString()
  {
    return this.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.r
 * JD-Core Version:    0.6.0
 */
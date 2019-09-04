package com.zend.ide.desktop;

import com.zend.ide.n.ob;
import com.zend.ide.util.ct;

class kb
  implements ob
{
  private int a;
  private int b;
  private String c;
  private String e;
  final bw d;

  kb(bw parambw, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString1;
    this.e = paramString2;
  }

  public int a()
  {
    return this.a;
  }

  public int b()
  {
    return this.b;
  }

  public String c()
  {
    return ct.a(159) + ' ' + this.e;
  }

  public void d()
  {
    bw.a(this.d).a(this.c, null, -1);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.kb
 * JD-Core Version:    0.6.0
 */
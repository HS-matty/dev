package com.zend.ide.o.c;

import com.zend.ide.o.a;
import com.zend.ide.o.hb;

public class d
  implements a
{
  private String[] a;
  private String b;
  private hb c;

  public d(String paramString)
  {
    this.a = new String[] { paramString.trim() };
    this.b = paramString;
    a(null);
  }

  public String[] a()
  {
    return this.a;
  }

  public String b()
  {
    return this.a[(this.a.length - 1)];
  }

  public String c()
  {
    return this.b;
  }

  public void a(hb paramhb)
  {
    if (paramhb == null)
      paramhb = w.a;
    this.c = paramhb;
  }

  public hb d()
  {
    return this.c;
  }

  public String toString()
  {
    return b() + " = " + d().c();
  }

  public a a(String paramString1, String paramString2)
  {
    return new d(this, paramString1, paramString2);
  }

  protected d(a parama, String paramString1, String paramString2)
  {
    String[] arrayOfString = parama.a();
    this.a = new String[arrayOfString.length + 1];
    System.arraycopy(arrayOfString, 0, this.a, 0, arrayOfString.length);
    this.a[arrayOfString.length] = paramString1;
    this.b = (parama.c() + paramString2);
    a(null);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.d
 * JD-Core Version:    0.6.0
 */
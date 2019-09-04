package com.zend.ide.o;

import com.zend.ide.o.c.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class jb
{
  private int a;
  private String b;
  private int c;
  private String d;
  private String e;
  private int f;
  private String g;
  private List h = new ArrayList(6);

  public jb()
  {
  }

  public jb(int paramInt1, String paramString1, int paramInt2, String paramString2, String paramString3, int paramInt3, String paramString4)
  {
    this();
    this.a = paramInt1;
    a(paramString1);
    a(paramInt2);
    b(paramString2);
    c(paramString3);
    b(paramInt3);
    d(paramString4);
  }

  public final int a()
  {
    return this.a;
  }

  public final String b()
  {
    return this.b;
  }

  public final void a(String paramString)
  {
    this.b = paramString;
  }

  public final int c()
  {
    return this.c;
  }

  public final void a(int paramInt)
  {
    this.c = paramInt;
  }

  public final String d()
  {
    return this.d;
  }

  public final void b(String paramString)
  {
    this.d = paramString;
  }

  public final String e()
  {
    return this.e;
  }

  public final void c(String paramString)
  {
    this.e = paramString;
  }

  public final int f()
  {
    return this.f;
  }

  public final void b(int paramInt)
  {
    this.f = paramInt;
  }

  public final String g()
  {
    return this.g;
  }

  public final void d(String paramString)
  {
    this.g = paramString;
  }

  public void a(String paramString1, String paramString2)
  {
    lb locallb = new lb(paramString1, a());
    locallb.a(h.a(locallb, paramString2));
    this.h.add(locallb);
  }

  public void a(a parama)
  {
    this.h.add(parama);
  }

  public int h()
  {
    return this.h.size();
  }

  public a[] i()
  {
    a[] arrayOfa = new a[this.h.size()];
    this.h.toArray(arrayOfa);
    return arrayOfa;
  }

  public Iterator j()
  {
    return this.h.iterator();
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer(20);
    localStringBuffer.append(k());
    localStringBuffer.append("  " + this.b + " line " + (this.c + 1));
    return localStringBuffer.toString();
  }

  public String k()
  {
    if ((d() == null) || (d().equals("")))
      return "";
    StringBuffer localStringBuffer = new StringBuffer(d() + '(');
    for (int i = 0; i < this.h.size(); i++)
    {
      a locala = (a)this.h.get(i);
      localStringBuffer.append(" $");
      localStringBuffer.append(locala.b());
      if (i == this.h.size() - 1)
        continue;
      localStringBuffer.append(',');
    }
    localStringBuffer.append(" )");
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.jb
 * JD-Core Version:    0.6.0
 */
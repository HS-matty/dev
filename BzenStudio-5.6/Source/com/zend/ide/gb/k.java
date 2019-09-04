package com.zend.ide.gb;

import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import javax.swing.Icon;

public class k
  implements Cloneable, cu
{
  private int a;
  private String b;
  private int c;
  private String d;
  private static Icon e = cv.b("warningmsg16.gif");
  private static Icon f = cv.b("errormsg16.gif");
  private static Icon[] g = { f, e };
  private static String[] h = { ct.a(1648), ct.a(1649) };
  private static String[] i = { ct.a(1605), ct.a(1606), ct.a(1607), ct.a(1608), ct.a(1606) };

  public String a()
  {
    return this.b;
  }

  public int b()
  {
    return this.c;
  }

  private static int a(int paramInt)
  {
    int j = paramInt <= 1 ? 0 : 1;
    return j;
  }

  private static String b(int paramInt)
  {
    return h[a(paramInt)];
  }

  private static Icon c(int paramInt)
  {
    int j = a(paramInt);
    return g[j];
  }

  public Icon c()
  {
    return c(this.a);
  }

  public String d()
  {
    return this.d;
  }

  public String e()
  {
    return b(this.a) + " - " + i[this.a];
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(e());
    if (this.c >= 0)
      localStringBuffer.append(ct.a(397, a(), "" + (this.c + 1)));
    if ((d() != null) && (!d().trim().equals("")))
      localStringBuffer.append(" - " + d());
    return localStringBuffer.toString();
  }

  public boolean equals(Object paramObject)
  {
    int j = 0;
    if ((paramObject instanceof k))
    {
      k localk = (k)paramObject;
      j = (this.a == localk.a) && (this.b.equals(localk.b)) && (this.c == localk.c) && (this.d.equals(localk.d)) ? 1 : 0;
    }
    return j;
  }

  public k(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramInt2;
    this.d = paramString2;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.k
 * JD-Core Version:    0.6.0
 */
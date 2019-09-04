package com.zend.ide.o;

import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import javax.swing.Icon;

public class bh
  implements Cloneable, cu
{
  private int a = -1;
  private int b = 1;
  private String c = "";
  private int d = -1;
  private String e = "";
  private static Icon f = cv.b("noticemsg16.gif");
  private static Icon g = cv.b("warningmsg16.gif");
  private static Icon h = cv.b("errormsg16.gif");
  private static Icon k = cv.b("warningmsg16.gif");
  private static Icon[] i = { h, g, h, f, h, g, h, g, h, g, f, k };
  private static String[] j = { ct.a(386), ct.a(387), ct.a(388), ct.a(389), ct.a(390), ct.a(391), ct.a(392), ct.a(393), ct.a(394), ct.a(395), ct.a(396), ct.a(1263) };

  public static boolean a(bh parambh)
  {
    int m = a(parambh.f());
    return (m == 3) || (m == 10);
  }

  public static boolean b(bh parambh)
  {
    int m = a(parambh.f());
    return (m == 1) || (m == 5) || (m == 7) || (m == 9);
  }

  public static boolean c(bh parambh)
  {
    int m = a(parambh.f());
    return (m == 0) || (m == 2) || (m == 4) || (m == 6) || (m == 8);
  }

  public static boolean d(bh parambh)
  {
    int m = a(parambh.f());
    return m == 11;
  }

  private static int a(int paramInt)
  {
    int m = (int)(Math.log(paramInt) / Math.log(2.0D));
    return m;
  }

  private static String b(int paramInt)
  {
    int m = a(paramInt);
    return j[m];
  }

  private static Icon c(int paramInt)
  {
    int m = a(paramInt);
    return i[m];
  }

  public bh()
  {
  }

  public bh(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    this();
    this.b = paramInt1;
    this.c = paramString1;
    this.d = paramInt2;
    this.e = paramString2;
  }

  public void d(int paramInt)
  {
    this.b = paramInt;
  }

  public int f()
  {
    return this.b;
  }

  public String b()
  {
    return b(this.b);
  }

  public String c()
  {
    return this.c;
  }

  public int d()
  {
    return this.d;
  }

  public void a(String paramString)
  {
    this.e = paramString;
  }

  public String g()
  {
    return this.e;
  }

  public Object clone()
    throws CloneNotSupportedException
  {
    return (bh)super.clone();
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(b());
    if (this.d >= 0)
      localStringBuffer.append(ct.a(397, c(), "" + (this.d + 1)));
    localStringBuffer.append(" - " + g());
    return localStringBuffer.toString();
  }

  public boolean equals(Object paramObject)
  {
    int m = 0;
    if ((paramObject instanceof bh))
    {
      bh localbh = (bh)paramObject;
      m = (this.b == localbh.b) && (this.c.equals(localbh.c)) && (this.d == localbh.d) && (this.e.equals(localbh.e)) ? 1 : 0;
    }
    return m;
  }

  public Icon e()
  {
    return c(this.b);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.bh
 * JD-Core Version:    0.6.0
 */
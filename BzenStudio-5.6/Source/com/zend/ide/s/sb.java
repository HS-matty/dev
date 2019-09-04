package com.zend.ide.s;

import com.zend.ide.util.d.a;
import java.util.Hashtable;

public class sb
{
  public static int a = nb.a;
  public static final int b = ++a;
  public static final int c = ++a;
  public static final int d = ++a;
  public static final int e = ++a;
  public static final int f = ++a;
  public static final int g = ++a;
  public static final int h = ++a;
  public static final int i = ++a;
  public static final int j = ++a;
  private static Hashtable k = null;
  private static a l = null;

  public static final int[] a()
  {
    return new int[] { i };
  }

  public static final int[] b()
  {
    return new int[] { b };
  }

  public static final int[] c()
  {
    return new int[] { c };
  }

  public static final int[] d()
  {
    return new int[] { d };
  }

  public static final int[] e()
  {
    return new int[] { e };
  }

  public static final int[] f()
  {
    return new int[] { f };
  }

  public static final int[] g()
  {
    return new int[] { g };
  }

  public static final int[] h()
  {
    return new int[] { h };
  }

  private static void i()
  {
    k = new Hashtable();
    l = new a();
    a("unknownTokenColor", a());
    a("attributeColor", d());
    a("xmlCommentColor", f());
    a("tagColor", b());
    a("tagDataColor", g());
    a("tagNameColor", c());
    a("valueColor", e());
    a("reservedWordColor", h());
  }

  private static void a(String paramString, int[] paramArrayOfInt)
  {
    for (int m = 0; m < paramArrayOfInt.length; m++)
      l.a(paramArrayOfInt[m], paramString);
    k.put(paramString, paramArrayOfInt);
  }

  public static String a(int paramInt)
  {
    if (l == null)
      i();
    return (String)l.b(paramInt);
  }

  public static int[] a(String paramString)
  {
    if (k == null)
      i();
    return (int[])(int[])k.get(paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.sb
 * JD-Core Version:    0.6.0
 */
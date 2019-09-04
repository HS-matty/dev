package com.zend.ide.s;

import com.zend.ide.util.d.a;
import java.util.Hashtable;

public class nb
{
  public static int a = bb.a;
  public static final int b = ++a;
  public static final int c = ++a;
  public static final int d = ++a;
  public static final int e = ++a;
  public static final int f = ++a;
  public static final int g = ++a;
  public static final int h = ++a;
  public static final int i = ++a;
  public static final int j = ++a;
  public static final int k = ++a;
  public static final int l = ++a;
  private static Hashtable m = null;
  private static a n = null;

  public static final int[] a()
  {
    return new int[] { l };
  }

  public static final int[] b()
  {
    return new int[] { h, e };
  }

  public static final int[] c()
  {
    return new int[] { f };
  }

  public static final int[] d()
  {
    return new int[] { i };
  }

  public static final int[] e()
  {
    return new int[] { g };
  }

  public static final int[] f()
  {
    return new int[] { b };
  }

  private static void g()
  {
    m = new Hashtable();
    n = new a();
    a("unknownTokenColor", a());
    a("sqlTextColor", b());
    a("sqlCommentColor", c());
    a("sqlConstantEncapsedStringColor", d());
    a("sqlNumberColor", e());
    a("sqlReservedWordColor", f());
  }

  private static void a(String paramString, int[] paramArrayOfInt)
  {
    for (int i1 = 0; i1 < paramArrayOfInt.length; i1++)
      n.a(paramArrayOfInt[i1], paramString);
    m.put(paramString, paramArrayOfInt);
  }

  public static String a(int paramInt)
  {
    if (n == null)
      g();
    return (String)n.b(paramInt);
  }

  public static int[] a(String paramString)
  {
    if (m == null)
      g();
    return (int[])(int[])m.get(paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.nb
 * JD-Core Version:    0.6.0
 */
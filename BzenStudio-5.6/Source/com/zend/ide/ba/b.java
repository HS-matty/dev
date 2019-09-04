package com.zend.ide.ba;

import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class b
  implements cu
{
  private static int[][] d;
  private String a;
  private int b;
  private int c;
  private String[] e;
  private String f;
  private boolean g = false;
  private static String[] h;

  private b(String paramString, int paramInt1, int paramInt2, String[] paramArrayOfString, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
    this.e = paramArrayOfString;
    this.g = paramBoolean;
  }

  private b(String paramString)
  {
    this.f = paramString;
  }

  public String toString()
  {
    String str = this.f;
    if (this.f == null)
      str = a(this.c, this.e) + " " + ct.a(1128, new StringBuilder().append(this.b).append("").toString());
    return str;
  }

  public int c()
  {
    return this.c;
  }

  public String e()
  {
    return this.a;
  }

  public void b(String paramString)
  {
    this.a = paramString;
  }

  public int b()
  {
    return this.b;
  }

  public boolean f()
  {
    return this.g;
  }

  private static String a(int paramInt, String[] paramArrayOfString)
  {
    return ct.a(d[paramInt][0], paramArrayOfString);
  }

  private static int b(int paramInt)
  {
    return d[paramInt][1];
  }

  private static void d()
  {
    d = new int[][] { { 0, 0 }, { 1265, 2 }, { 1098, 0 }, { 1099, 0 }, { 1100, 0 }, { 1101, 0 }, { 1102, 0 }, { 1103, 0 }, { 1104, 0 }, { 1105, 0 }, { 1106, 0 }, { 1107, 0 }, { 1108, 0 }, { 1109, 1 }, { 1110, 1 }, { 1111, 1 }, { 1112, 1 }, { 1113, 1 }, { 1114, 1 }, { 1115, 1 }, { 1116, 1 }, { 1117, 1 }, { 1118, 1 }, { 1119, 1 }, { 1120, 3 }, { 1121, 2 }, { 1122, 2 }, { 1123, 1 }, { 1124, 0 }, { 1806, 1 }, { 1807, 1 }, { 1808, 0 }, { 1809, 0 } };
  }

  public static b a(String paramString)
  {
    if (h == null)
      g();
    b localb;
    try
    {
      StringTokenizer localStringTokenizer = new StringTokenizer(paramString, "|");
      String str = localStringTokenizer.nextToken();
      int i = Integer.valueOf(localStringTokenizer.nextToken()).intValue();
      int j = Integer.valueOf(localStringTokenizer.nextToken()).intValue();
      localStringTokenizer.nextToken();
      String[] arrayOfString = new String[b(j)];
      for (int k = 0; k < arrayOfString.length; k++)
        arrayOfString[k] = localStringTokenizer.nextToken();
      k = 0;
      if (j == 1)
      {
        int m = Integer.valueOf(arrayOfString[0]).intValue();
        arrayOfString[0] = c(m);
        if (m == 2048)
          k = 1;
      }
      localb = new b(str, i, j, arrayOfString, k);
    }
    catch (NoSuchElementException localNoSuchElementException)
    {
      localb = new b(paramString);
    }
    return localb;
  }

  private static void g()
  {
    h = new String[] { ct.a(386), ct.a(387), ct.a(388), ct.a(389), ct.a(390), ct.a(391), ct.a(392), ct.a(393), ct.a(394), ct.a(395), ct.a(396), ct.a(1263) };
  }

  private static String c(int paramInt)
  {
    try
    {
      return h[(int)(java.lang.Math.log(paramInt) / java.lang.Math.log(2.0D))];
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  static
  {
    d();
    h = null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.ba.b
 * JD-Core Version:    0.6.0
 */
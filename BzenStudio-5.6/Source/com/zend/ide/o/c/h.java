package com.zend.ide.o.c;

import com.zend.ide.o.a;
import com.zend.ide.o.hb;
import com.zend.ide.util.bh;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.beans.PropertyChangeListener;

public class h
{
  private static bh a = bh.a;
  private static final PropertyChangeListener b = new t(null);
  private static final e c;

  public static hb a(a parama, String paramString)
  {
    if (paramString == null)
      paramString = "N";
    return a(parama, new c(a(paramString), null));
  }

  private static byte[] a(String paramString)
  {
    return bh.a(paramString, a);
  }

  private static hb a(a parama, c paramc)
  {
    int i = c.a(paramc);
    switch (i)
    {
    case 105:
      return a(paramc);
    case 100:
      return b(paramc);
    case 115:
      return c(paramc);
    case 98:
      return d(paramc);
    case 114:
      return e(paramc);
    case 97:
      return b(parama, paramc);
    case 79:
      return c(parama, paramc);
    }
    return w.a;
  }

  private static hb a(c paramc)
  {
    String str1 = c.b(paramc);
    String str2 = "(int) " + str1;
    return new w(1, str1, str2, null);
  }

  private static hb b(c paramc)
  {
    String str1 = c.b(paramc);
    String str2 = "(double) " + str1;
    return new w(4, str1, str2, null);
  }

  private static hb c(c paramc)
  {
    String str1 = c.c(paramc);
    String str2 = "(string:" + str1.length() + ") " + str1;
    return new w(2, str1, str2, null);
  }

  private static hb d(c paramc)
  {
    String str1 = c.b(paramc);
    String str2 = "(boolean) " + (str1.equals("0") ? "false" : "true");
    return new w(3, str1, str2, null);
  }

  private static hb e(c paramc)
  {
    int i = paramc.d();
    paramc.d();
    String str1 = c.b(paramc);
    String str2 = "resource (" + i + ") of type (" + str1 + ')';
    return new w(7, str1, str2, null);
  }

  private static hb b(a parama, c paramc)
  {
    int i = paramc.d();
    int j = i;
    if (c.d(paramc))
      i = 0;
    a[] arrayOfa = new a[i];
    for (int k = 0; k < i; k++)
    {
      int m = c.a(paramc);
      String str;
      if (m == 105)
        str = Integer.toString(paramc.d());
      else
        str = c.c(paramc);
      if (parama == null)
        arrayOfa[k] = b(str);
      else
        arrayOfa[k] = parama.a(str, '[' + str + ']');
      arrayOfa[k].a(a(parama, paramc));
    }
    return new w(5, "Array", "Array [" + j + ']', arrayOfa);
  }

  private static w c(a parama, c paramc)
  {
    String str1 = c.c(paramc);
    int i = paramc.d();
    if (c.d(paramc))
      i = 0;
    a[] arrayOfa = new a[i];
    for (int j = 0; j < i; j++)
    {
      int k = c.a(paramc);
      String str3;
      if (k == 105)
        str3 = Integer.toString(paramc.d());
      else
        str3 = c.c(paramc);
      if (parama == null)
        arrayOfa[j] = b(str3);
      else
        arrayOfa[j] = parama.a(str3, "->" + str3);
      arrayOfa[j].a(a(parama, paramc));
    }
    String str2 = "Object of: " + str1;
    return new w(6, str1, str2, arrayOfa);
  }

  private static a b(String paramString)
  {
    return new d('$' + paramString);
  }

  static bh a(bh parambh)
  {
    a = parambh;
    return parambh;
  }

  static
  {
    f localf = new f();
    c = new e(localf);
    localf.a("editing.encoding", b);
    localf.a("debugging.outputEncoding", b);
    localf.a("debugging.useOutputEncoding", b);
    c.a("editing.encoding");
    c.a("debugging.outputEncoding");
    c.a("debugging.useOutputEncoding");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.h
 * JD-Core Version:    0.6.0
 */
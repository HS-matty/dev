package com.zend.ide.f.yb;

import com.zend.ide.b.m;
import com.zend.ide.f.di;
import com.zend.ide.m.ab;
import com.zend.ide.m.ba;
import com.zend.ide.m.f;
import com.zend.ide.m.i;
import com.zend.ide.m.v;
import com.zend.ide.m.y;
import com.zend.ide.m.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class g
{
  private static Stack a = new Stack();
  private static Stack b = new Stack();
  private static Stack c = new Stack();
  private static Stack d = new Stack();
  private static Stack e = new Stack();
  private static Stack f = new Stack();
  private static Stack g = new Stack();
  private static ArrayList h = new ArrayList();
  private static HashMap i = new HashMap();
  private static m j = null;
  private static Stack k = null;

  public static boolean a(String paramString, Attributes paramAttributes)
    throws SAXException
  {
    if (paramString.equals("schema"))
      return a(paramAttributes);
    if ((paramString.equals("complexType")) || (paramString.equals("simpleType")))
      return b(paramAttributes);
    if (paramString.equals("extension"))
      return c(paramAttributes);
    if (paramString.equals("element"))
      return d(paramAttributes);
    if (paramString.equals("restriction"))
      return e(paramAttributes);
    if (paramString.equals("attribute"))
      return f(paramAttributes);
    if (paramString.equals("documentation"))
    {
      a();
      return true;
    }
    return true;
  }

  public static void a(String paramString1, String paramString2, String paramString3)
    throws SAXException
  {
    if (paramString3.equals("schema"))
    {
      b();
      return;
    }
    if ((paramString3.equals("complexType")) || (paramString3.equals("simpleType")))
    {
      c();
      return;
    }
    if (paramString3.equals("extension"))
    {
      d();
      return;
    }
    if (paramString3.equals("element"))
    {
      e();
      return;
    }
    if (paramString3.equals("restriction"))
    {
      f();
      return;
    }
    if (paramString3.equals("attribute"))
    {
      g();
      return;
    }
    if (paramString3.equals("documentation"))
    {
      h();
      return;
    }
  }

  private static boolean a(Attributes paramAttributes)
  {
    if (!a.isEmpty())
      return false;
    m();
    a.push("schema");
    return true;
  }

  private static boolean b(Attributes paramAttributes)
  {
    String str1 = (String)a.peek();
    if ((!"schema".equals(str1)) && (!"element".equals(str1)))
      return false;
    a.push("TypeDeclaration");
    if ("element".equals(str1))
      return true;
    String str2 = paramAttributes.getValue("name");
    if (str2 == null)
      str2 = "";
    b.push(str2);
    c.push("");
    d.push("");
    return true;
  }

  private static boolean c(Attributes paramAttributes)
  {
    String str1 = (String)a.peek();
    if (!"TypeDeclaration".equals(str1))
      return false;
    a.push("extension");
    String str2 = paramAttributes.getValue("base");
    str2 = str2 == null ? "" : c(str2);
    c.pop();
    c.push(str2);
    return true;
  }

  private static boolean d(Attributes paramAttributes)
  {
    String str1 = (String)a.peek();
    if ((!d(str1)) && (!"schema".equals(str1)))
      return false;
    a.push("element");
    if (d(str1))
      return g(paramAttributes);
    String str2 = paramAttributes.getValue("name");
    String str3 = paramAttributes.getValue("type");
    if ((str2 == null) || (str2.equals("")))
      return false;
    b.push(str2);
    d.push("");
    if (str3 != null)
      c.push(c(str3));
    else
      c.push("");
    return true;
  }

  private static boolean e(Attributes paramAttributes)
  {
    String str1 = (String)a.peek();
    if ((!d(str1)) && (!"element".equals(str1)))
      return false;
    a.push("restriction");
    String str2 = paramAttributes.getValue("base");
    str2 = c(str2);
    if (!str2.equals("Array"))
    {
      a(str2);
      return true;
    }
    i.put(b.peek(), "");
    return true;
  }

  private static boolean f(Attributes paramAttributes)
  {
    String str1 = (String)a.peek();
    if ((!"restriction".equals(str1)) && (!d(str1)))
      return false;
    a.push("attribute");
    if (d(str1))
      return g(paramAttributes);
    int m = paramAttributes.getLength();
    String str2 = null;
    for (int n = 0; n < m; n++)
    {
      String str3 = c(paramAttributes.getQName(n));
      if (!str3.equals("arrayType"))
        continue;
      str2 = c(paramAttributes.getValue(n));
      break;
    }
    if (str2 == null)
    {
      i.remove(b.peek());
      return true;
    }
    i.put(b.peek(), str2);
    b.pop();
    c.pop();
    d.pop();
    return true;
  }

  private static void a()
  {
    String str = (String)a.peek();
    if ((!d(str)) && (!"element".equals(str)))
      return;
    if ((d(str)) || (g.isEmpty()))
      k = d;
    else
      k = g;
    a.push("documentation");
  }

  private static void b()
  {
    a.pop();
  }

  private static void c()
  {
    if ((b.isEmpty()) || (((String)b.peek()).equals("")))
    {
      e.clear();
      f.clear();
      a.pop();
      return;
    }
    a.pop();
    if (((String)a.peek()).equals("element"))
      return;
    i();
    e.clear();
    f.clear();
    g.clear();
    b.pop();
    c.pop();
    d.pop();
  }

  private static void d()
  {
    a.pop();
  }

  private static void e()
  {
    a.pop();
    if (d((String)a.peek()))
      return;
    if (b.isEmpty())
      return;
    i();
    b.pop();
    c.pop();
    d.pop();
  }

  private static void f()
  {
    a.pop();
  }

  private static void g()
  {
    a.pop();
  }

  private static void h()
  {
    if ((a.isEmpty()) || (!((String)a.peek()).equals("documentation")))
      return;
    a.pop();
  }

  private static void i()
  {
    y localy;
    if (((String)c.peek()).equals(""))
      localy = di.a(null, null);
    else
      localy = di.a((String)c.peek(), j);
    z[] arrayOfz;
    if (e.isEmpty())
    {
      arrayOfz = di.g;
    }
    else
    {
      int m = e.size();
      arrayOfz = new z[m];
      for (int n = m - 1; n >= 0; n--)
      {
        localObject = new i((String)g.pop(), "", new f[0], 0);
        z localz = di.a((String)e.pop(), 0, (String)f.pop(), (com.zend.ide.m.g)localObject, j);
        arrayOfz[n] = localz;
      }
    }
    String str = (String)d.peek();
    i locali = new i(str, "", new f[0], 0);
    Object localObject = di.a((String)b.peek(), 0, locali, j, localy, di.h, arrayOfz, di.j, di.c);
    for (int i1 = 0; i1 < arrayOfz.length; i1++)
      arrayOfz[i1].a((ba)localObject);
    h.add(localObject);
  }

  private static boolean g(Attributes paramAttributes)
  {
    String str1 = paramAttributes.getValue("name");
    String str2 = paramAttributes.getValue("type");
    if (str1 == null)
      return false;
    str2 = str2 == null ? "" : c(str2);
    e.push(str1);
    f.push(str2);
    g.push("");
    return true;
  }

  private static void a(String paramString)
  {
    if (e.isEmpty())
    {
      c.pop();
      c.push(paramString);
      return;
    }
    f.pop();
    f.push(paramString);
  }

  private static void j()
  {
    for (int m = 0; m < h.size(); m++)
    {
      v localv = (v)h.get(m);
      z[] arrayOfz = localv.g();
      for (int n = 0; n < arrayOfz.length; n++)
      {
        z localz1 = arrayOfz[n];
        String str1 = localz1.c();
        String str2 = (String)i.get(str1);
        if (str2 == null)
          continue;
        z localz2 = di.a(localz1.a(), localz1.d(), str2, localz1.a(), localz1.f());
        arrayOfz[n] = localz2;
      }
    }
  }

  public static ab[] k()
  {
    ab[] arrayOfab = new ab[h.size()];
    h.toArray(arrayOfab);
    return arrayOfab;
  }

  public static HashMap l()
  {
    return i;
  }

  private static void m()
  {
    a.clear();
    h.clear();
    i.clear();
    b.clear();
    c.clear();
    d.clear();
    e.clear();
    f.clear();
    g.clear();
  }

  public static void b(String paramString)
  {
    m();
    j = di.a(paramString, 0, 0, 0, 0);
  }

  public static void n()
  {
    j();
  }

  private static String c(String paramString)
  {
    int m = paramString.indexOf(":");
    if (m != -1)
      return paramString.substring(m + 1);
    return paramString;
  }

  private static boolean d(String paramString)
  {
    return ("TypeDeclaration".equals(paramString)) || ("extension".equals(paramString));
  }

  public static void a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
    throws SAXException
  {
    if ((a.isEmpty()) || (!((String)a.peek()).equals("documentation")))
      return;
    if (k.isEmpty())
      return;
    String str = (String)k.pop();
    if (str.length() == 0)
      str = new String(paramArrayOfChar, paramInt1, paramInt2).trim();
    else
      str = str + "\n" + new String(paramArrayOfChar, paramInt1, paramInt2).trim();
    k.push(str);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.yb.g
 * JD-Core Version:    0.6.0
 */
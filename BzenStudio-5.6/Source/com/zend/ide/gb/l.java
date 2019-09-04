package com.zend.ide.gb;

import com.zend.ide.b.m;
import com.zend.ide.f.bl;
import com.zend.ide.f.bp;
import com.zend.ide.gb.b.a;
import com.zend.ide.gb.b.c;
import com.zend.ide.j.h;
import com.zend.ide.m.bh;
import com.zend.ide.m.bi;
import com.zend.ide.m.g;
import com.zend.ide.m.v;
import com.zend.ide.m.z;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.util.ArrayList;
import java.util.HashMap;

public class l
  implements cu
{
  protected static final com.zend.ide.f.s a = bp.d().b();
  private static ArrayList d = new ArrayList();
  private static ArrayList e = new ArrayList();
  private static ArrayList f = new ArrayList();
  private static ArrayList g = new ArrayList();
  private static ArrayList h = new ArrayList();
  private static ArrayList i = new ArrayList();
  private static com.a.d j = null;
  private static com.a.d b;
  private static com.a.d c;
  private static String l = "";
  private static String m = "";
  private static HashMap k = new HashMap();
  private static ArrayList n = new ArrayList();
  private static boolean q = true;
  private static com.a.d o;
  private static com.a.d p;

  public static com.a.d a(ArrayList paramArrayList1, String paramString1, ArrayList paramArrayList2, boolean paramBoolean1, boolean paramBoolean2, String paramString2)
  {
    c();
    l = paramString1;
    a(paramArrayList2);
    a(paramBoolean2, paramString2);
    q = paramBoolean1;
    com.a.d locald1 = q ? b : c;
    for (int i1 = 0; i1 < paramArrayList1.size(); i1++)
    {
      c localc = (c)paramArrayList1.get(i1);
      m = localc.b();
      int i2 = h.m.h(m).d();
      i3 = m.lastIndexOf(i2);
      int i4 = m.lastIndexOf('.');
      String str;
      if (i4 < i3)
        str = m.substring(i3 + 1);
      else
        str = m.substring(i3 + 1, i4);
      ArrayList localArrayList = localc.e();
      for (int i5 = 0; i5 < localArrayList.size(); i5++)
      {
        a locala = (a)localArrayList.get(i5);
        com.zend.ide.b.d[] arrayOfd = bl.a(locala.c(), bl.g);
        bh[] arrayOfbh = new bh[arrayOfd.length];
        for (int i6 = 0; i6 < arrayOfd.length; i6++)
          arrayOfbh[i6] = ((bh)arrayOfd[i6]);
        a(locala.a(), locala.b(), arrayOfbh, locala.c(), locald1);
      }
      a(str, localc.d(), localc.a(), null, locald1);
    }
    com.a.d locald2 = b();
    com.a.e locale = j.e();
    if (locald2 != null)
      locale.a(locald2);
    for (int i3 = 0; i3 < d.size(); i3++)
      locale.a((com.a.d)d.get(i3));
    for (i3 = 0; i3 < e.size(); i3++)
      locale.a((com.a.d)e.get(i3));
    for (i3 = 0; i3 < g.size(); i3++)
      locale.a((com.a.d)g.get(i3));
    locale.a(a());
    return j;
  }

  private static com.a.d a()
  {
    f localf = new f("service");
    com.a.e locale = new com.a.e();
    locale.a("name", l + "Service");
    for (int i1 = 0; i1 < f.size(); i1++)
      locale.a((com.a.d)f.get(i1));
    localf.a(locale);
    return localf;
  }

  private static void a(String paramString1, String paramString2, bh[] paramArrayOfbh, String paramString3, com.a.d paramd)
  {
    if ((paramArrayOfbh == null) || (paramArrayOfbh.length == 0))
      return;
    f localf1 = new f("portType");
    com.a.e locale1 = new com.a.e();
    locale1.a("name", paramString1 + "PortType");
    if ((paramString3 != null) && (!paramString3.trim().equals("")))
    {
      localf2 = new f("documentation");
      locale2 = new com.a.e();
      locale2.a(paramString3);
      localf2.a(locale2);
      locale1.a(localf2);
    }
    f localf2 = new f("binding");
    com.a.e locale2 = new com.a.e();
    locale2.a("name", paramString1 + "Binding");
    locale2.a("type", "typens:" + paramString1 + "PortType");
    locale2.a(paramd);
    f localf3 = new f("soap:address");
    com.a.e locale3 = new com.a.e();
    locale3.a("location", paramString2);
    localf3.a(locale3);
    f localf4 = new f("port");
    com.a.e locale4 = new com.a.e();
    locale4.a("name", paramString1 + "Port");
    locale4.a("binding", "typens:" + paramString1 + "Binding");
    locale4.a(localf3);
    localf4.a(locale4);
    b(paramString1);
    for (int i1 = 0; i1 < paramArrayOfbh.length; i1++)
      a(paramArrayOfbh[i1], locale1, locale2);
    localf1.a(locale1);
    localf2.a(locale2);
    e.add(localf1);
    f.add(localf4);
    g.add(localf2);
  }

  private static void a(bh parambh, com.a.e parame1, com.a.e parame2)
  {
    String str = null;
    g localg = parambh.a();
    if (localg != null)
      str = localg.a();
    parame1.a(b(parambh.a(), str));
    parame2.a(c(parambh.a()));
    m localm = parambh.f();
    a(parambh.a(), parambh.c());
    a(parambh.a(), parambh.d(), localm.c(), localm.b());
  }

  private static com.a.d b(String paramString1, String paramString2)
  {
    f localf1 = new f("operation");
    com.a.e locale1 = new com.a.e();
    localf1.a(locale1);
    locale1.a("name", paramString1);
    if ((paramString2 != null) && (!paramString2.trim().equals("")))
    {
      localf2 = new f("documentation");
      locale2 = new com.a.e();
      locale2.a(paramString2);
      localf2.a(locale2);
      locale1.a(localf2);
    }
    f localf2 = new f("input");
    com.a.e locale2 = new com.a.e();
    locale2.a("message", "typens:" + paramString1);
    localf2.a(locale2);
    locale1.a(localf2);
    f localf3 = new f("output");
    com.a.e locale3 = new com.a.e();
    locale3.a("message", "typens:" + paramString1 + "Response");
    localf3.a(locale3);
    locale1.a(localf3);
    return localf1;
  }

  private static void b(String paramString)
  {
    o = new f("soap:operation");
    o.a(new com.a.e());
    com.a.e locale = o.e();
    locale.a("soapAction", "urn:" + paramString + "Action");
  }

  private static void a(boolean paramBoolean, String paramString)
  {
    p = new f("soap:body");
    p.a(new com.a.e());
    com.a.e locale = p.e();
    locale.a("namespace", "urn:" + l);
    if (paramBoolean)
    {
      locale.a("use", "encoded");
      locale.a("encodingStyle", paramString);
    }
    else
    {
      locale.a("use", "literal");
    }
  }

  private static com.a.d c(String paramString)
  {
    f localf1 = new f("operation");
    com.a.e locale1 = new com.a.e();
    localf1.a(locale1);
    locale1.a("name", paramString);
    locale1.a(o);
    f localf2 = new f("input");
    com.a.e locale2 = new com.a.e();
    locale2.a(p);
    localf2.a(locale2);
    locale1.a(localf2);
    f localf3 = new f("output");
    com.a.e locale3 = new com.a.e();
    locale3.a(p);
    localf3.a(locale3);
    locale1.a(localf3);
    return localf1;
  }

  private static void a(String paramString, bi[] paramArrayOfbi)
  {
    f localf = new f("message");
    com.a.e locale = new com.a.e();
    locale.a("name", paramString);
    for (int i1 = 0; i1 < paramArrayOfbi.length; i1++)
    {
      bi localbi = paramArrayOfbi[i1];
      m localm = localbi.f();
      com.a.d locald = a(localbi.g(), localbi.a(), localm.c(), localm.b(), false);
      locale.a(locald);
    }
    localf.a(locale);
    d.add(localf);
  }

  private static void a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    f localf = new f("message");
    com.a.e locale = new com.a.e();
    locale.a("name", paramString1 + "Response");
    if (!paramString2.equals("void"))
      locale.a(a(paramString2, paramString1 + "Return", paramString3, paramInt, true));
    localf.a(locale);
    d.add(localf);
  }

  private static com.a.d a(String paramString1, String paramString2, String paramString3, int paramInt, boolean paramBoolean)
  {
    f localf = new f("part");
    com.a.e locale = new com.a.e();
    Object localObject;
    if (!q)
    {
      localObject = (Integer)k.get(paramString2);
      if (localObject == null)
      {
        k.put(paramString2, Integer.valueOf(1));
      }
      else
      {
        k.put(paramString2, Integer.valueOf(((Integer)localObject).intValue() + 1));
        paramString2 = paramString2 + localObject;
      }
    }
    locale.a("name", paramString2);
    if ((paramString1 != null) && (!paramString1.equals("unknown")))
    {
      localObject = d(paramString1);
      locale.a("type", (String)localObject);
      if ((((String)localObject).equals("xsd:anyType")) && (!paramString1.equals("array")) && (!paramString1.equals("mixed")))
      {
        k localk = new k(0, paramString3, paramInt, paramString1 + ct.a(1609));
        n.add(localk);
      }
    }
    else
    {
      if (paramBoolean)
        localObject = new k(3, paramString3, paramInt, null);
      else
        localObject = new k(2, paramString3, paramInt, "$" + paramString2 + ct.a(1610));
      n.add(localObject);
    }
    localf.a(locale);
    return (com.a.d)localf;
  }

  private static String d(String paramString)
  {
    if (paramString == null)
      return "xsd:anyType";
    int i1 = paramString.indexOf('[');
    if (i1 != -1)
    {
      String str1 = paramString.substring(0, i1) + "Array";
      b(str1, m);
      return "typens:" + str1;
    }
    if (paramString.equals("number"))
      paramString = "float";
    String str2 = e(paramString);
    if (str2.equals(""))
    {
      str2 = "xsd";
      paramString = "anyType";
    }
    return str2 + ":" + paramString;
  }

  private static String e(String paramString)
  {
    String str = e.b().b(paramString);
    if (!str.equals(""))
      return str;
    if (a.a(m, paramString, false) == null)
      return "";
    b(paramString, m);
    return "typens";
  }

  private static com.a.d b()
  {
    if (h.isEmpty())
      return null;
    f localf1 = new f("types");
    localf1.a(new com.a.e());
    com.a.e locale1 = localf1.e();
    f localf2 = new f("xsd:schema");
    localf2.a(new com.a.e());
    com.a.e locale2 = localf2.e();
    locale2.a("xmlns", "http://www.w3.org/2001/XMLSchema");
    locale2.a("targetNamespace", "urn:" + l);
    locale1.a(localf2);
    for (int i1 = 0; i1 < h.size(); i1++)
    {
      String str1 = (String)h.get(i1);
      m = (String)i.get(i1);
      Object localObject;
      if (str1.endsWith("Array"))
      {
        localObject = str1.substring(0, str1.length() - 5);
        String str2 = e((String)localObject);
        if (str2.equals(""))
        {
          str2 = "xsd";
          localObject = "anyType";
        }
        com.a.d locald = a((String)localObject, str2);
        locale2.a(locald);
      }
      else
      {
        localObject = f(str1);
        locale2.a((com.a.d)localObject);
      }
    }
    return (com.a.d)localf1;
  }

  private static com.a.d f(String paramString)
  {
    f localf1 = new f("xsd:complexType");
    localf1.a(new com.a.e());
    com.a.e locale1 = localf1.e();
    locale1.a("name", paramString);
    f localf2 = new f("xsd:all");
    locale1.a(localf2);
    localf2.a(new com.a.e());
    com.a.e locale2 = localf2.e();
    com.zend.ide.b.d[] arrayOfd = a.c(m, paramString, "");
    if (arrayOfd == null)
      return localf1;
    int i1 = a.a(m, paramString, false).f().b();
    for (int i2 = 0; i2 < arrayOfd.length; i2++)
    {
      z localz = (z)arrayOfd[i2];
      String str1 = localz.c();
      String str2 = d(str1);
      if ((str2.equals("xsd:anyType")) && (!"array".equals(str1)) && (!"mixed".equals(str1)))
      {
        k localk;
        if ((str1 == null) || (str1.equals("")))
          localk = new k(4, localz.f().c(), i1, paramString + "->" + localz.a() + ct.a(1610));
        else
          localk = new k(1, localz.f().c(), i1, paramString + "->" + localz.a() + ct.a(1611) + str1 + ct.a(1609));
        n.add(localk);
      }
      int i3 = str2.indexOf(':');
      String str3 = str2.substring(0, i3);
      str1 = str2.substring(i3 + 1);
      com.a.d locald = a(localz.a(), str1, str3);
      locale2.a(locald);
    }
    return localf1;
  }

  private static com.a.d a(String paramString1, String paramString2, String paramString3)
  {
    f localf = new f("xsd:element");
    localf.a(new com.a.e());
    com.a.e locale = localf.e();
    locale.a("name", paramString1);
    locale.a("type", paramString3 + ":" + paramString2);
    return localf;
  }

  private static com.a.d a(String paramString1, String paramString2)
  {
    f localf1 = new f("xsd:complexType");
    localf1.a(new com.a.e());
    com.a.e locale1 = localf1.e();
    locale1.a("name", paramString1 + "Array");
    f localf2 = new f("xsd:complexContent");
    locale1.a(localf2);
    localf2.a(new com.a.e());
    com.a.e locale2 = localf2.e();
    f localf3 = new f("xsd:restriction");
    locale2.a(localf3);
    localf3.a(new com.a.e());
    com.a.e locale3 = localf3.e();
    locale3.a("base", "soapenc:Array");
    f localf4 = new f("xsd:attribute");
    locale3.a(localf4);
    localf4.a(new com.a.e());
    com.a.e locale4 = localf4.e();
    locale4.a("ref", "soapenc:arrayType");
    locale4.a("wsdl:arrayType", paramString2 + ":" + paramString1 + "[]");
    return localf1;
  }

  private static void b(String paramString1, String paramString2)
  {
    if (h.contains(paramString1))
      return;
    h.add(paramString1);
    i.add(paramString2);
  }

  private static void c()
  {
    j = new f("definitions");
    d.clear();
    e.clear();
    f.clear();
    g.clear();
    h.clear();
    i.clear();
    l = "";
    n.clear();
    k.clear();
  }

  private static void a(ArrayList paramArrayList)
  {
    com.a.e locale = new com.a.e();
    locale.a("name", l);
    locale.a("targetNamespace", "urn:" + l);
    locale.a("xmlns:typens", "urn:" + l);
    locale.a("xmlns:xsd", "http://www.w3.org/2001/XMLSchema");
    locale.a("xmlns:soap", "http://schemas.xmlsoap.org/wsdl/soap/");
    locale.a("xmlns:soapenc", "http://schemas.xmlsoap.org/soap/encoding/");
    locale.a("xmlns:wsdl", "http://schemas.xmlsoap.org/wsdl/");
    locale.a("xmlns", "http://schemas.xmlsoap.org/wsdl/");
    if (paramArrayList != null)
      for (int i1 = 0; i1 < paramArrayList.size(); i1++)
        locale.a("xmlns:typens" + i1, paramArrayList.get(i1).toString());
    j.a(locale);
  }

  public static ArrayList d()
  {
    return n;
  }

  static
  {
    b = new f("soap:binding");
    com.a.e locale1 = new com.a.e();
    locale1.a("style", "rpc");
    locale1.a("transport", "http://schemas.xmlsoap.org/soap/http");
    b.a(locale1);
    c = new f("soap:binding");
    com.a.e locale2 = new com.a.e();
    locale2.a("style", "document");
    locale2.a("transport", "http://schemas.xmlsoap.org/soap/http");
    c.a(locale2);
    o = null;
    p = null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.l
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.f;

import com.zend.ide.b.d;
import com.zend.ide.b.m;
import com.zend.ide.m.ba;
import com.zend.ide.m.bd;
import com.zend.ide.m.bf;
import com.zend.ide.m.bh;
import com.zend.ide.m.bi;
import com.zend.ide.m.bj;
import com.zend.ide.m.c;
import com.zend.ide.m.g;
import com.zend.ide.m.j;
import com.zend.ide.m.v;
import com.zend.ide.m.w;
import com.zend.ide.m.x;
import com.zend.ide.m.y;
import com.zend.ide.m.z;
import com.zend.ide.util.cu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class jb
  implements cu
{
  private static Pattern a = Pattern.compile("\\$");
  private static Pattern b = Pattern.compile("unknown_type\\ ");
  private static Pattern e = Pattern.compile("unknown_type");
  private static StringBuffer c = new StringBuffer();
  private static StringBuffer d = new StringBuffer();

  public static final String a(ba paramba, s params)
  {
    c.delete(0, c.length());
    String str1 = paramba.b();
    ba localba = paramba.l();
    String str2 = paramba.e() ? paramba.f().c() : null;
    int i = localba != null ? 1 : 0;
    bi[] arrayOfbi = ((bh)paramba).c();
    String str3 = bj.a(((bh)paramba).a());
    c.append("<html><body bgcolor=\"#FFFFD7\" style=\"font: Dialog,Arial,Helvetica;\"><table width=\"100%\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\" style=\"margin: 5px;\">");
    if (str2 != null)
      c.append(a(str2));
    if (i != 0)
      c.append(a(localba.a(), params));
    c.append("<tr><td align=\"left\">");
    c.append(a(paramba, str3, arrayOfbi));
    c.append("</td></tr>");
    if (str1.length() > 0)
      c.append(b(str1));
    if (paramba.a() != null)
    {
      Iterator localIterator = paramba.a().a(7);
      if (localIterator.hasNext())
        c.append(b(localIterator));
      localIterator = paramba.a().a(6);
      if (localIterator.hasNext())
        c.append(a(localIterator));
      localIterator = paramba.a().a(8);
      if (localIterator.hasNext())
        c.append(a(localIterator, params, paramba));
    }
    c.append("</table></body></html>");
    return c.toString();
  }

  public static String a(v paramv, s params)
  {
    c.delete(0, c.length());
    bf localbf = (bf)paramv.l();
    y localy = paramv.c();
    w[] arrayOfw = paramv.d();
    boolean bool = bj.a(paramv.k());
    String str1 = null;
    String str2 = null;
    String[] arrayOfString = null;
    String str3 = paramv.b();
    if (localbf != null)
      str1 = localbf.a();
    if (localy != null)
      str2 = localy.a();
    if ((arrayOfw != null) && (arrayOfw.length > 0))
    {
      arrayOfString = new String[arrayOfw.length];
      for (int i = 0; i < arrayOfw.length; i++)
      {
        w localw = arrayOfw[i];
        arrayOfString[i] = localw.a();
      }
    }
    String str4 = paramv.a();
    c.append("<html><body bgcolor=\"#FFFFD7\" style=\"font: Dialog,Arial,Helvetica;\"><table width=\"100%\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\" style=\"margin: 5px;\">");
    if (str1 != null)
      c.append(a(str1));
    c.append("<tr><td nowrap>");
    c.append(bool ? "interface " : "class ");
    c.append("<b>");
    c.append(str4);
    c.append("</b></td></tr>");
    if (str2 != null)
      if (a(str2, params))
      {
        c.append("<tr><td nowrap>extends <a href=\"");
        c.append("extends");
        c.append("\">");
        c.append(str2);
        c.append("</a></td></tr>");
      }
      else
      {
        c.append("<tr><td nowrap>extends ");
        c.append(str2);
        c.append("</td></tr>");
      }
    if (arrayOfString != null)
    {
      c.append("<tr><td nowrap>");
      c.append("implements ");
      for (int j = 0; j < arrayOfString.length; j++)
      {
        String str5 = arrayOfString[j];
        c.append("<a href=\"");
        c.append("implements");
        c.append("\" target=>");
        c.append(str5);
        c.append("</a>");
        if ((arrayOfString.length <= 1) || (j >= arrayOfString.length - 1))
          continue;
        c.append(", ");
      }
      c.append("</td></tr>");
    }
    if (str3.length() > 0)
      c.append(b(str3));
    c.append("</table></body></html>");
    return c.toString();
  }

  public static String a(x paramx)
  {
    c.delete(0, c.length());
    String str1 = paramx.b();
    String str2 = paramx.i() ? "global " : "";
    c.append("<html><body bgcolor=\"#FFFFD7\" style=\"font: Dialog,Arial,Helvetica;\"><table width=\"100%\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\" style=\"margin: 5px;\">");
    c.append("<tr><td nowrap>");
    c.append(str2);
    c.append(paramx.a());
    c.append("</td></tr>");
    if (str1.length() > 0)
      c.append(b(str1));
    c.append("</table></body></html>");
    return c.toString();
  }

  public static String a(z paramz, s params)
  {
    c.delete(0, c.length());
    String str1 = paramz.b();
    ba localba = paramz.l();
    String str2 = localba != null ? localba.a() : null;
    String str3 = paramz.e() ? paramz.f().c() : localba != null ? localba.f().c() : null;
    String str4 = bj.a(paramz.d());
    String str5 = paramz.c();
    if (!str4.equals(""))
      str4 = str4 + " ";
    c.append("<html><body bgcolor=\"#FFFFD7\" style=\"font: Dialog,Arial,Helvetica;\"><table width=\"100%\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\" style=\"margin: 5px;\">");
    if (str3 != null)
      c.append(a(str3));
    if (str2 != null)
      a(str2, params);
    if (str3 != null)
    {
      str5 = str5 != null ? e.matcher(str5).replaceAll("") : null;
      str5 = a(str5, params) ? "<a href=\"extends\">" + str5 + "</a>" : str5;
      str5 = str5 != null ? " " + str5 : "";
      c.append("<tr><td nowrap>");
      c.append(str4);
      c.append(str5);
      c.append(" <b>");
      c.append(paramz.a());
      c.append("</b></td></tr>");
    }
    if (str1.length() > 0)
      c.append(b(str1));
    c.append("</table></body></html>");
    return c.toString();
  }

  public static String a(bd parambd)
  {
    c.delete(0, c.length());
    String str1 = parambd.b();
    String str2 = parambd.f() != null ? parambd.f().c() : null;
    String str3 = parambd.c();
    c.append("<html><body bgcolor=\"#FFFFD7\" style=\"font: Dialog,Arial,Helvetica;\"><table width=\"100%\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\" style=\"margin: 5px;\">");
    if (str2 != null)
      c.append(a(str2));
    c.append("<tr><td nowrap><b>");
    c.append(parambd.a());
    c.append("</b>");
    if ((str3 != null) && (str3.length() > 0))
    {
      c.append(" = ");
      c.append(str3);
    }
    c.append("</td></tr>");
    if (str1.length() > 0)
      c.append(str1);
    c.append("</table></body></html>");
    return c.toString();
  }

  public static String a(c paramc, s params)
  {
    c.delete(0, c.length());
    String str1 = paramc.b();
    String str2 = paramc.l().a();
    String str3 = paramc.f() != null ? paramc.f().c() : null;
    c.append("<html><body bgcolor=\"#FFFFD7\" style=\"font: Dialog,Arial,Helvetica;\"><table width=\"100%\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\" style=\"margin: 5px;\">");
    if (str3 != null)
      c.append(a(str3));
    if (str2 != null)
      c.append(a(str2, params));
    c.append("<tr><td nowrap><b>");
    c.append(paramc.a());
    c.append("</b></td></tr>");
    if (str1.length() > 0)
      c.append(b(str1));
    c.append("</table></body></html>");
    return c.toString();
  }

  private static String a(String paramString)
  {
    d.delete(0, d.length());
    d.append("<tr><td nowrap><b>Location:</b> ");
    d.append(paramString);
    d.append("</td></tr>");
    return d.toString();
  }

  private static String a(Iterator paramIterator, s params, ba paramba)
  {
    d.delete(0, d.length());
    d.append("<tr><td nowrap><b>See Also:</b></td></tr>");
    d.append("<tr><td nowrap>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
    j localj = (j)paramIterator.next();
    String str1 = localj.a();
    String[] arrayOfString = str1.split(",");
    for (int i = 0; i < arrayOfString.length; i++)
    {
      String str2 = arrayOfString[i];
      d[] arrayOfd = params.e(str2);
      int j = 0;
      Object localObject2;
      for (int k = 0; k < arrayOfd.length; k++)
      {
        localObject2 = arrayOfd[k];
        if (!arrayOfd.equals(((d)localObject2).a()))
          continue;
        d.append("<a href=\"");
        d.append("extends");
        d.append("\">");
        d.append(((d)localObject2).a());
        d.append("</a>");
        j = 1;
        break;
      }
      if (j != 0)
        break;
      if (params.a(str2) != null)
      {
        d.append("<a href=\"");
        d.append("see_file");
        d.append("\">");
        d.append(str2);
        d.append("</a>");
        break;
      }
      Object localObject1 = params.a(str2);
      if (localObject1 != null)
      {
        d.append("<a href=\"");
        d.append("see_const");
        d.append("\">");
        d.append(((d)localObject1).a());
        d.append("</a>");
        break;
      }
      if (((paramba instanceof bh)) && (paramba.l() != null))
      {
        localObject2 = str2;
        if (str2.indexOf('(') != -1)
          localObject2 = str2.substring(0, str2.indexOf('('));
        String str3 = paramba.e() ? paramba.f().c() : null;
        if ((str3 != null) && (params.a(str3, paramba.l().a(), (String)localObject2) != null))
        {
          d.append("<a href=\"");
          d.append("see_method");
          d.append("\">");
          d.append(str2);
          d.append("</a>");
          break;
        }
        if (str3 != null)
        {
          vb localvb = bl.a(paramba);
          localObject2 = str2;
          if (str2.startsWith("$"))
            localObject2 = str2.substring(1);
          arrayOfd = params.a(str3, localvb, (String)localObject2, true);
          for (int m = 0; m < arrayOfd.length; m++)
          {
            localObject1 = arrayOfd[m];
            if (!((ba)localObject1).a().equals(localObject2))
              continue;
            d.append("<a href=\"");
            d.append("see_var");
            d.append("\">");
            d.append(str2);
            d.append("</a>");
            j = 1;
            break;
          }
        }
        if (j != 0)
          break;
        if ((params.d(str2) != null) && (params.d(str2).length > 0))
        {
          d.append("<a href=\"");
          d.append("see_func");
          d.append("\">");
          d.append(str2);
          d.append("</a>");
          break;
        }
      }
      d.append(str2);
    }
    d.append("</td></tr>");
    return (String)(String)d.toString();
  }

  private static String a(Iterator paramIterator)
  {
    d.delete(0, d.length());
    d.append("<tr><td nowrap><b>Returns:</b></td></tr>");
    j localj = (j)paramIterator.next();
    String str = localj.a();
    d.append("<tr><td nowrap>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
    d.append(str);
    d.append("</td></tr>");
    return d.toString();
  }

  private static String b(Iterator paramIterator)
  {
    d.delete(0, d.length());
    Object localObject;
    while (paramIterator.hasNext())
    {
      localObject = (j)paramIterator.next();
      String str = ((j)localObject).a();
      str = a.matcher(str).replaceAll("");
      str = b.matcher(str).replaceAll("");
      if (str.split(" ").length > 1)
      {
        d.append("<tr><td nowrap>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
        d.append(str);
        d.append("</td></tr>");
      }
    }
    if (d.toString().length() > 0)
    {
      localObject = "<tr><td nowrap><b>Parameters:</b></td></tr>";
      d = d.insert(0, ((String)localObject).toCharArray(), 0, ((String)localObject).length());
    }
    return (String)d.toString();
  }

  private static String b(String paramString)
  {
    d.delete(0, d.length());
    paramString = paramString.replaceAll("\\n", "<br>");
    d.append("<tr><td>");
    d.append(paramString);
    d.append("</td></tr>");
    return d.toString();
  }

  private static String a(String paramString, s params)
  {
    d.delete(0, d.length());
    if (a(paramString, params))
    {
      d.append("<tr><td nowrap>class <a href=\"");
      d.append("extends");
      d.append("\">");
      d.append(paramString);
      d.append("</a></td></tr>");
    }
    else
    {
      d.append("<tr><td nowrap>class ");
      d.append(paramString);
      d.append("</td></tr>");
    }
    return d.toString();
  }

  private static String a(ba paramba, String paramString, bi[] paramArrayOfbi)
  {
    if (!paramString.equals(""))
      paramString = paramString + " ";
    String[] arrayOfString = { "" };
    if (paramArrayOfbi.length > 1)
    {
      ArrayList localArrayList = new ArrayList(paramArrayOfbi.length);
      for (int k = 0; k < paramArrayOfbi.length; k++)
      {
        String str2 = paramArrayOfbi[k].g();
        if ((str2 == null) || (str2.equals("unknown_type")))
          str2 = "";
        else
          str2 = str2 + " ";
        String str1 = str2 + "$" + paramArrayOfbi[k].a();
        if ((k > 0) && (paramArrayOfbi.length > 1) && (k < paramArrayOfbi.length - 1))
          str1 = str1 + ",<br>";
        else if (k == 0)
          str1 = str1 + ",";
        localArrayList.add(str1);
      }
      arrayOfString = new String[localArrayList.size()];
      localArrayList.toArray(arrayOfString);
    }
    else if (paramArrayOfbi.length == 1)
    {
      arrayOfString = new String[] { (paramArrayOfbi[0].g() == null ? "" : new StringBuilder().append(paramArrayOfbi[0].g()).append(" ").toString()) + "$" + paramArrayOfbi[0].a() };
    }
    int i = arrayOfString.length >= 1 ? 1 : 0;
    d.delete(0, d.length());
    d.append("<table width=\"100%\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\">");
    d.append("<tr><td align=\"left\" valign=\"top\" nowrap width=\"1%\" style=\"padding-right: 0px;\">");
    d.append(paramString);
    d.append("function <b>");
    d.append(paramba.a());
    d.append("</b>(");
    if ((i != 0) && (arrayOfString.length == 1))
    {
      d.append(arrayOfString[0]);
    }
    else if (i != 0)
    {
      d.append("</td><td align=\"left\" valign=\"middle\" nowrap>");
      d.append(arrayOfString[0]);
      d.append("</td></tr><tr><td align=\"left\" nowrap>&nbsp;</td>");
      d.append("<td align=\"left\" nowrap>");
      for (int j = 1; j < arrayOfString.length; j++)
        d.append(arrayOfString[j]);
    }
    else
    {
      d.append("(");
    }
    d.append(")</td></tr></table>");
    return d.toString();
  }

  public static boolean a(String paramString)
  {
    return (paramString.equals("extends")) || (paramString.equals("implements")) || (paramString.equals("see_const")) || (paramString.equals("see_file")) || (paramString.equals("see_func")) || (paramString.equals("see_method")) || (paramString.equals("see_var"));
  }

  public static d a(s params, d paramd, String paramString1, String paramString2)
  {
    if (paramString2 == null)
      return null;
    Object localObject1;
    Object localObject4;
    if (paramString1.equals("extends"))
    {
      localObject1 = null;
      int j;
      if ((paramd instanceof v))
      {
        localObject1 = ((v)paramd).c();
      }
      else if ((paramd instanceof bh))
      {
        localObject1 = ((ba)paramd).l();
      }
      else if ((paramd instanceof z))
      {
        localObject1 = null;
        arrayOfd1 = params.e(paramString2);
        if ((arrayOfd1 != null) && (arrayOfd1.length > 0))
          for (j = 0; j < arrayOfd1.length; j++)
          {
            localObject4 = (v)arrayOfd1[j];
            if (((v)localObject4).a().equals(paramString2))
              return localObject4;
          }
      }
      if (localObject1 == null)
        return null;
      d[] arrayOfd1 = params.e(((ba)localObject1).a());
      if ((arrayOfd1 != null) && (arrayOfd1.length > 0))
        for (j = 0; j < arrayOfd1.length; j++)
        {
          localObject4 = (v)arrayOfd1[j];
          if (((v)localObject4).a().equals(paramString2))
            return localObject4;
        }
    }
    else
    {
      Object localObject5;
      int n;
      Object localObject6;
      if (paramString1.equals("implements"))
      {
        localObject1 = ((v)paramd).d();
        for (int i = 0; i < localObject1.length; i++)
        {
          Object localObject3 = localObject1[i];
          localObject4 = localObject3.a();
          if (!((String)localObject4).equals(paramString2))
            continue;
          localObject5 = params.e((String)localObject4);
          for (n = 0; n < localObject5.length; n++)
          {
            localObject6 = localObject5[n];
            if ((localObject6.a().equals(paramString2)) && (bj.a(((v)localObject6).k())))
              return localObject6;
          }
        }
      }
      else
      {
        if (paramString1.equals("see_file"))
          return params.a(paramString2);
        if (paramString1.equals("see_const"))
          return params.a(paramString2);
        Object localObject2;
        if (paramString1.equals("see_method"))
        {
          localObject1 = paramString2;
          if (((String)localObject1).indexOf('(') != -1)
            localObject1 = paramString2.substring(0, paramString2.indexOf('('));
          localObject2 = params.f();
          for (int k = 0; k < localObject2.length; k++)
          {
            localObject4 = (v)localObject2[k];
            localObject5 = ((v)localObject4).h();
            for (n = 0; n < localObject5.length; n++)
            {
              localObject6 = localObject5[n];
              if (localObject6.a().equals(localObject1))
                return localObject6;
            }
          }
        }
        else if (paramString1.equals("see_var"))
        {
          localObject1 = bl.a(paramd);
          localObject2 = paramString2;
          if (((String)localObject2).startsWith("$"))
            localObject2 = paramString2.substring(1);
          d[] arrayOfd2 = params.a(((ba)paramd).f().c(), (vb)localObject1, (String)localObject2, true);
          for (int m = 0; m < arrayOfd2.length; m++)
          {
            localObject5 = arrayOfd2[m];
            if (((ba)localObject5).a().equals(localObject2))
              return localObject5;
          }
        }
      }
    }
    return (d)(d)(d)(d)null;
  }

  private static boolean a(String paramString, s params)
  {
    d[] arrayOfd = params.e(paramString);
    if ((arrayOfd != null) && (arrayOfd.length > 0))
      for (int i = 0; i < arrayOfd.length; i++)
      {
        v localv = (v)arrayOfd[i];
        if (localv.a().equals(paramString))
          return true;
      }
    return false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.jb
 * JD-Core Version:    0.6.0
 */
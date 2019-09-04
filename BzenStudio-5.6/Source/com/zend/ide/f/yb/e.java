package com.zend.ide.f.yb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class e extends DefaultHandler
{
  private String a = "";
  private ArrayList b = new ArrayList();
  private ArrayList c = new ArrayList();
  private ArrayList i = new ArrayList();
  private Stack d = new Stack();
  private a e = null;
  private b f = null;
  private boolean g = false;
  private ArrayList h = new ArrayList();
  private String j = "";
  private boolean k = false;
  private boolean l = false;

  public e()
  {
    this.h.add("binding");
    this.h.add("service");
  }

  public void a(String paramString)
  {
    g.b(paramString);
  }

  public void startDocument()
    throws SAXException
  {
  }

  public void endDocument()
    throws SAXException
  {
    g.n();
  }

  public void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
    throws SAXException
  {
    if (this.g)
      return;
    paramString3 = a(paramString3);
    if (this.h.contains(paramString3))
    {
      this.d.push(paramString3);
      return;
    }
    if (!this.d.isEmpty())
    {
      if (this.h.contains(this.d.peek()))
        return;
      if (p())
      {
        if (!g.a(paramString3, paramAttributes))
          h();
        return;
      }
    }
    if (paramString3.equals("definitions"))
    {
      a(paramAttributes);
      return;
    }
    if (paramString3.equals("message"))
    {
      b(paramAttributes);
      return;
    }
    if (paramString3.equals("part"))
    {
      c(paramAttributes);
      return;
    }
    if (paramString3.equals("portType"))
    {
      d(paramAttributes);
      return;
    }
    if (paramString3.equals("operation"))
    {
      e(paramAttributes);
      return;
    }
    if (paramString3.equals("input"))
    {
      f(paramAttributes);
      return;
    }
    if (paramString3.equals("output"))
    {
      g(paramAttributes);
      return;
    }
    if (paramString3.equals("documentation"))
    {
      j();
      return;
    }
    if (paramString3.equals("fault"))
    {
      i();
      return;
    }
    if (paramString3.equals("types"))
    {
      k();
      return;
    }
  }

  public void endElement(String paramString1, String paramString2, String paramString3)
    throws SAXException
  {
    if (this.g)
      return;
    paramString3 = a(paramString3);
    if ((paramString3.equals("binding")) || (paramString3.equals("service")))
    {
      this.d.pop();
      return;
    }
    if ((!this.d.isEmpty()) && (("binding".equals(this.d.peek())) || ("service".equals(this.d.peek()))))
      return;
    if (paramString3.equals("definitions"))
    {
      a();
      return;
    }
    if (paramString3.equals("message"))
    {
      b();
      return;
    }
    if (paramString3.equals("part"))
    {
      c();
      return;
    }
    if (paramString3.equals("portType"))
    {
      d();
      return;
    }
    if (paramString3.equals("operation"))
    {
      e();
      return;
    }
    if (paramString3.equals("input"))
    {
      f();
      return;
    }
    if (paramString3.equals("output"))
    {
      g();
      return;
    }
    if (paramString3.equals("documentation"))
    {
      l();
      return;
    }
    if (paramString3.equals("types"))
    {
      n();
      return;
    }
    if (p())
    {
      g.a(paramString1, paramString2, paramString3);
      return;
    }
  }

  private void a(Attributes paramAttributes)
  {
    if (!this.d.isEmpty())
    {
      h();
      return;
    }
    this.d.push("definitions");
    this.a = paramAttributes.getValue("name");
    if (this.a == null)
      this.a = "";
  }

  private void b(Attributes paramAttributes)
  {
    if (!"definitions".equals(this.d.peek()))
    {
      h();
      return;
    }
    this.d.push("message");
    String str = paramAttributes.getValue("name");
    if ((str == null) || (str.equals("")))
      return;
    this.e = c.a();
    this.e.a(str);
  }

  private void c(Attributes paramAttributes)
  {
    if (!"message".equals(this.d.peek()))
    {
      h();
      return;
    }
    this.d.push("part");
    if (this.e == null)
      return;
    String str1 = paramAttributes.getValue("name");
    if ((str1 == null) || (str1.equals("")))
      return;
    Object localObject = paramAttributes.getValue("type");
    if ((localObject == null) || (((String)localObject).equals("")))
      localObject = paramAttributes.getValue("element");
    localObject = localObject == null ? "" : a((String)localObject);
    String str2 = (String)g.l().get(localObject);
    if (str2 != null)
      localObject = str2;
    this.e.a(str1, (String)localObject);
  }

  private void d(Attributes paramAttributes)
  {
    if (!"definitions".equals(this.d.peek()))
    {
      h();
      return;
    }
    this.d.push("portType");
  }

  private void e(Attributes paramAttributes)
  {
    if (!"portType".equals(this.d.peek()))
    {
      h();
      return;
    }
    this.d.push("operation");
    String str = paramAttributes.getValue("name");
    if ((str == null) || (str.equals("")))
      return;
    this.f = c.b();
    this.f.c(str);
    this.k = true;
  }

  private void f(Attributes paramAttributes)
  {
    this.k = false;
    if (!"operation".equals(this.d.peek()))
    {
      h();
      return;
    }
    this.d.push("input");
    if ((this.f == null) || (this.f.b() != null))
      return;
    String str = a(paramAttributes.getValue("message"));
    if (str.equals(""))
      return;
    this.f.a(str);
  }

  private void g(Attributes paramAttributes)
  {
    this.k = false;
    if (!"operation".equals(this.d.peek()))
    {
      h();
      return;
    }
    this.d.push("output");
    if (this.f == null)
      return;
    String str = a(paramAttributes.getValue("message"));
    if (str.equals(""))
    {
      this.f = null;
      return;
    }
    this.f.b(str);
  }

  private void i()
  {
    this.k = false;
  }

  private void j()
  {
    if ((!"operation".equals(this.d.peek())) || (!this.k))
      return;
    this.l = true;
  }

  private void k()
  {
    if (!"definitions".equals(this.d.peek()))
    {
      h();
      return;
    }
    this.d.push("types");
  }

  private void a()
  {
    this.d.pop();
  }

  private void b()
  {
    this.d.pop();
    if (this.e != null)
      this.c.add(this.e);
    this.e = null;
  }

  private void c()
  {
    this.d.pop();
  }

  private void d()
  {
    this.d.pop();
  }

  private void e()
  {
    this.k = false;
    this.d.pop();
    if ((this.f != null) && (this.f.a() != null))
    {
      this.b.add(this.f);
      this.i.add(this.j);
      this.j = "";
    }
  }

  private void f()
  {
    this.d.pop();
  }

  private void g()
  {
    this.d.pop();
  }

  private void l()
    throws SAXException
  {
    if (p())
    {
      g.a("", "", "documentation");
      return;
    }
    this.l = false;
  }

  private void n()
  {
    this.d.pop();
  }

  public void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
    throws SAXException
  {
    if (p())
      g.a(paramArrayOfChar, paramInt1, paramInt2);
    if (!this.l)
      return;
    if (this.j.length() == 0)
      this.j = new String(paramArrayOfChar, paramInt1, paramInt2).trim();
    else
      this.j = (this.j + "\n" + new String(paramArrayOfChar, paramInt1, paramInt2).trim());
  }

  private void h()
  {
    this.g = true;
    this.c.clear();
    this.b.clear();
    this.i.clear();
    this.j = "";
    this.d.empty();
  }

  public String i()
  {
    return this.a;
  }

  public ArrayList j()
  {
    return this.b;
  }

  public ArrayList k()
  {
    return this.c;
  }

  public ArrayList o()
  {
    return this.i;
  }

  public boolean l()
  {
    return this.g;
  }

  private String a(String paramString)
  {
    if ((paramString == null) || (paramString.equals("")))
      return "";
    int m = paramString.lastIndexOf(":");
    if (m != -1)
    {
      if (m == paramString.length() - 1)
        return "";
      paramString = paramString.substring(m + 1);
    }
    return paramString;
  }

  private boolean p()
  {
    return (!this.d.isEmpty()) && ("types".equals(this.d.peek()));
  }

  public void m()
  {
    this.c.clear();
    this.b.clear();
    this.i.clear();
    this.j = "";
    while (!this.d.empty())
      this.d.pop();
    this.a = "";
    this.e = null;
    this.f = null;
    this.g = false;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.yb.e
 * JD-Core Version:    0.6.0
 */
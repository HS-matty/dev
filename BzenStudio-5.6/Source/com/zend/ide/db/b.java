package com.zend.ide.db;

import java.util.ArrayList;
import java.util.Arrays;

public class b
{
  private String a;
  private String b;
  private String[] c;
  private String[] d;
  private String e;
  private String p;
  private String[] f;
  private String g;
  private String h;
  private String i;
  private String j;
  private String k;
  private boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  private String q = "Configuration File made by Zend Studio PHPDocumentor Wizard";

  public String a()
  {
    return this.q;
  }

  public String b()
  {
    return this.b;
  }

  public void b(String paramString)
  {
    this.b = paramString;
  }

  public String[] c()
  {
    return this.c;
  }

  public void a(String[] paramArrayOfString)
  {
    this.c = paramArrayOfString;
  }

  public String[] d()
  {
    return this.d;
  }

  public void b(String[] paramArrayOfString)
  {
    this.d = paramArrayOfString;
  }

  public String e()
  {
    return this.e;
  }

  public void c(String paramString)
  {
    this.e = paramString;
  }

  public String f()
  {
    return this.p;
  }

  public void a(String paramString)
  {
    this.p = paramString;
  }

  public String[] g()
  {
    return this.f;
  }

  public void c(String[] paramArrayOfString)
  {
    this.f = paramArrayOfString;
  }

  public String h()
  {
    return this.g;
  }

  public void d(String paramString)
  {
    this.g = paramString;
  }

  public String i()
  {
    return this.h;
  }

  public void e(String paramString)
  {
    this.h = paramString;
  }

  public String j()
  {
    return this.i;
  }

  public void f(String paramString)
  {
    this.i = paramString;
  }

  public String k()
  {
    return this.j;
  }

  public void g(String paramString)
  {
    this.j = paramString;
  }

  public String l()
  {
    return this.k;
  }

  public void h(String paramString)
  {
    this.k = paramString;
  }

  public boolean m()
  {
    return this.l;
  }

  public void a(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }

  public boolean n()
  {
    return this.m;
  }

  public void b(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }

  public boolean o()
  {
    return this.n;
  }

  public void c(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }

  public boolean p()
  {
    return this.o;
  }

  public void d(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }

  public String[] a()
  {
    if ((this.a != null) && (!this.a.equals("")))
    {
      localObject = new String[2];
      localObject[0] = "-c";
      localObject[1] = this.a;
      return localObject;
    }
    Object localObject = new ArrayList();
    String str1 = "";
    if ((this.b != null) && (!this.b.equals("")))
    {
      ((ArrayList)localObject).add("-t");
      ((ArrayList)localObject).add(this.b);
    }
    int i1;
    String str2;
    if ((this.c != null) && (this.c.length > 0))
    {
      ((ArrayList)localObject).add("-f");
      str1 = str1 + this.c[0];
      for (i1 = 1; i1 < this.c.length; i1++)
      {
        str2 = this.c[i1];
        str1 = str1 + "," + str2;
      }
      ((ArrayList)localObject).add(str1);
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      ((ArrayList)localObject).add("-d");
      str1 = this.d[0];
      for (i1 = 1; i1 < this.d.length; i1++)
      {
        str2 = this.d[i1];
        str1 = str1 + "," + str2;
      }
      ((ArrayList)localObject).add(str1);
    }
    if ((this.f != null) && (this.f.length > 0))
    {
      ((ArrayList)localObject).add("-i");
      str1 = "";
      for (i1 = 0; i1 < this.f.length; i1++)
      {
        str2 = this.f[i1];
        str1 = str1 + str2 + ",";
      }
      ((ArrayList)localObject).add(str1);
    }
    if ((this.e != null) && (!this.e.equals("")))
    {
      ((ArrayList)localObject).add("-po");
      ((ArrayList)localObject).add(this.e);
    }
    if ((this.p != null) && (!this.p.equals("")))
    {
      ((ArrayList)localObject).add("-it");
      ((ArrayList)localObject).add(this.p);
    }
    if ((this.g != null) && (!this.g.equals("")))
    {
      ((ArrayList)localObject).add("-o");
      ((ArrayList)localObject).add(this.g);
    }
    if ((this.i != null) && (!this.i.equals("")))
    {
      ((ArrayList)localObject).add("-ti");
      ((ArrayList)localObject).add(this.i);
    }
    if ((this.h != null) && (!this.h.equals("")))
    {
      ((ArrayList)localObject).add("-ct");
      ((ArrayList)localObject).add(this.h);
    }
    if ((this.j != null) && (!this.j.equals("")))
    {
      ((ArrayList)localObject).add("-dn");
      ((ArrayList)localObject).add(this.j);
    }
    if ((this.k != null) && (!this.k.equals("")))
    {
      ((ArrayList)localObject).add("-dc");
      ((ArrayList)localObject).add(this.k);
    }
    if (this.l)
    {
      ((ArrayList)localObject).add("-pp");
      ((ArrayList)localObject).add("on");
    }
    if (this.m)
    {
      ((ArrayList)localObject).add("-s");
      ((ArrayList)localObject).add("on");
    }
    if (this.n)
    {
      ((ArrayList)localObject).add("-j");
      ((ArrayList)localObject).add("on");
    }
    if (this.o)
    {
      ((ArrayList)localObject).add("-p");
      ((ArrayList)localObject).add("on");
    }
    String[] arrayOfString = new String[((ArrayList)localObject).size()];
    ((ArrayList)localObject).toArray(arrayOfString);
    return (String)arrayOfString;
  }

  public hb q()
  {
    hb localhb = new hb();
    if ((this.i != null) && (!this.i.equals("")))
      localhb.put("title", this.i);
    localhb.put("parseprivate", m() ? "on" : "off");
    localhb.put("javadocdesc", o() ? "on" : "off");
    if ((this.h != null) && (!this.h.equals("")))
      localhb.put("customtags", this.h);
    if ((this.k != null) && (!this.k.equals("")))
      localhb.put("defaultcategoryname", this.k);
    if ((this.j != null) && (!this.j.equals("")))
      localhb.put("defaultpackagename", this.j);
    localhb.put("pear", p() ? "on" : "off");
    if ((this.b != null) && (!this.b.equals("")))
      localhb.put("target", this.b);
    if ((this.e != null) && (!this.e.equals("")))
      localhb.put("packageoutput", this.e);
    if ((this.p != null) && (!this.p.equals("")))
      localhb.put("ignore-tags", this.p);
    String str;
    int i1;
    if ((this.c != null) && (this.c.length > 0))
    {
      str = this.c[0];
      for (i1 = 1; i1 < this.c.length; i1++)
        str = str + "," + this.c[i1];
      localhb.put("filename", str);
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      str = this.d[0];
      for (i1 = 1; i1 < this.d.length; i1++)
        str = str + "," + this.d[i1];
      localhb.put("directory", str);
    }
    if ((this.f != null) && (this.f.length > 0))
    {
      str = this.f[0];
      for (i1 = 1; i1 < this.f.length; i1++)
        str = str + "," + this.f[i1];
      localhb.put("ignore", str);
    }
    if ((this.g != null) && (!this.g.equals("")))
      localhb.put("output", this.g);
    localhb.put("sourcecode", n() ? "on" : "off");
    return localhb;
  }

  private String[] b(String paramString)
  {
    String[] arrayOfString = null;
    try
    {
      arrayOfString = paramString.split(",", 10000);
    }
    catch (Exception localException)
    {
      return null;
    }
    return arrayOfString;
  }

  public void a(hb paramhb)
  {
    this.i = ((String)paramhb.get("title"));
    this.h = ((String)paramhb.get("customtags"));
    this.k = ((String)paramhb.get("defaultcategoryname"));
    this.j = ((String)paramhb.get("defaultpackagename"));
    this.b = ((String)paramhb.get("target"));
    this.e = ((String)paramhb.get("packageoutput"));
    this.p = ((String)paramhb.get("ignore-tags"));
    this.g = ((String)paramhb.get("output"));
    this.o = a(paramhb.get("pear"));
    this.m = a(paramhb.get("sourcecode"));
    this.l = a(paramhb.get("parseprivate"));
    this.n = a(paramhb.get("javadocdesc"));
    this.c = b((String)paramhb.get("filename"));
    this.d = b((String)paramhb.get("directory"));
    this.f = b((String)paramhb.get("ignore"));
  }

  private boolean a(Object paramObject)
  {
    return (paramObject != null) && (paramObject.equals("on"));
  }

  public boolean equals(Object paramObject)
  {
    b localb = (b)paramObject;
    return ((this.e == localb.e()) || (this.e.equals(localb.e()))) && ((this.p == localb.f()) || (this.p.equals(localb.f()))) && ((this.g == localb.h()) || (this.g.equals(localb.h()))) && ((this.h == localb.i()) || (this.h.equals(localb.i()))) && ((this.i == localb.j()) || (this.i.equals(localb.j()))) && ((this.j == localb.k()) || (this.j.equals(localb.k()))) && ((this.k == localb.l()) || (this.k.equals(localb.l()))) && ((this.b == localb.b()) || (this.b.equals(localb.b()))) && (this.l == localb.m()) && (this.m == localb.n()) && (this.n == localb.o()) && (this.o == localb.p()) && (Arrays.equals(this.c, localb.c())) && (Arrays.equals(this.d, localb.d())) && (Arrays.equals(this.f, localb.g()));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.b
 * JD-Core Version:    0.6.0
 */
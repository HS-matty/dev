package com.zend.ide.w;

import com.zend.ide.desktop.cj;
import com.zend.ide.l.k;
import com.zend.ide.y.c;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class l
  implements k
{
  private Map a;
  private cj b;
  private b c;
  private bb d;
  private o e;
  private static l f;

  public static void a(cj paramcj)
  {
    if (f == null)
      f = new l(paramcj);
  }

  public static l a()
  {
    return f;
  }

  private l(cj paramcj)
  {
    this.b = paramcj;
    this.a = Collections.synchronizedMap(new HashMap(5));
    b();
    String str = (String)com.zend.ide.y.b.a("sourceControl.tool").c();
    b(str);
  }

  private void b()
  {
    a(new com.zend.ide.w.a.d(this.b));
    a(new com.zend.ide.w.c.d(this.b));
  }

  public void a(b paramb)
  {
    this.a.put(paramb.a().toUpperCase(), paramb);
  }

  public b a(String paramString)
  {
    b localb = (b)this.a.get(paramString.toUpperCase());
    return localb;
  }

  public void b(String paramString)
    throws t
  {
    b localb = a(paramString);
    if (localb == this.c)
      return;
    if (localb == null)
    {
      d();
      return;
    }
    if (this.c != null)
      this.c.a(false);
    else
      d();
    this.c = localb;
    this.c.a(true);
    com.zend.ide.y.b.a("sourceControl.tool").a(paramString);
  }

  public b c()
  {
    return this.c;
  }

  public void d()
  {
    this.c = null;
    b[] arrayOfb = new b[this.a.size()];
    this.a.values().toArray(arrayOfb);
    for (int i = 0; i < arrayOfb.length; i++)
      arrayOfb[i].a(false);
  }

  public String[] e()
  {
    b[] arrayOfb = new b[this.a.size()];
    this.a.values().toArray(arrayOfb);
    String[] arrayOfString = new String[arrayOfb.length];
    for (int i = 0; i < arrayOfb.length; i++)
      arrayOfString[i] = arrayOfb[i].a();
    return arrayOfString;
  }

  public bb f()
  {
    if (this.d == null)
      this.d = new bb();
    return this.d;
  }

  public o g()
  {
    if (this.e == null)
      this.e = new o(this.b, f());
    return this.e;
  }

  public Object m()
  {
    j localj = new j();
    if (this.c != null)
      localj.a(this.c.a());
    return localj;
  }

  public void a(Object paramObject)
  {
  }

  public boolean b(Object paramObject)
  {
    return false;
  }

  public Object b()
  {
    return "SourceControl";
  }

  public Object d()
  {
    return new j();
  }

  public boolean a(boolean paramBoolean)
  {
    return true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.l
 * JD-Core Version:    0.6.0
 */
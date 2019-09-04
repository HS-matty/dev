package com.zend.ide.zendPlatformIntegration.a;

import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.util.ArrayList;
import java.util.HashMap;

public class f
  implements cu
{
  private static f a = null;
  public ArrayList b = new ArrayList();
  public HashMap c = new HashMap();
  public HashMap d = new HashMap();
  public HashMap e = new HashMap();
  public HashMap f = new HashMap();
  public HashMap g = new HashMap();
  public HashMap h = new HashMap();
  public HashMap i = new HashMap();
  public HashMap j = new HashMap();

  private f()
  {
    b();
    c();
    d();
    e();
    f();
  }

  public static synchronized f a()
  {
    if (a == null)
      a = new f();
    return a;
  }

  private void b()
  {
    this.b.add(new g(this, "all", ct.a(1931), new String[0]));
    this.b.add(new g(this, "enduser__other", ct.a(1932), new String[] { "outsize" }));
    this.b.add(new g(this, "server__other", ct.a(1933), new String[] { "load" }));
    this.b.add(new g(this, "php__slow", ct.a(1934), new String[] { "longscript", "devscript", "longfunction" }));
    this.b.add(new g(this, "php__error", ct.a(1935), new String[] { "zenderror", "funcerror" }));
    this.b.add(new g(this, "php__other", ct.a(1936), new String[] { "memsize", "devmem", "custom" }));
    this.b.add(new g(this, "db__slow", ct.a(1937), new String[] { "longquery" }));
    this.b.add(new g(this, "db__error", ct.a(1938), new String[] { "dberror" }));
  }

  private void c()
  {
    this.c.put("all", ct.a(1931));
    this.c.put("longscript", ct.a(1939));
    this.c.put("memsize", ct.a(1940));
    this.c.put("dberror", ct.a(1941));
    this.c.put("outsize", ct.a(1942));
    this.c.put("devscript", ct.a(1943));
    this.c.put("custom", ct.a(1944));
    this.c.put("devmem", ct.a(1945));
    this.c.put("longfunction", ct.a(1946));
    this.c.put("longquery", ct.a(1947));
    this.c.put("load", ct.a(1948));
    this.c.put("funcerror", ct.a(1949));
    this.c.put("zenderror", ct.a(1950));
    this.d.put(ct.a(1931), "all");
    this.d.put(ct.a(1939), "longscript");
    this.d.put(ct.a(1940), "memsize");
    this.d.put(ct.a(1941), "dberror");
    this.d.put(ct.a(1942), "outsize");
    this.d.put(ct.a(1943), "devscript");
    this.d.put(ct.a(1944), "custom");
    this.d.put(ct.a(1945), "devmem");
    this.d.put(ct.a(1946), "longfunction");
    this.d.put(ct.a(1947), "longquery");
    this.d.put(ct.a(1948), "load");
    this.d.put(ct.a(1949), "funcerror");
    this.d.put(ct.a(1950), "zenderror");
  }

  private void d()
  {
    this.e.put("all", ct.a(1931));
    this.e.put("0", ct.a(1885));
    this.e.put("1", ct.a(1884));
    this.f.put(ct.a(1931), "all");
    this.f.put(ct.a(1885), "0");
    this.f.put(ct.a(1884), "1");
  }

  private void e()
  {
    this.g.put("all", ct.a(1931));
    this.g.put("closed", ct.a(1951));
    this.g.put("dont_show", ct.a(1952));
    this.g.put("open", ct.a(1953));
    this.h.put(ct.a(1931), "all");
    this.h.put(ct.a(1951), "closed");
    this.h.put(ct.a(1952), "dont_show");
    this.h.put(ct.a(1953), "open");
  }

  private void f()
  {
    this.i.put("0", ct.a(673));
    this.i.put("1", ct.a(1921));
    this.i.put("2", ct.a(1922));
    this.i.put("3", ct.a(1923));
    this.i.put("4", ct.a(1924));
    this.j.put(ct.a(673), "0");
    this.j.put(ct.a(1921), "1");
    this.j.put(ct.a(1922), "2");
    this.j.put(ct.a(1923), "3");
    this.j.put(ct.a(1924), "4");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.a.f
 * JD-Core Version:    0.6.0
 */
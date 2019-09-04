package com.zend.ide.cb.c.c;

import com.zend.ide.cb.c.h;
import com.zend.ide.cb.c.v;
import com.zend.ide.cb.e;
import com.zend.ide.cb.q;
import java.util.Properties;

public class c extends h
{
  public c(e parame, q paramq)
  {
    super(parame, paramq);
    this.m = true;
  }

  protected void f()
  {
    this.b.clear();
    this.b.put("user", j());
    this.b.put("password", i());
    this.b.put("PGHOST", h());
    this.b.put("PGPORT", String.valueOf(l()));
    if (m())
      this.b.put("ssl", Boolean.toString(m()));
  }

  protected String e()
  {
    return "org.postgresql.Driver";
  }

  protected String a(String paramString, int paramInt)
  {
    return "jdbc:postgresql:" + n();
  }

  public v g()
  {
    if (this.c == null)
      this.c = new a(this);
    return this.c;
  }

  public String c()
  {
    return "\"";
  }

  public String d()
  {
    return "\"";
  }

  public boolean b()
  {
    return this.m;
  }

  public void b()
  {
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.c.c.c
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.cb.c.a;

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
  }

  protected void f()
  {
    this.b.clear();
    this.b.put("user", j());
    this.b.put("password", i());
  }

  protected String e()
  {
    return "oracle.jdbc.OracleDriver";
  }

  protected String a(String paramString, int paramInt)
  {
    if (paramString.startsWith("@"))
      paramString = paramString.substring(1);
    String str = "jdbc:oracle:thin:@" + paramString + ':' + l();
    if (!n().trim().equals(""))
      str = str + ':' + n();
    return str;
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
 * Qualified Name:     com.zend.ide.cb.c.a.c
 * JD-Core Version:    0.6.0
 */
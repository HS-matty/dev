package com.zend.ide.w.a;

import com.zend.ide.util.cl;
import com.zend.ide.util.cx;
import com.zend.ide.w.bb;

class ca
{
  private boolean a;
  private bb b;
  private StringBuffer c;

  public ca(bb parambb)
  {
    this.b = parambb;
  }

  public int a(Process paramProcess, boolean paramBoolean)
    throws a
  {
    this.c = new StringBuffer();
    cx localcx = new cx(new Object[] { "outBuffer", "err" });
    cd localcd1 = new cd(this, paramProcess.getInputStream(), this.c, localcx, "outBuffer", paramBoolean);
    cd localcd2 = new cd(this, paramProcess.getErrorStream(), this.c, localcx, "err", paramBoolean);
    localcd1.start();
    localcd2.start();
    localcx.b();
    if (this.a)
      throw new a();
    try
    {
      paramProcess.waitFor();
    }
    catch (InterruptedException localInterruptedException)
    {
      cl.a(localInterruptedException);
    }
    return paramProcess.exitValue();
  }

  private bb a()
  {
    return this.b;
  }

  private static boolean a(String paramString)
  {
    return (paramString.indexOf("used empty password; try \"cvs login\" with a real password") != -1) || (paramString.indexOf("use \"cvs login\" to log in first") != -1) || (paramString.indexOf("authorization failed") != -1);
  }

  private static boolean b(String paramString)
  {
    int i = 1;
    if (paramString.indexOf("used empty password; try \"cvs login\" with a real password") != -1)
      i = 0;
    else if (paramString.indexOf("authorization failed") != -1)
      i = 0;
    return i;
  }

  public String c()
  {
    return this.c.toString();
  }

  static boolean a(ca paramca, boolean paramBoolean)
  {
    return paramca.a = paramBoolean;
  }

  static boolean c(String paramString)
  {
    return a(paramString);
  }

  static bb a(ca paramca)
  {
    return paramca.a();
  }

  static boolean d(String paramString)
  {
    return b(paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.ca
 * JD-Core Version:    0.6.0
 */
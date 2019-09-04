package com.zend.ide.gb;

import com.zend.ide.be.d;
import com.zend.ide.desktop.bl;
import com.zend.ide.desktop.cj;
import com.zend.ide.gb.a.mb;
import com.zend.ide.k.e;
import com.zend.ide.n.bw;
import com.zend.ide.util.bc;
import com.zend.ide.util.cl;
import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.SwingUtilities;

public class i
{
  private cj a;
  private g b;
  private mb c;
  private p d;
  private Action e;

  public i(cj paramcj)
  {
    this.a = paramcj;
    this.d = new p(this);
    b();
  }

  private void a()
  {
    d().l();
  }

  private void b()
  {
    this.e = new com.zend.ide.util.f.i(new com.zend.ide.util.c.m(new m(this)));
    this.a.a("keys.wsdlCreatorTool", this.e, "default", false);
  }

  private g c()
  {
    if (this.b == null)
      this.b = new g(this);
    return this.b;
  }

  private mb d()
  {
    if (this.c == null)
      this.c = new mb(c(), this.a);
    return this.c;
  }

  private void e()
  {
    com.zend.ide.k.c localc = com.zend.ide.bd.c.b().f();
    e locale = localc.a("wsdlMessages");
    if (locale != null)
      localc.b(locale);
    localc.a(this.d, "WSDL");
    this.d.f();
    localc.c(this.d);
    com.zend.ide.bd.c.b().c().a("MessageComponent", true);
  }

  public boolean a(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.trim().equals("")))
      return false;
    bc localbc = bl.a().a(paramString);
    InputStream localInputStream = localbc.b;
    paramString = localbc.a;
    if (localInputStream != null)
    {
      bw localbw = this.a.X();
      if (localbw.a(paramString, null, localInputStream))
      {
        SwingUtilities.invokeLater(new j(this, localbw, paramInt));
        return true;
      }
      try
      {
        localInputStream.close();
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
    return false;
  }

  public void f()
  {
    e();
    this.d.a();
  }

  public void g()
  {
    this.d.b();
  }

  public void a(ArrayList paramArrayList)
  {
    for (int i = 0; i < paramArrayList.size(); i++)
      this.d.a((k)paramArrayList.get(i));
  }

  static void a(i parami)
  {
    parami.a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.i
 * JD-Core Version:    0.6.0
 */
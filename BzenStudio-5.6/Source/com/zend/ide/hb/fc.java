package com.zend.ide.hb;

import com.zend.ide.b.d;
import com.zend.ide.desktop.cj;
import com.zend.ide.f.bp;
import com.zend.ide.f.s;
import com.zend.ide.util.a.b;
import com.zend.ide.util.cu;
import javax.swing.JDialog;

public class fc
  implements cu
{
  private JDialog a;
  private s b;
  private d[] c;
  private d[] d;
  private static final d[] e = new d[0];
  private cj f;

  public fc(cj paramcj)
  {
    this.f = paramcj;
    this.b = bp.d().b();
    rc localrc = new rc(this);
    paramcj.a("keys.gotoFile", localrc, "default", false);
  }

  public void a(String paramString, int paramInt)
  {
    try
    {
      this.f.a(paramString, null, paramInt);
      this.f.Y();
    }
    catch (Exception localException)
    {
      b.a(localException);
    }
  }

  static d[] a(fc paramfc, d[] paramArrayOfd)
  {
    return paramfc.d = paramArrayOfd;
  }

  static d[] a()
  {
    return e;
  }

  static d[] a(fc paramfc)
  {
    return paramfc.d;
  }

  static d[] b(fc paramfc)
  {
    return paramfc.c;
  }

  static s c(fc paramfc)
  {
    return paramfc.b;
  }

  static d[] b(fc paramfc, d[] paramArrayOfd)
  {
    return paramfc.c = paramArrayOfd;
  }

  static JDialog d(fc paramfc)
  {
    return paramfc.a;
  }

  static JDialog a(fc paramfc, JDialog paramJDialog)
  {
    return paramfc.a = paramJDialog;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.fc
 * JD-Core Version:    0.6.0
 */
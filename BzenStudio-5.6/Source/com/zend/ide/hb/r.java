package com.zend.ide.hb;

import com.zend.ide.desktop.cj;
import com.zend.ide.f.bp;
import com.zend.ide.f.s;
import com.zend.ide.util.a.b;
import com.zend.ide.util.cu;
import javax.swing.JDialog;

public class r
  implements cu
{
  private JDialog a;
  private s b;
  private cj c;

  public r(cj paramcj)
  {
    this.c = paramcj;
    this.b = bp.d().b();
    nb localnb = new nb(this);
    paramcj.a("keys.gotoResource", localnb, "default", false);
  }

  public void a(String paramString, int paramInt)
  {
    try
    {
      this.c.a(paramString, null, paramInt);
      this.c.Y();
    }
    catch (Exception localException)
    {
      b.a(localException);
    }
  }

  static s a(r paramr)
  {
    return paramr.b;
  }

  static JDialog b(r paramr)
  {
    return paramr.a;
  }

  static JDialog a(r paramr, JDialog paramJDialog)
  {
    return paramr.a = paramJDialog;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.r
 * JD-Core Version:    0.6.0
 */
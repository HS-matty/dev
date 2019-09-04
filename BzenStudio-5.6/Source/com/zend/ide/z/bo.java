package com.zend.ide.z;

import com.zend.ide.bc.a;
import com.zend.ide.bd.c;
import com.zend.ide.be.d;
import com.zend.ide.be.i;
import com.zend.ide.be.l;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.Date;
import javax.swing.ImageIcon;

public class bo
  implements cu
{
  private bm e;
  private w f;
  private bn g;
  private h h;
  private m i;
  private Date k;
  private l a;
  private String b;

  public bo(h paramh, m paramm, String paramString)
  {
    this.h = paramh;
    this.i = paramm;
    this.b = paramString;
    i();
  }

  private void i()
  {
    bd localbd = new bd(this);
    this.k = new Date();
    this.e = new bm(this.i, this.k);
    this.g = new bn(this.h, this.i, localbd);
    this.f = new w(this.h, this.i);
    d locald = c.b().c();
    i locali = new i(true, true, 1, 1.0D, -1, new Rectangle(150, 150, this.e.getPreferredSize().width + 50, this.e.getPreferredSize().height + 50));
    ImageIcon localImageIcon = cv.b("profile16.gif");
    this.a = locald.a(this.b, localImageIcon, null, true, locali);
    this.a.a(localImageIcon);
    this.a.a(true);
    this.a.a(ct.a(929), null, this.e, null, "PROFILER_INFO");
    this.a.a(ct.a(930), cv.b("classbrowser/phpfiledata.gif"), this.f, null, "PROFILER_FUNCTION");
    this.a.a(ct.a(931), cv.b("parent_closed.gif"), this.g, null, "PROFILER_CALL_TRACE");
    a.a(this.e, "PROFILER_INFO");
    a.a(this.f, "PROFILER_FUNCTION");
    a.a(this.g, "PROFILER_CALL_TRACE");
  }

  public l b()
  {
    return this.a;
  }

  static bn a(bo parambo)
  {
    return parambo.g;
  }

  static m b(bo parambo)
  {
    return parambo.i;
  }

  static w c(bo parambo)
  {
    return parambo.f;
  }

  static l d(bo parambo)
  {
    return parambo.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.bo
 * JD-Core Version:    0.6.0
 */
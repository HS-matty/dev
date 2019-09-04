package com.zend.ide.s;

import com.zend.ide.b.d;
import com.zend.ide.bf.c;
import com.zend.ide.p.bi;
import com.zend.ide.util.cv;
import com.zend.ide.x.i;
import com.zend.ide.x.l;
import com.zend.ide.x.o;
import javax.swing.ImageIcon;

public class g extends f
  implements i
{
  private final ImageIcon e = cv.b("classbrowser/htmltagdata16.gif");
  private final ImageIcon f = cv.b("classbrowser/htmlattrdata16.gif");
  private final ImageIcon g = cv.b("classbrowser/htmlvaluedata16.gif");
  private final ImageIcon i = cv.b("classbrowser/htmltpldata16.gif");
  final k h;

  private g(k paramk)
  {
  }

  protected void a(d paramd, int paramInt, boolean paramBoolean)
  {
    String str1 = this.h.d.a(paramd, paramInt);
    String str2 = str1.substring(0, this.d);
    String str3 = str1.substring(this.d);
    this.a.a(str2, this.c, null);
    this.a.a(str3, null, null);
    paramd.a(this);
  }

  public void a(com.zend.ide.x.k paramk)
  {
    this.a.a(this.e);
  }

  public void a(com.zend.ide.x.h paramh)
  {
    this.a.a(this.f);
  }

  public void a(l paraml)
  {
    this.a.a(this.g);
  }

  public void a(o paramo)
  {
    this.a.a(this.g);
  }

  public void a(c paramc)
  {
    this.a.a(this.i);
    String str = paramc.b();
    this.a.a(" - ", this.c, null);
    this.a.a(str, this.c, null);
  }

  g(k paramk, y paramy)
  {
    this(paramk);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.g
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.l;

import com.zend.ide.bc.a;
import com.zend.ide.h.be;
import com.zend.ide.h.bf;
import com.zend.ide.h.r;
import com.zend.ide.j.u;
import com.zend.ide.util.bb;
import com.zend.ide.util.bp;
import javax.swing.ToolTipManager;

public class bk extends r
{
  private g d;

  private bk(be parambe, g paramg)
  {
    super(parambe);
    parambe.b(false);
    this.d = paramg;
    ((bg)q()).b();
    d("projectsTab");
    ToolTipManager.sharedInstance().registerComponent(parambe);
    a.a(c(), "PROJECT");
  }

  public bk(u paramu, g paramg)
  {
    this(new bf(paramu), paramg);
    bp.a(d());
  }

  protected bb e()
  {
    return new bg(this);
  }

  static g a(bk parambk)
  {
    return parambk.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.bk
 * JD-Core Version:    0.6.0
 */
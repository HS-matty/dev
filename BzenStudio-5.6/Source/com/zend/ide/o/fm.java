package com.zend.ide.o;

import com.zend.ide.g.n;
import com.zend.ide.n.gx;
import com.zend.ide.util.c.f;
import com.zend.ide.util.c.h;
import java.awt.Color;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;

public class fm extends n
  implements HierarchyListener
{
  private fk l;
  private cn m;
  private a o;
  private boolean n = false;
  private f p;

  public fm(fk paramfk)
  {
    this.l = paramfk;
    this.o = paramfk.a().a("ob_get_contents()");
    this.m = new cn(this, null);
    paramfk.a(this.m);
    addHierarchyListener(this);
    this.a.setBackground(Color.white);
    this.p = h.c().b(new ee(this, null));
    com.zend.ide.bc.a.a(this.a, "OUTPUT_BUFFER");
  }

  private void h()
  {
    this.n = true;
    if ((!this.p.e()) && (j()))
      this.p.a(0L, 500L);
  }

  private boolean j()
  {
    return (this.n) && (isShowing());
  }

  private void k()
  {
    e();
    this.l.a().b(this.o, 1);
    if ((this.o.d().e()) || (this.o.d().a() == 3))
      return;
    c(this.o.d().b().toString());
  }

  public void hierarchyChanged(HierarchyEvent paramHierarchyEvent)
  {
    long l1 = paramHierarchyEvent.getChangeFlags();
    int i = (l1 & 0x4) != 0L ? 1 : 0;
    int j = (i != 0) && (isShowing()) ? 1 : 0;
    if (j != 0)
      h();
  }

  static boolean a(fm paramfm)
  {
    return paramfm.j();
  }

  static boolean a(fm paramfm, boolean paramBoolean)
  {
    return paramfm.n = paramBoolean;
  }

  static void b(fm paramfm)
  {
    paramfm.k();
  }

  static f c(fm paramfm)
  {
    return paramfm.p;
  }

  static void d(fm paramfm)
  {
    paramfm.h();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.fm
 * JD-Core Version:    0.6.0
 */
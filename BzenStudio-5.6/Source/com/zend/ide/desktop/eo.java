package com.zend.ide.desktop;

import com.zend.ide.d.co;
import com.zend.ide.n.bc;
import com.zend.ide.n.be;
import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import com.zend.ide.n.gx;
import com.zend.ide.v.x;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import com.zend.ide.y.m;
import java.beans.PropertyChangeListener;

public class eo extends x
{
  private e b;
  private PropertyChangeListener c = new mb(this, null);
  private PropertyChangeListener e = new fq(this, null);
  private dx d = new dx();
  private bc a = new bc();
  private boolean f = true;

  public eo()
  {
    b();
  }

  private void b()
  {
    f localf = new f();
    this.b = new e(localf);
    localf.a("application.chosenScheme", this.c);
    localf.a("editing.styleManager", this.c);
    localf.a("editing.highlightingTurnOff", this.e);
    this.b.a("application.chosenScheme");
    this.b.a("editing.styleManager");
    this.b.a("editing.highlightingTurnOff");
  }

  public void a(dz paramdz, boolean paramBoolean)
  {
    if ((paramdz instanceof bw))
      this.d.b((gx)((bw)paramdz).e());
  }

  public void b(dz paramdz, boolean paramBoolean)
  {
    if ((paramdz instanceof bw))
      ((gx)((bw)paramdz).e()).a(this.d);
  }

  private void a(be parambe)
  {
    dx.a(this.d, parambe);
  }

  private void b(boolean paramBoolean)
  {
    this.f = paramBoolean;
    a();
  }

  private void a()
  {
    if (this.f)
    {
      be localbe = m.a().c();
      a(localbe);
    }
    else
    {
      a(this.a);
    }
  }

  static void a(eo parameo)
  {
    parameo.a();
  }

  static void a(eo parameo, boolean paramBoolean)
  {
    parameo.b(paramBoolean);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.eo
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.n;

import com.zend.ide.n.td.ec;
import com.zend.ide.n.td.gb;
import com.zend.ide.n.td.lb;
import java.util.List;
import javax.swing.SwingUtilities;

class ye
  implements lb
{
  private Runnable a = new ze(this);
  final gx b;

  public ye(gx paramgx)
  {
  }

  public void a(ec paramec)
  {
    if (paramec.a().c())
    {
      a();
      gx.a(this.b, "foldChanged", null, paramec.a());
    }
  }

  public void b(ec paramec)
  {
    a();
    gx.b(this.b, "foldChanged", null, paramec.b());
  }

  public void c(ec paramec)
  {
    a();
    gx.c(this.b, "foldChanged", null, paramec.a());
  }

  public void a(ec paramec, boolean paramBoolean)
  {
    a();
    gx.d(this.b, "foldChanged", null, paramec.b());
  }

  public void d(ec paramec)
  {
    a();
    gx.e(this.b, "foldChanged", null, paramec.a());
  }

  public void e(ec paramec)
  {
    gb localgb = paramec.a();
    int i = this.b.getCaretPosition();
    if ((i > localgb.d()) && (i <= localgb.e()))
      this.b.c(localgb.e() + 1, false);
    a();
    gx.f(this.b, "foldChanged", null, paramec.a());
  }

  public void f(ec paramec)
  {
    List localList = paramec.b();
    int i = this.b.getCaretPosition();
    for (int j = 0; j < localList.size(); j++)
    {
      gb localgb = (gb)localList.get(j);
      if ((i <= localgb.d()) || (i > localgb.e()))
        continue;
      this.b.c(localgb.e() + 1, false);
      break;
    }
    a();
    gx.g(this.b, "foldChanged", null, paramec.b());
  }

  public void g(ec paramec)
  {
    a();
    gx.h(this.b, "foldChanged", null, paramec.b());
  }

  public void h(ec paramec)
  {
    a();
    gx.i(this.b, "foldChanged", null, paramec.b());
  }

  private void a()
  {
    SwingUtilities.invokeLater(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ye
 * JD-Core Version:    0.6.0
 */
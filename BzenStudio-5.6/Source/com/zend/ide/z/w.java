package com.zend.ide.z;

import com.zend.ide.util.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.cu;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

class w extends JPanel
  implements bn, cu
{
  private m a;
  private h b;
  private y c;
  private bi d;
  private JSplitPane e;
  private bb f;
  private String g = "profilerFilesManager";
  private bt h;
  private q i;

  public w(h paramh, m paramm)
  {
    this.b = paramh;
    this.a = paramm;
    this.i = new q(this);
    this.d = new bi(this.i);
    this.c = new y(this, this.a, new f(this, null));
    setLayout(new BorderLayout());
    this.e = new JSplitPane(1, this.c, this.d);
    this.e.setOneTouchExpandable(true);
    this.e.setDividerLocation(0.3D);
    this.e.setContinuousLayout(true);
    Dimension localDimension = new Dimension(150, 50);
    this.c.setMinimumSize(localDimension);
    this.d.setMinimumSize(localDimension);
    this.e.setPreferredSize(new Dimension(400, 200));
    add(this.e, "Center");
    b();
    setName("functionStatsPanel");
  }

  private void b()
  {
    this.f = new p(this);
    ((p)this.f).b();
    d("profilerFilesManager");
    this.h = new bt(this);
    this.h.a(d().c().a());
    this.h.a(d().d().a());
  }

  public bi d()
  {
    return this.d;
  }

  public y e()
  {
    return this.c;
  }

  public bs t()
  {
    return this.h;
  }

  public Object s()
  {
    return null;
  }

  public void c(Object paramObject)
  {
  }

  public bb q()
  {
    return this.f;
  }

  public JComponent c()
  {
    return this;
  }

  public void d(String paramString)
  {
    this.g = paramString;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public String r()
  {
    return this.g;
  }

  public boolean d(boolean paramBoolean)
  {
    return this.h.d(paramBoolean);
  }

  public void a(bn parambn)
  {
    this.f.a(parambn.q());
  }

  static h a(w paramw)
  {
    return paramw.b;
  }

  static y b(w paramw)
  {
    return paramw.c;
  }

  static bi c(w paramw)
  {
    return paramw.d;
  }

  static m d(w paramw)
  {
    return paramw.a;
  }

  static q e(w paramw)
  {
    return paramw.i;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.w
 * JD-Core Version:    0.6.0
 */
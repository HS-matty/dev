package com.zend.ide.util.f;

import com.zend.ide.util.cu;
import java.awt.Component;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class g
  implements cu
{
  private p a;
  private Window b;
  private h c;

  public g(h paramh)
  {
    this.c = paramh;
    this.a = new p(this);
    this.b = null;
  }

  public void a()
  {
    this.b = new o();
    ((o)this.b).a(this.a);
    this.b.setVisible(true);
  }

  public void a(JFrame paramJFrame)
  {
    this.b = new n(paramJFrame);
    ((n)this.b).a(this.a);
    this.b.setVisible(true);
  }

  public void e()
  {
    this.b.setVisible(false);
  }

  public Component b()
  {
    return this.b;
  }

  public String c()
  {
    return this.a.c.getText().trim();
  }

  public String d()
  {
    return this.a.d.getText().trim();
  }

  static h a(g paramg)
  {
    return paramg.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.f.g
 * JD-Core Version:    0.6.0
 */
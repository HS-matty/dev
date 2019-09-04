package com.zend.ide.k;

import com.zend.ide.util.cl;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.JComponent;

public abstract class d
  implements f
{
  private JComponent a;
  private Object b;
  private String c;
  private String d;
  private Icon e;
  protected Vector g = new Vector(2);

  public d(JComponent paramJComponent, Object paramObject, String paramString1, Icon paramIcon, String paramString2)
  {
    this.a = paramJComponent;
    this.b = paramObject;
    this.c = paramString1;
    this.e = paramIcon;
    this.d = paramString2;
    MouseListener localMouseListener = k();
    if (localMouseListener != null)
      this.a.addMouseListener(localMouseListener);
  }

  protected MouseListener k()
  {
    return new a(this);
  }

  public Object m()
  {
    return this.b;
  }

  public String b()
  {
    return this.c;
  }

  public boolean c()
  {
    return false;
  }

  public void d()
  {
    n();
  }

  public String e()
  {
    return this.d;
  }

  public Icon f()
  {
    return this.e;
  }

  public JComponent g()
  {
    return this.a;
  }

  public void h()
  {
  }

  public void i()
  {
  }

  public void j()
  {
    n();
  }

  public void n()
  {
    int i = this.g.size();
    for (int j = 0; j < i; j++)
    {
      b localb = (b)this.g.get(j);
      try
      {
        localb.c();
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
    }
  }

  public void a(b paramb)
  {
    if (!this.g.contains(paramb))
      this.g.add(paramb);
  }

  public void b(b paramb)
  {
    this.g.remove(paramb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.k.d
 * JD-Core Version:    0.6.0
 */
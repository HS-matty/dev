package com.zend.ide.s;

import com.zend.ide.n.bw;
import com.zend.ide.util.cl;
import java.awt.Rectangle;
import javax.swing.JLayeredPane;
import javax.swing.RootPaneContainer;
import javax.swing.SwingUtilities;
import javax.swing.text.JTextComponent;

public class s
{
  private JLayeredPane a = null;
  private dj b = new dj(new t(this, null));
  final h c;

  private s(h paramh)
  {
  }

  private dj d()
  {
    return this.b;
  }

  private void c()
  {
    JLayeredPane localJLayeredPane = ((RootPaneContainer)this.c.n().e().getTopLevelAncestor()).getLayeredPane();
    if (localJLayeredPane == this.a)
      return;
    if (this.a != null)
      this.a.remove(this.b);
    this.a = localJLayeredPane;
    this.a.add(this.b, new Integer(2));
  }

  private void a(z paramz)
  {
    c();
    if ((paramz == null) || (paramz.c()))
    {
      b();
      return;
    }
    try
    {
      Rectangle localRectangle1 = this.c.n().e().modelToView(paramz.b());
      localRectangle1 = SwingUtilities.convertRectangle(this.c.n().e(), localRectangle1, this.a);
      Rectangle localRectangle2 = this.a.getBounds();
      this.b.a(paramz, localRectangle1, localRectangle2);
      this.b.setVisible(true);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  public void b()
  {
    if (this.b.isShowing())
    {
      this.b.setVisible(false);
      this.c.n().e().repaint();
    }
  }

  s(h paramh, a parama)
  {
    this(paramh);
  }

  static dj a(s params)
  {
    return params.d();
  }

  static void a(s params, z paramz)
  {
    params.a(paramz);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.s
 * JD-Core Version:    0.6.0
 */
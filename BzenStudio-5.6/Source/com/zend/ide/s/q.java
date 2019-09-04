package com.zend.ide.s;

import com.zend.ide.b.d;
import com.zend.ide.m.ba;
import com.zend.ide.m.x;
import com.zend.ide.n.bw;
import com.zend.ide.util.cl;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLayeredPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.text.JTextComponent;

class q
  implements ActionListener
{
  final n a;

  q(n paramn)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (!n.e(this.a).isShowing())
      return;
    String str = h.a(this.a.i).b(n.f(this.a));
    if (str == "")
      return;
    try
    {
      Rectangle localRectangle1 = this.a.i.n().e().modelToView(h.a(this.a.i).b());
      localRectangle1 = SwingUtilities.convertRectangle(this.a.i.n().e(), localRectangle1, n.g(this.a));
      Rectangle localRectangle2 = n.g(this.a).getBounds();
      boolean bool;
      if ((n.f(this.a) instanceof ba))
        bool = (n.f(this.a).e()) && (((ba)n.f(this.a)).a() == null);
      else
        bool = (n.f(this.a).e()) && ((n.f(this.a).b() == null) || (n.f(this.a).b().equals("")));
      n.a(this.a).d(bool);
      int i = ((n.f(this.a) instanceof x)) && (!(n.f(this.a) instanceof com.zend.ide.m.z)) ? 1 : 0;
      n.a(this.a).a(n.f(this.a).e() ? 0 : i != 0 ? 2 : 1);
      n.a(this.a).a(str, localRectangle2, n.a(this.a), localRectangle1);
      n.a(this.a, n.f(this.a));
      n.d(this.a).a(n.c(this.a));
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    n.h(this.a).stop();
    n.a(this.a, null);
    n.b(this.a, null);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.q
 * JD-Core Version:    0.6.0
 */
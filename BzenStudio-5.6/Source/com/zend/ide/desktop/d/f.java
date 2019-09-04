package com.zend.ide.desktop.d;

import com.zend.ide.ba.b;
import com.zend.ide.n.bw;
import com.zend.ide.util.cl;
import javax.swing.SwingUtilities;

class f
  implements com.zend.ide.ba.g
{
  final a a;

  private f(a parama)
  {
  }

  public void a(b paramb)
  {
    if (a.c(this.a).a(paramb.e(), null, -1))
      try
      {
        SwingUtilities.invokeLater(new g(this, paramb));
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
  }

  f(a parama, e parame)
  {
    this(parama);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.d.f
 * JD-Core Version:    0.6.0
 */
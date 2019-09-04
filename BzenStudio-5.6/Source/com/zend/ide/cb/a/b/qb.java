package com.zend.ide.cb.a.b;

import com.zend.ide.bd.c;
import com.zend.ide.cb.q;
import com.zend.ide.cb.u;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

class qb extends lb
{
  final bb c;

  public qb(bb parambb, KeyStroke paramKeyStroke)
  {
    super(ct.a(1527), cv.b("sql/removeServer.gif"));
    putValue("AcceleratorKey", paramKeyStroke);
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (this.a == null)
    {
      this.a = bb.a(this.c).g();
      if (this.a == null)
        return;
    }
    int i = JOptionPane.showConfirmDialog(c.b().h(), ct.a(1406) + '\'' + this.a.a() + "'?", ct.a(184), 0);
    if (i != 0)
      return;
    this.a.b();
    bb.a(this.c).c().b(this.a);
    this.a = null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.b.qb
 * JD-Core Version:    0.6.0
 */
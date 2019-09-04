package com.zend.ide.n.td;

import com.zend.ide.util.cl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.BadLocationException;

class ub
  implements ActionListener
{
  final hc a;

  private ub(hc paramhc)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    try
    {
      hc.a(this.a, hc.a(this.a), hc.b(this.a), hc.c(this.a), hc.d(this.a), hc.e(this.a));
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }

  ub(hc paramhc, tb paramtb)
  {
    this(paramhc);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.ub
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.d;

import com.zend.ide.p.w;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class v extends AbstractAction
{
  final bi a;

  private v(bi parambi)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (!bi.k(this.a).equals(ct.b(663)))
      bi.c(this.a, bi.k(this.a));
    bi.b(this.a).setEnabled(false);
  }

  v(bi parambi, f paramf)
  {
    this(parambi);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.v
 * JD-Core Version:    0.6.0
 */
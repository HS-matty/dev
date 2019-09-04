package com.zend.ide.w;

import com.zend.ide.h.be;
import com.zend.ide.util.d.a;
import com.zend.ide.util.eo;
import java.awt.Container;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.plaf.basic.BasicTreeUI;

class ib
  implements PropertyChangeListener
{
  final fb a;

  private ib(fb paramfb)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    String str = paramPropertyChangeEvent.getPropertyName();
    if (str.equals("vcs.statusAdded"))
      this.a.a.a(1, paramPropertyChangeEvent.getNewValue());
    else if (str.equals("vcs.statusMergedWithConflicts"))
      this.a.a.a(4, paramPropertyChangeEvent.getNewValue());
    else if (str.equals("vcs.statusModified"))
      this.a.a.a(3, paramPropertyChangeEvent.getNewValue());
    else if (str.equals("vcs.statusNotVersioned"))
      this.a.a.a(5, paramPropertyChangeEvent.getNewValue());
    else if (str.equals("vcs.statusUpToDate"))
      this.a.a.a(0, paramPropertyChangeEvent.getNewValue());
    ((BasicTreeUI)this.a.b.n().getUI()).setRightChildIndent(7);
    this.a.b.getParent().invalidate();
    this.a.b.getParent().repaint();
    this.a.b.n().repaint();
  }

  ib(fb paramfb, gb paramgb)
  {
    this(paramfb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.ib
 * JD-Core Version:    0.6.0
 */
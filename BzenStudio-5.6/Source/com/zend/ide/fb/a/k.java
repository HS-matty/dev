package com.zend.ide.fb.a;

import com.jniwrapper.win32.ie.Browser;
import com.zend.ide.util.en;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class k
  implements ChangeListener
{
  final g a;

  k(g paramg)
  {
  }

  public void stateChanged(ChangeEvent paramChangeEvent)
  {
    g.b(this.a, (Browser)g.a(this.a).getSelectedComponent());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.a.k
 * JD-Core Version:    0.6.0
 */
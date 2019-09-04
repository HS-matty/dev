package com.zend.ide.fb.a;

import com.jniwrapper.win32.ie.event.NavigationEventAdapter;
import javax.swing.SwingUtilities;

class n extends NavigationEventAdapter
{
  final g a;

  n(g paramg)
  {
  }

  public void progressChanged(int paramInt1, int paramInt2)
  {
    s locals = new s(this, paramInt2, paramInt1);
    SwingUtilities.invokeLater(locals);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.a.n
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.p.d;

import java.awt.Component;
import java.awt.Window;

class ab
  implements Runnable
{
  final f a;

  ab(f paramf)
  {
  }

  public void run()
  {
    Component localComponent = ((Window)this.a.a).getMostRecentFocusOwner();
    if (localComponent != null)
      localComponent.requestFocus();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.ab
 * JD-Core Version:    0.6.0
 */
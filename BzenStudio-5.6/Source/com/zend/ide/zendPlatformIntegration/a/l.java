package com.zend.ide.zendPlatformIntegration.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class l
  implements ActionListener
{
  final hb a;

  l(hb paramhb)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    ib localib = new ib(this.a, hb.a(this.a));
    if (localib.e())
      hb.b(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.a.l
 * JD-Core Version:    0.6.0
 */
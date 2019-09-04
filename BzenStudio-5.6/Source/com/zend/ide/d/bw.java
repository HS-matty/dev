package com.zend.ide.d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class bw
  implements ActionListener
{
  final ca a;

  private bw(ca paramca)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    ca.a(this.a);
  }

  bw(ca paramca, bv parambv)
  {
    this(paramca);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.bw
 * JD-Core Version:    0.6.0
 */
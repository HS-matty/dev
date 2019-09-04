package com.zend.ide.n;

import javax.swing.text.Document;

class dn
  implements Runnable
{
  final int a;
  final dl b;

  dn(dl paramdl, int paramInt)
  {
  }

  public void run()
  {
    int i = Math.min(this.a, this.b.getDocument().getLength());
    this.b.setCaretPosition(i);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.dn
 * JD-Core Version:    0.6.0
 */
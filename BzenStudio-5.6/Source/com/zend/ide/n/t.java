package com.zend.ide.n;

import javax.swing.text.Document;

class t
  implements Runnable
{
  final int a;
  final gz b;

  t(gz paramgz, int paramInt)
  {
  }

  public void run()
  {
    int i = Math.min(this.a, this.b.getDocument().getLength() - 1);
    this.b.setCaretPosition(i);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.t
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.w.b;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

class bv extends JPanel
{
  private bt a;
  final bs b;

  public bv(bs parambs)
  {
    b();
  }

  private void b()
  {
    setBorder(BorderFactory.createLineBorder(Color.gray));
    setLayout(new BorderLayout());
    this.a = new bt(this.b);
    add(this.a);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.bv
 * JD-Core Version:    0.6.0
 */
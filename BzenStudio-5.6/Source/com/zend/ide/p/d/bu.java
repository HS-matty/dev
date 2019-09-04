package com.zend.ide.p.d;

import java.awt.Dimension;
import javax.swing.JTextField;

class bu extends JTextField
{
  final bw a;

  bu(bw parambw)
  {
  }

  public Dimension getMaximumSize()
  {
    return new Dimension(32767, super.getPreferredSize().height);
  }

  public Dimension getPreferredSize()
  {
    return new Dimension(98, super.getPreferredSize().height);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bu
 * JD-Core Version:    0.6.0
 */
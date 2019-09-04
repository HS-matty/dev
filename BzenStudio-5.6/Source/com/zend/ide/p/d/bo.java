package com.zend.ide.p.d;

import java.awt.Dimension;
import javax.swing.JButton;

class bo extends JButton
{
  final bw a;

  bo(bw parambw, String paramString)
  {
    super(paramString);
  }

  public Dimension getMaximumSize()
  {
    return bw.i(this.a).getPreferredSize().width > bw.j(this.a).getPreferredSize().width ? bw.i(this.a).getPreferredSize() : bw.j(this.a).getPreferredSize();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bo
 * JD-Core Version:    0.6.0
 */
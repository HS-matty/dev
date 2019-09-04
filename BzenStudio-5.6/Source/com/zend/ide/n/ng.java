package com.zend.ide.n;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JToolTip;

class ng extends JToolTip
{
  final gx a;

  ng(gx paramgx)
  {
  }

  public Dimension getPreferredSize()
  {
    Dimension localDimension1 = super.getPreferredSize();
    Dimension localDimension2 = Toolkit.getDefaultToolkit().getScreenSize();
    int i = (int)(localDimension2.width * 0.75D);
    int j = (int)(localDimension2.height * 0.75D);
    localDimension1.width = Math.min(localDimension1.width, i);
    localDimension1.height = Math.min(localDimension1.height, j);
    return localDimension1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ng
 * JD-Core Version:    0.6.0
 */
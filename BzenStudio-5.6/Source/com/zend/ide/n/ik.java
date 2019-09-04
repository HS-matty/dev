package com.zend.ide.n;

import java.awt.Dimension;
import java.awt.Rectangle;

class ik extends gz
{
  private ik()
  {
  }

  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getRowHeight();
    paramInt2 = Math.round(paramInt2 / i) * i;
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public Dimension getPreferredSize()
  {
    Dimension localDimension = super.getPreferredSize();
    int i = getRowHeight();
    Rectangle localRectangle = getVisibleRect();
    if (localRectangle.height > 50)
    {
      localDimension.height += 50;
      localDimension.height = (Math.round(localDimension.height / i) * i);
      localDimension.height += localRectangle.height % i;
      localDimension.width += 100;
    }
    return localDimension;
  }

  ik(iq paramiq)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ik
 * JD-Core Version:    0.6.0
 */
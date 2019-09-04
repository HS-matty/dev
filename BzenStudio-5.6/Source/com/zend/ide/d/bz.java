package com.zend.ide.d;

import com.zend.ide.p.w;
import com.zend.ide.util.ct;
import com.zend.ide.y.g;
import java.awt.event.MouseEvent;

class bz extends w
{
  final bi a;

  bz(bi parambi, String paramString)
  {
    super(paramString);
  }

  public String getToolTipText(MouseEvent paramMouseEvent)
  {
    return ct.a(646) + ": " + g.e();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.bz
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.d;

import com.zend.ide.n.bd;
import com.zend.ide.n.be;
import com.zend.ide.util.ct;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;

class da extends dr
{
  final dd b;

  private da(dd paramdd)
  {
    super(paramdd);
  }

  public void a(MouseEvent paramMouseEvent)
  {
    Component localComponent = (Component)paramMouseEvent.getSource();
    Color localColor = this.b.b.a(localComponent, ct.a(1164), localComponent.getBackground());
    ci localci = dd.b(this.b);
    if ((localci != null) && (localColor != null))
    {
      localComponent.setBackground(localColor);
      int[] arrayOfInt = localci.b();
      be localbe = (be)dd.c(this.b);
      for (int i = 0; i < arrayOfInt.length; i++)
      {
        bd localbd = localbe.a(arrayOfInt[i]);
        localbd.a(localColor);
        localbe.a(arrayOfInt[i], localbd);
      }
    }
  }

  da(dd paramdd, bp parambp)
  {
    this(paramdd);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.da
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.d;

import com.zend.ide.n.bd;
import com.zend.ide.n.be;
import com.zend.ide.util.ct;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;

class cx extends dr
{
  final dd b;

  private cx(dd paramdd)
  {
    super(paramdd);
  }

  public void a(MouseEvent paramMouseEvent)
  {
    Component localComponent = (Component)paramMouseEvent.getSource();
    Color localColor = this.b.b.a(localComponent, ct.a(1163), localComponent.getBackground());
    ci localci = dd.b(this.b);
    if ((localci != null) && (localColor != null))
    {
      dd.g(this.b).setBackground(localColor);
      dd.g(this.b).setText("");
      int[] arrayOfInt = localci.b();
      be localbe = (be)dd.c(this.b);
      for (int i = 0; i < arrayOfInt.length; i++)
      {
        bd localbd = localbe.a(arrayOfInt[i]);
        localbd.b(localColor);
        localbe.a(arrayOfInt[i], localbd);
      }
    }
  }

  cx(dd paramdd, bp parambp)
  {
    this(paramdd);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.cx
 * JD-Core Version:    0.6.0
 */
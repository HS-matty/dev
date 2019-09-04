package com.zend.ide.d;

import com.zend.ide.n.bd;
import com.zend.ide.n.be;
import com.zend.ide.p.x;
import java.awt.event.ActionEvent;

public class cz extends dk
{
  final dd b;

  protected cz(dd paramdd)
  {
    super(paramdd);
  }

  public void a(ActionEvent paramActionEvent)
  {
    ci localci = dd.b(this.b);
    if (localci != null)
    {
      int i = 0;
      i += (dd.h(this.b).isSelected() ? 1 : 0);
      i += (dd.e(this.b).isSelected() ? 2 : 0);
      int[] arrayOfInt = localci.b();
      be localbe = (be)dd.c(this.b);
      for (int j = 0; j < arrayOfInt.length; j++)
      {
        bd localbd = localbe.a(arrayOfInt[j]);
        localbd.a(i);
        localbd.b(dd.f(this.b).isSelected());
        localbe.a(arrayOfInt[j], localbd);
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.cz
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.d;

import com.zend.ide.n.bd;
import com.zend.ide.n.be;
import com.zend.ide.p.x;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class cy extends dk
{
  final dd b;

  protected cy(dd paramdd)
  {
    super(paramdd);
  }

  public void a(ActionEvent paramActionEvent)
  {
    boolean bool = dd.d(this.b).isSelected();
    ci localci = dd.b(this.b);
    if (localci != null)
    {
      int[] arrayOfInt = localci.b();
      be localbe = (be)dd.c(this.b);
      for (int i = 0; i < arrayOfInt.length; i++)
      {
        bd localbd = localbe.a(arrayOfInt[i]);
        localbd.a(bool);
        localbe.a(arrayOfInt[i], localbd);
      }
      Color localColor = localbe.a(arrayOfInt[0]).c();
      dd.a(this.b, bool, localColor);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.cy
 * JD-Core Version:    0.6.0
 */
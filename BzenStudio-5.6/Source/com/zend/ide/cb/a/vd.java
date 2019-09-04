package com.zend.ide.cb.a;

import com.zend.ide.cb.c.w;
import com.zend.ide.util.ct;
import javax.swing.table.TableCellRenderer;

class vd extends sd
  implements TableCellRenderer
{
  final pd b;

  public vd(pd parampd)
  {
  }

  public void setValue(Object paramObject)
  {
    if (paramObject == null)
    {
      setText("(null)");
      return;
    }
    if (pd.b(this.b) == null)
      pd.a(this.b, new q(pd.c(this.b).b()));
    try
    {
      setText(pd.b(this.b).a(paramObject, this.b.a()));
    }
    catch (Throwable localThrowable)
    {
      if (pd.d(this.b))
        setText(paramObject.toString());
      else
        setText(ct.a(1471) + "[ " + paramObject.toString() + "]");
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.vd
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.cb.a;

import com.zend.ide.cb.c.w;
import com.zend.ide.util.ct;
import javax.swing.table.TableCellRenderer;

class le extends sd
  implements TableCellRenderer
{
  final pd a;

  public le(pd parampd)
  {
  }

  public void setValue(Object paramObject)
  {
    if (pd.a(this.a) == null)
      pd.b(this.a, new q(pd.c(this.a).a()));
    try
    {
      setText(pd.a(this.a).a(paramObject, this.a.a()));
    }
    catch (Throwable localThrowable)
    {
      if (pd.d(this.a))
        setText(paramObject.toString());
      else
        setText(ct.a(1471) + "[ " + paramObject.toString() + "]");
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.le
 * JD-Core Version:    0.6.0
 */
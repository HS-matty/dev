package com.zend.ide.cb.a;

import java.awt.Font;
import javax.swing.table.DefaultTableCellRenderer;

class zd extends DefaultTableCellRenderer
{
  private zd()
  {
  }

  protected void setValue(Object paramObject)
  {
    Font localFont = getFont();
    setText(paramObject == null ? "null" : paramObject.toString());
    if (paramObject == null)
    {
      if (localFont.getStyle() != 2)
        setFont(getFont().deriveFont(2));
    }
    else if (localFont.getStyle() != 0)
      setFont(getFont().deriveFont(0));
  }

  zd(g paramg)
  {
    this();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.zd
 * JD-Core Version:    0.6.0
 */
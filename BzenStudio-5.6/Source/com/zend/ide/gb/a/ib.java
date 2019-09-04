package com.zend.ide.gb.a;

import com.zend.ide.gb.b.c;
import java.awt.Component;
import java.io.File;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JList;
import javax.swing.UIManager;

class ib extends DefaultListCellRenderer
{
  final rb a;

  private ib(rb paramrb)
  {
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    setComponentOrientation(paramJList.getComponentOrientation());
    if (paramBoolean1)
    {
      setBackground(paramJList.getSelectionBackground());
      setForeground(paramJList.getSelectionForeground());
    }
    else
    {
      setBackground(paramJList.getBackground());
      setForeground(paramJList.getForeground());
    }
    if ((paramObject instanceof Icon))
    {
      setIcon((Icon)paramObject);
      setText("");
    }
    else
    {
      setIcon(null);
      String str;
      if ((paramObject instanceof c))
        str = ((c)paramObject).b();
      else
        str = paramObject.toString();
      setToolTipText(str);
      int i = str.lastIndexOf(File.separator);
      if (i + 1 != str.length())
        setText(str.substring(i + 1));
      else
        setText(str);
    }
    setEnabled(paramJList.isEnabled());
    setFont(paramJList.getFont());
    setBorder(paramBoolean2 ? UIManager.getBorder("List.focusCellHighlightBorder") : noFocusBorder);
    return this;
  }

  ib(rb paramrb, v paramv)
  {
    this(paramrb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.ib
 * JD-Core Version:    0.6.0
 */
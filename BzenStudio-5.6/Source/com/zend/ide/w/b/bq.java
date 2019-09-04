package com.zend.ide.w.b;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.Border;

class bq extends JLabel
{
  final bs a;

  public bq(bs parambs, String paramString, Color paramColor, Border paramBorder)
  {
    super(paramString);
    setOpaque(true);
    a(paramColor);
    if (paramBorder != null)
      setBorder(paramBorder);
  }

  public void a(Color paramColor)
  {
    if (paramColor != null)
      setBackground(paramColor);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.bq
 * JD-Core Version:    0.6.0
 */
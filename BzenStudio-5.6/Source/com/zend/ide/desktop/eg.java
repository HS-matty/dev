package com.zend.ide.desktop;

import com.zend.ide.i.n;
import java.awt.Container;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class eg extends n
{
  private JLabel c;

  public Icon a(String paramString)
  {
    return new ImageIcon(ClassLoader.getSystemResource(paramString));
  }

  public eg(JFrame paramJFrame, String paramString1, String paramString2)
  {
    super(paramJFrame, true);
    setTitle(paramString1);
    this.c = new JLabel(a(paramString2), 0);
    getContentPane().add(this.c);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.eg
 * JD-Core Version:    0.6.0
 */
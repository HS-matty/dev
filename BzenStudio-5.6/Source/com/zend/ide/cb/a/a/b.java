package com.zend.ide.cb.a.a;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class b
  implements a
{
  private JPanel a = new d(this, null);
  private ImageIcon b;

  public b()
  {
  }

  public b(byte[] paramArrayOfByte)
  {
    this();
    a(paramArrayOfByte);
  }

  public void a(byte[] paramArrayOfByte)
  {
    this.b = new ImageIcon(paramArrayOfByte);
    this.a.repaint();
  }

  public JComponent a()
  {
    return this.a;
  }

  static ImageIcon a(b paramb)
  {
    return paramb.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.a.b
 * JD-Core Version:    0.6.0
 */
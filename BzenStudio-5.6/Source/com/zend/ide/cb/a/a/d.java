package com.zend.ide.cb.a.a;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

class d extends JPanel
{
  final b a;

  private d(b paramb)
  {
  }

  public void paintComponent(Graphics paramGraphics)
  {
    super.paintComponent(paramGraphics);
    if (b.a(this.a) != null)
    {
      paramGraphics.setColor(Color.black);
      paramGraphics.drawRect(0, 0, b.a(this.a).getIconWidth() + 2, b.a(this.a).getIconHeight() + 2);
      paramGraphics.drawImage(b.a(this.a).getImage(), 1, 1, b.a(this.a).getIconWidth(), b.a(this.a).getIconHeight(), this);
    }
  }

  d(b paramb, c paramc)
  {
    this(paramb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.a.d
 * JD-Core Version:    0.6.0
 */
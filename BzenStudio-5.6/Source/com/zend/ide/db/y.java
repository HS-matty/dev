package com.zend.ide.db;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

class y extends JPanel
{
  private ImageIcon a;
  final x b;

  private y(x paramx)
  {
  }

  public void a(ImageIcon paramImageIcon)
  {
    this.a = paramImageIcon;
  }

  public void paintComponent(Graphics paramGraphics)
  {
    super.paintComponent(paramGraphics);
    if (this.a != null)
    {
      paramGraphics.setColor(Color.black);
      paramGraphics.drawRect(0, 0, this.a.getIconWidth() + 2, this.a.getIconHeight() + 2);
      paramGraphics.drawImage(this.a.getImage(), 1, 1, this.a.getIconWidth(), this.a.getIconHeight(), this);
    }
  }

  y(x paramx, c paramc)
  {
    this(paramx);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.db.y
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.p;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class bi extends JComponent
{
  private JLabel a;
  private bj b;

  public bi()
  {
    setLayout(new BorderLayout());
    this.a = new JLabel();
    add(this.a, "Before");
    this.b = new bj();
    add(this.b, "Center");
  }

  public void a(Icon paramIcon)
  {
    this.b.setIcon(paramIcon);
  }

  public void setOpaque(boolean paramBoolean)
  {
    super.setOpaque(paramBoolean);
    this.a.setOpaque(paramBoolean);
    this.b.setOpaque(paramBoolean);
  }

  public void setComponentOrientation(ComponentOrientation paramComponentOrientation)
  {
    super.setComponentOrientation(paramComponentOrientation);
    this.a.setComponentOrientation(paramComponentOrientation);
    this.b.setComponentOrientation(paramComponentOrientation);
  }

  public void setFont(Font paramFont)
  {
    super.setFont(paramFont);
    this.b.setFont(paramFont);
  }

  public void setBackground(Color paramColor)
  {
    super.setBackground(paramColor);
    this.a.setBackground(paramColor);
    this.b.setBackground(paramColor);
  }

  public void setForeground(Color paramColor)
  {
    super.setForeground(paramColor);
    this.a.setForeground(paramColor);
    this.b.setForeground(paramColor);
  }

  public void a(String paramString)
  {
    this.b.setText(paramString);
  }

  public void a(String paramString, Font paramFont, Color paramColor)
  {
    this.b.a(paramString, paramFont, paramColor);
  }

  public int b()
  {
    int i = this.b.e();
    int j = 0;
    Icon localIcon = this.a.getIcon();
    if (localIcon != null)
      j = localIcon.getIconWidth() + this.a.getIconTextGap();
    return i + j;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.bi
 * JD-Core Version:    0.6.0
 */
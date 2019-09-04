package com.zend.ide.be.a;

import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Icon;

class m
  implements Icon, PropertyChangeListener
{
  private Component a;
  private String b;
  private int c;
  private int d;
  private int e;
  private int f;

  public m(Component paramComponent, String paramString)
  {
    this.a = paramComponent;
    this.b = paramString;
    c();
    this.a.addPropertyChangeListener(this);
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    String str = paramPropertyChangeEvent.getPropertyName();
    if ("font".equals(str))
      b();
  }

  private void b()
  {
    int i = getIconHeight();
    int j = getIconWidth();
    c();
    if ((i != getIconWidth()) || (j != getIconHeight()))
      this.a.invalidate();
  }

  private void c()
  {
    FontMetrics localFontMetrics = this.a.getFontMetrics(this.a.getFont());
    this.e = (localFontMetrics.getAscent() + localFontMetrics.getDescent());
    this.f = localFontMetrics.getDescent();
    this.c = (localFontMetrics.stringWidth(this.b) + 10);
    this.d = this.e;
  }

  public void paintIcon(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    paramGraphics.setColor(paramComponent.getForeground());
    paramGraphics.setFont(paramComponent.getFont());
    paramGraphics.drawString(this.b, paramInt1 + 5, paramInt2 + this.d - this.f);
  }

  public int getIconWidth()
  {
    return this.c;
  }

  public int getIconHeight()
  {
    return this.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.m
 * JD-Core Version:    0.6.0
 */
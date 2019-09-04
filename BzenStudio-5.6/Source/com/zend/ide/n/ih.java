package com.zend.ide.n;

import com.zend.ide.n.td.a.k;
import com.zend.ide.p.a.b;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;

public class ih extends b
{
  private static final Color b = new Color(235, 235, 235);
  private static k c = new k();
  private boolean d = true;

  public void a(Element paramElement)
  {
    super.a(new hp(this, paramElement));
  }

  public void a(Element paramElement, boolean paramBoolean)
  {
    super.a(new ii(this, paramElement, paramBoolean));
  }

  protected int a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws BadLocationException
  {
    return -1;
  }

  public void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public boolean a()
  {
    return (c.b()) && (this.d);
  }

  public int b()
  {
    return c.a();
  }

  static Color c()
  {
    return b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ih
 * JD-Core Version:    0.6.0
 */
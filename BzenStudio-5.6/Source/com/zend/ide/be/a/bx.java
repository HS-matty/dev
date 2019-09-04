package com.zend.ide.be.a;

import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JComponent;

class bx extends JComponent
{
  private int a;
  private Icon b;
  final f c;

  public bx(f paramf, int paramInt)
  {
    this.a = paramInt;
    setBorder(f.d());
    b();
    addMouseListener(new i(this, paramf));
  }

  public void b()
  {
    bd localbd = f.b(this.c).b();
    switch (this.a)
    {
    case 1:
      this.b = (localbd.e ? bq.d : bq.c);
      break;
    case 2:
      this.b = (localbd.f ? bq.b : bq.c);
      break;
    case 3:
      this.b = (localbd.g ? bq.d : bq.a);
      break;
    case 4:
      this.b = (localbd.h ? bq.b : bq.a);
    }
  }

  protected void paintComponent(Graphics paramGraphics)
  {
    super.paintComponent(paramGraphics);
    this.b.paintIcon(this, paramGraphics, 2, 2);
  }

  static int b(bx parambx)
  {
    return parambx.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.bx
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.be.a;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

class i extends MouseAdapter
{
  final f a;
  final bx b;

  i(bx parambx, f paramf)
  {
  }

  public void mousePressed(MouseEvent paramMouseEvent)
  {
    bd localbd = f.b(this.b.c).b();
    switch (bx.b(this.b))
    {
    case 1:
      localbd.e = (!localbd.e);
      break;
    case 2:
      localbd.f = (!localbd.f);
      break;
    case 3:
      localbd.g = (!localbd.g);
      break;
    case 4:
      localbd.h = (!localbd.h);
    }
    f.b(this.b.c).a(localbd);
    this.b.b();
    f.e(this.b.c).invalidate();
    f.e(this.b.c).validate();
    f.e(this.b.c).repaint();
    f.d(this.b.c).invalidate();
    f.d(this.b.c).validate();
    f.d(this.b.c).repaint();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.be.a.i
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.d;

import com.zend.ide.n.gz;
import com.zend.ide.w.b.bs;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class dg extends MouseMotionAdapter
{
  private Cursor a = new Cursor(12);
  private Cursor b = new Cursor(0);
  final dn c;

  private dg(dn paramdn)
  {
  }

  public void mouseMoved(MouseEvent paramMouseEvent)
  {
    if (dn.b(this.c) != null)
    {
      gz localgz = (gz)dn.b(this.c).d();
      int i = localgz.viewToModel(paramMouseEvent.getPoint());
      if (dn.a(this.c, dn.b(this.c).b(i)) != -1)
        localgz.setCursor(this.a);
      else
        localgz.setCursor(this.b);
    }
  }

  dg(dn paramdn, dj paramdj)
  {
    this(paramdn);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.dg
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.n;

import com.zend.ide.util.cl;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.plaf.TextUI;
import javax.swing.text.BadLocationException;

class j extends MouseMotionAdapter
{
  final mb a;

  private j(mb parammb)
  {
  }

  public void mouseMoved(MouseEvent paramMouseEvent)
  {
    ob localob = null;
    if (mb.b(this.a))
    {
      int i = this.a.c.getUI().viewToModel(this.a.c, paramMouseEvent.getPoint());
      if (a(paramMouseEvent, i))
        localob = this.a.c.a().a(this.a.c, i);
    }
    mb.a(this.a, localob);
  }

  private boolean a(MouseEvent paramMouseEvent, int paramInt)
  {
    try
    {
      int i = this.a.c.getLineEndOffset(this.a.c.getLineOfOffset(paramInt)) - 1;
      if (i < 0)
        return false;
      Rectangle localRectangle = this.a.c.getUI().modelToView(this.a.c, i);
      if (!this.a.c.getLineWrap())
        return localRectangle.x >= paramMouseEvent.getX();
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
      return false;
    }
    return true;
  }

  j(mb parammb, cy paramcy)
  {
    this(parammb);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.j
 * JD-Core Version:    0.6.0
 */
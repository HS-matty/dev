package com.zend.ide.w.b;

import com.zend.ide.util.cl;
import java.awt.Rectangle;
import java.util.List;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;

class bc
  implements CaretListener
{
  private boolean a = false;
  final z b;

  public bc(z paramz)
  {
  }

  public void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public boolean b()
  {
    return this.a;
  }

  public void caretUpdate(CaretEvent paramCaretEvent)
  {
    if (!b())
      return;
    z.e(this.b, 1);
    try
    {
      Rectangle localRectangle = z.a(this.b).modelToView(paramCaretEvent.getMark());
      if (z.i(this.b) == null)
      {
        z.b(this.b, localRectangle);
        return;
      }
      if (z.i(this.b).y == localRectangle.y)
      {
        z.b(this.b, localRectangle);
        return;
      }
      z.b(this.b, localRectangle);
      x localx = z.a(this.b, z.j(this.b), z.i(this.b).y, 1, 1);
      boolean bool1 = (localx != z.r()) && (z.j(this.b).size() != 0);
      boolean bool2 = (localx != z.s()) && (z.j(this.b).size() != 0);
      if ((bool1) && (bool2))
      {
        int i = localx.f();
        if (i <= z.j(this.b).size() - 1)
        {
          int j = localx.c(z.i(this.b).y);
          if (i == z.j(this.b).size() - 1)
            bool1 = j > 0;
        }
        else
        {
          bool1 = false;
        }
        bool2 = i > 0;
      }
      bk localbk = new bk(this, bool1, bool2);
      z.a(this.b, localbk);
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.bc
 * JD-Core Version:    0.6.0
 */
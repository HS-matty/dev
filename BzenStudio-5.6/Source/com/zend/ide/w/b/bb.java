package com.zend.ide.w.b;

import com.zend.ide.util.cl;
import java.awt.Rectangle;
import java.util.List;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;

class bb
  implements CaretListener
{
  private boolean a = false;
  final z b;

  public bb(z paramz)
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
    z.e(this.b, 0);
    try
    {
      Rectangle localRectangle = z.b(this.b).modelToView(paramCaretEvent.getMark());
      if ((z.g(this.b) != null) && (z.g(this.b).y == localRectangle.y))
      {
        z.a(this.b, localRectangle);
        return;
      }
      z.a(this.b, localRectangle);
      x localx = z.a(this.b, z.h(this.b), z.g(this.b).y, 1, 0);
      boolean bool1 = (localx != z.p()) && (z.h(this.b).size() != 0);
      boolean bool2 = (localx != z.q()) && (z.h(this.b).size() != 0);
      if ((bool1) && (bool2))
      {
        int i = localx.f();
        if (i <= z.h(this.b).size() - 1)
        {
          int j = localx.c(z.g(this.b).y);
          if (i == z.h(this.b).size() - 1)
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
 * Qualified Name:     com.zend.ide.w.b.bb
 * JD-Core Version:    0.6.0
 */
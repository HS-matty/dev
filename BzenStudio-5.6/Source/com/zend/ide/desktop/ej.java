package com.zend.ide.desktop;

import com.zend.ide.b.m;
import com.zend.ide.f.bp;
import com.zend.ide.f.s;
import com.zend.ide.m.bc;
import com.zend.ide.m.bf;
import com.zend.ide.n.bw;
import com.zend.ide.n.el;
import java.awt.FontMetrics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

class ej
  implements el
{
  final ek a;

  private ej(ek paramek)
  {
  }

  public String a(MouseEvent paramMouseEvent)
  {
    String str = ek.d(this.a).k();
    bf localbf = bp.d().b().a(str);
    if (localbf != null)
    {
      Point localPoint = paramMouseEvent.getPoint();
      JTextComponent localJTextComponent = (JTextComponent)paramMouseEvent.getComponent();
      int i = localJTextComponent.viewToModel(localPoint);
      bc localbc = a(localbf, i);
      if (localbc != null)
        try
        {
          FontMetrics localFontMetrics = localJTextComponent.getFontMetrics(localJTextComponent.getFont());
          Rectangle localRectangle = localJTextComponent.modelToView(i);
          if (localJTextComponent.getDocument().getLength() == i)
          {
            if (localPoint.x > localRectangle.x + localFontMetrics.getMaxAdvance() + 20)
              return "";
            if (localPoint.y >= localRectangle.y + localFontMetrics.getHeight())
              return "";
            return localbc.c();
          }
          if (localPoint.x > localRectangle.x + localFontMetrics.getMaxAdvance())
            return "";
          return localbc.c();
        }
        catch (BadLocationException localBadLocationException)
        {
        }
    }
    return "";
  }

  public bc a(bf parambf, int paramInt)
  {
    bc[] arrayOfbc = parambf.i();
    for (int i = 0; (i < arrayOfbc.length) && (i < ek.e(this.a)); i++)
    {
      m localm = arrayOfbc[i].b();
      if ((paramInt >= localm.d()) && (paramInt <= localm.e() + 1))
        return arrayOfbc[i];
    }
    return null;
  }

  ej(ek paramek, eh parameh)
  {
    this(paramek);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.ej
 * JD-Core Version:    0.6.0
 */
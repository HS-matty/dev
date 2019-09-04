package com.zend.ide.n;

import com.zend.ide.n.td.gb;
import com.zend.ide.n.td.hc;
import com.zend.ide.n.td.jb;
import com.zend.ide.util.cl;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import javax.swing.event.MouseInputAdapter;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;

class kg extends MouseInputAdapter
{
  private Cursor a;
  final mg b;

  public kg(mg parammg)
  {
    this.a = parammg.getCursor();
  }

  public void mouseExited(MouseEvent paramMouseEvent)
  {
    this.b.f();
    if (mg.a(this.b) != null)
    {
      mg.a(this.b, null);
      mg.b(this.b, null);
      this.b.repaint();
    }
  }

  public void mouseMoved(MouseEvent paramMouseEvent)
  {
    gb localgb = mg.a(this.b);
    mg.a(this.b, a(paramMouseEvent.getPoint()));
    if (mg.a(this.b) != null)
    {
      this.b.setCursor(mg.g());
      if (mg.a(this.b) != mg.b(this.b))
      {
        this.b.f();
        a(paramMouseEvent.getPoint(), mg.a(this.b));
        mg.b(this.b, mg.a(this.b));
      }
    }
    else
    {
      mg.b(this.b, null);
      this.b.setCursor(this.a);
      this.b.f();
    }
    if (localgb != mg.a(this.b))
      this.b.repaint();
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    this.b.f();
    mg.a(this.b, a(paramMouseEvent.getPoint()));
    if (mg.a(this.b) != null)
    {
      if (mg.a(this.b).c())
        mg.c(this.b).a().b(mg.a(this.b));
      else
        mg.c(this.b).a().a(mg.a(this.b));
    }
    else
      mg.d(this.b).mouseClicked(paramMouseEvent);
  }

  private gb a(Point paramPoint)
  {
    Document localDocument = mg.e(this.b).getDocument();
    int i = mg.c(this.b).viewToModel(paramPoint);
    if (i == localDocument.getLength())
      return null;
    Element localElement1 = localDocument.getDefaultRootElement();
    Element localElement2 = localElement1.getElement(localElement1.getElementIndex(i));
    Iterator localIterator = mg.c(this.b).a().b(localElement2.getStartOffset(), localElement2.getEndOffset());
    if (localIterator.hasNext())
      return (gb)localIterator.next();
    return null;
  }

  private void a(Point paramPoint, gb paramgb)
  {
    if ((paramgb == null) || (!paramgb.c()))
      return;
    int i = paramgb.d();
    int j = paramgb.e() + 1;
    Document localDocument = mg.e(this.b).getDocument();
    int k = localDocument.getDefaultRootElement().getElementIndex(i);
    int m = localDocument.getDefaultRootElement().getElementIndex(j);
    Point localPoint1 = new Point(0, paramPoint.y + 10);
    Rectangle localRectangle = this.b.getVisibleRect();
    Point localPoint2 = this.b.getParent().getParent().getLocationOnScreen();
    localPoint1.translate(localPoint2.x, -(localRectangle.y - localPoint2.y));
    try
    {
      mg.g(this.b).a(mg.e(this.b), k, m, localPoint1, mg.f(this.b));
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.kg
 * JD-Core Version:    0.6.0
 */
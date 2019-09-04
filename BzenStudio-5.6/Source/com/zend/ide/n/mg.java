package com.zend.ide.n;

import com.zend.ide.n.td.a.s;
import com.zend.ide.n.td.gb;
import com.zend.ide.n.td.hc;
import com.zend.ide.n.td.jb;
import com.zend.ide.util.cl;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Iterator;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.TextUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.View;

public class mg extends JPanel
  implements DocumentListener, PropertyChangeListener
{
  private static final Color a = new Color(153, 153, 153);
  private static final Color b = new Color(51, 153, 255);
  private static final Color c = new Color(240, 240, 240);
  private static final Cursor d = Cursor.getPredefinedCursor(12);
  private int e = 0;
  private int f = 0;
  private bw g;
  private gx h;
  private int i;
  private int j;
  private int k;
  private gb l;
  private gb m;
  private int n;
  private hc o;
  private MouseListener p;

  public mg(bw parambw, MouseListener paramMouseListener)
  {
    this.g = parambw;
    this.p = paramMouseListener;
    this.h = ((gx)parambw.e());
    this.h.addPropertyChangeListener("font", this);
    parambw.addDocumentListener(this);
    kg localkg = new kg(this);
    addMouseMotionListener(localkg);
    addMouseListener(localkg);
    a();
  }

  private void a()
  {
    setBackground(c);
    this.h.addPropertyChangeListener("font", this);
    this.h.addPropertyChangeListener("foldChanged", this);
    this.e = this.g.p();
    this.o = new hc();
    d();
  }

  protected void paintComponent(Graphics paramGraphics)
  {
    super.paintComponent(paramGraphics);
    Rectangle localRectangle1 = getVisibleRect();
    paramGraphics.setFont(this.h.getGraphics().getFont());
    paramGraphics.setColor(c);
    paramGraphics.fillRect(localRectangle1.x, localRectangle1.y, localRectangle1.width, localRectangle1.height);
    paramGraphics.setColor(this.h.getBackground());
    paramGraphics.fillRect(localRectangle1.x + (int)(this.f / 1.5D), localRectangle1.y, localRectangle1.width, localRectangle1.height);
    int i1 = 0;
    try
    {
      i1 = this.g.getLineOfOffset(this.h.viewToModel(localRectangle1.getLocation()));
    }
    catch (BadLocationException localBadLocationException1)
    {
    }
    int i2 = 0;
    try
    {
      Point localPoint = localRectangle1.getLocation();
      localPoint.translate(0, localRectangle1.height);
      i2 = this.g.getLineOfOffset(this.h.viewToModel(localPoint));
      if (i2 + 1 < this.g.p())
        i2++;
    }
    catch (BadLocationException localBadLocationException2)
    {
    }
    View localView = this.h.getUI().getRootView(this.h).getView(0);
    if (!(localView instanceof s))
      return;
    s locals = (s)localView;
    int i3 = locals.a(i1);
    int i4 = i1;
    try
    {
      Element localElement1 = this.g.getDocument().getDefaultRootElement();
      Rectangle localRectangle2 = this.h.modelToView(localElement1.getElement(i4).getStartOffset());
      int i5 = 0;
      if (localRectangle2 != null)
        i5 = localRectangle2.height;
      else
        i5 = this.h.getFontMetrics(getFont()).getHeight();
      Element localElement2 = localElement1.getElement(i1);
      Element localElement3 = localElement1.getElement(i2);
      int i6 = localElement2.getStartOffset();
      int i7 = localElement3.getEndOffset();
      Iterator localIterator = this.h.a().b(i6, i7);
      if (localIterator.hasNext())
      {
        gb localgb = (gb)localIterator.next();
        int i8 = localgb.d();
        int i9 = localgb.e();
        int i10 = i8 == i9 ? 1 : 0;
        int i11 = this.i / 2;
        int i12 = -1;
        do
        {
          i4 = locals.b(i3);
          if (i4 < 0)
            return;
          while (i10 != 0)
          {
            if (!localIterator.hasNext())
              return;
            localgb = (gb)localIterator.next();
            i8 = localgb.d();
            i9 = localgb.e();
            if ((i8 < i12) || (i8 == i9))
              continue;
            i10 = 0;
          }
          i12 = locals.c(i3);
          if (i8 < i12)
          {
            i10 = 1;
            paramGraphics.setColor(Color.WHITE);
            int i13 = this.k;
            int i14 = i3 * i5 + this.j;
            paramGraphics.fillRect(i13, i14, this.i, this.i);
            if ((this.l != null) && (this.l == localgb))
              paramGraphics.setColor(b);
            else
              paramGraphics.setColor(a);
            paramGraphics.drawRect(i13, i14, this.i, this.i);
            paramGraphics.drawLine(i13 + 2, i14 + i11, i13 + this.i - 2, i14 + i11);
            if (localgb.c())
            {
              paramGraphics.drawLine(i13 + i11, i14 + 2, i13 + i11, i14 + this.i - 2);
            }
            else if ((this.l != null) && (this.l == localgb))
            {
              Rectangle localRectangle3 = this.h.modelToView(localgb.e());
              Rectangle localRectangle4 = this.h.modelToView(localgb.d());
              if (localRectangle3.y != localRectangle4.y)
              {
                localRectangle3.y += this.n;
                int i15 = localRectangle1.y + localRectangle1.height;
                if (localRectangle3.y > i15)
                {
                  paramGraphics.drawLine(i13 + i11, i14 + this.i, i13 + i11, i15);
                }
                else
                {
                  paramGraphics.drawLine(i13 + i11, i14 + this.i, i13 + i11, localRectangle3.y);
                  paramGraphics.drawLine(i13 + i11, localRectangle3.y, i13 + this.i, localRectangle3.y);
                }
              }
            }
          }
          i3++;
        }
        while (i4 < i2);
      }
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    b();
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    b();
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
  }

  private void b()
  {
    if (c())
      d();
    repaint();
  }

  private boolean c()
  {
    int i1 = this.g.p();
    if (i1 > this.e)
    {
      this.e = i1;
      return true;
    }
    return false;
  }

  private void d()
  {
    FontMetrics localFontMetrics = getFontMetrics(this.h.getFont());
    int i1 = localFontMetrics.getHeight();
    this.n = (i1 / 2);
    int i2 = this.g.p();
    int i3 = i1 * i2 * 10;
    this.i = Math.max(8, i1 / 2);
    this.f = (this.i + 4);
    this.j = ((i1 - this.i) / 2);
    this.k = ((this.f - this.i) / 2);
    if (this.j % 2 != 0)
      this.j -= 1;
    if (this.k % 2 != 0)
      this.k -= 1;
    if (this.i % 2 != 0)
      this.i += 1;
    Dimension localDimension = new Dimension(this.f, i3);
    setPreferredSize(localDimension);
    setSize(localDimension);
    revalidate();
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if (paramPropertyChangeEvent.getPropertyName().equals("foldChanged"))
      repaint();
    else
      d();
  }

  public boolean e()
  {
    return this.o.isVisible();
  }

  public void f()
  {
    this.o.b();
  }

  static gb a(mg parammg)
  {
    return parammg.l;
  }

  static gb a(mg parammg, gb paramgb)
  {
    return parammg.l = paramgb;
  }

  static gb b(mg parammg, gb paramgb)
  {
    return parammg.m = paramgb;
  }

  static Cursor g()
  {
    return d;
  }

  static gb b(mg parammg)
  {
    return parammg.m;
  }

  static gx c(mg parammg)
  {
    return parammg.h;
  }

  static MouseListener d(mg parammg)
  {
    return parammg.p;
  }

  static bw e(mg parammg)
  {
    return parammg.g;
  }

  static int f(mg parammg)
  {
    return parammg.f;
  }

  static hc g(mg parammg)
  {
    return parammg.o;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.mg
 * JD-Core Version:    0.6.0
 */
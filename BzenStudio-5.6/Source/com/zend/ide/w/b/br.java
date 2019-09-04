package com.zend.ide.w.b;

import com.zend.ide.util.cl;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JViewport;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

public class br extends JPanel
  implements m, ComponentListener
{
  private Point a;
  private Point b;
  private l c;
  private JTextComponent d;
  private JTextComponent e;
  private h f;
  private Insets g;
  private ArrayList h;
  private r i;
  private r j;
  private double k;
  private double l;
  private int m;
  private boolean n;
  private Color o;
  private Color p;
  private e q;

  public br(l paraml, JTextComponent paramJTextComponent1, JTextComponent paramJTextComponent2, h paramh)
  {
    this.c = paraml;
    this.d = paramJTextComponent1;
    this.e = paramJTextComponent2;
    this.f = paramh;
    this.h = new ArrayList(20);
    paraml.a(this);
    this.a = new Point(0, 0);
    this.b = new Point(0, 0);
    this.i = new r(this, 0);
    this.j = new r(this, 1);
    this.n = false;
    this.o = Color.blue;
    this.p = Color.red;
    addComponentListener(this);
  }

  public void a(Insets paramInsets)
  {
    this.g = paramInsets;
  }

  private void a(ChangeEvent paramChangeEvent)
  {
    Point localPoint = ((JViewport)paramChangeEvent.getSource()).getViewPosition();
    this.b = localPoint;
    repaint();
  }

  private void b(ChangeEvent paramChangeEvent)
  {
    Point localPoint = ((JViewport)paramChangeEvent.getSource()).getViewPosition();
    this.a = localPoint;
    repaint();
  }

  public ChangeListener b()
  {
    return this.i;
  }

  public ChangeListener c()
  {
    return this.j;
  }

  public void a(bl parambl)
  {
    switch (parambl.b())
    {
    case 0:
      this.h.clear();
      repaint();
      break;
    case 1:
      try
      {
        this.b = new Point();
        this.a = new Point();
        g();
        repaint();
      }
      catch (BadLocationException localBadLocationException)
      {
        cl.a(localBadLocationException);
      }
    default:
      this.b = new Point();
      this.a = new Point();
      this.h.clear();
      repaint();
    }
  }

  protected void paintComponent(Graphics paramGraphics)
  {
    super.paintComponent(paramGraphics);
    Graphics2D localGraphics2D = (Graphics2D)paramGraphics;
    this.l = f();
    this.k = e();
    localGraphics2D.translate(0.0D, this.k);
    localGraphics2D.shear(0.0D, this.l);
    Color localColor = paramGraphics.getColor();
    Rectangle localRectangle = getBounds();
    localRectangle.translate(-localRectangle.x, -localRectangle.y);
    for (int i1 = 0; i1 < this.h.size(); i1++)
    {
      e locale = (e)this.h.get(i1);
      paramGraphics.setColor(this.f.a(locale.b()));
      paramGraphics.fillPolygon(locale);
    }
    paramGraphics.setColor(localColor);
    localGraphics2D.translate(0.0D, -this.k);
    localGraphics2D.shear(0.0D, -this.l);
    if (this.g != null)
    {
      i1 = this.g.top;
      localGraphics2D.setColor(getBackground());
      localGraphics2D.fillRect(0, 0, getWidth(), i1);
      localGraphics2D.setColor(Color.gray);
      localGraphics2D.drawLine(0, this.g.top - 1, getWidth(), this.g.top - 1);
      localGraphics2D.setColor(localColor);
    }
    if ((this.n) && (this.m > 0) && (this.q != null))
      a(localGraphics2D);
  }

  private void a(Graphics2D paramGraphics2D)
  {
    Paint localPaint = paramGraphics2D.getPaint();
    paramGraphics2D.setPaint(this.q.c());
    paramGraphics2D.fillPolygon(this.q);
    paramGraphics2D.setPaint(localPaint);
  }

  private void d()
  {
    int i1 = 8;
    int[] arrayOfInt1 = new int[i1];
    int[] arrayOfInt2 = new int[i1];
    int i2 = getWidth();
    arrayOfInt1[0] = 0;
    arrayOfInt1[1] = (int)(i2 * 0.15D);
    arrayOfInt1[2] = arrayOfInt1[1];
    arrayOfInt1[3] = (i2 - arrayOfInt1[1]);
    arrayOfInt1[4] = arrayOfInt1[3];
    arrayOfInt1[5] = i2;
    arrayOfInt1[6] = i2;
    arrayOfInt1[7] = 0;
    arrayOfInt2[0] = (this.m - 1);
    arrayOfInt2[1] = (this.m - 6);
    arrayOfInt2[2] = arrayOfInt2[0];
    arrayOfInt2[3] = arrayOfInt2[0];
    arrayOfInt2[4] = arrayOfInt2[1];
    arrayOfInt2[5] = arrayOfInt2[0];
    arrayOfInt2[6] = this.m;
    arrayOfInt2[7] = this.m;
    this.q = new e(arrayOfInt1, arrayOfInt2, i1, 4);
    this.q.a(new GradientPaint(i2, this.m, this.o, 0.0F, this.m, this.p));
  }

  private double e()
  {
    if (this.g != null)
      return -this.b.getY() + this.g.top;
    return -this.b.getY();
  }

  private double f()
  {
    return (this.b.getY() - this.a.getY()) / getWidth();
  }

  protected void g()
    throws BadLocationException
  {
    this.h.clear();
    Document localDocument1 = this.c.h();
    Document localDocument2 = this.c.i();
    List localList = this.c.j();
    if (localList != null)
    {
      for (int i1 = 0; i1 < localList.size(); i1++)
      {
        j localj = (j)localList.get(i1);
        q localq1 = localj.a(localj.d()[0]);
        q localq2 = localj.b(localj.e()[0]);
        if ((!localq1.b()) || (!localq2.b()))
          b(localj, localDocument1, localDocument2);
        else
          a(localj, localDocument1, localDocument2);
      }
      repaint();
    }
  }

  private void a(j paramj, Document paramDocument1, Document paramDocument2)
    throws BadLocationException
  {
    e locale = new e(4);
    int i1 = 0;
    int i2 = getWidth();
    int[] arrayOfInt1 = paramj.d();
    int[] arrayOfInt2 = paramj.e();
    Rectangle localRectangle1 = this.e.modelToView(i.b(paramDocument1, arrayOfInt1[0]));
    Rectangle localRectangle2 = this.e.modelToView(i.b(paramDocument1, arrayOfInt1[1]));
    Rectangle localRectangle3 = this.d.modelToView(i.b(paramDocument2, arrayOfInt2[0]));
    Rectangle localRectangle4 = this.d.modelToView(i.b(paramDocument2, arrayOfInt2[1]));
    locale.addPoint(i2, localRectangle1.y);
    locale.addPoint(i2, localRectangle2.y + localRectangle2.height);
    locale.addPoint(i1, localRectangle4.y + localRectangle4.height);
    locale.addPoint(i1, localRectangle3.y);
    locale.a(a(paramj));
    this.h.add(locale);
  }

  private void b(j paramj, Document paramDocument1, Document paramDocument2)
    throws BadLocationException
  {
    e locale = new e(4);
    int i1 = 0;
    int i2 = getWidth();
    int[] arrayOfInt1 = paramj.d();
    int[] arrayOfInt2 = paramj.e();
    q localq = paramj.a(arrayOfInt1[0]);
    Rectangle localRectangle1 = this.d.modelToView(i.b(paramDocument2, Math.max(1, arrayOfInt2[1])));
    Rectangle localRectangle2 = this.e.modelToView(i.b(paramDocument1, Math.max(1, arrayOfInt1[1])));
    Rectangle localRectangle3;
    if (localq.b())
    {
      localRectangle3 = this.e.modelToView(i.b(paramDocument1, arrayOfInt1[0]));
      locale.addPoint(i2, localRectangle2.y + localRectangle2.height);
      if (arrayOfInt2[1] == 0)
      {
        locale.addPoint(i1, localRectangle1.y + 1);
        locale.addPoint(i1, localRectangle1.y - 1);
      }
      else
      {
        locale.addPoint(i1, localRectangle1.y + localRectangle1.height + 1);
        locale.addPoint(i1, localRectangle1.y + localRectangle1.height - 1);
      }
      locale.addPoint(i2, localRectangle3.y);
    }
    else
    {
      localRectangle3 = this.d.modelToView(i.b(paramDocument2, arrayOfInt2[0]));
      locale.addPoint(i1, localRectangle1.y + localRectangle1.height);
      if (arrayOfInt1[1] == 0)
      {
        locale.addPoint(i2, localRectangle2.y + 1);
        locale.addPoint(i2, localRectangle2.y - 1);
      }
      else
      {
        locale.addPoint(i2, localRectangle2.y + localRectangle2.height + 1);
        locale.addPoint(i2, localRectangle2.y + localRectangle2.height - 1);
      }
      locale.addPoint(i1, localRectangle3.y);
    }
    locale.a(a(paramj));
    this.h.add(locale);
  }

  private static int a(j paramj)
  {
    int i1 = 4;
    switch (paramj.f())
    {
    case 0:
      i1 = 0;
      break;
    case 1:
      i1 = 1;
      break;
    case 2:
      i1 = 2;
    }
    return i1;
  }

  public void componentResized(ComponentEvent paramComponentEvent)
  {
    try
    {
      g();
    }
    catch (BadLocationException localBadLocationException)
    {
      cl.a(localBadLocationException);
    }
    repaint();
  }

  public void componentMoved(ComponentEvent paramComponentEvent)
  {
  }

  public void componentShown(ComponentEvent paramComponentEvent)
  {
  }

  public void componentHidden(ComponentEvent paramComponentEvent)
  {
  }

  public void a(int paramInt)
  {
    this.m = paramInt;
    d();
  }

  static void a(br parambr, ChangeEvent paramChangeEvent)
  {
    parambr.a(paramChangeEvent);
  }

  static void b(br parambr, ChangeEvent paramChangeEvent)
  {
    parambr.b(paramChangeEvent);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.b.br
 * JD-Core Version:    0.6.0
 */
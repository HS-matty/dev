package com.zend.ide.n;

import com.zend.ide.n.td.a.s;
import com.zend.ide.n.td.bc;
import com.zend.ide.util.cl;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.TextUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.View;

public class gv extends JPanel
  implements DocumentListener, PropertyChangeListener
{
  private static final Color c = com.zend.ide.p.e.b.b;
  private static final Color e = new Color(240, 240, 240);
  private static final Color g = com.zend.ide.p.e.b.c;
  private static int l = bc.b() ? 0 : 2;
  private JTextComponent a = null;
  private bw b;
  private int h = 0;
  private int d = 0;
  private int i = 0;
  private int f = 0;
  private cp j = new cp(this);
  private com.zend.ide.n.a.b k;
  private e m;
  private PropertyChangeListener n = new sf(this, null);

  public gv(bw parambw)
  {
    this.b = parambw;
    this.a = parambw.e();
    b();
    ToolTipManager.sharedInstance().registerComponent(this);
  }

  private void b()
  {
    setBackground(e);
    this.a.addPropertyChangeListener("font", this);
    this.a.addPropertyChangeListener("foldChanged", this);
    this.b.addDocumentListener(this);
    this.h = this.b.p();
    this.i = Integer.toString(this.b.p()).length();
    e();
    a();
  }

  private void a()
  {
    f localf = new f();
    this.m = new e(localf);
    localf.a("editing.foldingEnabled", this.n);
    this.m.a("editing.foldingEnabled");
  }

  protected void paintComponent(Graphics paramGraphics)
  {
    super.paintComponent(paramGraphics);
    Rectangle localRectangle = getVisibleRect();
    paramGraphics.setFont(this.a.getGraphics().getFont());
    int i1 = 0;
    try
    {
      i1 = this.b.getLineOfOffset(this.a.viewToModel(localRectangle.getLocation()));
    }
    catch (BadLocationException localBadLocationException1)
    {
    }
    int i2 = 0;
    try
    {
      Point localPoint = localRectangle.getLocation();
      localPoint.translate(0, localRectangle.height);
      i2 = this.b.getLineOfOffset(this.a.viewToModel(localPoint));
      if (i2 + 1 < this.b.p())
        i2++;
    }
    catch (BadLocationException localBadLocationException2)
    {
    }
    View localView = this.a.getUI().getRootView(this.a).getView(0);
    if ((localView instanceof s))
      a(paramGraphics, (s)localView, i1, i2);
    else
      a(paramGraphics, i1, i2);
    paramGraphics.setColor(this.a.getBackground());
    paramGraphics.fillRect(this.d, 0, l, getHeight());
  }

  private void a(Graphics paramGraphics, s params, int paramInt1, int paramInt2)
  {
    int i1 = Math.max(0, params.a(paramInt1));
    int i2 = paramInt1;
    int i3 = -1;
    try
    {
      Element localElement = this.b.getDocument().getDefaultRootElement();
      Rectangle localRectangle = this.a.modelToView(localElement.getElement(i2).getStartOffset());
      if (localRectangle != null)
        this.f = localRectangle.height;
      else
        this.f = this.a.getFontMetrics(getFont()).getHeight();
      Iterator localIterator = null;
      List localList = null;
      if (this.k != null)
        localList = this.k.b(this.b.k());
      int i4 = -1;
      int i5 = -1;
      if (localList != null)
      {
        localIterator = localList.iterator();
        while ((localIterator.hasNext()) && (i5 < paramInt1))
          i5 = ((co)localIterator.next()).b();
        if (i5 < paramInt1)
          i5 = -1;
      }
      do
      {
        paramGraphics.setColor(c);
        int i6 = i1 * this.f;
        i2 = params.b(i1++);
        if (i2 < 0)
          return;
        i3 = params.b(i1);
        if ((localList != null) && (i5 > -1) && ((i5 <= i2) || (i5 < i3) || (i3 == -1)))
        {
          if (i4 != i2)
          {
            paramGraphics.setColor(g);
            paramGraphics.fillRect(0, i6, this.d - 1, this.f);
            paramGraphics.setColor(e);
          }
          while ((i5 < i3) && (localIterator.hasNext()))
            i5 = ((co)localIterator.next()).b();
          if ((i5 < i3) || (i3 == -1))
            i5 = -1;
        }
        if (i4 == i2)
          continue;
        String str = Integer.toString(i2 + 1);
        paramGraphics.drawString(str, 3, i6 + 3 * this.f / 4);
        i4 = i2;
      }
      while (i2 < paramInt2);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  private void a(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    int i1 = paramInt1;
    Element localElement2 = this.b.getDocument().getDefaultRootElement();
    List localList = null;
    if (this.k != null)
      localList = this.k.b(this.b.k());
    try
    {
      do
      {
        paramGraphics.setColor(c);
        Element localElement1 = localElement2.getElement(i1);
        Rectangle localRectangle = this.a.modelToView(localElement1.getStartOffset());
        if (localRectangle == null)
          return;
        if (localList != null)
        {
          Iterator localIterator = localList.iterator();
          while (localIterator.hasNext())
          {
            if (i1 != ((co)localIterator.next()).b())
              continue;
            paramGraphics.setColor(g);
            paramGraphics.fillRect(localRectangle.x, localRectangle.y, this.d - 1, localRectangle.height);
            this.f = localRectangle.height;
            paramGraphics.setColor(e);
          }
        }
        String str = Integer.toString(i1 + 1);
        paramGraphics.drawString(str, localRectangle.x + 3, localRectangle.y + 3 * localRectangle.height / 4);
        i1++;
      }
      while (i1 <= paramInt2);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  public void insertUpdate(DocumentEvent paramDocumentEvent)
  {
    c();
  }

  public void removeUpdate(DocumentEvent paramDocumentEvent)
  {
    c();
  }

  public void changedUpdate(DocumentEvent paramDocumentEvent)
  {
    com.zend.ide.n.a.b localb = this.k;
    this.k = ((com.zend.ide.n.a.b)this.b.getDocument().getProperty("bookmark"));
    if (localb != this.k)
    {
      if (localb != null)
        localb.b(this.j);
      if (this.k != null)
        this.k.a(this.j);
    }
    c();
  }

  private void c()
  {
    if (d())
      e();
    repaint();
  }

  private boolean d()
  {
    int i1 = this.b.p();
    int i2 = Integer.toString(i1).length();
    if ((i1 > this.h) || (i2 != this.i))
    {
      this.h = i1;
      this.i = i2;
      return true;
    }
    return false;
  }

  private void e()
  {
    FontMetrics localFontMetrics = getFontMetrics(this.a.getFont());
    int i1 = this.b.p();
    int i2 = localFontMetrics.getHeight() * i1 * 10;
    this.d = (SwingUtilities.computeStringWidth(localFontMetrics, Integer.toString(this.h)) + 6);
    Dimension localDimension = new Dimension(this.d + l, i2);
    setPreferredSize(localDimension);
    setSize(localDimension);
    revalidate();
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if (paramPropertyChangeEvent.getPropertyName().equals("foldChanged"))
      repaint();
    else
      e();
  }

  public String getToolTipText(MouseEvent paramMouseEvent)
  {
    View localView = this.a.getUI().getRootView(this.a).getView(0);
    if ((localView instanceof s))
      return a(paramMouseEvent, (s)localView);
    return a(paramMouseEvent);
  }

  private String a(MouseEvent paramMouseEvent, s params)
  {
    if (this.k != null)
    {
      List localList = this.k.b(this.b.k());
      if (localList != null)
      {
        Iterator localIterator = localList.iterator();
        int i1 = 0;
        int i2 = 0;
        if (localIterator.hasNext())
          try
          {
            Point localPoint = paramMouseEvent.getPoint();
            i1 = this.b.getLineOfOffset(this.a.viewToModel(localPoint));
            localPoint.translate(0, this.f);
            i2 = this.b.getLineOfOffset(this.a.viewToModel(localPoint));
          }
          catch (BadLocationException localBadLocationException)
          {
          }
        ArrayList localArrayList = new ArrayList(4);
        Object localObject2;
        while (localIterator.hasNext())
        {
          localObject1 = (co)localIterator.next();
          i3 = ((co)localObject1).b();
          localObject2 = ((co)localObject1).c();
          if ((i3 >= i1) && (i3 < i2) && (localObject2 != null) && (!((String)localObject2).equals("")))
            localArrayList.add(localObject1);
        }
        if (localArrayList.size() == 1)
          return ((co)localArrayList.get(0)).c();
        if (localArrayList.isEmpty())
          return null;
        Object localObject1 = new StringBuffer();
        for (int i3 = 0; i3 < localArrayList.size(); i3++)
        {
          localObject2 = (co)localArrayList.get(i3);
          ((StringBuffer)localObject1).append('[');
          ((StringBuffer)localObject1).append(((co)localObject2).b() + 1);
          ((StringBuffer)localObject1).append("]  ");
          ((StringBuffer)localObject1).append(((co)localObject2).c());
          if (i3 + 1 >= localArrayList.size())
            continue;
          ((StringBuffer)localObject1).append("\n");
        }
        return ((StringBuffer)localObject1).toString();
      }
    }
    return (String)(String)null;
  }

  private String a(MouseEvent paramMouseEvent)
  {
    if (this.k != null)
    {
      List localList = this.k.b(this.b.k());
      double d1 = paramMouseEvent.getPoint().getY();
      if (localList != null)
      {
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
        {
          co localco = (co)localIterator.next();
          int i1 = localco.b();
          String str = localco.c();
          if ((d1 > i1 * this.f) && (d1 < (i1 + 1) * this.f) && (str != null) && (!str.equals("")))
            return str;
        }
      }
    }
    return null;
  }

  static int a(int paramInt)
  {
    return gv.l = paramInt;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.gv
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.s;

import com.zend.ide.p.bc;
import com.zend.ide.p.bw;
import com.zend.ide.p.e.f;
import com.zend.ide.util.bb;
import com.zend.ide.util.cr;
import com.zend.ide.util.s;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JScrollBar;
import javax.swing.KeyStroke;
import javax.swing.ListCellRenderer;
import javax.swing.border.EtchedBorder;

public class cw extends bc
{
  private w g = new w(null);
  private z k;
  private int h;
  private int i;
  private boolean j;
  private v l;

  public cw(v paramv)
  {
    this.l = paramv;
    this.e.addFocusListener(new b(this));
    if (!f.h().i())
    {
      getHorizontalScrollBar().setPreferredSize(new Dimension(10, 10));
      getVerticalScrollBar().setPreferredSize(new Dimension(10, 10));
    }
    setHorizontalScrollBarPolicy(31);
    setVerticalScrollBarPolicy(20);
    setBorder(new EtchedBorder(0));
    this.e.setFont(cr.b());
    this.e.setSelectionMode(0);
    this.e.setBackground(com.zend.ide.p.e.b.a);
    setSize(100, 100);
    this.i = (Toolkit.getDefaultToolkit().getScreenSize().width / 2);
    this.e.addMouseListener(new d(this));
    this.e.addListSelectionListener(new u(this));
    this.e.addKeyListener(new jc(this));
    KeyStroke localKeyStroke = KeyStroke.getKeyStroke(27, 0);
    this.e.getActionMap().put("CloseWindowAction", new dd(this, null));
    this.e.getInputMap(2).put(localKeyStroke, "CloseWindowAction");
    this.e.setModel(this.g);
  }

  protected bb m()
  {
    return new s();
  }

  public void a(z paramz, Rectangle paramRectangle1, Rectangle paramRectangle2)
  {
    this.k = paramz;
    this.h = -1;
    w.a(this.g, paramz.r());
    x localx = paramz.f();
    int m = localx.a(paramz, (com.zend.ide.b.d)this.g.getElementAt(0), this.e, false, false, -1, 1).getPreferredSize().height;
    this.h = a(Math.min(this.i, getParent().getWidth()));
    this.e.setFixedCellHeight(m);
    this.e.setFixedCellWidth(m);
    int n = C();
    setSize(this.h + 20, n);
    setLocation(a(paramRectangle1, paramRectangle2));
    this.e.setSelectedIndex(0);
    this.e.ensureIndexIsVisible(0);
  }

  private int C()
  {
    int m = getPreferredSize().height;
    int n = this.g.getSize();
    Rectangle localRectangle = this.e.getCellBounds(n - 1, n - 1);
    if (localRectangle != null)
    {
      int i1 = localRectangle.height * n + getInsets().top + getInsets().bottom;
      m = Math.min(i1, m);
    }
    return m;
  }

  private int a(int paramInt)
  {
    int m = 0;
    x localx = this.k.f();
    com.zend.ide.b.d[] arrayOfd = w.a(this.g);
    for (int n = 0; n < arrayOfd.length; n++)
    {
      int i1 = localx.a(this.k, arrayOfd[n], this.e, false, false, -1, 1).getPreferredSize().width;
      if (i1 > paramInt)
        return paramInt;
      if (i1 <= m)
        continue;
      m = i1;
    }
    return m;
  }

  private Point a(Rectangle paramRectangle1, Rectangle paramRectangle2)
  {
    Rectangle localRectangle = getBounds();
    int m = paramRectangle1.x;
    if (m + localRectangle.width > paramRectangle2.width)
      m = paramRectangle2.width - localRectangle.width;
    this.j = (paramRectangle2.height / 2 < paramRectangle1.y);
    int n;
    if (this.j)
      n = paramRectangle1.y - localRectangle.height - 2;
    else
      n = paramRectangle1.y + paramRectangle1.height + 2;
    return new Point(m, n);
  }

  public boolean p()
  {
    return this.j;
  }

  protected ListCellRenderer o()
  {
    return new l(this, null);
  }

  public void u()
  {
    int m = this.e.getSelectedIndex();
    int n = this.e.getFirstVisibleIndex();
    if (!b(n))
      n++;
    int i1 = this.e.getLastVisibleIndex();
    if (!b(i1))
      i1--;
    int i2 = i1 - m;
    int i3 = i1 - n + 1;
    if (n - 1 >= 0)
    {
      n = n - i3 + 1 > 0 ? n - i3 + 1 : 0;
      this.e.setSelectedIndex(n + (i3 - i2 - 1));
      this.e.ensureIndexIsVisible(n);
    }
  }

  public void v()
  {
    int m = this.e.getSelectedIndex();
    int n = this.e.getFirstVisibleIndex();
    if (!b(n))
      n++;
    int i1 = this.e.getLastVisibleIndex();
    if (!b(i1))
      i1--;
    int i2 = i1 - m;
    int i3 = i1 - n + 1;
    int i4 = this.g.getSize() - 1;
    i1 = i1 < 0 ? i4 : i1;
    if (i1 + 1 <= i4)
    {
      i1 = i4 > i1 + i3 - 1 ? i1 + i3 - 1 : i4;
      this.e.setSelectedIndex(i1 - i2);
      this.e.ensureIndexIsVisible(i1);
    }
  }

  public void y()
  {
    int m = this.e.getSelectedIndex();
    int n = this.g.getSize();
    if ((m != -1) && (m < n - 1))
      this.e.setSelectedIndex(m + 1);
    this.e.ensureIndexIsVisible(m + 1);
  }

  public void z()
  {
    int m = this.e.getSelectedIndex();
    if (m > 0)
      this.e.setSelectedIndex(m - 1);
    this.e.ensureIndexIsVisible(m - 1);
  }

  public void w()
  {
    this.e.setSelectedIndex(this.g.getSize() - 1);
    this.e.ensureIndexIsVisible(this.g.getSize() - 1);
  }

  public void x()
  {
    this.e.setSelectedIndex(0);
    this.e.ensureIndexIsVisible(0);
  }

  private boolean b(int paramInt)
  {
    int m = this.g.getSize() - 1;
    if ((paramInt < 0) || (paramInt > m))
      return false;
    Rectangle localRectangle1 = this.e.getCellBounds(paramInt, paramInt);
    Rectangle localRectangle2 = this.e.getVisibleRect();
    return (localRectangle2.y <= localRectangle1.y) && (localRectangle2.y + localRectangle2.height >= localRectangle1.y + localRectangle1.height);
  }

  public com.zend.ide.b.d A()
  {
    return (com.zend.ide.b.d)this.e.getSelectedValue();
  }

  static v b(cw paramcw)
  {
    return paramcw.l;
  }

  static z a(cw paramcw)
  {
    return paramcw.k;
  }

  static int c(cw paramcw)
  {
    return paramcw.h;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.cw
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.s;

import com.zend.ide.b.d;
import com.zend.ide.p.bc;
import com.zend.ide.p.bw;
import com.zend.ide.util.bb;
import com.zend.ide.util.s;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Enumeration;
import javax.swing.ActionMap;
import javax.swing.DefaultListModel;
import javax.swing.InputMap;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.KeyStroke;
import javax.swing.ListCellRenderer;
import javax.swing.border.EtchedBorder;

public class dj extends bc
{
  private static Color g = new Color(255, 255, 215);
  private z h;
  private int i;
  private cr j;

  public dj(cr paramcr)
  {
    this.j = paramcr;
    getHorizontalScrollBar().setPreferredSize(new Dimension(10, 10));
    getVerticalScrollBar().setPreferredSize(new Dimension(10, 10));
    setHorizontalScrollBarPolicy(30);
    setVerticalScrollBarPolicy(21);
    this.e.setBackground(g);
    setBorder(new EtchedBorder(0));
    this.e.setFont(com.zend.ide.util.cr.b());
    this.e.setSelectionMode(0);
    setSize(100, 100);
    KeyStroke localKeyStroke = KeyStroke.getKeyStroke(27, 0);
    this.e.getActionMap().put("CloseWindowAction", new dg(this, null));
    this.e.getInputMap(2).put(localKeyStroke, "CloseWindowAction");
  }

  protected bb m()
  {
    return new s();
  }

  public void a(z paramz, Rectangle paramRectangle1, Rectangle paramRectangle2)
  {
    this.h = paramz;
    this.i = -1;
    d[] arrayOfd = paramz.r();
    DefaultListModel localDefaultListModel = new DefaultListModel();
    for (int k = 0; k < arrayOfd.length; k++)
      localDefaultListModel.addElement(arrayOfd[k]);
    d().setModel(localDefaultListModel);
    k = p();
    int m = getParent().getWidth();
    this.i = (a(m) + 10);
    if (this.i >= m)
    {
      this.i = m;
      k += 10;
    }
    setSize(this.i, k);
    setLocation(a(paramRectangle1, paramRectangle2));
    this.e.setSelectedIndex(0);
    this.e.ensureIndexIsVisible(0);
  }

  private int p()
  {
    int k = getPreferredSize().height;
    int m = e().getSize();
    Rectangle localRectangle = this.e.getCellBounds(m - 1, m - 1);
    if (localRectangle != null)
    {
      int n = localRectangle.height * m + getInsets().top + getInsets().bottom;
      k = Math.min(n, k);
    }
    return k;
  }

  private int a(int paramInt)
  {
    int k = 0;
    x localx = this.h.f();
    Enumeration localEnumeration = e().elements();
    while (localEnumeration.hasMoreElements())
    {
      d locald = (d)localEnumeration.nextElement();
      int m = localx.a(this.h, locald, this.e, false, false, -1, 1).getPreferredSize().width;
      if (m > paramInt)
        return paramInt;
      if (m > k)
        k = m;
    }
    return k;
  }

  private Point a(Rectangle paramRectangle1, Rectangle paramRectangle2)
  {
    Rectangle localRectangle = getBounds();
    int k = paramRectangle1.x;
    if (k + localRectangle.width > paramRectangle2.width)
      k = paramRectangle2.width - localRectangle.width;
    int m = paramRectangle2.height / 2 > paramRectangle1.y ? 1 : 0;
    int n;
    if (m != 0)
      n = paramRectangle1.y - localRectangle.height - 2;
    else
      n = paramRectangle1.y + paramRectangle1.height + 2;
    return new Point(k, n);
  }

  protected ListCellRenderer o()
  {
    return new cq(this, null);
  }

  static z a(dj paramdj)
  {
    return paramdj.h;
  }

  static int b(dj paramdj)
  {
    return paramdj.i;
  }

  static cr c(dj paramdj)
  {
    return paramdj.j;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.dj
 * JD-Core Version:    0.6.0
 */
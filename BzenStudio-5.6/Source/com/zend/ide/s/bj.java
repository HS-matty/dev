package com.zend.ide.s;

import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.FocusListener;
import java.util.Vector;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

public class bj
  implements cu
{
  private JScrollPane b;
  private JTextPane a;
  private JPanel c;
  private JToolBar d;
  private JToolBar e;
  private JButton f;
  private JButton g;
  private JButton h;
  private JButton i;
  private Action j;
  private Action k;
  private Vector l = new Vector(3);

  public bj()
  {
    HTMLEditorKit localHTMLEditorKit = new HTMLEditorKit();
    HTMLDocument localHTMLDocument = (HTMLDocument)localHTMLEditorKit.createDefaultDocument();
    this.j = new jb(this);
    this.k = new kb(this);
    this.a = new JTextPane();
    this.a.setDocument(localHTMLDocument);
    this.a.setEditorKit(localHTMLEditorKit);
    localHTMLEditorKit.install(this.a);
    this.a.setEditable(false);
    this.a.setBorder(BorderFactory.createEmptyBorder());
    this.b = new JScrollPane(this.a);
    this.b.setHorizontalScrollBarPolicy(30);
    this.b.setVerticalScrollBarPolicy(20);
    this.b.setBorder(BorderFactory.createEmptyBorder());
    this.f = new JButton(cv.b("moveleft16.gif"));
    this.f.addActionListener(new eb(this));
    this.f.setMargin(new Insets(1, 1, 1, 1));
    this.f.setToolTipText(ct.a(655));
    this.g = new JButton(cv.b("moveright16.gif"));
    this.g.addActionListener(new fb(this));
    this.g.setMargin(new Insets(1, 1, 1, 1));
    this.g.setToolTipText(ct.a(656));
    this.i = new JButton(cv.b("addcomment.gif"));
    this.i.addActionListener(new gb(this));
    this.i.setMargin(new Insets(1, 1, 1, 1));
    this.i.setToolTipText(ct.a(557));
    this.h = new JButton(this.j);
    this.h.addActionListener(new hb(this));
    this.h.setMargin(new Insets(1, 1, 1, 1));
    this.d = new JToolBar();
    this.d.setRollover(true);
    this.d.setFloatable(false);
    this.d.add(this.f);
    this.d.add(this.g);
    this.d.setPreferredSize(new Dimension(this.d.getPreferredSize().width, 25));
    this.e = new JToolBar();
    this.e.setRollover(true);
    this.e.setFloatable(false);
    this.e.add(this.h);
    this.e.add(this.i);
    JPanel localJPanel = new JPanel(new BorderLayout());
    localJPanel.add(this.d, "West");
    localJPanel.add(this.e, "East");
    localJPanel.setPreferredSize(new Dimension(localJPanel.getPreferredSize().width, 25));
    this.c = new JPanel(new BorderLayout());
    this.c.add(this.b, "Center");
    this.c.add(localJPanel, "North");
    this.c.setBorder(BorderFactory.createLineBorder(Color.blue.darker()));
  }

  public void a(boolean paramBoolean)
  {
    this.c.setVisible(paramBoolean);
  }

  public void a(FocusListener paramFocusListener)
  {
    this.c.addFocusListener(paramFocusListener);
  }

  public JTextPane b()
  {
    return this.a;
  }

  public JPanel a()
  {
    return this.c;
  }

  public void b(boolean paramBoolean)
  {
    this.g.setEnabled(paramBoolean);
  }

  public void c(boolean paramBoolean)
  {
    this.f.setEnabled(paramBoolean);
  }

  public void d(boolean paramBoolean)
  {
    this.i.setEnabled(paramBoolean);
  }

  public void a(int paramInt)
  {
    if (paramInt == 2)
    {
      this.h.setEnabled(false);
    }
    else
    {
      this.h.setEnabled(true);
      this.h.setAction(paramInt == 0 ? this.j : this.k);
      this.h.setToolTipText(paramInt == 0 ? ct.a(287) : ct.a(556));
    }
  }

  public void a(String paramString, Rectangle paramRectangle1, cw paramcw, Rectangle paramRectangle2)
  {
    this.a.setText(paramString);
    this.a.setCaretPosition(0);
    Dimension localDimension1 = this.b.getPreferredSize();
    if (paramRectangle1.width < localDimension1.width)
      localDimension1.width = paramRectangle1.width;
    if (localDimension1.width > 550)
      localDimension1.width = 550;
    if (localDimension1.height > paramRectangle1.height)
      localDimension1.height = paramRectangle1.height;
    if (localDimension1.height > 600)
      localDimension1.height = 600;
    if (localDimension1.height < 50)
      localDimension1.height = 50;
    if (localDimension1.width < 120)
      localDimension1.width = 120;
    Dimension localDimension2 = new Dimension(localDimension1.width + 10, localDimension1.height + this.d.getPreferredSize().height + 2);
    this.c.setSize(localDimension2);
    this.c.setLocation(a(paramRectangle1, paramcw, paramRectangle2));
    Rectangle localRectangle = this.c.getBounds();
    if (localRectangle.y < 0)
    {
      localDimension1.height -= Math.abs(localRectangle.y);
      localDimension2.height = (localDimension1.height + this.d.getPreferredSize().height + 2);
      this.c.setSize(localDimension2);
      this.c.setLocation(a(paramRectangle1, paramcw, paramRectangle2));
    }
    this.c.revalidate();
    this.c.doLayout();
    if (!this.c.isVisible())
      this.c.setVisible(true);
  }

  private Point a(Rectangle paramRectangle1, cw paramcw, Rectangle paramRectangle2)
  {
    Rectangle localRectangle = paramcw.getBounds();
    Dimension localDimension = this.c.getSize();
    int m = localRectangle.x;
    if (m + localDimension.width > paramRectangle1.width)
      m = Math.max(10, localRectangle.x + localRectangle.width - localDimension.width);
    int n;
    if (paramcw.p())
    {
      n = localRectangle.y - localDimension.height;
    }
    else
    {
      n = localRectangle.y + localRectangle.height;
      if (n + localDimension.height + 10 > paramRectangle1.height)
        n = localRectangle.y - paramRectangle2.height - 2 - localDimension.height - 2;
    }
    return new Point(m, n);
  }

  public void a(ib paramib)
  {
    if (!this.l.contains(paramib))
      this.l.add(paramib);
  }

  private void b()
  {
    for (int m = 0; m < this.l.size(); m++)
    {
      ib localib = (ib)this.l.get(m);
      localib.a();
    }
  }

  private void c()
  {
    for (int m = 0; m < this.l.size(); m++)
    {
      ib localib = (ib)this.l.get(m);
      localib.d();
    }
  }

  private void d()
  {
    for (int m = 0; m < this.l.size(); m++)
    {
      ib localib = (ib)this.l.get(m);
      localib.e();
    }
  }

  private void e()
  {
    for (int m = 0; m < this.l.size(); m++)
    {
      ib localib = (ib)this.l.get(m);
      localib.f();
    }
  }

  private void f()
  {
    for (int m = 0; m < this.l.size(); m++)
    {
      ib localib = (ib)this.l.get(m);
      localib.g();
    }
  }

  static void a(bj parambj)
  {
    parambj.b();
  }

  static void b(bj parambj)
  {
    parambj.c();
  }

  static void c(bj parambj)
  {
    parambj.d();
  }

  static Action d(bj parambj)
  {
    return parambj.j;
  }

  static JButton e(bj parambj)
  {
    return parambj.h;
  }

  static Action f(bj parambj)
  {
    return parambj.k;
  }

  static void g(bj parambj)
  {
    parambj.e();
  }

  static void h(bj parambj)
  {
    parambj.f();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.bj
 * JD-Core Version:    0.6.0
 */
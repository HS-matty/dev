package com.zend.ide.r;

import com.zend.ide.i.n;
import com.zend.ide.p.cd;
import com.zend.ide.p.w;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class y extends n
  implements cu
{
  private JTextArea c;
  private JPanel d;
  private JList e;
  private w f;
  private w g;
  private w b;
  private JScrollPane h;
  private String i = null;
  private boolean j;

  public y(JFrame paramJFrame)
  {
    super(paramJFrame);
    setTitle(ct.a(1027));
    c();
  }

  private void c()
  {
    e();
    f();
    g();
    pack();
    setSize(300, 350);
    setModal(true);
    setLocationRelativeTo(getParent());
  }

  private void e()
  {
    this.c = new JTextArea();
    this.c.setEditable(false);
    this.c.setLineWrap(true);
    this.c.setWrapStyleWord(true);
    this.c.setBackground(getBackground());
    this.c.setBorder(BorderFactory.createEmptyBorder(5, 5, 0, 5));
    this.c.setSelectionColor(this.c.getBackground());
    getContentPane().add(this.c, "North");
  }

  private void f()
  {
    this.e = new JList();
    this.e.setModel(new DefaultListModel());
    this.e.setSelectionMode(0);
    this.e.addKeyListener(new t(this));
    DefaultListModel localDefaultListModel = (DefaultListModel)this.e.getModel();
    Iterator localIterator = p.e().c();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      localDefaultListModel.addElement(locald);
    }
    this.e.setSelectedIndex(0);
    this.h = new cd(this.e);
    this.h.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), this.h.getBorder()));
    getContentPane().add(this.h, "Center");
  }

  private void g()
  {
    this.d = new JPanel(new FlowLayout(2));
    this.b = new w(ct.a(1724));
    this.b.addActionListener(new u(this));
    this.f = new w(ct.a(116));
    this.f.addActionListener(new kb(this));
    this.g = new w(ct.a(117));
    this.g.addActionListener(new lb(this));
    this.d.add(this.b);
    this.d.add(this.f);
    this.d.add(this.g);
    getContentPane().add(this.d, "South");
  }

  public boolean a(String paramString)
  {
    DefaultListModel localDefaultListModel = (DefaultListModel)this.e.getModel();
    localDefaultListModel.clear();
    Iterator localIterator = p.e().c();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      localDefaultListModel.addElement(locald);
    }
    this.e.setSelectedIndex(0);
    if (paramString.equals(""))
      this.c.setText(ct.a(1025));
    else
      this.c.setText(ct.a(1026, paramString));
    this.i = paramString;
    this.j = false;
    this.e.requestFocus();
    setVisible(true);
    if (this.j)
      p.e().a((d)this.e.getSelectedValue(), paramString);
    return this.j;
  }

  static w a(y paramy)
  {
    return paramy.f;
  }

  static JList b(y paramy)
  {
    return paramy.e;
  }

  static String b(y paramy)
  {
    return paramy.i;
  }

  static String a(y paramy, String paramString)
  {
    return paramy.i = paramString;
  }

  static boolean a(y paramy, boolean paramBoolean)
  {
    return paramy.j = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.y
 * JD-Core Version:    0.6.0
 */
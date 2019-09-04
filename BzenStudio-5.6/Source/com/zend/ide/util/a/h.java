package com.zend.ide.util.a;

import com.zend.ide.i.n;
import com.zend.ide.p.cd;
import com.zend.ide.p.w;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.ActionMap;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class h extends n
  implements cu
{
  private boolean c = false;
  private JPanel d;
  private JPanel e;
  private JPanel f;
  private JPanel g;
  private z h;
  private z i;
  private Icon j;
  private w k;
  private w l;
  private JTextArea m;
  private String n;
  private JScrollPane o;
  private g p;

  public h(Frame paramFrame)
  {
    super(paramFrame);
    c();
    f();
    e();
    pack();
  }

  private void c()
  {
    this.p = new g(this);
    this.d = new JPanel();
    this.e = new JPanel();
    this.f = new JPanel();
    this.g = new JPanel();
    this.l = new w();
    this.k = new w();
    this.j = UIManager.getIcon("OptionPane.errorIcon");
    this.i = new z(this.j);
    this.m = new JTextArea();
    this.m.setMinimumSize(new Dimension(300, 150));
    this.m.setMaximumSize(new Dimension(500, 300));
    this.o = new cd(this.m);
    this.o.setMaximumSize(new Dimension(500, 300));
    this.m.setEditable(false);
    this.o.setHorizontalScrollBarPolicy(30);
    this.o.setVerticalScrollBarPolicy(20);
    this.h = new z();
    this.h.setText("");
    this.h.setForeground(Color.black);
    JPanel localJPanel = new JPanel();
    localJPanel.add(this.h);
    this.e.setLayout(new FlowLayout(0));
    this.e.add(this.i);
    this.e.add(localJPanel);
    this.d.setLayout(new BoxLayout(this.d, 1));
    this.d.add(this.e);
    this.f.setLayout(new BorderLayout());
    this.f.add(this.o, "Center");
    this.f.setVisible(false);
    this.k.setText(ct.a(116));
    this.k.setFocusPainted(false);
    this.l.setText(ct.b(258));
    this.l.setFocusPainted(false);
    this.g.setLayout(new FlowLayout(2, 5, 5));
    this.g.add(this.l);
    this.g.add(this.k);
    getContentPane().add(this.d, "Center");
    getContentPane().add(this.g, "South");
    setModal(true);
    setTitle(ct.a(259));
    pack();
    B();
    addWindowListener(new a(this));
  }

  private void e()
  {
    JRootPane localJRootPane = getRootPane();
    KeyStroke localKeyStroke = KeyStroke.getKeyStroke(10, 0);
    ActionMap localActionMap = localJRootPane.getActionMap();
    InputMap localInputMap = localJRootPane.getInputMap(1);
    String str = "enterKey";
    localInputMap.put(localKeyStroke, str);
    localActionMap.put(str, this.p);
    localInputMap = localJRootPane.getInputMap(0);
    localInputMap.put(localKeyStroke, str);
    localInputMap = localJRootPane.getInputMap(2);
    localInputMap.put(localKeyStroke, str);
  }

  private void f()
  {
    this.k.addActionListener(this.p);
    this.l.addActionListener(new c(this));
  }

  public void a(String paramString)
  {
    this.n = paramString;
    this.h.setText(this.n);
    pack();
  }

  public void b(String paramString)
  {
    this.m.setText(paramString);
  }

  private void g()
  {
    if (this.c == true)
    {
      this.c = false;
      this.l.setText(ct.b(258));
      this.d.remove(this.f);
      this.f.setVisible(false);
      setSize(getPreferredSize());
    }
    else
    {
      this.c = true;
      this.l.setText(ct.b(260));
      this.d.add(this.f);
      this.f.setVisible(true);
      setSize(this.m.getMaximumSize());
    }
    doLayout();
    repaint();
  }

  public void setVisible(boolean paramBoolean)
  {
    if (this.c == true)
      g();
    super.setVisible(paramBoolean);
  }

  private void h()
  {
    setVisible(false);
    dispose();
  }

  static void a(h paramh)
  {
    paramh.h();
  }

  static void b(h paramh)
  {
    paramh.g();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.a.h
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.i;

import com.zend.ide.p.z;
import com.zend.ide.util.cv;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class o extends n
{
  private z c;
  private JComboBox d;
  private z e;
  private JComboBox f;
  private z g;
  private JTextField h;
  private z i;
  private JTextField j;
  private z k;
  private JTextField l;
  private JButton m;
  private JButton n;
  private JButton o;
  private JPanel p;
  private JPanel q;
  private boolean r;
  private i s = new i(this);
  private boolean t = false;

  public o()
  {
    k();
    l();
    pack();
    setTitle("Breakpoint Configuration");
    setModal(true);
    Frame localFrame = (Frame)getOwner();
    localFrame.setIconImage(cv.a("togglebreakpoint16.gif"));
  }

  public o(int paramInt1, String paramString1, String paramString2, int paramInt2, boolean paramBoolean)
  {
    this();
    a(paramInt1);
    a(paramString1);
    b(paramString2);
    b(paramInt2);
    a(paramBoolean);
  }

  public int c()
  {
    return this.d.getSelectedIndex() + 1;
  }

  public void a(int paramInt)
  {
    this.f.setSelectedIndex(paramInt - 1);
  }

  public int e()
  {
    return this.f.getSelectedIndex() + 1;
  }

  public String f()
  {
    return this.h.getText();
  }

  public void a(String paramString)
  {
    this.h.setText(paramString);
  }

  public int g()
  {
    int i1 = -1;
    try
    {
      Integer localInteger = Integer.valueOf(this.j.getText());
      i1 = localInteger.intValue();
    }
    catch (Exception localException)
    {
    }
    return i1;
  }

  public void b(int paramInt)
  {
    this.j.setText(Integer.toString(paramInt));
  }

  public String h()
  {
    return this.l.getText();
  }

  public void b(String paramString)
  {
    this.l.setText(paramString);
  }

  public boolean i()
  {
    return this.r;
  }

  public void a(boolean paramBoolean)
  {
    this.r = paramBoolean;
    this.s.b();
  }

  public boolean j()
  {
    return this.t;
  }

  private void k()
  {
    this.c = new z();
    Object[] arrayOfObject1 = { "Static" };
    this.d = new JComboBox(arrayOfObject1);
    this.e = new z();
    Object[] arrayOfObject2 = { "One time", "Permanent" };
    this.f = new JComboBox(arrayOfObject2);
    this.g = new z();
    this.h = new JTextField();
    this.i = new z();
    this.j = new JTextField();
    this.k = new z();
    this.l = new JTextField();
    this.m = new JButton();
    this.n = new JButton();
    this.o = new JButton();
    this.p = new JPanel();
    this.q = new JPanel();
    this.q.setLayout(new FlowLayout(2));
    getContentPane().add(this.p, "Center");
    getContentPane().add(this.q, "South");
    this.p.setLayout(new GridBagLayout());
    this.p.setBorder(new EtchedBorder());
    addWindowListener(new a(this));
    this.c.setText("Type:");
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.insets = new Insets(5, 5, 3, 3);
    localGridBagConstraints.anchor = 17;
    this.p.add(this.c, localGridBagConstraints);
    this.d.setMinimumSize(new Dimension(160, 20));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.anchor = 17;
    localGridBagConstraints.insets = new Insets(5, 3, 3, 0);
    this.p.add(this.d, localGridBagConstraints);
    this.e.setText("Life time:");
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.insets = new Insets(5, 5, 3, 3);
    localGridBagConstraints.anchor = 17;
    this.p.add(this.e, localGridBagConstraints);
    this.f.setMinimumSize(new Dimension(160, 20));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.anchor = 17;
    localGridBagConstraints.insets = new Insets(5, 3, 3, 0);
    this.p.add(this.f, localGridBagConstraints);
    this.g.setText("File Name:");
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 2;
    localGridBagConstraints.insets = new Insets(3, 5, 3, 3);
    localGridBagConstraints.anchor = 17;
    this.p.add(this.g, localGridBagConstraints);
    this.h.setPreferredSize(new Dimension(160, 20));
    this.h.setColumns(20);
    this.h.setMinimumSize(new Dimension(160, 20));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 2;
    localGridBagConstraints.insets = new Insets(3, 3, 3, 0);
    this.p.add(this.h, localGridBagConstraints);
    this.i.setText("Line number:");
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 3;
    localGridBagConstraints.insets = new Insets(3, 5, 3, 3);
    localGridBagConstraints.anchor = 17;
    this.p.add(this.i, localGridBagConstraints);
    this.j.setPreferredSize(new Dimension(60, 20));
    this.j.setMinimumSize(new Dimension(60, 20));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 3;
    localGridBagConstraints.insets = new Insets(3, 3, 3, 0);
    localGridBagConstraints.anchor = 17;
    this.p.add(this.j, localGridBagConstraints);
    this.k.setText("Condition:");
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 4;
    localGridBagConstraints.insets = new Insets(3, 5, 3, 3);
    localGridBagConstraints.anchor = 17;
    this.p.add(this.k, localGridBagConstraints);
    this.l.setPreferredSize(this.h.getPreferredSize());
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 4;
    localGridBagConstraints.insets = new Insets(3, 3, 3, 0);
    localGridBagConstraints.anchor = 17;
    this.p.add(this.l, localGridBagConstraints);
    this.m.setAction(this.s);
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 5;
    localGridBagConstraints.insets = new Insets(3, 3, 3, 0);
    localGridBagConstraints.anchor = 17;
    this.p.add(this.m, localGridBagConstraints);
    this.n.setPreferredSize(new Dimension(80, 24));
    this.n.setMaximumSize(new Dimension(80, 24));
    this.n.setText("OK");
    this.n.setMinimumSize(new Dimension(80, 24));
    this.q.add(this.n);
    this.o.setPreferredSize(new Dimension(80, 24));
    this.o.setMaximumSize(new Dimension(80, 24));
    this.o.setText("Cancel");
    this.o.setMinimumSize(new Dimension(80, 24));
    this.q.add(this.o);
  }

  private void l()
  {
    this.n.addActionListener(new c(this));
    this.o.addActionListener(new d(this));
  }

  private boolean m()
  {
    int i1 = 0;
    if (this.h.getText().length() > 0)
      i1 = 1;
    return i1;
  }

  private void a(WindowEvent paramWindowEvent)
  {
    setVisible(false);
    dispose();
  }

  static void a(o paramo, WindowEvent paramWindowEvent)
  {
    paramo.a(paramWindowEvent);
  }

  static boolean a(o paramo)
  {
    return paramo.m();
  }

  static boolean a(o paramo, boolean paramBoolean)
  {
    return paramo.t = paramBoolean;
  }

  static boolean b(o paramo, boolean paramBoolean)
  {
    return paramo.r = paramBoolean;
  }

  static boolean b(o paramo)
  {
    return paramo.r;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.i.o
 * JD-Core Version:    0.6.0
 */
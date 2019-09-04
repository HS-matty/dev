package com.zend.ide.l;

import com.zend.ide.d.cb;
import com.zend.ide.p.a.d;
import com.zend.ide.p.d.bp;
import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
import com.zend.ide.util.bh;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.dj;
import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.File;
import java.util.Hashtable;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class by extends JPanel
  implements cu
{
  private static String g = "http://";
  private static String n = "https://";
  public static x a;
  private JTextArea b;
  private z c;
  private z d;
  private z e;
  private z f;
  private JTextField h;
  private JTextField i;
  private com.zend.ide.p.bb j;
  private com.zend.ide.p.bb k;
  private w l;
  private bp m;
  private JComboBox o;
  private JTextField p;
  private Hashtable q;
  private JComboBox r;

  public by()
  {
    k();
    j();
  }

  private void a()
  {
    this.q = new Hashtable();
    bh[] arrayOfbh = bh.d();
    for (int i1 = 0; i1 < arrayOfbh.length; i1++)
      this.q.put(arrayOfbh[i1].toString(), arrayOfbh[i1]);
  }

  private void k()
  {
    a = new x(ct.b(706));
    a.setSelected(true);
    a.addItemListener(new bb(this));
    this.b = new JTextArea(ct.a(1810));
    this.b.setFocusable(false);
    this.b.setEditable(false);
    this.b.setLineWrap(true);
    this.b.setWrapStyleWord(true);
    this.b.setBackground(getBackground());
    this.b.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.DARK_GRAY), BorderFactory.createEmptyBorder(0, 0, 10, 0)));
    a();
    this.r = new JComboBox(bh.d());
    this.r.setEditable(true);
    this.r.addItemListener(new bc(this));
    JPanel localJPanel1 = new JPanel(new BorderLayout(5, 5));
    localJPanel1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(" " + ct.a(430) + " "), BorderFactory.createEmptyBorder(2, 2, 2, 2)));
    localJPanel1.add(this.r, "Center");
    DefaultComboBoxModel localDefaultComboBoxModel = new DefaultComboBoxModel();
    localDefaultComboBoxModel.insertElementAt(n, 0);
    localDefaultComboBoxModel.insertElementAt(g, 0);
    this.o = new JComboBox(localDefaultComboBoxModel);
    this.o.setSelectedIndex(0);
    this.p = new cb(30);
    JPanel localJPanel2 = new JPanel(new BorderLayout(4, 0));
    localJPanel2.add(this.o, "West");
    localJPanel2.add(this.p, "Center");
    this.p.setMinimumSize(new Dimension(150, (int)this.p.getPreferredSize().getHeight()));
    this.c = new z(ct.b(693));
    this.c.setLabelFor(this.o);
    this.d = new z(ct.b(1293));
    this.h = new JTextField();
    this.h.setDocument(new d(5));
    this.d.setLabelFor(this.h);
    this.e = new z(ct.b(695));
    this.i = new JTextField();
    this.i.setEditable(false);
    this.f = new z(ct.a(696));
    this.j = new com.zend.ide.p.bb(ct.b(1229));
    this.k = new com.zend.ide.p.bb(ct.b(1228));
    bd localbd = new bd(this, null);
    this.j.addActionListener(localbd);
    this.k.addActionListener(localbd);
    ButtonGroup localButtonGroup = new ButtonGroup();
    localButtonGroup.add(this.j);
    localButtonGroup.add(this.k);
    setLayout(new GridBagLayout());
    JPanel localJPanel3 = new JPanel(new FlowLayout(0));
    localJPanel3.add(this.f);
    localJPanel3.add(this.j);
    localJPanel3.add(this.k);
    w localw = b();
    this.e.setLabelFor(localw);
    JPanel localJPanel4 = new JPanel(new GridBagLayout());
    localJPanel4.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(" " + ct.a(242) + " "), BorderFactory.createEmptyBorder(2, 2, 2, 2)));
    setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.anchor = 18;
    localGridBagConstraints.fill = 1;
    localGridBagConstraints.gridwidth = 0;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.insets = new Insets(0, 0, 3, 0);
    add(this.b, localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(0, 0, 5, 0);
    add(a, localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(0, 0, 3, 0);
    add(localJPanel1, localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(0, 0, 3, 0);
    localJPanel4.add(localJPanel3, localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(0, 0, 3, 0);
    localJPanel4.add(this.c, localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(0, 0, 0, 0);
    localJPanel4.add(localJPanel2, localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(10, 0, 3, 0);
    localJPanel4.add(this.d, localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(0, 0, 0, 0);
    localJPanel4.add(this.h, localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(10, 0, 3, 0);
    localJPanel4.add(this.e, localGridBagConstraints);
    localGridBagConstraints.insets = new Insets(0, 0, 0, 0);
    localGridBagConstraints.gridwidth = -1;
    localJPanel4.add(this.i, localGridBagConstraints);
    localGridBagConstraints.weightx = 0.0D;
    localJPanel4.add(localw, localGridBagConstraints);
    add(localJPanel4, localGridBagConstraints);
  }

  private w b()
  {
    if (this.l == null)
    {
      this.l = new w("...");
      this.l.addActionListener(new lb(this));
      this.l.setPreferredSize(new Dimension(this.l.getPreferredSize().width, 20));
      this.l.setMaximumSize(new Dimension(this.l.getMaximumSize().width, 20));
    }
    return this.l;
  }

  private bp c()
  {
    if (this.m == null)
    {
      this.m = new bp(false);
      this.m.setApproveButtonText(ct.a(116));
      this.m.setFileSelectionMode(1);
      this.m.setMultiSelectionEnabled(false);
      this.m.setDialogTitle(ct.a(658));
    }
    return this.m;
  }

  public int e()
  {
    try
    {
      int i1 = Integer.valueOf(this.h.getText()).intValue();
      if ((i1 >= 0) && (i1 < 65536))
        return i1;
    }
    catch (Exception localException)
    {
    }
    throw new dj(ct.a(1061));
  }

  public void a(int paramInt)
  {
    this.h.setText("" + paramInt);
  }

  public String f()
  {
    return this.o.getSelectedItem() + this.p.getText();
  }

  public void a(String paramString)
  {
    int i1 = paramString.indexOf("//");
    if (i1 != -1)
    {
      String str1 = paramString.substring(0, i1 + 2);
      String str2 = paramString.substring(i1 + 2);
      this.o.setSelectedItem(str1);
      this.p.setText(str2);
    }
    else
    {
      this.p.setText(paramString);
    }
  }

  public String g()
  {
    return this.i.getText();
  }

  public void b(String paramString)
  {
    this.i.setText(paramString);
  }

  public boolean h()
  {
    return this.j.isSelected();
  }

  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
      this.j.setSelected(true);
    else
      this.k.setSelected(true);
    d();
  }

  public void b(boolean paramBoolean)
  {
    this.b.setVisible(paramBoolean);
  }

  public bh b()
  {
    return new bh(this.r.getSelectedItem().toString());
  }

  public boolean i()
  {
    return a.isSelected();
  }

  public void j()
  {
    a(((Integer)b.a("debugging.debugPort").c()).intValue());
    a(b.a("debugging.serverHost").c().toString());
    a(((Boolean)b.a("debugging.localDebugging").c()).booleanValue());
    b(((File)b.a("debugging.tempFilesLocation").c()).getPath());
    c(true);
    bh localbh = (bh)b.a("editing.encoding");
    a(localbh);
    d();
  }

  public void a(bh parambh)
  {
    if (parambh == null)
      return;
    if (!this.q.contains(parambh))
    {
      this.q.put(parambh.toString(), parambh);
      ((DefaultComboBoxModel)this.r.getModel()).addElement(parambh);
    }
    this.r.setSelectedItem(parambh);
  }

  public void c(boolean paramBoolean)
  {
    a.setSelected(paramBoolean);
    d();
  }

  private void d()
  {
    boolean bool1 = i();
    this.r.setEnabled(!bool1);
    this.f.setEnabled(!bool1);
    this.j.setEnabled(!bool1);
    this.k.setEnabled(!bool1);
    this.c.setEnabled(!bool1);
    this.o.setEnabled(!bool1);
    this.p.setEnabled(!bool1);
    this.d.setEnabled(!bool1);
    this.h.setEnabled(!bool1);
    this.e.setEnabled(!bool1);
    this.i.setEnabled(!bool1);
    this.l.setEnabled(!bool1);
    if (!bool1)
    {
      boolean bool2 = this.j.isSelected();
      this.o.setEnabled(bool2);
      this.p.setEnabled(bool2);
      this.c.setEnabled(bool2);
    }
  }

  static Hashtable a(by paramby)
  {
    return paramby.q;
  }

  static JComboBox b(by paramby)
  {
    return paramby.r;
  }

  static bp c(by paramby)
  {
    return paramby.c();
  }

  static JTextField d(by paramby)
  {
    return paramby.i;
  }

  static void e(by paramby)
  {
    paramby.d();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.by
 * JD-Core Version:    0.6.0
 */
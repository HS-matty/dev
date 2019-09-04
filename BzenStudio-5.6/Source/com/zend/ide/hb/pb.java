package com.zend.ide.hb;

import com.zend.ide.bc.a;
import com.zend.ide.i.n;
import com.zend.ide.p.d.bc;
import com.zend.ide.p.d.bp;
import com.zend.ide.p.db;
import com.zend.ide.p.w;
import com.zend.ide.p.x;
import com.zend.ide.p.z;
import com.zend.ide.r.bo;
import com.zend.ide.r.d;
import com.zend.ide.r.o;
import com.zend.ide.r.p;
import com.zend.ide.r.r;
import com.zend.ide.r.s;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ComboBoxEditor;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.InputMap;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.Document;

public class pb extends n
  implements cu, r
{
  private DefaultComboBoxModel b = new DefaultComboBoxModel();
  private bp c = null;
  private JPanel d;
  private JPanel e;
  private JPanel f;
  private JPanel g;
  private JPanel h;
  private JPanel i;
  private db j = null;
  private db k = null;
  private JComboBox l = null;
  private z m = null;
  private z n = null;
  private z o = null;
  private x p = null;
  private x q = null;
  private x r = null;
  private x s = null;
  private w t = null;
  private w u = null;
  private w v = null;
  private x w = null;
  private x x = null;
  private xb y = new xb(this);
  private String z = "FindAction";
  private wb A = new wb(this);
  private String B = "CancelAction";
  private HashMap C = new HashMap();
  private m D;

  public pb(Frame paramFrame)
  {
    super(paramFrame, true);
    q();
    p.e().a(this);
    a.a(this, "FIND_IN_FILES");
  }

  public void a(m paramm)
  {
    this.D = paramm;
  }

  public void a(bo parambo)
  {
  }

  public void a(o paramo)
  {
    s locals = paramo.j();
    if (this.C.containsKey(locals.getDescription()))
      return;
    this.C.put(locals.getDescription(), locals);
    ((DefaultComboBoxModel)this.l.getModel()).insertElementAt(locals.getDescription(), this.l.getModel().getSize());
  }

  public void c(o paramo)
  {
    s locals = paramo.j();
    if (!this.C.containsKey(locals.getDescription()))
      return;
    this.C.remove(locals.getDescription());
    ((DefaultComboBoxModel)this.l.getModel()).removeElement(locals.getDescription());
  }

  public String a()
  {
    return (String)this.j.getEditor().getItem();
  }

  public void a(String paramString)
  {
    this.j.a(paramString);
  }

  public boolean b()
  {
    return this.p.isSelected();
  }

  public void a(boolean paramBoolean)
  {
    this.p.setSelected(paramBoolean);
  }

  public boolean c()
  {
    return this.s.isSelected();
  }

  public void b(boolean paramBoolean)
  {
    this.s.setSelected(paramBoolean);
  }

  public boolean e()
  {
    return this.w.isSelected();
  }

  public void c(boolean paramBoolean)
  {
    this.w.setSelected(paramBoolean);
  }

  public boolean f()
  {
    return this.x.isSelected();
  }

  public void d(boolean paramBoolean)
  {
    this.x.setSelected(paramBoolean);
  }

  public boolean g()
  {
    return this.q.isSelected();
  }

  public void e(boolean paramBoolean)
  {
    this.q.setSelected(paramBoolean);
  }

  public boolean h()
  {
    return this.r.isSelected();
  }

  public void f(boolean paramBoolean)
  {
    this.r.setSelected(paramBoolean);
  }

  public void g(boolean paramBoolean)
  {
    if (!paramBoolean)
      d(false);
    this.x.setEnabled(paramBoolean);
    u();
  }

  private bp i()
  {
    if (this.c == null)
      this.c = new bp(false);
    return this.c;
  }

  public FileFilter j()
  {
    String str = (String)this.l.getSelectedItem();
    FileFilter localFileFilter = (FileFilter)this.C.get(str);
    if (localFileFilter == null)
      return (FileFilter)this.C.get(ct.a(709));
    return localFileFilter;
  }

  private void k()
  {
    this.h = new JPanel();
    this.h.setLayout(new BorderLayout());
    l();
    this.h.add(this.e, "Center");
  }

  private void l()
  {
    this.e = new JPanel();
    this.e.setLayout(new FlowLayout(2));
    this.u = new w();
    this.u.addActionListener(this.y);
    this.u.setText(ct.b(262));
    this.u.setIcon(cv.b("find16.gif"));
    this.e.add(this.u);
    this.u.setEnabled(false);
    this.v = new w();
    this.v.addActionListener(this.A);
    this.v.setText(ct.b(1067));
    this.e.add(this.v);
  }

  private void m()
  {
    this.d = new JPanel();
    this.d.setLayout(new BorderLayout(10, 0));
    this.d.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
    this.j = new db();
    a.a(this.j, "FIND_IN_FILES");
    this.j.setEditable(true);
    this.l = new JComboBox();
    this.k = new db();
    a.a(this.k, "FIND_IN_FILES");
    this.k.setEditable(true);
    this.m = new z();
    this.m.setLabelFor(this.j);
    this.m.setText(ct.b(266));
    this.n = new z();
    this.n.setLabelFor(this.l);
    this.n.setText(ct.b(1144));
    this.n.setToolTipText(ct.a(711));
    this.o = new z();
    this.o.setLabelFor(this.k);
    this.o.setText(ct.b(1268));
    this.t = new w();
    this.t.setText(ct.b(224));
    this.t.setPreferredSize(new Dimension(80, 24));
    this.t.addActionListener(new i(this));
    JPanel localJPanel = new JPanel();
    localJPanel.setLayout(new BorderLayout());
    localJPanel.add(this.k, "Center");
    localJPanel.add(this.t, "East");
    this.l.setModel(this.b);
    Box localBox1 = new Box(1);
    localBox1.add(Box.createVerticalStrut(5));
    localBox1.add(this.m);
    localBox1.add(Box.createVerticalStrut(12));
    localBox1.add(this.n);
    localBox1.add(Box.createVerticalStrut(12));
    localBox1.add(this.o);
    this.d.add(localBox1, "West");
    Box localBox2 = new Box(1);
    localBox2.add(this.j);
    localBox2.add(Box.createVerticalStrut(5));
    localBox2.add(this.l);
    localBox2.add(Box.createVerticalStrut(5));
    localBox2.add(localJPanel);
    this.d.add(localBox2, "Center");
    n();
  }

  private void n()
  {
    a(ct.a(226), false);
    Iterator localIterator = p.e().c();
    while (localIterator.hasNext())
    {
      localObject1 = (d)localIterator.next();
      if (((d)localObject1).i())
        continue;
      localObject2 = ((d)localObject1).j();
      a(((FileFilter)localObject2).getDescription(), false);
      this.C.put(((FileFilter)localObject2).getDescription(), localObject2);
    }
    Object localObject1 = p.e().d();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (o)((Iterator)localObject1).next();
      s locals = ((o)localObject2).j();
      a(locals.getDescription(), false);
      this.C.put(locals.getDescription(), locals);
    }
    Object localObject2 = p.f().j();
    a(((FileFilter)localObject2).getDescription(), false);
    this.C.put(((FileFilter)localObject2).getDescription(), localObject2);
    this.l.setSelectedIndex(1);
  }

  private void a(JComboBox paramJComboBox)
  {
    ((JTextField)paramJComboBox.getEditor().getEditorComponent()).getDocument().addDocumentListener(new j(this));
  }

  private void o()
  {
    if ((!this.j.getEditor().getItem().equals("")) && ((!this.l.isEditable()) || (!this.l.getEditor().getItem().equals(""))) && ((this.x.isSelected()) || (!this.k.getEditor().getItem().equals(""))))
      this.u.setEnabled(true);
    else
      this.u.setEnabled(false);
  }

  private void p()
  {
    this.f = new JPanel();
    this.f.setLayout(new GridBagLayout());
    this.f.setBorder(BorderFactory.createTitledBorder(ct.b(562)));
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.anchor = 17;
    localGridBagConstraints.insets = new Insets(0, 5, 5, 40);
    this.p = new x(ct.b(1070));
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    this.f.add(this.p, localGridBagConstraints);
    this.q = new x(ct.b(264));
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    this.f.add(this.q, localGridBagConstraints);
    this.r = new x(ct.b(524));
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 2;
    this.f.add(this.r, localGridBagConstraints);
    this.g = new JPanel();
    this.g.setLayout(new GridBagLayout());
    this.g.setBorder(BorderFactory.createTitledBorder(ct.b(563)));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.anchor = 17;
    localGridBagConstraints.insets = new Insets(0, 5, 5, 40);
    this.s = new x(ct.b(564));
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    this.g.add(this.s, localGridBagConstraints);
    this.w = new x(ct.b(565));
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    this.g.add(this.w, localGridBagConstraints);
    this.x = new x(ct.b(566));
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 2;
    this.g.add(this.x, localGridBagConstraints);
    this.x.addActionListener(new k(this));
    this.i = new JPanel(new GridLayout(1, 2, 5, 5));
    this.i.add(this.f);
    this.i.add(this.g);
  }

  private void q()
  {
    k();
    m();
    p();
    a(this.j);
    a(this.l);
    a(this.k);
    this.l.addItemListener(new l(this));
    getContentPane().setLayout(new BorderLayout(5, 5));
    getContentPane().add(this.h, "South");
    getContentPane().add(this.d, "North");
    getContentPane().add(this.i, "Center");
    b localb = new b(this);
    addWindowListener(localb);
    addWindowFocusListener(localb);
    r();
  }

  private void r()
  {
    JComponent localJComponent1 = (JComponent)getContentPane();
    ActionMap localActionMap = localJComponent1.getActionMap();
    InputMap localInputMap = localJComponent1.getInputMap(1);
    localActionMap.put(this.B, this.A);
    localInputMap.put(KeyStroke.getKeyStroke(27, 0), this.B);
    localActionMap.put(this.z, this.y);
    localInputMap.put(KeyStroke.getKeyStroke(10, 0), this.z);
    JComponent localJComponent2 = (JComponent)this.j.getEditor().getEditorComponent();
    localJComponent2.getInputMap().put(KeyStroke.getKeyStroke(10, 0), this.z);
    localJComponent2.getActionMap().put(this.z, this.y);
    localJComponent2 = (JComponent)this.k.getEditor().getEditorComponent();
    localJComponent2.getInputMap().put(KeyStroke.getKeyStroke(10, 0), this.z);
    localJComponent2.getActionMap().put(this.z, this.y);
    localJComponent2 = (JComponent)this.l.getEditor().getEditorComponent();
    localJComponent2.getInputMap().put(KeyStroke.getKeyStroke(10, 0), this.z);
    localJComponent2.getActionMap().put(this.z, this.y);
  }

  public void a(int paramInt)
  {
    String str = null;
    if (paramInt == 0)
      str = ct.a(366);
    setTitle(str);
    pack();
    B();
  }

  public void b(String paramString)
  {
    c(paramString);
  }

  public void a(File paramFile)
  {
    b(paramFile.getPath());
  }

  public void c(String paramString)
  {
    if ((paramString != null) && (paramString.trim().length() > 0))
      this.k.a(paramString);
  }

  public String s()
  {
    return (String)this.k.getSelectedItem();
  }

  public String t()
  {
    return (String)this.j.getSelectedItem();
  }

  private void u()
  {
    boolean bool = !this.x.isSelected();
    this.k.setEditable(bool);
    this.k.setEnabled(bool);
    this.t.setEnabled(bool);
    o();
  }

  private void a(String paramString, boolean paramBoolean)
  {
    if ((paramString == null) || (paramString.trim().length() == 0))
      return;
    if (this.b.getIndexOf(paramString) == -1)
    {
      this.b.insertElementAt(paramString, 0);
      if (paramBoolean)
        this.C.put(paramString, new bc(paramString));
    }
    this.b.setSelectedItem(paramString);
    doLayout();
  }

  static bp a(pb parampb)
  {
    return parampb.i();
  }

  static db b(pb parampb)
  {
    return parampb.k;
  }

  static void c(pb parampb)
  {
    parampb.o();
  }

  static void d(pb parampb)
  {
    parampb.u();
  }

  static JComboBox e(pb parampb)
  {
    return parampb.l;
  }

  static m f(pb parampb)
  {
    return parampb.D;
  }

  static db g(pb parampb)
  {
    return parampb.j;
  }

  static String h(pb parampb)
  {
    return parampb.z;
  }

  static void a(pb parampb, String paramString, boolean paramBoolean)
  {
    parampb.a(paramString, paramBoolean);
  }

  static HashMap i(pb parampb)
  {
    return parampb.C;
  }

  static String j(pb parampb)
  {
    return parampb.B;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.pb
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.hb;

import com.zend.ide.b.d;
import com.zend.ide.bd.c;
import com.zend.ide.f.bl;
import com.zend.ide.f.bt;
import com.zend.ide.f.s;
import com.zend.ide.i.n;
import com.zend.ide.p.bc;
import com.zend.ide.p.w;
import com.zend.ide.p.z;
import com.zend.ide.r.bo;
import com.zend.ide.r.o;
import com.zend.ide.r.p;
import com.zend.ide.r.r;
import com.zend.ide.util.ct;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Arrays;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.text.Document;

class wc extends n
  implements r
{
  private bc b;
  private JTextField c;
  private JComboBox d;
  private oc e;
  private nc f;
  private Hashtable g = new Hashtable();
  final fc h;

  public wc(fc paramfc)
  {
    super(c.b().h(), ct.a(1719));
    a();
  }

  private void a()
  {
    setLayout(new BorderLayout());
    e();
    c();
    f();
    pack();
    setSize(350, 400);
    B();
    setModal(true);
    this.e = new oc(this);
    p.e().a(this);
  }

  private void c()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    z localz = new z(ct.b(1720));
    localz.setBorder(BorderFactory.createEmptyBorder(0, 0, 3, 0));
    this.c = new JTextField();
    this.c.getDocument().addDocumentListener(new gc(this));
    this.c.addKeyListener(new mb(this));
    this.c.addActionListener(new hc(this));
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.add(localz, "North");
    localJPanel2.add(this.c, "Center");
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(0, 2, 5, 2));
    localJPanel1.add(localJPanel2, "Center");
    localJPanel1.add(d(), "South");
    localJPanel1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    add(localJPanel1, "North");
  }

  private JPanel d()
  {
    JPanel localJPanel = new JPanel(new FlowLayout(0));
    g();
    localJPanel.add(this.d);
    localJPanel.setBorder(BorderFactory.createTitledBorder(ct.a(1708)));
    return localJPanel;
  }

  private void e()
  {
    this.b = new yc(this);
    this.b.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(0, 3, 3, 3), this.b.getBorder()));
    JPanel localJPanel = new JPanel(new BorderLayout());
    localJPanel.add(this.b, "Center");
    localJPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5), BorderFactory.createTitledBorder(ct.a(1721))));
    add(localJPanel, "Center");
  }

  private void f()
  {
    JPanel localJPanel = new JPanel(new FlowLayout(2));
    w localw1 = new w(ct.a(116));
    localw1.addActionListener(new ic(this));
    localJPanel.add(localw1);
    w localw2 = new w(ct.a(117));
    localw2.addActionListener(new jc(this));
    localJPanel.add(localw2);
    JButton localJButton = new JButton(ct.a(639));
    localJButton.addActionListener(new kc(this));
    localJPanel.add(localJButton);
    add(localJPanel, "South");
  }

  private void g()
  {
    Iterator localIterator = p.e().a(true);
    while (localIterator.hasNext())
    {
      o localo = (o)localIterator.next();
      this.g.put(localo.b(), localo);
    }
    this.d = new JComboBox(this.g.values().toArray());
    this.d.setToolTipText("");
    ((DefaultComboBoxModel)this.d.getModel()).insertElementAt(ct.a(226), this.d.getModel().getSize());
    this.d.addItemListener(new lc(this));
  }

  private void h()
  {
    this.b.f();
    this.c.setText("");
  }

  private void i()
  {
    setVisible(false);
    if (this.b.d().getSelectedValue() != null)
      this.h.a(((d)this.b.d().getSelectedValue()).a(), 0);
    h();
  }

  private void a(String paramString)
  {
    this.e.a(150, paramString);
  }

  public void a(bo parambo)
  {
    String str = ((o)this.d.getModel().getSelectedItem()).getDescription();
    if (str.equals(parambo.b().b()))
      a(this.c.getText());
  }

  public void a(o paramo)
  {
    if (this.g.containsKey(paramo.b()))
      return;
    this.g.put(paramo.b(), paramo);
    ((DefaultComboBoxModel)this.d.getModel()).insertElementAt(paramo, this.d.getModel().getSize());
  }

  public void c(o paramo)
  {
    if (!this.g.containsKey(paramo.b()))
      return;
    o localo1 = (o)this.d.getModel().getSelectedItem();
    o localo2 = (o)this.g.get(paramo.b());
    this.g.remove(localo2.getDescription());
    ((DefaultComboBoxModel)this.d.getModel()).removeElement(localo2);
    if (localo1.equals(localo2))
    {
      a(this.c.getText());
      this.d.revalidate();
      this.d.repaint();
    }
  }

  public void setVisible(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      fc.a(this.h, fc.a());
      d[] arrayOfd1 = fc.c(this.h).g().a("");
      d[] arrayOfd2 = fc.c(this.h).g().b("");
      d[] arrayOfd3 = bl.a(arrayOfd1, arrayOfd2);
      if (this.f == null)
        this.f = new nc(this);
      Arrays.sort(arrayOfd3, 0, arrayOfd3.length, this.f);
      fc.b(this.h, arrayOfd3);
      SwingUtilities.invokeLater(new mc(this));
    }
    super.setVisible(paramBoolean);
  }

  static JTextField a(wc paramwc)
  {
    return paramwc.c;
  }

  static void a(wc paramwc, String paramString)
  {
    paramwc.a(paramString);
  }

  static bc b(wc paramwc)
  {
    return paramwc.b;
  }

  static void c(wc paramwc)
  {
    paramwc.i();
  }

  static JComboBox d(wc paramwc)
  {
    return paramwc.d;
  }

  static void e(wc paramwc)
  {
    paramwc.h();
  }

  static Hashtable f(wc paramwc)
  {
    return paramwc.g;
  }

  static oc g(wc paramwc)
  {
    return paramwc.e;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.wc
 * JD-Core Version:    0.6.0
 */
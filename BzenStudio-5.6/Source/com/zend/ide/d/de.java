package com.zend.ide.d;

import com.zend.ide.p.a.d;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import com.zend.ide.util.cv;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class de extends dd
{
  private String[] n;
  private dt o;
  private JComboBox p;
  private JTextField q;

  public de(dc paramdc, String paramString, ArrayList paramArrayList)
  {
    super(paramdc, paramString, paramArrayList);
  }

  protected JPanel e()
  {
    JPanel localJPanel = new JPanel(new BorderLayout(5, 5));
    localJPanel.add(n(), "North");
    localJPanel.add(super.e(), "Center");
    return localJPanel;
  }

  protected void j()
  {
  }

  private JPanel n()
  {
    this.n = cv.c();
    JPanel localJPanel = new JPanel(new FlowLayout(0, 5, 5));
    localJPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2), BorderFactory.createTitledBorder("")));
    z localz1 = new z(ct.a(1167));
    this.p = new JComboBox(this.n);
    this.p.addItemListener(new cn(this, null));
    this.p.addMouseListener(new cm(this));
    z localz2 = new z(ct.a(1168));
    this.q = new cb(new d(2), "", 3);
    this.q.addKeyListener(new bo(this, null));
    localJPanel.add(localz1);
    localJPanel.add(this.p);
    localJPanel.add(localz2);
    localJPanel.add(this.q);
    o();
    return localJPanel;
  }

  private void o()
  {
    this.p.setSelectedItem(c().d().getName());
    this.q.setText(String.valueOf(c().d().getSize()));
    boolean bool = !d();
    this.p.setEnabled(bool);
    this.q.setEnabled(bool);
  }

  public void q()
  {
    this.q.setText(String.valueOf(c().d().getSize()));
  }

  private cg p()
  {
    return (cg)this.a.getSelectedValue();
  }

  protected JPanel f()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout(0, 0));
    localJPanel1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(ct.a(1296)), BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    z localz = new z(ct.a(1169));
    this.o = new dt(this);
    this.o.addMouseListener(new db(this, null));
    this.o.setOpaque(true);
    this.o.setPreferredSize(new Dimension(60, 25));
    JPanel localJPanel2 = new JPanel(new FlowLayout(1, 5, 5));
    localJPanel2.add(localz);
    localJPanel2.add(this.o);
    localJPanel1.add(localJPanel2, "Center");
    return localJPanel1;
  }

  protected void k()
  {
    o();
    cg localcg = p();
    if (localcg != null)
    {
      String str = localcg.b();
      this.o.setBackground(c().b(str));
    }
  }

  static JComboBox a(de paramde)
  {
    return paramde.p;
  }

  static cg b(de paramde)
  {
    return paramde.p();
  }

  static JTextField c(de paramde)
  {
    return paramde.q;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.de
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.eb;

import com.zend.ide.i.n;
import com.zend.ide.n.bf;
import com.zend.ide.n.gz;
import com.zend.ide.p.cd;
import com.zend.ide.p.w;
import com.zend.ide.p.z;
import com.zend.ide.util.ct;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

class l extends n
{
  private a b;
  JTextField d;
  JTextField e;
  gz f;
  final k g;

  public l(k paramk)
  {
    super(paramk);
    a();
    setModal(true);
    setSize(new Dimension(420, 300));
    setLocationRelativeTo(paramk);
    com.zend.ide.bc.a.a(this, "CREATE_CODE_SNIPPETS_DIALOG");
  }

  private void a()
  {
    JPanel localJPanel1 = new JPanel(new GridBagLayout());
    this.f = new gb(this);
    this.f.a(new bf());
    cd localcd = new cd(this.f);
    localcd.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(ct.b(1395)), localcd.getBorder()));
    this.d = new JTextField();
    this.d.setPreferredSize(new Dimension(200, 24));
    z localz1 = new z(ct.b(685));
    localz1.setLabelFor(this.d);
    this.e = new JTextField();
    this.e.setPreferredSize(new Dimension(200, 24));
    z localz2 = new z(ct.b(1037));
    localz2.setLabelFor(this.e);
    w localw1 = new w(ct.b(116));
    localw1.addActionListener(new bb(this));
    w localw2 = new w(ct.b(117));
    localw2.addActionListener(new cb(this));
    JPanel localJPanel2 = new JPanel(new FlowLayout(2));
    localJPanel2.add(localw1);
    localJPanel2.add(localw2);
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.insets = new Insets(3, 3, 3, 3);
    localGridBagConstraints.anchor = 17;
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.weightx = 1.9D;
    localJPanel1.add(localz1, localGridBagConstraints);
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.weightx = 199.90000000000001D;
    localJPanel1.add(this.d, localGridBagConstraints);
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.weightx = 1.9D;
    localJPanel1.add(localz2, localGridBagConstraints);
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.gridwidth = 3;
    localGridBagConstraints.weightx = 119.90000000000001D;
    localJPanel1.add(this.e, localGridBagConstraints);
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 2;
    localGridBagConstraints.gridheight = 2;
    localGridBagConstraints.gridwidth = 4;
    localGridBagConstraints.weighty = 1.0D;
    localGridBagConstraints.weightx = 10.9D;
    localGridBagConstraints.fill = 1;
    localJPanel1.add(localcd, localGridBagConstraints);
    getContentPane().add(localJPanel1, "Center");
    getContentPane().add(localJPanel2, "South");
  }

  public void c()
  {
    setTitle(ct.a(1414));
    this.d.setText("");
    this.e.setText("");
    this.f.setText("");
  }

  public void a(a parama)
  {
    if (parama == null)
    {
      c();
      return;
    }
    setTitle(ct.a(1415));
    this.d.setText(parama.a());
    this.e.setText(parama.g());
    this.f.setText(parama.f());
    this.f.setCaretPosition(0);
  }

  public a a()
  {
    return this.b;
  }

  public void a(String paramString)
  {
    this.f.setText(paramString);
    this.f.setCaretPosition(0);
  }

  static a a(l paraml, a parama)
  {
    return paraml.b = parama;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.eb.l
 * JD-Core Version:    0.6.0
 */
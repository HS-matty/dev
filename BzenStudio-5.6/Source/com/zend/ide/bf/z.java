package com.zend.ide.bf;

import com.zend.ide.i.n;
import com.zend.ide.n.gz;
import com.zend.ide.p.cd;
import com.zend.ide.p.w;
import com.zend.ide.util.ct;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

class z extends n
{
  private d c;
  final ba d;

  public z(ba paramba)
  {
    super(ba.e(paramba));
    c();
    setModal(true);
    setSize(new Dimension(420, 300));
    setPreferredSize(new Dimension(420, 300));
    setLocationRelativeTo(paramba);
  }

  private void c()
  {
    JPanel localJPanel1 = new JPanel(new GridBagLayout());
    ba.a(this.d, new db(this));
    ba.f(this.d).a(false);
    ba.a(this.d, new cd(ba.f(this.d)));
    ba.g(this.d).setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder(ct.a(1206)), ba.g(this.d).getBorder()));
    ba.a(this.d, new JComboBox());
    ba.b(this.d, new JComboBox());
    Object[] arrayOfObject = r.e();
    for (int i = 0; i < arrayOfObject.length; i++)
    {
      localObject = arrayOfObject[i];
      ba.h(this.d).addItem(localObject);
    }
    ba.h(this.d).addActionListener(new j(this));
    ba.a(this.d, new com.zend.ide.p.z(ct.a(1207)));
    ba.j(this.d).setLabelFor(ba.h(this.d));
    ba.a(this.d, new JTextField());
    ba.k(this.d).setPreferredSize(new Dimension(200, 24));
    ba.b(this.d, new com.zend.ide.p.z(ct.a(1208)));
    ba.l(this.d).setLabelFor(ba.k(this.d));
    ba.b(this.d, new JTextField());
    ba.m(this.d).setPreferredSize(new Dimension(200, 24));
    ba.c(this.d, new com.zend.ide.p.z(ct.a(1209)));
    ba.n(this.d).setLabelFor(ba.m(this.d));
    ba.c(this.d, new w(ct.a(1210)));
    ba.g(this.d).addActionListener(new k(this));
    ba.a(this.d, new w(ct.a(116)));
    ba.o(this.d).addActionListener(new l(this));
    ba.b(this.d, new w(ct.a(117)));
    ba.p(this.d).addActionListener(new cb(this));
    JPanel localJPanel2 = new JPanel(new FlowLayout(2));
    localJPanel2.add(ba.o(this.d));
    localJPanel2.add(ba.p(this.d));
    Object localObject = new GridBagConstraints();
    ((GridBagConstraints)localObject).insets = new Insets(3, 3, 3, 3);
    ((GridBagConstraints)localObject).anchor = 17;
    ((GridBagConstraints)localObject).fill = 2;
    ((GridBagConstraints)localObject).gridx = 0;
    ((GridBagConstraints)localObject).gridy = 0;
    localJPanel1.add(ba.l(this.d), localObject);
    ((GridBagConstraints)localObject).gridx = 1;
    ((GridBagConstraints)localObject).gridy = 0;
    ((GridBagConstraints)localObject).weightx = 9.9D;
    localJPanel1.add(ba.k(this.d), localObject);
    ((GridBagConstraints)localObject).gridx = 2;
    ((GridBagConstraints)localObject).gridy = 0;
    ((GridBagConstraints)localObject).weightx = 0.0D;
    localJPanel1.add(ba.j(this.d), localObject);
    ((GridBagConstraints)localObject).gridx = 3;
    ((GridBagConstraints)localObject).gridy = 0;
    localJPanel1.add(ba.h(this.d), localObject);
    ((GridBagConstraints)localObject).gridx = 0;
    ((GridBagConstraints)localObject).gridy = 1;
    localJPanel1.add(ba.n(this.d), localObject);
    ((GridBagConstraints)localObject).gridx = 1;
    ((GridBagConstraints)localObject).gridy = 1;
    ((GridBagConstraints)localObject).gridwidth = 3;
    localJPanel1.add(ba.m(this.d), localObject);
    ((GridBagConstraints)localObject).gridx = 0;
    ((GridBagConstraints)localObject).gridy = 2;
    ((GridBagConstraints)localObject).gridheight = 2;
    ((GridBagConstraints)localObject).gridwidth = 4;
    ((GridBagConstraints)localObject).weighty = 1.0D;
    ((GridBagConstraints)localObject).weightx = 10.9D;
    ((GridBagConstraints)localObject).fill = 1;
    localJPanel1.add(ba.g(this.d), localObject);
    ((GridBagConstraints)localObject).gridx = 0;
    ((GridBagConstraints)localObject).gridy = 4;
    ((GridBagConstraints)localObject).fill = 2;
    ((GridBagConstraints)localObject).gridwidth = 3;
    ((GridBagConstraints)localObject).weighty = 0.0D;
    localJPanel1.add(ba.i(this.d), localObject);
    ((GridBagConstraints)localObject).gridx = 3;
    ((GridBagConstraints)localObject).gridy = 4;
    ((GridBagConstraints)localObject).gridwidth = 1;
    ((GridBagConstraints)localObject).weightx = 0.0D;
    localJPanel1.add(ba.g(this.d), localObject);
    getContentPane().add(localJPanel1, "Center");
    getContentPane().add(localJPanel2, "South");
  }

  private void a(Object[] paramArrayOfObject)
  {
    for (int i = 0; i < paramArrayOfObject.length; i++)
    {
      Object localObject = paramArrayOfObject[i];
      ((DefaultComboBoxModel)ba.i(this.d).getModel()).addElement(localObject);
    }
  }

  public void e()
  {
    setTitle(ct.a(1211));
    ba.k(this.d).setText("");
    ba.m(this.d).setText("");
    ba.h(this.d).setSelectedIndex(0);
    ba.f(this.d).setText("");
  }

  public void a(d paramd)
  {
    if (paramd == null)
    {
      e();
      return;
    }
    setTitle(ct.a(1212));
    ba.k(this.d).setText(paramd.a());
    ba.m(this.d).setText(paramd.b());
    ba.h(this.d).setSelectedItem(paramd.d());
    ba.f(this.d).setText(paramd.c());
  }

  public d f()
  {
    return this.c;
  }

  static void a(z paramz, Object[] paramArrayOfObject)
  {
    paramz.a(paramArrayOfObject);
  }

  static d a(z paramz, d paramd)
  {
    return paramz.c = paramd;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.bf.z
 * JD-Core Version:    0.6.0
 */
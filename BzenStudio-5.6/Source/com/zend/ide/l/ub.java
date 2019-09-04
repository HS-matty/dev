package com.zend.ide.l;

import com.zend.ide.f.zc.b.j;
import com.zend.ide.f.zc.b.l;
import com.zend.ide.util.ct;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

class ub extends JPanel
{
  private JComboBox a;
  private JButton b;
  final sb c;

  public ub(sb paramsb)
  {
    c();
  }

  protected void a()
  {
    this.a.setModel(new DefaultComboBoxModel(l.d()));
  }

  protected void a(j paramj)
  {
    this.a.setSelectedItem(paramj.d());
  }

  protected j b()
  {
    return l.a(this.a.getSelectedItem().toString());
  }

  private void c()
  {
    setLayout(new GridBagLayout());
    this.a = new JComboBox(l.d());
    this.b = new JButton(ct.a(1843));
    this.b.addActionListener(new gb(this));
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.fill = 2;
    add(this.a, localGridBagConstraints);
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.fill = 0;
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.insets = new Insets(0, 4, 0, 0);
    add(this.b, localGridBagConstraints);
    setBorder(BorderFactory.createTitledBorder("JRE"));
  }

  static JComboBox a(ub paramub)
  {
    return paramub.a;
  }

  static JButton b(ub paramub)
  {
    return paramub.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.ub
 * JD-Core Version:    0.6.0
 */
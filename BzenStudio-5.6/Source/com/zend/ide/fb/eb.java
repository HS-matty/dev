package com.zend.ide.fb;

import com.zend.ide.bd.c;
import com.zend.ide.i.n;
import com.zend.ide.p.bb;
import com.zend.ide.util.ct;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

class eb extends n
{
  private bb b;
  private bb c;
  private JButton d;
  final d e;

  public eb(d paramd)
  {
    super(c.b().h(), ct.a(1683));
    a();
  }

  private void a()
  {
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(b(), "North");
    getContentPane().add(d(), "South");
    pack();
    setLocationRelativeTo(getOwner());
    setModal(true);
  }

  private Component b()
  {
    JPanel localJPanel = new JPanel(new BorderLayout());
    localJPanel.add(c(), "Center");
    return localJPanel;
  }

  private JPanel c()
  {
    JLabel localJLabel = new JLabel(ct.a(1231));
    this.b = new bb(ct.b(1232));
    this.c = new bb(ct.b(1233));
    ButtonGroup localButtonGroup = new ButtonGroup();
    localButtonGroup.add(this.b);
    localButtonGroup.add(this.c);
    JPanel localJPanel = new JPanel(new GridLayout(3, 1));
    localJPanel.setBorder(BorderFactory.createTitledBorder(ct.a(1688)));
    localJPanel.add(localJLabel);
    localJPanel.add(this.c);
    localJPanel.add(this.b);
    this.b.setSelected(true);
    return localJPanel;
  }

  private Component d()
  {
    JPanel localJPanel = new JPanel();
    localJPanel.setLayout(new FlowLayout(2));
    this.d = new JButton(ct.a(6));
    this.d.addActionListener(new i(this));
    localJPanel.add(this.d);
    return localJPanel;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.eb
 * JD-Core Version:    0.6.0
 */
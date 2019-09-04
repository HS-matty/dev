package com.zend.ide.d;

import com.zend.ide.f.zc.b.j;
import com.zend.ide.p.e.d;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.List;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ld extends com.zend.ide.i.n
  implements cu
{
  private fc b;
  private fc c;
  private n d;
  private Action e;
  private JTextField f;
  private JTextField g;
  private JLabel h;
  private KeyListener i;
  private String j;
  private List k;

  public ld(Dialog paramDialog, boolean paramBoolean, fc paramfc, List paramList, n paramn)
  {
    super(paramDialog, paramBoolean);
    this.d = paramn;
    this.b = paramfc;
    this.k = paramList;
    this.j = paramfc.a();
    this.c = new fc(paramfc.a(), paramfc.b());
    a();
  }

  private void a()
  {
    if (n.EDIT.equals(this.d))
      setTitle(ct.a(1834));
    else
      setTitle(ct.a(1835));
    setLocationRelativeTo(null);
    setLayout(new BorderLayout());
    add(c(), "Center");
    add(d(), "South");
    pack();
    e();
  }

  private Component b()
  {
    this.h = new JLabel("");
    this.h.setPreferredSize(new Dimension(100, 20));
    this.h.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
    this.h.setForeground(Color.RED);
    this.h.setFocusable(false);
    return this.h;
  }

  private Component c()
  {
    JPanel localJPanel = new JPanel(new GridBagLayout());
    this.f = new JTextField(this.c.a());
    this.g = new JTextField(this.c.b());
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.insets = new Insets(2, 2, 2, 2);
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.fill = 1;
    localJPanel.add(new JLabel(ct.a(1836) + ':'), localGridBagConstraints);
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridwidth = 0;
    localJPanel.add(this.f, localGridBagConstraints);
    localGridBagConstraints.gridwidth = 1;
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    localJPanel.add(new JLabel(ct.a(1837) + ':'), localGridBagConstraints);
    localGridBagConstraints.gridx = 1;
    localJPanel.add(this.g, localGridBagConstraints);
    localGridBagConstraints.gridx = 2;
    JButton localJButton = new JButton(new uc(this));
    localJPanel.add(localJButton, localGridBagConstraints);
    localJPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4), BorderFactory.createEtchedBorder()));
    Dimension localDimension = localJButton.getPreferredSize();
    this.f.setPreferredSize(new Dimension(250, localDimension.height));
    this.g.setPreferredSize(new Dimension(250, localDimension.height));
    this.i = new a(this, null);
    this.f.addKeyListener(this.i);
    this.g.addKeyListener(this.i);
    return localJPanel;
  }

  private Component d()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    JPanel localJPanel2 = new JPanel(new FlowLayout(2));
    this.e = new wc(this);
    JButton localJButton1 = new JButton(this.e);
    JButton localJButton2 = new JButton(new vc(this));
    localJPanel2.add(localJButton1);
    localJPanel2.add(localJButton2);
    d.b(new JButton[] { localJButton1, localJButton2 });
    localJPanel1.add(localJPanel2, "Center");
    localJPanel1.add(b(), "North");
    return localJPanel1;
  }

  private void e()
  {
    this.c.a(this.f.getText().trim());
    this.c.b(this.g.getText());
    b(null);
    if (this.c.c())
    {
      File localFile = j.c(new File(this.g.getText()));
      if (localFile != null)
      {
        if (this.c.a().length() == 0)
        {
          this.e.setEnabled(false);
          b(ct.a(1859));
        }
        else if (a(this.c.a()))
        {
          this.e.setEnabled(false);
          b(ct.a(1860));
        }
        else
        {
          this.e.setEnabled(true);
        }
      }
      else
      {
        this.e.setEnabled(false);
        b(ct.a(1839));
      }
    }
    else
    {
      this.e.setEnabled(false);
      if (this.g.getText().trim().length() > 0)
        b(ct.a(1839));
      else
        b(ct.a(1840));
    }
  }

  private boolean a(String paramString)
  {
    return (!paramString.equals(this.j)) && (this.k.contains(this.c.a()));
  }

  private void b(String paramString)
  {
    if (paramString == null)
      this.h.setText("");
    else
      this.h.setText(paramString);
  }

  static fc a(ld paramld)
  {
    return paramld.c;
  }

  static fc b(ld paramld)
  {
    return paramld.b;
  }

  static JTextField c(ld paramld)
  {
    return paramld.g;
  }

  static void d(ld paramld)
  {
    paramld.e();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.ld
 * JD-Core Version:    0.6.0
 */
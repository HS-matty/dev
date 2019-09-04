package com.zend.ide.v;

import com.zend.ide.i.n;
import com.zend.ide.n.br;
import com.zend.ide.n.dz;
import com.zend.ide.p.cd;
import com.zend.ide.p.w;
import com.zend.ide.util.a.b;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

public class bc extends n
  implements cu
{
  private w e;
  private w f;
  private w g;
  private w h;
  private bd i;
  private boolean d = false;

  public bc(JFrame paramJFrame)
  {
    super(paramJFrame, true);
    c();
  }

  private void c()
  {
    setTitle(ct.a(150));
    getContentPane().setLayout(new BorderLayout());
    addWindowListener(new a(this));
    getContentPane().add(e(), "Center");
    getContentPane().add(f(), "East");
  }

  private JComponent e()
  {
    JPanel localJPanel = new JPanel();
    localJPanel.setLayout(new BorderLayout());
    localJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    localJPanel.setPreferredSize(new Dimension(300, 100));
    this.i = new bd(this);
    this.i.setBorder(new EtchedBorder());
    cd localcd = new cd(this.i);
    localJPanel.add(localcd, "Center");
    return localJPanel;
  }

  private JComponent f()
  {
    JPanel localJPanel = new JPanel();
    localJPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    localJPanel.setLayout(new GridBagLayout());
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.insets = new Insets(4, 4, 4, 4);
    this.e = new w();
    this.e.setText(ct.b(150));
    this.e.addActionListener(new g(this));
    localGridBagConstraints.weighty = 1.0D;
    localGridBagConstraints.gridwidth = 0;
    localJPanel.add(this.e, localGridBagConstraints);
    this.f = new w();
    this.f.setText(ct.b(151));
    this.f.addActionListener(new h(this));
    localJPanel.add(this.f, localGridBagConstraints);
    this.g = new w();
    this.g.setText(ct.b(152));
    this.g.addActionListener(new i(this));
    localJPanel.add(this.g, localGridBagConstraints);
    this.h = new w();
    this.h.setText(ct.a(117));
    this.h.addActionListener(new j(this));
    localJPanel.add(this.h, localGridBagConstraints);
    return localJPanel;
  }

  private boolean a(dz[] paramArrayOfdz)
  {
    for (int j = 0; j < paramArrayOfdz.length; j++)
      if (!a(paramArrayOfdz[j]))
        return false;
    if (this.i.getModel().getSize() == 0)
    {
      this.d = true;
      g();
    }
    return true;
  }

  private boolean a(dz paramdz)
  {
    try
    {
      if (br.a(paramdz) == 1)
      {
        ((DefaultListModel)this.i.getModel()).removeElement(paramdz);
        return true;
      }
    }
    catch (Exception localException)
    {
      b.a(localException);
    }
    return false;
  }

  public boolean b(dz[] paramArrayOfdz)
  {
    if ((paramArrayOfdz == null) || (paramArrayOfdz.length == 0))
      return true;
    DefaultListModel localDefaultListModel = (DefaultListModel)this.i.getModel();
    localDefaultListModel.clear();
    this.e.setEnabled(this.i.getSelectedValue() != null);
    for (int j = 0; j < paramArrayOfdz.length; j++)
    {
      if (!paramArrayOfdz[j].l())
        continue;
      localDefaultListModel.addElement(paramArrayOfdz[j]);
    }
    if (localDefaultListModel.size() == 0)
      return true;
    this.d = false;
    pack();
    B();
    setVisible(true);
    return this.d;
  }

  private void g()
  {
    setVisible(false);
    dispose();
  }

  static void c(bc parambc)
  {
    parambc.g();
  }

  static bd a(bc parambc)
  {
    return parambc.i;
  }

  static boolean a(bc parambc, dz[] paramArrayOfdz)
  {
    return parambc.a(paramArrayOfdz);
  }

  static w b(bc parambc)
  {
    return parambc.e;
  }

  static boolean a(bc parambc, boolean paramBoolean)
  {
    return parambc.d = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.bc
 * JD-Core Version:    0.6.0
 */
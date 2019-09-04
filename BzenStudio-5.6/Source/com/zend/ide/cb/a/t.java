package com.zend.ide.cb.a;

import com.zend.ide.bc.a;
import com.zend.ide.cb.e;
import com.zend.ide.cb.f;
import com.zend.ide.cb.p;
import com.zend.ide.cb.q;
import com.zend.ide.util.ct;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class t
  implements k
{
  private JComboBox a = new bd(paramn, this.d);
  private JComboBox b = new bd(paramn, this.e);
  private JComboBox c = new bd(paramn, this.f);
  private DefaultComboBoxModel d = new DefaultComboBoxModel();
  private DefaultComboBoxModel e = new DefaultComboBoxModel();
  private DefaultComboBoxModel f = new DefaultComboBoxModel();
  private JPanel g;
  private HashMap h = new HashMap();
  private HashMap i = new HashMap();
  private String j = "queryTarget";
  private Object l = new Object();
  final n k;

  public t(n paramn)
  {
    this.a.setPreferredSize(new Dimension(120, 20));
    this.b.setPreferredSize(new Dimension(120, 20));
    this.c.setPreferredSize(new Dimension(120, 20));
    this.a.setMinimumSize(this.a.getPreferredSize());
    this.b.setMinimumSize(this.b.getPreferredSize());
    this.c.setMinimumSize(this.c.getPreferredSize());
    this.a.addItemListener(new nd(this, paramn));
    this.b.addItemListener(new qd(this, paramn));
    this.c.addItemListener(new ce(this, paramn));
    this.g = new JPanel(new GridBagLayout());
    JPanel localJPanel1 = new JPanel(new GridLayout(-1, 1, 1, 2));
    JPanel localJPanel2 = new JPanel(new GridLayout(-1, 1, 1, 1));
    localJPanel1.add(new JLabel(ct.a(1487) + ": "));
    localJPanel1.add(new JLabel(ct.a(1488) + ": "));
    localJPanel1.add(new JLabel(ct.a(1489) + ": "));
    localJPanel2.add(this.a);
    localJPanel2.add(this.b);
    localJPanel2.add(this.c);
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.fill = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    localGridBagConstraints.gridwidth = 2;
    localGridBagConstraints.gridheight = 1;
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    this.g.add(localJPanel1);
    localGridBagConstraints.gridx = 1;
    this.g.add(localJPanel2);
    Dimension localDimension = this.g.getPreferredSize();
    this.g.setMaximumSize(localDimension);
    this.g.setMinimumSize(localDimension);
    a.a(this.g, "SQL_QUERY_EXECUTION_CONTROL");
  }

  public JComponent a()
  {
    return this.g;
  }

  public void c()
  {
  }

  public void a(String paramString)
  {
    this.j = paramString;
  }

  public String d()
  {
    return this.j;
  }

  public boolean e()
  {
    return this.g.requestFocusInWindow();
  }

  public void a(q paramq)
  {
    synchronized (this.l)
    {
      if (this.d.getIndexOf(paramq) != -1)
        return;
      this.d.addElement(paramq);
    }
    SwingUtilities.invokeLater(new de(this, paramq));
  }

  public void b(q paramq)
  {
    try
    {
      synchronized (this.l)
      {
        this.d.removeElement(paramq);
      }
      this.a.setModel(this.d);
    }
    catch (Throwable localThrowable)
    {
    }
  }

  public void c(q paramq)
  {
    this.a.repaint();
  }

  public void a(f[] paramArrayOff)
  {
    this.e = new DefaultComboBoxModel(paramArrayOff);
    SwingUtilities.invokeLater(new ee(this));
  }

  public void a(p[] paramArrayOfp)
  {
    this.f = new DefaultComboBoxModel(paramArrayOfp);
    SwingUtilities.invokeLater(new fe(this, paramArrayOfp));
  }

  public void d(q paramq)
  {
    if (paramq != null)
    {
      this.a.setSelectedItem(paramq);
      this.b.setEnabled(paramq.b());
      this.c.setEnabled((paramq.a()) && (paramq.k()));
      if (!paramq.b())
        a(paramq.a(), paramq.l().d());
    }
  }

  public void a(f paramf)
  {
    if (paramf != null)
      if (paramf.c().b())
        this.b.setSelectedItem(paramf);
      else
        a(paramf.c().a(), paramf.c().l().d());
  }

  private void a(String paramString1, String paramString2)
  {
    for (int m = 0; m < this.b.getItemCount(); m++)
    {
      f localf = (f)this.b.getItemAt(m);
      q localq = localf.c();
      if ((!paramString1.equals(localq.a())) || (!paramString2.equals(localf.a())))
        continue;
      this.b.setSelectedItem(localf);
      break;
    }
  }

  public void a(p paramp)
  {
    if (paramp != null)
      if (paramp.c().a())
        this.c.setSelectedItem(paramp);
      else
        this.c.setSelectedItem(paramp.c().h());
  }

  public boolean a()
  {
    int m = 0;
    synchronized (this.l)
    {
      m = this.d.getSize();
    }
    return m > 0;
  }

  public q b()
  {
    if (a())
      return (q)this.a.getSelectedItem();
    return null;
  }

  public f c()
  {
    if (a())
      return (f)this.b.getSelectedItem();
    return null;
  }

  public p d()
  {
    if (a())
      return (p)this.c.getSelectedItem();
    return null;
  }

  private p a(String paramString1, String paramString2)
  {
    return (p)this.i.get(paramString1 + paramString2);
  }

  private f a(String paramString)
  {
    return (f)this.h.get(paramString);
  }

  static DefaultComboBoxModel a(t paramt)
  {
    return paramt.f;
  }

  static f a(t paramt, String paramString)
  {
    return paramt.a(paramString);
  }

  static JComboBox b(t paramt)
  {
    return paramt.b;
  }

  static JComboBox a(t paramt)
  {
    return paramt.c;
  }

  static HashMap b(t paramt)
  {
    return paramt.h;
  }

  static p a(t paramt, String paramString1, String paramString2)
  {
    return paramt.a(paramString1, paramString2);
  }

  static HashMap c(t paramt)
  {
    return paramt.i;
  }

  static DefaultComboBoxModel d(t paramt)
  {
    return paramt.e;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.t
 * JD-Core Version:    0.6.0
 */
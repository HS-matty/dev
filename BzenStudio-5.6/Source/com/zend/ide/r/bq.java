package com.zend.ide.r;

import com.zend.ide.i.n;
import com.zend.ide.p.cd;
import com.zend.ide.p.w;
import com.zend.ide.util.ct;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

class bq extends n
  implements r
{
  private Object[] c;
  private JList d;
  final ba e;

  public bq(ba paramba)
  {
    super(ba.m(paramba), ct.a(1083));
    c();
    setModal(true);
    pack();
    ba.a(paramba).a(this);
    setSize(250, 300);
    setLocationRelativeTo(getOwner());
  }

  private void c()
  {
    this.d = new JList(new DefaultListModel());
    JPanel localJPanel = new JPanel(new FlowLayout(2));
    w localw1 = new w(ct.a(116));
    w localw2 = new w(ct.a(117));
    cd localcd = new cd(this.d);
    JLabel localJLabel = new JLabel(ct.a(1084));
    this.d.addKeyListener(new ab(this, localw1));
    Iterator localIterator = p.e().g();
    while (localIterator.hasNext())
    {
      localObject = (d)localIterator.next();
      ((DefaultListModel)this.d.getModel()).addElement(localObject);
    }
    localw1.addActionListener(new cb(this));
    localw2.addActionListener(new db(this));
    localJPanel.add(localw1);
    localJPanel.add(localw2);
    Object localObject = new JPanel(new BorderLayout());
    ((JPanel)localObject).add(localJLabel, "North");
    ((JPanel)localObject).add(localcd, "Center");
    ((JPanel)localObject).add(localJPanel, "South");
    ((JPanel)localObject).setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    getContentPane().add((Component)localObject, "Center");
  }

  public Object[] e()
  {
    return this.c;
  }

  public void a(o paramo)
  {
    if ((paramo instanceof c))
      return;
    if (!((DefaultListModel)this.d.getModel()).contains(paramo))
      ((DefaultListModel)this.d.getModel()).addElement(paramo);
  }

  public void c(o paramo)
  {
    if (((DefaultListModel)this.d.getModel()).contains(paramo))
      ((DefaultListModel)this.d.getModel()).removeElement(paramo);
  }

  public void a(bo parambo)
  {
  }

  public void a()
  {
    this.d.getCellRenderer().getListCellRendererComponent(this.d, ((DefaultListModel)this.d.getModel()).elementAt(0), 0, true, true).setEnabled(false);
    super.setVisible(true);
  }

  static Object[] a(bq parambq, Object[] paramArrayOfObject)
  {
    return parambq.c = paramArrayOfObject;
  }

  static JList a(bq parambq)
  {
    return parambq.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.r.bq
 * JD-Core Version:    0.6.0
 */
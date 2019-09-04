package com.zend.ide.l;

import com.zend.ide.f.zc.b.c;
import com.zend.ide.p.bw;
import com.zend.ide.p.cd;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

class tb extends JPanel
{
  private Action a;
  private bw b;
  private c c;
  private JButton d;
  private JButton e;
  private JButton f;
  final sb g;

  public tb(sb paramsb)
  {
    sb.a(paramsb, new DefaultListModel());
    b();
  }

  protected void a(c paramc)
  {
    this.c = paramc;
    sb.b(this.g).clear();
    List localList = paramc.a();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
      sb.b(this.g).addElement(localIterator.next());
  }

  protected void a(File[] paramArrayOfFile)
  {
    for (int i = 0; i < paramArrayOfFile.length; i++)
    {
      String str = paramArrayOfFile[i].getAbsolutePath();
      if (sb.b(this.g).contains(str))
        continue;
      sb.b(this.g).addElement(str);
    }
    this.b.repaint();
  }

  protected c a()
  {
    Enumeration localEnumeration = sb.b(this.g).elements();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Object localObject;
    while (localEnumeration.hasMoreElements())
    {
      localObject = localEnumeration.nextElement().toString();
      File localFile = new File((String)localObject);
      if ((localFile.getName().endsWith(".jar")) || (localFile.getName().endsWith(".zip")))
        localArrayList1.add(localFile);
      else if (localFile.isDirectory())
        localArrayList2.add(localFile);
    }
    this.c.a(0, this.g.a());
    try
    {
      localObject = new File[localArrayList2.size()];
      localArrayList2.toArray(localObject);
      this.c.a(localObject);
    }
    catch (IOException localIOException1)
    {
      cl.a(localIOException1);
    }
    try
    {
      File[] arrayOfFile = new File[localArrayList1.size()];
      localArrayList1.toArray(arrayOfFile);
      this.c.b(arrayOfFile);
    }
    catch (IOException localIOException2)
    {
      cl.a(localIOException2);
    }
    return (c)this.c;
  }

  private void b()
  {
    setLayout(new BorderLayout());
    add(new JLabel(ct.a(1844)), "North");
    add(d(), "Center");
    add(c(), "East");
    setBorder(BorderFactory.createTitledBorder("Classpath"));
    e();
  }

  private JComponent c()
  {
    this.d = new JButton(new nb(this));
    this.e = new JButton(new mb(this));
    this.a = new ob(this);
    this.f = new JButton(this.a);
    JPanel localJPanel1 = new JPanel(new GridLayout(-1, 1));
    localJPanel1.add(this.d);
    localJPanel1.add(this.e);
    localJPanel1.add(new JLabel(" "));
    localJPanel1.add(this.f);
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.add(localJPanel1, "North");
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(0, 4, 0, 0));
    return localJPanel2;
  }

  private JComponent d()
  {
    this.b = new bw();
    this.b.setModel(sb.b(this.g));
    this.b.getSelectionModel().addListSelectionListener(new fb(this));
    this.b.setCellRenderer(new qb(this));
    cd localcd = new cd(this.b);
    return localcd;
  }

  private void e()
  {
    this.a.setEnabled(this.b.getSelectedIndex() > -1);
  }

  static void a(tb paramtb)
  {
    paramtb.e();
  }

  static bw b(tb paramtb)
  {
    return paramtb.b;
  }

  static JButton c(tb paramtb)
  {
    return paramtb.e;
  }

  static JButton d(tb paramtb)
  {
    return paramtb.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.tb
 * JD-Core Version:    0.6.0
 */
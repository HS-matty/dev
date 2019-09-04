package com.zend.ide.d;

import com.zend.ide.f.zc.b.j;
import com.zend.ide.f.zc.b.l;
import com.zend.ide.p.cd;
import com.zend.ide.p.e.d;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.y.a;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JViewport;
import javax.swing.border.CompoundBorder;
import javax.swing.table.DefaultTableModel;

public class md extends com.zend.ide.i.n
  implements a, cu
{
  private DefaultTableModel b = a();
  private ud c;
  private Action d;
  private Action e;
  private JComponent f;
  private j g;
  private Dialog h;
  private boolean i;

  public md(Dialog paramDialog)
  {
    super(paramDialog);
    c();
    setLocationRelativeTo(null);
  }

  public void b(String paramString)
  {
    this.g = l.a(paramString);
  }

  public void setVisible(boolean paramBoolean)
  {
    if (paramBoolean)
      f();
    super.setVisible(paramBoolean);
  }

  protected DefaultTableModel a()
  {
    return new DefaultTableModel(new String[] { ct.a(1832), ct.a(1833) }, 0);
  }

  public String b()
  {
    if (this.g != null)
      return this.g.d();
    return l.c();
  }

  private void c()
  {
    setLayout(new BorderLayout());
    this.f = new JPanel(new BorderLayout());
    JPanel localJPanel = new JPanel(new BorderLayout());
    localJPanel.add(d(), "North");
    localJPanel.add(e(), "Center");
    CompoundBorder localCompoundBorder = BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5));
    localJPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), localCompoundBorder));
    this.f.add(localJPanel, "Center");
    this.f.add(f(), "South");
    ud.a(this.c);
    add(this.f, "Center");
    setTitle(ct.a(1830));
    setModal(true);
    setSize(550, 400);
  }

  private Component d()
  {
    JTextArea localJTextArea = new JTextArea(ct.a(1831));
    localJTextArea.setFocusable(false);
    localJTextArea.setEditable(false);
    localJTextArea.setLineWrap(true);
    localJTextArea.setWrapStyleWord(true);
    localJTextArea.setBackground(this.f.getBackground());
    localJTextArea.setBorder(BorderFactory.createEmptyBorder(0, 0, 4, 0));
    return localJTextArea;
  }

  private Component e()
  {
    this.c = new ud(this, this.b);
    cd localcd = new cd(this.c);
    localcd.getViewport().setBackground(Color.WHITE);
    this.c.addMouseListener(new c(this));
    JPanel localJPanel1 = new JPanel(new GridLayout(-1, 1, 0, 2));
    this.h = this;
    JButton localJButton1 = new JButton(new xc(this));
    this.d = new zc(this);
    JButton localJButton2 = new JButton(this.d);
    this.e = new bd(this);
    JButton localJButton3 = new JButton(this.e);
    localJPanel1.add(localJButton1);
    localJPanel1.add(localJButton2);
    localJPanel1.add(localJButton3);
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.add(localJPanel1, "North");
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(0, 4, 0, 0));
    JPanel localJPanel3 = new JPanel(new BorderLayout());
    localJPanel3.add(localcd, "Center");
    localJPanel3.add(localJPanel2, "East");
    return localJPanel3;
  }

  private Component f()
  {
    JPanel localJPanel = new JPanel(new FlowLayout(2));
    JButton localJButton1 = new JButton(new ad(this));
    JButton localJButton2 = new JButton(new yc(this));
    localJPanel.add(localJButton1);
    localJPanel.add(localJButton2);
    d.b(new JButton[] { localJButton1, localJButton2 });
    return localJPanel;
  }

  public JComponent c()
  {
    return this.f;
  }

  public void a(String paramString)
  {
  }

  public void e()
  {
  }

  public void d()
  {
    this.g = l.a(this.c.getValueAt(ud.b(this.c), 0).toString());
    if ((this.g != null) && (!this.i))
      return;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    int j = this.b.getRowCount();
    for (int k = 0; k < j; k++)
    {
      String str1 = this.b.getValueAt(k, 0).toString();
      String str2 = this.b.getValueAt(k, 1).toString();
      localArrayList1.add(str1);
      try
      {
        j localj = new j(str1, new File(str2));
        localArrayList2.add(localj);
      }
      catch (IOException localIOException)
      {
        cl.a(localIOException);
        localArrayList1.remove(str1);
      }
    }
    l.a(localArrayList1, localArrayList2);
    this.g = l.a(this.c.getValueAt(ud.b(this.c), 0).toString());
    if (this.g == null)
      this.g = l.b();
  }

  public void f()
  {
    this.i = false;
    int j = this.b.getRowCount();
    for (int k = 0; k < j; k++)
      this.b.removeRow(0);
    String[] arrayOfString = l.d();
    for (int m = 0; m < arrayOfString.length; m++)
    {
      j localj = l.a(arrayOfString[m]);
      this.b.addRow(new Object[] { arrayOfString[m], localj.c().getAbsolutePath() });
      if (!localj.d().equals(this.g.d()))
        continue;
      ud.a(this.c, m);
    }
    this.c.repaint();
  }

  private void g()
  {
    int j = this.c.getSelectedRow();
    List localList = i();
    fc localfc = new fc((String)this.b.getValueAt(j, 0), (String)this.b.getValueAt(j, 1));
    ld localld = new ld(this.h, true, localfc, localList, n.EDIT);
    localld.setVisible(true);
    if (localfc.c())
    {
      this.i = true;
      this.b.setValueAt(localfc.a(), j, 0);
      this.b.setValueAt(localfc.b(), j, 1);
      repaint();
    }
  }

  private boolean h()
  {
    int j = this.c.getSelectedRowCount();
    int k = j >= 1 ? 1 : 0;
    if (k != 0)
    {
      String str = l.c();
      int[] arrayOfInt = this.c.getSelectedRows();
      for (int m = 0; m < arrayOfInt.length; m++)
      {
        if (!str.equals(this.c.getValueAt(arrayOfInt[m], 0).toString()))
          continue;
        k = 0;
        break;
      }
    }
    return k;
  }

  public List i()
  {
    ArrayList localArrayList = new ArrayList();
    int j = this.b.getRowCount();
    for (int k = 0; k < j; k++)
      localArrayList.add((String)this.b.getValueAt(k, 0));
    return localArrayList;
  }

  static boolean a(md parammd)
  {
    return parammd.h();
  }

  static ud b(md parammd)
  {
    return parammd.c;
  }

  static void c(md parammd)
  {
    parammd.g();
  }

  static Action d(md parammd)
  {
    return parammd.e;
  }

  static Action e(md parammd)
  {
    return parammd.d;
  }

  static Dialog f(md parammd)
  {
    return parammd.h;
  }

  static DefaultTableModel g(md parammd)
  {
    return parammd.b;
  }

  static boolean a(md parammd, boolean paramBoolean)
  {
    return parammd.i = paramBoolean;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.md
 * JD-Core Version:    0.6.0
 */
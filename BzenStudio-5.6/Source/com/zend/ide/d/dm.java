package com.zend.ide.d;

import com.zend.ide.n.hl;
import com.zend.ide.p.bw;
import com.zend.ide.p.cd;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;

public abstract class dm extends JPanel
  implements cu
{
  protected JList a;
  protected dc b;

  public dm(dc paramdc, ArrayList paramArrayList)
  {
    setLayout(new BorderLayout(5, 5));
    setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
    this.b = paramdc;
    a(paramArrayList);
    l();
    this.a.setSelectedIndex(0);
  }

  public void b()
  {
    k();
    h();
  }

  protected co c()
  {
    return this.b.p();
  }

  protected boolean d()
  {
    return this.b.v();
  }

  public void q()
  {
  }

  public abstract void h();

  protected abstract void k();

  protected abstract void a(hl paramhl);

  protected abstract void a(Font paramFont);

  protected abstract void a(Color paramColor);

  protected abstract void b(Color paramColor);

  protected JPanel e()
  {
    JPanel localJPanel1 = new JPanel(new BorderLayout(15, 15));
    JPanel localJPanel2 = new JPanel(new BorderLayout(5, 5));
    cd localcd = new cd(this.a);
    localJPanel2.add(localcd, "Center");
    localJPanel2.setBorder(BorderFactory.createTitledBorder(ct.a(1154)));
    localJPanel1.add(localJPanel2, "Center");
    localJPanel1.add(f(), "East");
    return localJPanel1;
  }

  protected abstract JPanel f();

  protected abstract JPanel i();

  protected String r()
  {
    String str1 = "my" + this.b.u();
    int i = 1;
    int j = 1;
    while (i != 0)
    {
      if (this.b.e(str1) == null)
      {
        i = 0;
        continue;
      }
      str1 = "my" + this.b.u() + j++;
    }
    String str2 = this.b.a(ct.a(1225), str1);
    return str2;
  }

  private void l()
  {
    add(e(), "North");
    add(i(), "Center");
  }

  private void a(ArrayList paramArrayList)
  {
    this.a = new bw();
    this.a.setSelectionMode(0);
    this.a.addListSelectionListener(new di(this, null));
    DefaultListModel localDefaultListModel = (DefaultListModel)this.a.getModel();
    for (int i = 0; i < paramArrayList.size(); i++)
      localDefaultListModel.addElement(paramArrayList.get(i));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.dm
 * JD-Core Version:    0.6.0
 */
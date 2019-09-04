package com.zend.ide.z;

import com.zend.ide.p.cd;
import com.zend.ide.util.ct;
import com.zend.ide.util.d.a;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class bl extends bj
{
  private double e;
  private a h;
  final bi g;

  public bl(bi parambi)
  {
    super(parambi);
    b();
  }

  void b()
  {
    this.h = new a();
    Vector localVector = new Vector();
    localVector.add(ct.a(913));
    localVector.add(ct.a(914));
    this.c = new hb(this, localVector, 0);
    this.b = new com.zend.ide.p.eb();
    this.c.setNumRows(0);
    this.b.setModel(this.c);
    this.b.a(t.class, new eb(this));
    this.b.setGridColor(Color.white);
    this.b.setIntercellSpacing(new Dimension(0, 0));
    this.b.addMouseListener(new c(this));
    TableColumn localTableColumn1 = this.b.getColumnModel().getColumn(0);
    TableColumn localTableColumn2 = this.b.getColumnModel().getColumn(1);
    localTableColumn1.setPreferredWidth(80);
    localTableColumn1.setCellRenderer(new bt(null));
    localTableColumn2.setPreferredWidth(300);
    localTableColumn2.setCellRenderer(new bs(this, null));
    cd localcd = new cd(this.b, 20, 30);
    localcd.getViewport().setBackground(Color.white);
    add(localcd, "Center");
    setAlignmentX(0.0F);
    setBackground(Color.white);
    setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    c();
    this.b.a(1);
    this.b.setName("functionGraphTable");
  }

  public void d()
  {
    this.c.setNumRows(0);
    this.h.c();
    this.e = 0.0D;
  }

  public void a(r[] paramArrayOfr)
  {
    for (int i = 0; i < paramArrayOfr.length; i++)
    {
      r localr = paramArrayOfr[i];
      if ((!this.f) && ((this.f) || (localr.e() <= 0)))
        continue;
      double d1 = localr.j();
      double d2 = localr.i();
      t localt = new t(d1, d2, localr.d());
      this.h.a(localr.d(), localr);
      this.e = Math.max(this.e, d2);
      this.c.addRow(new Object[] { localr, localt });
    }
  }

  static a a(bl parambl)
  {
    return parambl.h;
  }

  static double b(bl parambl)
  {
    return parambl.e;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.bl
 * JD-Core Version:    0.6.0
 */
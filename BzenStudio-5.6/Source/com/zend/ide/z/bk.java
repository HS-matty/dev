package com.zend.ide.z;

import com.zend.ide.p.cd;
import com.zend.ide.p.eb;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import java.awt.Color;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class bk extends bj
{
  final bi e;

  public bk(bi parambi)
  {
    super(parambi);
    b();
  }

  void b()
  {
    this.b = new eb();
    Vector localVector = new Vector();
    localVector.add(ct.a(908));
    localVector.add(ct.a(909));
    localVector.add(ct.a(910));
    localVector.add(ct.a(911));
    localVector.add(ct.a(912));
    this.c = new gb(this, localVector, 0);
    this.c.setNumRows(0);
    this.b.setModel(this.c);
    this.b.setIntercellSpacing(new Dimension(0, 0));
    cd localcd = new cd(this.b, 20, 30);
    localcd.getViewport().setBackground(Color.white);
    DefaultTableCellRenderer localDefaultTableCellRenderer = new DefaultTableCellRenderer();
    localDefaultTableCellRenderer.setHorizontalAlignment(0);
    this.b.setDefaultRenderer(this.b.getColumnClass(0), localDefaultTableCellRenderer);
    this.b.addMouseListener(new c(this));
    TableColumn localTableColumn = this.b.getColumnModel().getColumn(0);
    JTableHeader localJTableHeader = this.b.getTableHeader();
    localJTableHeader.setName("functionDataTableHeader");
    localJTableHeader.addMouseMotionListener(new cc(this.e));
    bt localbt = new bt(null);
    localbt.setHorizontalAlignment(2);
    localbt.addMouseListener(new c(this));
    localTableColumn.setCellRenderer(localbt);
    add(localcd, "Center");
    setAlignmentX(0.0F);
    setBackground(Color.white);
    setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    c();
    this.b.a(2);
    this.b.setName("functionDataTable");
  }

  protected void d()
  {
    this.c.setNumRows(0);
  }

  public void a(r[] paramArrayOfr)
  {
    for (int i = 0; i < paramArrayOfr.length; i++)
      try
      {
        r localr = paramArrayOfr[i];
        if ((this.f) || ((!this.f) && (localr.e() > 0)))
        {
          String str1 = bi.f(this.e).format(localr.j());
          String str2 = bi.f(this.e).format(localr.i());
          this.c.addRow(new Object[] { localr, new Integer(localr.c()), new Integer(localr.e()), new Double(str1), new Double(str2) });
        }
      }
      catch (Exception localException)
      {
        cl.a(localException);
      }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.bk
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.zendPlatformIntegration.a;

import com.zend.ide.p.ab.o;
import com.zend.ide.p.eb;
import com.zend.ide.zendPlatformIntegration.b.a.p;
import com.zend.ide.zendPlatformIntegration.b.a.q;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class jb extends eb
{
  private static final long serialVersionUID = 1L;
  protected kb b;
  private mb c;

  public jb(d paramd)
  {
    this.b = new kb(this, paramd);
    this.c = new mb(paramd, this.b);
    setModel(this.c);
    this.b.setSelectionModel(new nb(this));
    this.b.setRowHeight(getRowHeight());
    setDefaultRenderer(Object.class, this.b);
    getTableHeader().setReorderingAllowed(false);
    setShowGrid(true);
    TableColumnModel localTableColumnModel = getColumnModel();
    q[] arrayOfq = p.a;
    for (int i = 0; i < arrayOfq.length; i++)
      localTableColumnModel.getColumn(i).setPreferredWidth(arrayOfq[i].c());
    addMouseListener(new e(this));
    setSelectionMode(0);
  }

  protected o a()
  {
    this.a = new a();
    o localo = new o(this.a);
    return localo;
  }

  public void a(fb paramfb)
  {
    this.b.setModel(paramfb);
    this.c.fireTableDataChanged();
  }

  public int getEditingRow()
  {
    return getColumnClass(this.editingColumn) == fb.class ? -1 : this.editingRow;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.a.jb
 * JD-Core Version:    0.6.0
 */
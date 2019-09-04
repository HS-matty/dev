package com.zend.ide.p.ab;

import com.zend.ide.util.ct;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

public class o extends AbstractTableModel
{
  private static final String m = ct.a(1586);
  private static c a = new c(-1, 0);
  private TableModel b;
  private g c;
  private int[] d;
  private boolean e;
  private d[] f;
  private int[] g;
  private JTableHeader h;
  private MouseListener i;
  private TableModelListener j;
  private List k = new ArrayList();
  private h l;

  public o(h paramh)
  {
    this.l = paramh;
    this.i = new a(this, null);
    this.j = new f(this, null);
  }

  public TableModel a()
  {
    return this.b;
  }

  public void a(TableModel paramTableModel)
  {
    if (this.b != null)
      this.b.removeTableModelListener(this.j);
    this.b = paramTableModel;
    if (this.b != null)
      this.b.addTableModelListener(this.j);
    b();
    fireTableStructureChanged();
  }

  private void b()
  {
    this.f = null;
    this.g = null;
  }

  public void a(JTableHeader paramJTableHeader)
  {
    e();
    if (this.h != null)
    {
      this.h.removeMouseListener(this.i);
      TableCellRenderer localTableCellRenderer = this.h.getDefaultRenderer();
      if ((localTableCellRenderer instanceof e))
        this.h.setDefaultRenderer(e.a((e)localTableCellRenderer));
      this.h.setToolTipText(null);
    }
    this.h = paramJTableHeader;
    if (this.h != null)
    {
      this.h.addMouseListener(this.i);
      this.h.setDefaultRenderer(new e(this, this.h.getDefaultRenderer()));
      this.h.setToolTipText(m);
    }
  }

  private boolean c()
  {
    return this.k.size() != 0;
  }

  private c a(int paramInt)
  {
    for (int n = 0; n < this.k.size(); n++)
    {
      c localc = (c)this.k.get(n);
      if (c.a(localc) == paramInt)
        return localc;
    }
    return a;
  }

  private int b(int paramInt)
  {
    return c.b(a(paramInt));
  }

  private void d()
  {
    b();
    fireTableDataChanged();
    if (this.h != null)
      this.h.repaint();
  }

  public void a(int paramInt1, int paramInt2)
  {
    c localc = a(paramInt1);
    if (localc != a)
      this.k.remove(localc);
    if (paramInt2 != 0)
      this.k.add(new c(paramInt1, paramInt2));
    d();
  }

  private Icon b(int paramInt1, int paramInt2)
  {
    c localc = a(paramInt1);
    if (localc == a)
      return null;
    return new m(c.b(localc) == -1, paramInt2, this.k.indexOf(localc));
  }

  private void e()
  {
    this.k.clear();
    d();
  }

  private Comparator c(int paramInt)
  {
    return this.l.a(paramInt, this.b.getColumnClass(paramInt));
  }

  private d[] f()
  {
    if (this.f == null)
    {
      int n = this.b.getRowCount();
      this.f = new d[n];
      for (int i1 = 0; i1 < n; i1++)
        this.f[i1] = new d(this, i1);
      if (c())
        Arrays.sort(this.f);
    }
    return this.f;
  }

  public int d(int paramInt)
  {
    return d.a(f()[paramInt]);
  }

  private int[] g()
  {
    if (this.g == null)
    {
      int n = f().length;
      this.g = new int[n];
      for (int i1 = 0; i1 < n; i1++)
        this.g[d(i1)] = i1;
    }
    return this.g;
  }

  public int getRowCount()
  {
    return this.b == null ? 0 : this.b.getRowCount();
  }

  public int getColumnCount()
  {
    return this.b == null ? 0 : this.b.getColumnCount();
  }

  public String getColumnName(int paramInt)
  {
    return this.b.getColumnName(paramInt);
  }

  public Class getColumnClass(int paramInt)
  {
    return this.b.getColumnClass(paramInt);
  }

  public boolean isCellEditable(int paramInt1, int paramInt2)
  {
    return this.b.isCellEditable(d(paramInt1), paramInt2);
  }

  public Object getValueAt(int paramInt1, int paramInt2)
  {
    return this.b.getValueAt(d(paramInt1), paramInt2);
  }

  public void setValueAt(Object paramObject, int paramInt1, int paramInt2)
  {
    this.b.setValueAt(paramObject, d(paramInt1), paramInt2);
  }

  public ListSelectionListener a(JTable paramJTable)
  {
    if (this.c == null)
    {
      this.c = new g(this, paramJTable);
      this.e = true;
    }
    return this.c;
  }

  static List a(o paramo)
  {
    return paramo.k;
  }

  static TableModel b(o paramo)
  {
    return paramo.b;
  }

  static Comparator a(o paramo, int paramInt)
  {
    return paramo.c(paramInt);
  }

  static boolean c(o paramo)
  {
    return paramo.c();
  }

  static void d(o paramo)
  {
    paramo.b();
  }

  static void e(o paramo)
  {
    paramo.e();
  }

  static int b(o paramo, int paramInt)
  {
    return paramo.b(paramInt);
  }

  static int[] f(o paramo)
  {
    return paramo.g;
  }

  static int[] g(o paramo)
  {
    return paramo.g();
  }

  static boolean a(o paramo, boolean paramBoolean)
  {
    return paramo.e = paramBoolean;
  }

  static g h(o paramo)
  {
    return paramo.c;
  }

  static Icon a(o paramo, int paramInt1, int paramInt2)
  {
    return paramo.b(paramInt1, paramInt2);
  }

  static boolean i(o paramo)
  {
    return paramo.e;
  }

  static int[] a(o paramo, int[] paramArrayOfInt)
  {
    return paramo.d = paramArrayOfInt;
  }

  static int[] j(o paramo)
  {
    return paramo.d;
  }

  static d[] k(o paramo)
  {
    return paramo.f;
  }

  static d[] l(o paramo)
  {
    return paramo.f();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.ab.o
 * JD-Core Version:    0.6.0
 */
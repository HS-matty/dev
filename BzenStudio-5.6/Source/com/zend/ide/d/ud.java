package com.zend.ide.d;

import com.zend.ide.p.bm;
import java.awt.Color;
import javax.swing.Action;
import javax.swing.JCheckBox;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

class ud extends bm
{
  private JCheckBox a = new JCheckBox("");
  private int b;
  final md c;

  public ud(md parammd, TableModel paramTableModel)
  {
    super(paramTableModel);
    c();
    setGridColor(Color.LIGHT_GRAY);
  }

  public boolean isCellEditable(int paramInt1, int paramInt2)
  {
    return paramInt2 < 1;
  }

  private void c()
  {
    if (getColumnCount() > 0)
    {
      TableColumn localTableColumn = getColumnModel().getColumn(0);
      JCheckBox localJCheckBox = new JCheckBox("");
      localTableColumn.setCellEditor(new hd(this, localJCheckBox, localJCheckBox));
      localTableColumn.setCellRenderer(new vd(this));
      addMouseListener(new j(this));
      getSelectionModel().addListSelectionListener(new bc(this));
    }
  }

  private void d()
  {
    boolean bool = md.a(this.c);
    int i = getSelectedRowCount();
    md.d(this.c).setEnabled(bool);
    md.e(this.c).setEnabled((bool) && (i == 1));
  }

  static void a(ud paramud)
  {
    paramud.d();
  }

  static int b(ud paramud)
  {
    return paramud.b;
  }

  static int a(ud paramud, int paramInt)
  {
    return paramud.b = paramInt;
  }

  static JCheckBox c(ud paramud)
  {
    return paramud.a;
  }

  static int d(ud paramud)
  {
    return paramud.b--;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.ud
 * JD-Core Version:    0.6.0
 */
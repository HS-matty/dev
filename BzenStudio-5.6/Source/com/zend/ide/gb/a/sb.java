package com.zend.ide.gb.a;

import com.zend.ide.gb.b.b;
import com.zend.ide.gb.b.d;
import com.zend.ide.p.cd;
import com.zend.ide.p.eb;
import com.zend.ide.util.ct;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class sb extends ob
{
  private JTextArea c;
  private static eb d;
  private static DefaultTableModel e;

  public sb(mb parammb)
  {
    b = parammb;
    c();
    e();
  }

  private void c()
  {
    d();
    this.c = new JTextArea(ct.a(1644));
    this.c.setFocusable(false);
    this.c.setBackground(getBackground());
    this.c.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.DARK_GRAY), BorderFactory.createEmptyBorder(0, 0, 10, 0)));
    this.c.setEditable(false);
    this.c.setLineWrap(true);
    this.c.setWrapStyleWord(true);
  }

  private void d()
  {
    d = new eb();
    Vector localVector = new Vector();
    localVector.add(ct.a(1645));
    localVector.add(ct.a(1641));
    localVector.add(ct.a(1646));
    e = new vb(this, localVector, 0);
    d.getTableHeader().setReorderingAllowed(false);
    d.setModel(e);
    d.getSelectionModel().setSelectionMode(0);
    TableColumn localTableColumn1 = d.getColumnModel().getColumn(2);
    lb locallb = new lb(this);
    locallb.setModel(new DefaultComboBoxModel());
    locallb.setEditable(true);
    localTableColumn1.setCellEditor(new DefaultCellEditor(locallb));
    TableColumn localTableColumn2 = d.getColumnModel().getColumn(0);
    localTableColumn2.setCellRenderer(new tb(this));
  }

  private void e()
  {
    setLayout(new BorderLayout(5, 5));
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    localJPanel1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    localJPanel1.add(this.c, "Center");
    add(localJPanel1, "North");
    cd localcd = new cd(d, 20, 30);
    JPanel localJPanel2 = new JPanel(new BorderLayout());
    localJPanel2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    localJPanel2.add(localcd, "Center");
    add(localJPanel2, "Center");
  }

  void a(b paramb)
  {
    this.a = paramb;
  }

  void a()
  {
    if (this.a == null)
      return;
    ArrayList localArrayList = this.a.a();
    localArrayList.clear();
    for (int i = 0; i < e.getRowCount(); i++)
    {
      String str = (String)e.getValueAt(i, 1);
      localArrayList.add(new d(str, (String)e.getValueAt(i, 2)));
    }
  }

  void b()
  {
    b.b(true);
    b.c(true);
  }

  public void a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    while (e.getRowCount() > 0)
      e.removeRow(0);
    ArrayList localArrayList = this.a.a();
    for (int i = 0; i < paramArrayList1.size(); i++)
    {
      String str1 = (String)paramArrayList1.get(i);
      String str2 = (String)paramArrayList2.get(i);
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = str2;
      arrayOfObject[1] = str1;
      arrayOfObject[2] = "";
      for (int j = 0; j < localArrayList.size(); j++)
      {
        d locald = (d)localArrayList.get(j);
        if (!locald.a().equals(str1))
          continue;
        arrayOfObject[2] = locald.b();
        break;
      }
      e.addRow(arrayOfObject);
    }
  }

  public boolean b(boolean paramBoolean)
  {
    a();
    return true;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.a.sb
 * JD-Core Version:    0.6.0
 */
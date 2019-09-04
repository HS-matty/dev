package com.zend.ide.cb.a;

import com.zend.ide.n.gz;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.util.EventObject;
import javax.swing.AbstractCellEditor;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellEditor;

class yc extends AbstractCellEditor
  implements TableCellEditor
{
  private gz a;
  private DefaultCellEditor b;
  private JTextField c;
  private JPanel d;
  private String e;
  private String f;
  final pd g;

  public yc(pd parampd)
  {
    a();
    b();
  }

  public Object getCellEditorValue()
  {
    String str = this.f == null ? this.e : this.f;
    this.f = null;
    return str;
  }

  public Component getTableCellEditorComponent(JTable paramJTable, Object paramObject, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    if (paramObject != null)
    {
      Object localObject = paramJTable.getValueAt(paramInt1, paramInt2);
      this.e = localObject.toString();
      if (this.e != null)
        this.c.setText(this.e);
    }
    else
    {
      this.e = null;
      this.c.setText(null);
    }
    return this.d;
  }

  public boolean stopCellEditing()
  {
    String str;
    if (this.f != null)
    {
      str = this.f;
    }
    else if (!this.c.getText().equals(this.e))
    {
      str = this.c.getText();
      this.f = str;
    }
    else
    {
      str = this.e;
    }
    this.c.setText(str);
    return super.stopCellEditing();
  }

  private void a()
  {
    this.d = new JPanel(new BorderLayout());
    this.b = new DefaultCellEditor(new JTextField());
    this.c = ((JTextField)this.b.getComponent());
    this.d.add(this.b.getComponent());
    JButton localJButton = new JButton(new xb(this));
    Dimension localDimension = localJButton.getPreferredSize();
    localDimension.width = 20;
    localJButton.setPreferredSize(localDimension);
    this.d.add(localJButton, "East");
  }

  public boolean isCellEditable(EventObject paramEventObject)
  {
    if (((paramEventObject instanceof MouseEvent)) && (this.b != null))
      return ((MouseEvent)paramEventObject).getClickCount() >= this.b.getClickCountToStart();
    return true;
  }

  private void b()
  {
    f localf = new f();
    localf.a("editing.styleManager", new h(this, null));
    localf.a("editing.font", new ld(this, null));
    e locale = new e(localf);
    locale.a("editing.styleManager");
    locale.a("editing.font");
  }

  static gz a(yc paramyc)
  {
    return paramyc.a;
  }

  static gz a(yc paramyc, gz paramgz)
  {
    return paramyc.a = paramgz;
  }

  static String d(yc paramyc)
  {
    return paramyc.f;
  }

  static String b(yc paramyc)
  {
    return paramyc.e;
  }

  static String a(yc paramyc, String paramString)
  {
    return paramyc.f = paramString;
  }

  static JTextField c(yc paramyc)
  {
    return paramyc.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.yc
 * JD-Core Version:    0.6.0
 */
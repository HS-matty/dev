package com.zend.ide.z;

import com.zend.ide.p.bb;
import com.zend.ide.p.cd;
import com.zend.ide.p.eb;
import com.zend.ide.util.ct;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class y extends JPanel
{
  private u a;
  private f b;
  private eb c;
  private DefaultTableModel d;
  private bb e;
  private bb f;
  final w g;

  public y(w paramw, m paramm, f paramf)
  {
    super(new BorderLayout());
    this.a = paramm.d();
    this.b = paramf;
    b();
    c();
  }

  private void b()
  {
    this.c = new eb();
    Vector localVector = new Vector();
    localVector.add(ct.a(900));
    this.d = new fb(this, localVector, 0);
    this.c.getTableHeader().setReorderingAllowed(false);
    this.c.addMouseListener(new b(this));
    ListSelectionModel localListSelectionModel = this.c.getSelectionModel();
    localListSelectionModel.addListSelectionListener(new e(this));
    this.d.setNumRows(0);
    this.c.setModel(this.d);
    this.c.a(0, new db(this));
    this.c.getSelectionModel().setSelectionMode(0);
    this.c.setIntercellSpacing(new Dimension(0, 0));
    this.c.setAutoResizeMode(2);
    this.c.getColumnModel().getColumn(0).setCellRenderer(new z(this, null));
    cd localcd = new cd(this.c, 20, 30);
    localcd.getViewport().setBackground(Color.white);
    add(localcd, "Center");
    setAlignmentX(0.0F);
    setBackground(Color.white);
    setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    e();
    try
    {
      this.c.addRowSelectionInterval(0, 0);
    }
    catch (Exception localException)
    {
    }
    this.c.getTableHeader().setName("fileNameHeader");
    this.c.setName("filesTable");
  }

  private void c()
  {
    this.e = new bb(ct.b(1010));
    this.f = new bb(ct.b(901));
    this.e.setName("allFilesButton");
    this.f.setName("specificFileButton");
    ButtonGroup localButtonGroup = new ButtonGroup();
    localButtonGroup.add(this.f);
    localButtonGroup.add(this.e);
    JPanel localJPanel = new JPanel(new GridLayout(0, 1));
    o localo = new o(this, null);
    this.f.addActionListener(localo);
    this.e.addActionListener(localo);
    localJPanel.add(this.f);
    localJPanel.add(this.e);
    add(localJPanel, "South");
    this.f.setSelected(true);
  }

  private void d()
  {
    if (this.e.isSelected())
    {
      w.b(this.g).a(new String[0]);
      w.c(this.g).a(true);
      w.c(this.g).a(w.d(this.g).c());
    }
    else
    {
      w.c(this.g).a(false);
      w.b(this.g).a(this.a.f());
    }
    if (this.c.getRowCount() > 0)
      this.c.getSelectionModel().setLeadSelectionIndex(0);
  }

  private void e()
  {
    a(this.a.f());
  }

  public void a(String[] paramArrayOfString)
  {
    this.d.setNumRows(0);
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      String str = paramArrayOfString[i];
      this.d.addRow(new Object[] { " " + str });
    }
  }

  public void a(String paramString)
  {
    for (int i = 0; i < this.c.getRowCount(); i++)
    {
      if (!this.c.getValueAt(i, 0).toString().trim().equals(paramString))
        continue;
      this.c.setRowSelectionInterval(i, i);
      this.c.b();
      f();
      break;
    }
  }

  public void f()
  {
    int i = this.c.getSelectedRow();
    if (i == -1)
      return;
    Object localObject = this.c.getModel().getValueAt(i, 0);
    if (localObject != null)
    {
      String str = "";
      if ((localObject instanceof n))
        str = ((n)localObject).e();
      else
        str = (String)localObject;
      this.b.a(i, str);
    }
  }

  static eb a(y paramy)
  {
    return paramy.c;
  }

  static u b(y paramy)
  {
    return paramy.a;
  }

  static void a(y paramy)
  {
    paramy.d();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.y
 * JD-Core Version:    0.6.0
 */
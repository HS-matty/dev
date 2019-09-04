package com.zend.ide.n;

import com.zend.ide.bc.a;
import com.zend.ide.n.a.e;
import com.zend.ide.n.a.m;
import com.zend.ide.p.ba;
import com.zend.ide.p.cd;
import com.zend.ide.p.w;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.List;
import java.util.Vector;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.text.JTextComponent;

class sc extends JPanel
  implements cu
{
  private jb a = new jb(this, null);
  private JTable b;
  private DefaultTableModel c;
  private w d;
  private w e;
  private w f;
  private w g;
  private w h;
  private nc i = new nc(this, null);
  private m j;
  private ac k;

  public sc(ac paramac)
  {
    this.k = paramac;
    this.j = paramac.b();
    this.j.a(this.a);
    a();
    c();
    d();
    a.a(this, "BOOKMARKS");
  }

  private void a()
  {
    setLayout(new BorderLayout(5, 5));
    JPanel localJPanel = new JPanel(new BorderLayout(5, 5));
    this.b = new JTable();
    a.a(this.b, "BOOKMARKS");
    this.b.getTableHeader().setReorderingAllowed(false);
    this.b.addMouseListener(new g(this, null));
    Vector localVector = new Vector();
    localVector.add(ct.a(680));
    localVector.add(ct.a(681));
    this.c = new uc(this, new Vector(), localVector);
    b();
    this.b.setModel(this.c);
    this.b.setPreferredScrollableViewportSize(new Dimension(500, 130));
    this.b.getSelectionModel().setSelectionMode(0);
    this.b.setIntercellSpacing(new Dimension(0, 0));
    this.b.setAutoResizeMode(2);
    this.b.getColumnModel().getColumn(0).setCellRenderer(new tc(this));
    cd localcd = new cd(this.b, 20, 30);
    localcd.getViewport().setBackground(Color.white);
    localJPanel.add(localcd);
    TableColumn localTableColumn = this.b.getColumnModel().getColumn(0);
    localTableColumn.setPreferredWidth(150);
    ListSelectionModel localListSelectionModel = this.b.getSelectionModel();
    this.c.addTableModelListener(new rb(this, null));
    localListSelectionModel.addListSelectionListener(new zb(this, null));
    ActionMap localActionMap = this.b.getActionMap();
    InputMap localInputMap = this.b.getInputMap();
    localActionMap.put("closeActionKey", this.i);
    localInputMap.put(KeyStroke.getKeyStroke(27, 0), "closeActionKey");
    localActionMap.put("closeActionKey", this.i);
    localInputMap.put(KeyStroke.getKeyStroke(10, 0), "closeActionKey");
    add(localJPanel, "Center");
  }

  private void a(e parame)
  {
    co localco = (co)parame;
    this.c.addRow(new Object[] { localco, localco.c() });
  }

  private void b()
  {
    List localList = this.j.m();
    for (int m = 0; m < localList.size(); m++)
      a((e)localList.get(m));
  }

  private void c()
  {
    this.d = new w(ct.a(542));
    this.d.addActionListener(new oc(this, null));
    this.e = new w(ct.a(677));
    this.e.addActionListener(new rc(this, null));
    this.g = new w(ct.a(678));
    this.g.addActionListener(new qc(this, null));
    this.h = new w(ct.a(679));
    this.h.addActionListener(new pc(this, null));
    this.f = new w(ct.a(329));
    this.f.addActionListener(this.i);
    JPanel localJPanel = new JPanel(new GridLayout(1, 5, 4, 7));
    localJPanel.add(this.d);
    localJPanel.add(this.e);
    localJPanel.add(this.g);
    localJPanel.add(this.h);
    localJPanel.add(this.f);
    add(localJPanel, "South");
  }

  private void d()
  {
    boolean bool1 = this.b.getRowCount() > 0;
    boolean bool2 = false;
    ListSelectionModel localListSelectionModel = this.b.getSelectionModel();
    if (!localListSelectionModel.isSelectionEmpty())
    {
      int m = localListSelectionModel.getMinSelectionIndex();
      if (this.b.getValueAt(m, 0) != null)
        bool2 = true;
    }
    this.h.setEnabled(bool1);
    this.g.setEnabled(bool2);
    this.d.setEnabled(bool2);
    this.e.setEnabled(bool2);
  }

  private void e()
  {
    int m = this.b.getSelectedRow();
    if (m != -1)
    {
      co localco = (co)this.b.getValueAt(m, 0);
      this.j.b(localco);
    }
    d();
  }

  private void a(boolean paramBoolean)
  {
    int m = this.b.getSelectedRow();
    if (m == -1)
      return;
    Object localObject = this.b.getValueAt(m, 0);
    if (localObject != null)
    {
      co localco = (co)localObject;
      JDialog localJDialog = this.k.c();
      JTextComponent localJTextComponent = this.k.a().e();
      Exception localException1 = 0;
      if (localJDialog.isShowing())
        localException1 = (int)localJDialog.getLocationOnScreen().getY();
      if (!paramBoolean)
      {
        int n = localJTextComponent.getFontMetrics(localJTextComponent.getFont()).getHeight();
        Point localPoint = localJTextComponent.getLocationOnScreen();
        Rectangle localRectangle1 = new Rectangle((int)localPoint.getX(), (int)localPoint.getY() + n * localco.b(), localJTextComponent.getWidth(), n);
        Rectangle localRectangle2 = new Rectangle(localJDialog.getLocationOnScreen(), new Dimension(localJDialog.getWidth(), localJDialog.getHeight()));
        Rectangle localRectangle3 = localRectangle1.intersection(localRectangle2);
        if (!localRectangle3.isEmpty())
        {
          int i2 = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
          Exception localException4 = (int)localJDialog.getLocationOnScreen().getY();
          localException1 = i2 / 2 > localException4 ? (int)localRectangle1.getY() + n + 3 : (int)localRectangle1.getY() - localJDialog.getHeight() - 3;
          if ((localException1 > i2) || (localException1 < 0))
            localException1 = localException4;
        }
      }
      boolean bool;
      try
      {
        bool = this.k.a().a(localco.j(), null, -1);
      }
      catch (Exception localException2)
      {
        bool = false;
        int i1 = ba.a(localJDialog, ct.a(861), ct.a(94), 0, 0);
        if (i1 == 0)
          e();
      }
      localException2 = localException1;
      if (bool)
      {
        try
        {
          SwingUtilities.invokeLater(new z(this, localco, paramBoolean, localJDialog, localException2));
        }
        catch (Exception localException3)
        {
          cl.a(localException3);
        }
        SwingUtilities.invokeLater(new bb(this));
      }
    }
  }

  public void f()
  {
    if (this.b.isEditing())
      this.b.getCellEditor().stopCellEditing();
  }

  static ac a(sc paramsc)
  {
    return paramsc.k;
  }

  static JTable b(sc paramsc)
  {
    return paramsc.b;
  }

  static m c(sc paramsc)
  {
    return paramsc.j;
  }

  static void a(sc paramsc, boolean paramBoolean)
  {
    paramsc.a(paramBoolean);
  }

  static void d(sc paramsc)
  {
    paramsc.d();
  }

  static DefaultTableModel e(sc paramsc)
  {
    return paramsc.c;
  }

  static void f(sc paramsc)
  {
    paramsc.e();
  }

  static void a(sc paramsc, e parame)
  {
    paramsc.a(parame);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.sc
 * JD-Core Version:    0.6.0
 */
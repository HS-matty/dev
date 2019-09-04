package com.zend.ide.f;

import com.zend.ide.b.m;
import com.zend.ide.i.n;
import com.zend.ide.j.h;
import com.zend.ide.j.y;
import com.zend.ide.m.r;
import com.zend.ide.p.cd;
import com.zend.ide.p.d.bp;
import com.zend.ide.p.x;
import com.zend.ide.util.bb;
import com.zend.ide.util.bn;
import com.zend.ide.util.bs;
import com.zend.ide.util.bt;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.y.b;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.File;
import java.util.Vector;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JViewport;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class da extends n
  implements bn, cu
{
  private JTable c;
  private x d;
  private s e;
  private g f;
  private bp g;
  private cw h;
  private cx i;
  private boolean j = true;
  private y k;
  private File[] l;
  private bb m;
  private String n = "includeFilesManager";
  private bt o;

  public da(JFrame paramJFrame, s params, g paramg)
  {
    super(paramJFrame, ct.a(7), true);
    this.e = params;
    this.f = paramg;
    this.h = new cw(this);
    this.i = new cx(this);
    e();
    h();
    addWindowListener(new d(this));
    this.m = new ck(this);
    ((ck)this.m).b();
    this.o = new bt(this);
    this.o.a(this.c);
  }

  private void e()
  {
    getContentPane().setLayout(new BorderLayout());
    Dimension localDimension = new Dimension(120, 24);
    JPanel localJPanel1 = new JPanel(new BorderLayout());
    localJPanel1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    JPanel localJPanel2 = new JPanel(new BorderLayout(3, 3));
    JTextArea localJTextArea = new JTextArea(ct.a(4), 2, 1);
    localJTextArea.setBackground(localJPanel2.getBackground());
    localJTextArea.setBorder(BorderFactory.createEmptyBorder());
    localJTextArea.setDisabledTextColor(Color.black);
    localJTextArea.setEnabled(false);
    this.c = new JTable();
    this.c.getTableHeader().setReorderingAllowed(false);
    this.c.addMouseListener(new c(this, null));
    localJTextArea.setFont(this.c.getFont());
    Vector localVector = new Vector();
    localVector.add(ct.a(1));
    localVector.add(ct.a(0));
    df localdf = new df(this, new Vector(), localVector);
    this.c.setModel(localdf);
    this.c.setPreferredScrollableViewportSize(new Dimension(400, 100));
    this.c.getSelectionModel().setSelectionMode(0);
    this.c.getColumnModel().getColumn(0).setCellRenderer(new dm());
    this.c.setGridColor(Color.GRAY);
    this.c.setAutoResizeMode(1);
    cd localcd = new cd(this.c, 20, 30);
    localcd.getViewport().setBackground(Color.white);
    localJPanel2.add(localJTextArea, "North");
    localJPanel2.add(localcd, "Center");
    JPanel localJPanel3 = new JPanel(new BorderLayout());
    JPanel localJPanel4 = new JPanel(new FlowLayout(0));
    this.d = new x(ct.b(5), !this.j);
    this.d.setFocusPainted(false);
    localJPanel4.add(this.d);
    JPanel localJPanel5 = new JPanel(new FlowLayout(2));
    JButton localJButton = new JButton(ct.a(6));
    localJButton.setPreferredSize(localDimension);
    localJButton.addActionListener(this.h);
    localJPanel5.add(localJButton);
    localJPanel3.add(localJPanel4, "Center");
    localJPanel3.add(localJPanel5, "South");
    localJPanel1.add(localJPanel2, "Center");
    localJPanel1.add(localJPanel3, "South");
    getContentPane().add(localJPanel1, "Center");
    pack();
    B();
  }

  public bs t()
  {
    return this.o;
  }

  public Object s()
  {
    return null;
  }

  public void c(Object paramObject)
  {
  }

  public bb q()
  {
    return this.m;
  }

  public JComponent c()
  {
    return this.c;
  }

  public void d(String paramString)
  {
    this.n = paramString;
  }

  public String a(int paramInt1, int paramInt2)
  {
    return r();
  }

  public String r()
  {
    return this.n;
  }

  public boolean d(boolean paramBoolean)
  {
    return this.o.d(paramBoolean);
  }

  public void a(bn parambn)
  {
    this.m.a(parambn.q());
  }

  private bp f()
  {
    if (this.g == null)
      this.g = new bp(false);
    return this.g;
  }

  private void h()
  {
    JComponent localJComponent = (JComponent)getContentPane();
    ActionMap localActionMap1 = localJComponent.getActionMap();
    ActionMap localActionMap2 = this.c.getActionMap();
    InputMap localInputMap1 = localJComponent.getInputMap(1);
    InputMap localInputMap2 = this.c.getInputMap();
    localActionMap1.put("CloseAction", this.h);
    localActionMap2.put("CloseAction", this.h);
    localInputMap1.put(KeyStroke.getKeyStroke(27, 0), "CloseAction");
    localInputMap2.put(KeyStroke.getKeyStroke(27, 0), "CloseAction");
    localActionMap2.put("EnterAction", this.i);
    localInputMap2.put(KeyStroke.getKeyStroke(10, 0), "EnterAction");
  }

  private void i()
  {
    String str = j();
    if ((str == null) || (str.trim().length() == 0))
      return;
    File localFile = h.m.g(str);
    f().setApproveButtonText(ct.a(8));
    f().setFileSelectionMode(2);
    f().setDialogTitle(ct.a(9) + localFile.getAbsolutePath());
    try
    {
      f().setSelectedFile(localFile);
    }
    catch (Exception localException)
    {
    }
    int i1 = f().showOpenDialog(this);
    if (i1 == 0)
    {
      this.k.a(f().getSelectedFile());
      m();
    }
  }

  private String j()
  {
    int i1 = this.c.getSelectedRow();
    if (i1 == -1)
      return null;
    String str1 = ((r)this.c.getValueAt(i1, 0)).f().c();
    String str2 = (String)this.c.getValueAt(i1, 1);
    try
    {
      if (h.m.g(str2).isAbsolute())
        return str2;
      File localFile = h.m.g(str1);
      return h.m.g(localFile.getParent() + File.separatorChar + str2.trim()).getCanonicalPath();
    }
    catch (Exception localException)
    {
    }
    return str1;
  }

  private String k()
  {
    int i1 = this.c.getSelectedRow();
    if (i1 == -1)
      return null;
    String str = ((r)this.c.getValueAt(i1, 0)).f().c();
    return str;
  }

  private int l()
  {
    int i1 = this.c.getSelectedRow();
    if (i1 == -1)
      return -1;
    int i2 = ((r)this.c.getValueAt(i1, 0)).f().b();
    return i2;
  }

  public boolean a(y paramy)
  {
    if (isVisible())
      return true;
    this.k = paramy;
    return m();
  }

  public boolean a(y paramy, File[] paramArrayOfFile)
  {
    if (isVisible())
      return true;
    n();
    this.k = paramy;
    this.l = paramArrayOfFile;
    return m();
  }

  private boolean m()
  {
    DefaultTableModel localDefaultTableModel = (DefaultTableModel)this.c.getModel();
    int i1 = localDefaultTableModel.getRowCount();
    for (int i2 = i1 - 1; i2 >= 0; i2--)
      localDefaultTableModel.removeRow(i2);
    r[] arrayOfr = this.e.a(this.k, this.l);
    if ((arrayOfr == null) || (arrayOfr.length == 0))
    {
      dispose();
      return false;
    }
    for (int i3 = 0; i3 < arrayOfr.length; i3++)
      localDefaultTableModel.addRow(new Object[] { arrayOfr[i3], arrayOfr[i3].a() });
    this.d.setSelected(!((Boolean)b.a("application.showListDialog").c()).booleanValue());
    setVisible(true);
    return true;
  }

  private void n()
  {
    this.c.getColumnModel().getColumn(0).setPreferredWidth(250);
    this.c.getColumnModel().getColumn(1).setPreferredWidth(200);
    pack();
  }

  static JTable a(da paramda)
  {
    return paramda.c;
  }

  static x b(da paramda)
  {
    return paramda.d;
  }

  static void c(da paramda)
  {
    paramda.i();
  }

  static String d(da paramda)
  {
    return paramda.k();
  }

  static int e(da paramda)
  {
    return paramda.l();
  }

  static g f(da paramda)
  {
    return paramda.f;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.da
 * JD-Core Version:    0.6.0
 */
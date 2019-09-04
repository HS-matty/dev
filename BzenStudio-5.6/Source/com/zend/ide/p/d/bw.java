package com.zend.ide.p.d;

import com.zend.ide.j.h;
import com.zend.ide.util.bh;
import com.zend.ide.util.ct;
import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.FocusListener;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.Date;
import java.util.Locale;
import javax.accessibility.AccessibleContext;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ListSelectionModel;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileSystemView;
import javax.swing.filechooser.FileView;
import javax.swing.plaf.ActionMapUIResource;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicDirectoryModel;
import javax.swing.plaf.basic.BasicFileChooserUI;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import sun.awt.shell.ShellFolder;

public class bw extends BasicFileChooserUI
{
  private JPanel a;
  private com.zend.ide.p.z b;
  private JComboBox c;
  private v d;
  private Action e = new u(this);
  private Action f = new bx(this);
  private JTextField h;
  private w g;
  private bq i;
  private bq j;
  private bq k;
  private JPanel l;
  protected JComboBox m;
  protected JPanel n;
  private JToggleButton o;
  private JToggleButton p;
  private JPanel q;
  private JPanel r;
  private JPanel s;
  private FocusListener t = new b(this);
  private ListSelectionModel u;
  private JList v;
  private JTable w;
  private JButton x;
  private JButton y;
  private JPanel z;
  private JPanel A;
  private JComboBox B;
  private static final Dimension C = new Dimension(5, 1);
  private static final Dimension D = new Dimension(11, 1);
  private static final Dimension E = new Dimension(1, 5);
  private static final Dimension F = new Dimension(1, 10);
  private static final Dimension G = new Dimension(1, 15);
  private static final Insets H = new Insets(0, 0, 0, 0);
  private static int I = 500;
  private static int J = 326;
  private static Dimension K = new Dimension(I, J);
  private static int L = 500;
  private static int M = 326;
  private static Dimension N = new Dimension(L, M);
  private static int O = 405;
  private static int P = 135;
  private static Dimension Q = new Dimension(O, P);
  private int[] R = { 150, 75, 130, 130, 40 };
  private int S = 0;
  private String T = null;
  private String U = null;
  private int V = 0;
  private String W = null;
  private int X = 0;
  private String Y = null;
  private String Z = null;
  private String ba = null;
  private String bb = null;
  private String bc = null;
  private String bd = null;
  private String be = null;
  private String bf = null;
  private String bg = null;
  private String bh = null;
  private String bi = null;
  private String bj = null;
  private String bk = null;
  private String bl = null;
  private String bm = null;
  private String bn = null;
  private FileView bo = null;
  private i ab;
  int bp = -1;
  boolean bq = false;
  int br = 20;
  JTextField bs = null;
  private BasicDirectoryModel bt = null;
  private Action by = new be(this);
  boolean bz;

  public static ComponentUI createUI(JComponent paramJComponent)
  {
    return new bw((JFileChooser)paramJComponent);
  }

  public bw(JFileChooser paramJFileChooser)
  {
    super(paramJFileChooser);
  }

  public void installUI(JComponent paramJComponent)
  {
    super.installUI(paramJComponent);
    this.bo = null;
    JFileChooser localJFileChooser = (JFileChooser)paramJComponent;
    if ((localJFileChooser.getFileSystemView() instanceof bg))
      this.bo = new bm((bg)localJFileChooser.getFileSystemView());
    this.ab = new i(this, null);
    h.m.a(this.ab);
  }

  public void uninstallComponents(JFileChooser paramJFileChooser)
  {
    paramJFileChooser.removeAll();
    this.A = null;
    this.z = null;
  }

  public void installComponents(JFileChooser paramJFileChooser)
  {
    FileSystemView localFileSystemView = paramJFileChooser.getFileSystemView();
    paramJFileChooser.setBorder(new EmptyBorder(12, 12, 11, 11));
    paramJFileChooser.setLayout(new BorderLayout(0, 11));
    JPanel localJPanel1 = new JPanel(new BorderLayout(11, 0));
    JPanel localJPanel2 = new JPanel();
    localJPanel2.setLayout(new BoxLayout(localJPanel2, 2));
    localJPanel1.add(localJPanel2, "After");
    paramJFileChooser.add(localJPanel1, "North");
    this.b = new com.zend.ide.p.z(this.T);
    this.b.setDisplayedMnemonic(this.S);
    localJPanel1.add(this.b, "Before");
    this.c = new JComboBox();
    this.c.putClientProperty("JComboBox.lightweightKeyboardNavigation", "Lightweight");
    this.b.setLabelFor(this.c);
    this.d = i(paramJFileChooser);
    this.c.setModel(this.d);
    this.c.addActionListener(this.e);
    this.c.setRenderer(h(paramJFileChooser));
    this.c.setAlignmentX(0.0F);
    this.c.setAlignmentY(0.0F);
    this.c.setMaximumRowCount(8);
    localJPanel1.add(this.c, "Center");
    JButton localJButton1 = new JButton(getChangeToParentDirectoryAction());
    localJButton1.setText(null);
    localJButton1.setIcon(this.upFolderIcon);
    localJButton1.setToolTipText(this.Z);
    localJButton1.getAccessibleContext().setAccessibleName(this.ba);
    localJButton1.setAlignmentX(0.0F);
    localJButton1.setAlignmentY(0.5F);
    localJButton1.setMargin(H);
    localJPanel2.add(localJButton1);
    localJPanel2.add(Box.createRigidArea(C));
    File localFile = localFileSystemView.getHomeDirectory();
    String str = this.bb;
    if (localFileSystemView.isRoot(localFile))
      str = getFileView(paramJFileChooser).getName(localFile);
    JButton localJButton2 = new JButton(this.homeFolderIcon);
    localJButton2.setToolTipText(str);
    localJButton2.getAccessibleContext().setAccessibleName(this.bc);
    localJButton2.setAlignmentX(0.0F);
    localJButton2.setAlignmentY(0.5F);
    localJButton2.setMargin(H);
    localJButton2.addActionListener(getGoHomeAction());
    localJPanel2.add(localJButton2);
    localJPanel2.add(Box.createRigidArea(C));
    localJButton2 = new JButton(getNewFolderAction());
    localJButton2.setText(null);
    localJButton2.setIcon(this.newFolderIcon);
    localJButton2.setToolTipText(this.bd);
    localJButton2.getAccessibleContext().setAccessibleName(this.be);
    localJButton2.setAlignmentX(0.0F);
    localJButton2.setAlignmentY(0.5F);
    localJButton2.setMargin(H);
    localJPanel2.add(localJButton2);
    localJPanel2.add(Box.createRigidArea(C));
    ButtonGroup localButtonGroup = new ButtonGroup();
    j localj = new j(this, paramJFileChooser);
    this.o = new JToggleButton(this.listViewIcon);
    this.o.setToolTipText(this.bf);
    this.o.getAccessibleContext().setAccessibleName(this.bg);
    this.o.setSelected(true);
    this.o.setAlignmentX(0.0F);
    this.o.setAlignmentY(0.5F);
    this.o.setMargin(H);
    this.o.addActionListener(localj);
    localJPanel2.add(this.o);
    localButtonGroup.add(this.o);
    this.p = new JToggleButton(this.detailsViewIcon);
    this.p.setToolTipText(this.bh);
    this.p.getAccessibleContext().setAccessibleName(this.bi);
    this.p.setAlignmentX(0.0F);
    this.p.setAlignmentY(0.5F);
    this.p.setMargin(H);
    this.p.addActionListener(localj);
    localJPanel2.add(this.p);
    localButtonGroup.add(this.p);
    this.a = new JPanel(new BorderLayout());
    this.q = f(paramJFileChooser);
    this.u = this.v.getSelectionModel();
    this.q.setPreferredSize(Q);
    this.a.add(this.q, "Center");
    this.s = this.q;
    this.a.add(getAccessoryPanel(), "After");
    JComponent localJComponent = paramJFileChooser.getAccessory();
    if (localJComponent != null)
      getAccessoryPanel().add(localJComponent);
    paramJFileChooser.add(this.a, "Center");
    JPanel localJPanel3 = b();
    localJPanel3.setLayout(new BorderLayout(10, 0));
    paramJFileChooser.add(localJPanel3, "South");
    a(paramJFileChooser);
    localJPanel3.add(this.l, "Center");
    e(paramJFileChooser);
    a(new bq[] { this.i, this.j, this.k });
  }

  protected JPanel a(JFileChooser paramJFileChooser)
  {
    this.l = new JPanel();
    this.l.setLayout(new BoxLayout(this.l, 1));
    this.l.add(d(paramJFileChooser));
    this.l.add(Box.createRigidArea(G));
    this.l.add(c(paramJFileChooser));
    this.l.add(Box.createRigidArea(G));
    this.n = b(paramJFileChooser);
    l(null);
    return this.l;
  }

  protected JPanel b(JFileChooser paramJFileChooser)
  {
    JPanel localJPanel = new JPanel();
    localJPanel.setLayout(new BoxLayout(localJPanel, 2));
    this.k = new bq(this, ct.a(1583));
    this.k.setDisplayedMnemonic('e');
    localJPanel.add(this.k);
    this.m = new JComboBox(bh.d());
    this.m.putClientProperty("JComboBox.lightweightKeyboardNavigation", "Lightweight");
    this.k.setLabelFor(this.m);
    localJPanel.add(this.m);
    this.m.addFocusListener(new c(this));
    return localJPanel;
  }

  public bh a()
  {
    bh localbh = (bh)this.m.getSelectedItem();
    return localbh;
  }

  public void a(bh parambh)
  {
    this.m.setSelectedItem(parambh);
    if (!this.m.getSelectedItem().equals(parambh))
    {
      this.m.addItem(parambh);
      this.m.setSelectedItem(parambh);
    }
  }

  protected JPanel c(JFileChooser paramJFileChooser)
  {
    JPanel localJPanel = new JPanel();
    localJPanel.setLayout(new BoxLayout(localJPanel, 2));
    this.j = new bq(this, this.Y);
    this.j.setDisplayedMnemonic(this.X);
    localJPanel.add(this.j);
    this.B = new cb(this);
    this.g = ((w)this.B.getModel());
    paramJFileChooser.addPropertyChangeListener(this.g);
    this.j.setLabelFor(this.B);
    localJPanel.add(this.B);
    return localJPanel;
  }

  protected JPanel d(JFileChooser paramJFileChooser)
  {
    JPanel localJPanel = new JPanel();
    localJPanel.setLayout(new BoxLayout(localJPanel, 2));
    this.i = new bq(this, this.W);
    this.i.setDisplayedMnemonic(this.V);
    localJPanel.add(this.i);
    this.h = new bu(this);
    localJPanel.add(this.h);
    this.i.setLabelFor(this.h);
    this.h.addFocusListener(new d(this));
    if (paramJFileChooser.isMultiSelectionEnabled())
      setFileName(a(paramJFileChooser.getSelectedFiles()));
    else
      setFileName(a(paramJFileChooser.getSelectedFile()));
    return localJPanel;
  }

  protected JPanel e(JFileChooser paramJFileChooser)
  {
    JPanel localJPanel = o();
    localJPanel.setLayout(new BoxLayout(o(), 1));
    this.x = new bn(this, getApproveButtonText(paramJFileChooser));
    this.x.addActionListener(getApproveSelectionAction());
    this.x.setToolTipText(getApproveButtonToolTipText(paramJFileChooser));
    localJPanel.add(this.x);
    localJPanel.add(Box.createRigidArea(F));
    this.y = new bo(this, this.cancelButtonText);
    this.y.setToolTipText(this.cancelButtonToolTipText);
    this.y.addActionListener(getCancelSelectionAction());
    localJPanel.add(this.y);
    if (paramJFileChooser.getControlButtonsAreShown())
      i();
    return localJPanel;
  }

  public FileView getFileView(JFileChooser paramJFileChooser)
  {
    if (this.bo != null)
      return this.bo;
    return super.getFileView(paramJFileChooser);
  }

  protected JPanel o()
  {
    if (this.z == null)
      this.z = new JPanel();
    return this.z;
  }

  protected JPanel b()
  {
    if (this.A == null)
      this.A = new JPanel();
    return this.A;
  }

  protected void installStrings(JFileChooser paramJFileChooser)
  {
    super.installStrings(paramJFileChooser);
    Locale localLocale = paramJFileChooser.getLocale();
    this.S = UIManager.getInt("FileChooser.lookInLabelMnemonic");
    this.T = UIManager.getString("FileChooser.lookInLabelText", localLocale);
    this.U = UIManager.getString("FileChooser.saveInLabelText", localLocale);
    this.V = UIManager.getInt("FileChooser.fileNameLabelMnemonic");
    this.W = UIManager.getString("FileChooser.fileNameLabelText", localLocale);
    this.X = UIManager.getInt("FileChooser.filesOfTypeLabelMnemonic");
    this.Y = UIManager.getString("FileChooser.filesOfTypeLabelText", localLocale);
    this.Z = UIManager.getString("FileChooser.upFolderToolTipText", localLocale);
    this.ba = UIManager.getString("FileChooser.upFolderAccessibleName", localLocale);
    this.bb = UIManager.getString("FileChooser.homeFolderToolTipText", localLocale);
    this.bc = UIManager.getString("FileChooser.homeFolderAccessibleName", localLocale);
    this.bd = UIManager.getString("FileChooser.newFolderToolTipText", localLocale);
    this.be = UIManager.getString("FileChooser.newFolderAccessibleName", localLocale);
    this.bf = UIManager.getString("FileChooser.listViewButtonToolTipText", localLocale);
    this.bg = UIManager.getString("FileChooser.listViewButtonAccessibleName", localLocale);
    this.bh = UIManager.getString("FileChooser.detailsViewButtonToolTipText", localLocale);
    this.bi = UIManager.getString("FileChooser.detailsViewButtonAccessibleName", localLocale);
    this.bj = UIManager.getString("FileChooser.fileNameHeaderText", localLocale);
    this.bk = UIManager.getString("FileChooser.fileSizeHeaderText", localLocale);
    this.bl = UIManager.getString("FileChooser.fileTypeHeaderText", localLocale);
    this.bm = UIManager.getString("FileChooser.fileDateHeaderText", localLocale);
    this.bn = UIManager.getString("FileChooser.fileAttrHeaderText", localLocale);
  }

  protected void installListeners(JFileChooser paramJFileChooser)
  {
    super.installListeners(paramJFileChooser);
    ActionMap localActionMap = getActionMap();
    SwingUtilities.replaceUIActionMap(paramJFileChooser, localActionMap);
  }

  protected ActionMap getActionMap()
  {
    return createActionMap();
  }

  protected ActionMap createActionMap()
  {
    t localt = new t(this);
    ActionMapUIResource localActionMapUIResource = new ActionMapUIResource();
    localActionMapUIResource.put("approveSelection", getApproveSelectionAction());
    localActionMapUIResource.put("cancelSelection", localt);
    localActionMapUIResource.put("Go Up", getChangeToParentDirectoryAction());
    return localActionMapUIResource;
  }

  protected JPanel f(JFileChooser paramJFileChooser)
  {
    JPanel localJPanel = new JPanel(new BorderLayout());
    JFileChooser localJFileChooser = paramJFileChooser;
    this.v = new bs(this, localJFileChooser);
    this.v.setCellRenderer(new z(this));
    this.v.setLayoutOrientation(1);
    this.v.setVisibleRowCount(-1);
    if (paramJFileChooser.isMultiSelectionEnabled())
      this.v.setSelectionMode(2);
    else
      this.v.setSelectionMode(0);
    this.v.setModel(getModel());
    this.v.addListSelectionListener(createListSelectionListener(paramJFileChooser));
    this.v.addMouseListener(createDoubleClickListener(paramJFileChooser, this.v));
    this.v.addMouseListener(a(paramJFileChooser, this.v));
    getModel().addListDataListener(new l(this));
    JScrollPane localJScrollPane = new JScrollPane(this.v);
    localJPanel.add(localJScrollPane, "Center");
    return localJPanel;
  }

  protected JPanel g(JFileChooser paramJFileChooser)
  {
    JFileChooser localJFileChooser = paramJFileChooser;
    JPanel localJPanel = new JPanel(new BorderLayout());
    bz localbz = new bz(this, localJFileChooser);
    this.w = new bt(this, localbz, localJFileChooser);
    this.w.setComponentOrientation(localJFileChooser.getComponentOrientation());
    this.w.setAutoResizeMode(0);
    this.w.setShowGrid(false);
    this.w.setSelectionModel(this.u);
    this.w.putClientProperty("JTable.autoStartsEdit", Boolean.FALSE);
    TableColumnModel localTableColumnModel = this.w.getColumnModel();
    TableColumn[] arrayOfTableColumn = new TableColumn[5];
    for (int i1 = 0; i1 < 5; i1++)
    {
      arrayOfTableColumn[i1] = localTableColumnModel.getColumn(i1);
      arrayOfTableColumn[i1].setPreferredWidth(this.R[i1]);
    }
    if (!System.getProperty("os.name").startsWith("Windows"))
    {
      localTableColumnModel.removeColumn(arrayOfTableColumn[2]);
      localTableColumnModel.removeColumn(arrayOfTableColumn[4]);
    }
    ca localca = new ca(this, localJFileChooser);
    this.w.setDefaultRenderer(File.class, localca);
    this.w.setDefaultRenderer(Date.class, localca);
    this.w.setDefaultRenderer(Object.class, localca);
    JTextField localJTextField = new JTextField();
    localJTextField.addFocusListener(this.t);
    arrayOfTableColumn[0].setCellEditor(new x(this, localJTextField, localJTextField, localJFileChooser));
    br localbr = new br(this, localbz.c);
    localbr.setSelectionModel(this.u);
    this.w.addMouseListener(createDoubleClickListener(localJFileChooser, localbr));
    JScrollPane localJScrollPane = new JScrollPane(this.w);
    localJScrollPane.setComponentOrientation(localJFileChooser.getComponentOrientation());
    LookAndFeel.installColors(localJScrollPane.getViewport(), "Table.background", "Table.foreground");
    localJScrollPane.addComponentListener(new a(this));
    localJPanel.add(localJScrollPane, "Center");
    return localJPanel;
  }

  private void a(int paramInt)
  {
    TableColumn localTableColumn = this.w.getColumnModel().getColumn(0);
    int i1 = this.w.getPreferredSize().width;
    if (i1 < paramInt)
      localTableColumn.setPreferredWidth(localTableColumn.getPreferredWidth() + paramInt - i1);
  }

  public ListSelectionListener createListSelectionListener(JFileChooser paramJFileChooser)
  {
    return new by(this);
  }

  private MouseListener a(JFileChooser paramJFileChooser, JList paramJList)
  {
    return new e(this, paramJList);
  }

  private int c()
  {
    return this.bp;
  }

  private void b(int paramInt)
  {
    this.bp = paramInt;
  }

  private void d()
  {
    this.bp = -1;
  }

  private void e()
  {
    if (this.bq)
    {
      this.bq = false;
      this.v.remove(this.bs);
      this.a.repaint();
    }
    else if ((this.w != null) && (this.w.isEditing()))
    {
      this.w.getCellEditor().cancelCellEditing();
    }
  }

  private void c(int paramInt)
  {
    d(paramInt);
    if (this.q.isVisible())
    {
      this.bq = true;
      Rectangle localRectangle = this.v.getCellBounds(paramInt, paramInt);
      if (this.bs == null)
      {
        this.bs = new JTextField();
        this.bs.addActionListener(new n(this));
        this.bs.addFocusListener(this.t);
        this.bs.setNextFocusableComponent(this.v);
      }
      this.v.add(this.bs);
      File localFile = (File)getModel().getElementAt(paramInt);
      this.bs.setText(getFileChooser().getName(localFile));
      if (this.v.getComponentOrientation().isLeftToRight())
        this.bs.setBounds(this.br + localRectangle.x, localRectangle.y, localRectangle.width - this.br, localRectangle.height);
      else
        this.bs.setBounds(localRectangle.x, localRectangle.y, localRectangle.width - this.br, localRectangle.height);
      this.bs.requestFocus();
      this.bs.selectAll();
    }
    else if (this.r.isVisible())
    {
      this.w.editCellAt(paramInt, 0);
    }
  }

  private void f()
  {
    if (this.bq)
    {
      JFileChooser localJFileChooser = getFileChooser();
      File localFile1 = null;
      if (isDirectorySelected())
        localFile1 = getDirectory();
      else
        localFile1 = localJFileChooser.getSelectedFile();
      if (localFile1 != null)
      {
        String str1 = localJFileChooser.getName(localFile1);
        String str2 = localFile1.getName();
        String str3 = this.bs.getText().trim();
        if (!str3.equals(str1))
        {
          String str4 = str3;
          int i1 = str2.length();
          int i2 = str1.length();
          if ((i1 > i2) && (str2.charAt(i2) == '.'))
            str4 = str3 + str2.substring(i2);
          FileSystemView localFileSystemView = localJFileChooser.getFileSystemView();
          File localFile2 = localFileSystemView.createFileObject(localFile1.getParentFile(), str4);
          if (localFile2.isDirectory())
            setDirectory(localFile2);
          if ((getModel().renameFile(localFile1, localFile2)) && (localFileSystemView.isParent(localJFileChooser.getCurrentDirectory(), localFile2)))
            SwingUtilities.invokeLater(new k(this, localJFileChooser, localFile2));
        }
      }
    }
    if ((this.w != null) && (this.w.isEditing()))
      this.w.getCellEditor().stopCellEditing();
    e();
  }

  public void uninstallUI(JComponent paramJComponent)
  {
    paramJComponent.removePropertyChangeListener(this.g);
    this.y.removeActionListener(getCancelSelectionAction());
    this.x.removeActionListener(getApproveSelectionAction());
    this.h.removeActionListener(getApproveSelectionAction());
    this.bo = null;
    super.uninstallUI(paramJComponent);
  }

  public Dimension getPreferredSize(JComponent paramJComponent)
  {
    int i1 = K.width;
    Dimension localDimension = paramJComponent.getLayout().preferredLayoutSize(paramJComponent);
    if (localDimension != null)
      return new Dimension(localDimension.width < i1 ? i1 : localDimension.width, localDimension.height < K.height ? K.height : localDimension.height);
    return new Dimension(i1, K.height);
  }

  public Dimension getMinimumSize(JComponent paramJComponent)
  {
    return N;
  }

  public Dimension getMaximumSize(JComponent paramJComponent)
  {
    return new Dimension(2147483647, 2147483647);
  }

  void g()
  {
    Object localObject1;
    Object localObject2;
    int i1;
    if ((getFileChooser().isMultiSelectionEnabled()) && (!isDirectorySelected()))
    {
      localObject1 = getFileChooser().getSelectedFiles();
      localObject2 = this.v.getSelectedValues();
      if ((localObject1.length == 1) && (localObject2.length == 1) && (localObject1[0].equals(localObject2[0])))
      {
        ensureFileIsVisible(getFileChooser(), localObject1[0]);
        return;
      }
      int i2;
      int i3;
      for (i1 = 0; i1 < localObject2.length; i1++)
      {
        i2 = 0;
        for (i3 = 0; i3 < localObject1.length; i3++)
        {
          if (!localObject1[i3].equals(localObject2[i1]))
            continue;
          i2 = 1;
          break;
        }
        if (i2 != 0)
          continue;
        i3 = getModel().indexOf(localObject2[i1]);
        if (i3 < 0)
          continue;
        this.u.removeSelectionInterval(i3, i3);
      }
      for (i1 = 0; i1 < localObject1.length; i1++)
      {
        i2 = 0;
        for (i3 = 0; i3 < localObject2.length; i3++)
        {
          if (!localObject1[i1].equals(localObject2[i3]))
            continue;
          i2 = 1;
          break;
        }
        if (i2 != 0)
          continue;
        i3 = getModel().indexOf(localObject1[i1]);
        if (i3 < 0)
          continue;
        this.u.addSelectionInterval(i3, i3);
      }
    }
    else
    {
      localObject1 = getFileChooser();
      localObject2 = null;
      if (isDirectorySelected())
        localObject2 = getDirectory();
      else
        localObject2 = ((JFileChooser)localObject1).getSelectedFile();
      if ((localObject2 != null) && ((i1 = getModel().indexOf(localObject2)) >= 0))
      {
        this.u.setSelectionInterval(i1, i1);
        d(i1);
      }
      else
      {
        this.u.clearSelection();
      }
    }
  }

  private String a(File paramFile)
  {
    if (paramFile == null)
      return null;
    JFileChooser localJFileChooser = getFileChooser();
    if (((localJFileChooser.isDirectorySelectionEnabled()) && (!localJFileChooser.isFileSelectionEnabled())) || (h.m.m(paramFile)))
      return paramFile.getPath();
    return paramFile.getName();
  }

  private String a(File[] paramArrayOfFile)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i1 = 0; (paramArrayOfFile != null) && (i1 < paramArrayOfFile.length); i1++)
    {
      if (i1 > 0)
        localStringBuffer.append(" ");
      if (paramArrayOfFile.length > 1)
        localStringBuffer.append("\"");
      localStringBuffer.append(a(paramArrayOfFile[i1]));
      if (paramArrayOfFile.length <= 1)
        continue;
      localStringBuffer.append("\"");
    }
    return localStringBuffer.toString();
  }

  private void a(PropertyChangeEvent paramPropertyChangeEvent)
  {
    f();
    File localFile = (File)paramPropertyChangeEvent.getNewValue();
    JFileChooser localJFileChooser = getFileChooser();
    if ((localFile != null) && (((localJFileChooser.isFileSelectionEnabled()) && (!localFile.isDirectory())) || ((localFile.isDirectory()) && (localJFileChooser.isDirectorySelectionEnabled()))))
      setFileName(a(localFile));
    g();
  }

  private void b(PropertyChangeEvent paramPropertyChangeEvent)
  {
    f();
    File[] arrayOfFile = (File[])(File[])paramPropertyChangeEvent.getNewValue();
    JFileChooser localJFileChooser = getFileChooser();
    if ((arrayOfFile != null) && (arrayOfFile.length > 0) && ((arrayOfFile.length > 1) || (localJFileChooser.isDirectorySelectionEnabled()) || (!arrayOfFile[0].isDirectory())))
      setFileName(a(arrayOfFile));
    g();
  }

  private void c(PropertyChangeEvent paramPropertyChangeEvent)
  {
    JFileChooser localJFileChooser = getFileChooser();
    FileSystemView localFileSystemView = localJFileChooser.getFileSystemView();
    f();
    d();
    clearIconCache();
    this.u.clearSelection();
    d(0);
    File localFile = localJFileChooser.getCurrentDirectory();
    if (localFile != null)
    {
      v.a(this.d, localFile);
      getNewFolderAction().setEnabled((localFileSystemView.isFileSystem(localFile)) && (localFile.canWrite()));
      File[] arrayOfFile = (File[])(File[])ShellFolder.get("roots");
      boolean bool = false;
      for (int i1 = 0; (i1 < arrayOfFile.length) && (!bool); i1++)
        bool = arrayOfFile[i1].equals(localFile);
      getChangeToParentDirectoryAction().setEnabled(!bool);
      if ((localJFileChooser.isDirectorySelectionEnabled()) && (!localJFileChooser.isFileSelectionEnabled()) && (localFileSystemView.isFileSystem(localFile)))
        setFileName(localFile.getPath());
    }
  }

  private void d(PropertyChangeEvent paramPropertyChangeEvent)
  {
    f();
    d();
    clearIconCache();
    this.u.clearSelection();
  }

  private void e(PropertyChangeEvent paramPropertyChangeEvent)
  {
    f();
    d();
    clearIconCache();
    this.u.clearSelection();
    JFileChooser localJFileChooser = getFileChooser();
    File localFile = localJFileChooser.getCurrentDirectory();
    if ((localFile != null) && (localJFileChooser.isDirectorySelectionEnabled()) && (!localJFileChooser.isFileSelectionEnabled()) && (localJFileChooser.getFileSystemView().isFileSystem(localFile)))
      setFileName(localFile.getPath());
    else
      setFileName(null);
  }

  private void f(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if (getFileChooser().isMultiSelectionEnabled())
    {
      this.u.setSelectionMode(2);
    }
    else
    {
      this.u.setSelectionMode(0);
      this.u.clearSelection();
      getFileChooser().setSelectedFiles(null);
    }
  }

  private void g(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if (getAccessoryPanel() != null)
    {
      if (paramPropertyChangeEvent.getOldValue() != null)
        getAccessoryPanel().remove((JComponent)paramPropertyChangeEvent.getOldValue());
      JComponent localJComponent = (JComponent)paramPropertyChangeEvent.getNewValue();
      if (localJComponent != null)
        getAccessoryPanel().add(localJComponent, "Center");
    }
  }

  private void h(PropertyChangeEvent paramPropertyChangeEvent)
  {
    JFileChooser localJFileChooser = getFileChooser();
    this.x.setText(getApproveButtonText(localJFileChooser));
    this.x.setToolTipText(getApproveButtonToolTipText(localJFileChooser));
  }

  private void i(PropertyChangeEvent paramPropertyChangeEvent)
  {
    JFileChooser localJFileChooser = getFileChooser();
    this.x.setText(getApproveButtonText(localJFileChooser));
    this.x.setToolTipText(getApproveButtonToolTipText(localJFileChooser));
    if (localJFileChooser.getDialogType() == 1)
      this.b.setText(this.U);
    else
      this.b.setText(this.T);
  }

  private void j(PropertyChangeEvent paramPropertyChangeEvent)
  {
  }

  private void k(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if (getFileChooser().getControlButtonsAreShown())
      i();
    else
      h();
  }

  private void l(PropertyChangeEvent paramPropertyChangeEvent)
  {
    if (((getFileChooser() instanceof bp)) && (((bp)getFileChooser()).d()))
      k();
    else
      j();
  }

  public PropertyChangeListener createPropertyChangeListener(JFileChooser paramJFileChooser)
  {
    return new m(this);
  }

  protected void h()
  {
    b().remove(o());
  }

  protected void i()
  {
    b().add(o(), "East");
  }

  protected void j()
  {
    this.l.remove(this.n);
  }

  protected void k()
  {
    this.l.add(this.n);
  }

  private void d(int paramInt)
  {
    if (paramInt >= 0)
    {
      this.v.ensureIndexIsVisible(paramInt);
      if (this.w != null)
        this.w.scrollRectToVisible(this.w.getCellRect(paramInt, 0, true));
    }
  }

  public void ensureFileIsVisible(JFileChooser paramJFileChooser, File paramFile)
  {
    d(getModel().indexOf(paramFile));
  }

  public void rescanCurrentDirectory(JFileChooser paramJFileChooser)
  {
    getModel().validateFileCache();
  }

  public String getFileName()
  {
    if (this.h != null)
      return this.h.getText();
    return null;
  }

  public void setFileName(String paramString)
  {
    if (this.h != null)
      this.h.setText(paramString);
  }

  protected void setDirectorySelected(boolean paramBoolean)
  {
    super.setDirectorySelected(paramBoolean);
    JFileChooser localJFileChooser = getFileChooser();
    if (paramBoolean)
    {
      this.x.setText(this.directoryOpenButtonText);
      this.x.setToolTipText(this.directoryOpenButtonToolTipText);
    }
    else
    {
      this.x.setText(getApproveButtonText(localJFileChooser));
      this.x.setToolTipText(getApproveButtonToolTipText(localJFileChooser));
    }
  }

  public String getDirectoryName()
  {
    return null;
  }

  public void setDirectoryName(String paramString)
  {
  }

  protected y h(JFileChooser paramJFileChooser)
  {
    return new y(this);
  }

  protected v i(JFileChooser paramJFileChooser)
  {
    return new v(this);
  }

  protected JButton getApproveButton(JFileChooser paramJFileChooser)
  {
    return this.x;
  }

  private static void a(bq[] paramArrayOfbq)
  {
    for (int i1 = 0; i1 < paramArrayOfbq.length; i1++)
      bq.a(paramArrayOfbq[i1], paramArrayOfbq);
  }

  public Action getApproveSelectionAction()
  {
    return this.f;
  }

  protected void createModel()
  {
    this.bt = new bv(this, getFileChooser());
  }

  public BasicDirectoryModel getModel()
  {
    return this.bt;
  }

  public Action getNewFolderAction()
  {
    return this.by;
  }

  static void a(bw parambw)
  {
    parambw.f();
  }

  static JComboBox a(bw parambw)
  {
    return parambw.c;
  }

  static JPanel d(bw parambw)
  {
    return parambw.s;
  }

  static JToggleButton b(bw parambw)
  {
    return parambw.p;
  }

  static JPanel e(bw parambw)
  {
    return parambw.r;
  }

  static JPanel b(bw parambw, JPanel paramJPanel)
  {
    return parambw.r = paramJPanel;
  }

  static Dimension a()
  {
    return Q;
  }

  static JPanel a(bw parambw, JPanel paramJPanel)
  {
    return parambw.s = paramJPanel;
  }

  static JPanel c(bw parambw)
  {
    return parambw.q;
  }

  static JPanel f(bw parambw)
  {
    return parambw.a;
  }

  static ListSelectionModel g(bw parambw)
  {
    return parambw.u;
  }

  static JTextField h(bw parambw)
  {
    return parambw.h;
  }

  static JButton i(bw parambw)
  {
    return parambw.x;
  }

  static JButton j(bw parambw)
  {
    return parambw.y;
  }

  static void k(bw parambw)
  {
    parambw.e();
  }

  static JList a(bw parambw)
  {
    return parambw.v;
  }

  static void a(bw parambw, int paramInt)
  {
    parambw.c(paramInt);
  }

  static String p(bw parambw)
  {
    return parambw.bj;
  }

  static String l(bw parambw)
  {
    return parambw.bk;
  }

  static String m(bw parambw)
  {
    return parambw.bl;
  }

  static String b(bw parambw)
  {
    return parambw.bm;
  }

  static String c(bw parambw)
  {
    return parambw.bn;
  }

  static JTable d(bw parambw)
  {
    return parambw.w;
  }

  static void b(bw parambw, int paramInt)
  {
    parambw.a(paramInt);
  }

  static void a(bw parambw, File paramFile)
  {
    parambw.setDirectory(paramFile);
  }

  static void b(bw parambw, File paramFile)
  {
    parambw.setDirectory(paramFile);
  }

  static int e(bw parambw)
  {
    return parambw.c();
  }

  static void c(bw parambw, int paramInt)
  {
    parambw.b(paramInt);
  }

  static void f(bw parambw)
  {
    parambw.d();
  }

  static void d(bw parambw, PropertyChangeEvent paramPropertyChangeEvent)
  {
    parambw.a(paramPropertyChangeEvent);
  }

  static void e(bw parambw, PropertyChangeEvent paramPropertyChangeEvent)
  {
    parambw.b(paramPropertyChangeEvent);
  }

  static void f(bw parambw, PropertyChangeEvent paramPropertyChangeEvent)
  {
    parambw.c(paramPropertyChangeEvent);
  }

  static void g(bw parambw, PropertyChangeEvent paramPropertyChangeEvent)
  {
    parambw.d(paramPropertyChangeEvent);
  }

  static void h(bw parambw, PropertyChangeEvent paramPropertyChangeEvent)
  {
    parambw.e(paramPropertyChangeEvent);
  }

  static void i(bw parambw, PropertyChangeEvent paramPropertyChangeEvent)
  {
    parambw.f(paramPropertyChangeEvent);
  }

  static void j(bw parambw, PropertyChangeEvent paramPropertyChangeEvent)
  {
    parambw.g(paramPropertyChangeEvent);
  }

  static void k(bw parambw, PropertyChangeEvent paramPropertyChangeEvent)
  {
    parambw.h(paramPropertyChangeEvent);
  }

  static void l(bw parambw, PropertyChangeEvent paramPropertyChangeEvent)
  {
    parambw.i(paramPropertyChangeEvent);
  }

  static void a(bw parambw, PropertyChangeEvent paramPropertyChangeEvent)
  {
    parambw.j(paramPropertyChangeEvent);
  }

  static void b(bw parambw, PropertyChangeEvent paramPropertyChangeEvent)
  {
    parambw.k(paramPropertyChangeEvent);
  }

  static void c(bw parambw, PropertyChangeEvent paramPropertyChangeEvent)
  {
    parambw.l(paramPropertyChangeEvent);
  }

  static v g(bw parambw)
  {
    return parambw.d;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bw
 * JD-Core Version:    0.6.0
 */
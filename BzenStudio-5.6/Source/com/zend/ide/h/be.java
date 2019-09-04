package com.zend.ide.h;

import com.zend.ide.j.t;
import com.zend.ide.j.u;
import com.zend.ide.util.bb;
import com.zend.ide.util.cl;
import com.zend.ide.util.cu;
import com.zend.ide.util.eo;
import com.zend.ide.util.es;
import java.awt.Cursor;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.filechooser.FileFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;
import sun.awt.shell.ShellFolder;

public class be extends eo
  implements e, ClipboardOwner, cu
{
  public static String j = "RefreshFolderAction";
  public static String k = "OpenFileAction";
  private HashMap l;
  private g m;
  protected u n;
  private FileFilter o;
  private com.zend.ide.p.d.bm p;
  protected PropertyChangeListener q = new d(this, null);
  protected com.zend.ide.y.e r;
  protected com.zend.ide.y.f v = new com.zend.ide.y.f();
  protected boolean w = true;
  protected Cursor t = new Cursor(3);
  protected int u = 0;

  public be(String paramString)
  {
    this(com.zend.ide.j.h.m);
    setName(paramString);
  }

  public be(u paramu)
  {
    super(paramu);
    this.n.a(this);
    setRootVisible(false);
    j();
  }

  protected void a(Object paramObject)
  {
    this.n = ((u)paramObject);
    setShowsRootHandles(true);
    this.l = new HashMap();
    this.m = new g();
    TreeSelectionModel localTreeSelectionModel = getSelectionModel();
    localTreeSelectionModel.setSelectionMode(4);
    this.p = new com.zend.ide.p.d.bm(new bd(this));
    super.a(paramObject);
    repaint();
  }

  public void a()
  {
    bg localbg = (bg)getLastSelectedPathComponent();
    if (localbg == null)
      return;
    String str = d(localbg);
    if (str.equals("root"))
      return;
    try
    {
      a(true);
      t.a(b(), true, this);
    }
    finally
    {
      a(false);
    }
  }

  public eo n()
  {
    return this;
  }

  public JComponent c()
  {
    return this;
  }

  public void j()
  {
    this.r = new com.zend.ide.y.e(this.v);
    this.v.a("desktop.showHiddenFiles", this.q);
    this.r.a("desktop.showHiddenFiles");
  }

  public u k()
  {
    return this.n;
  }

  protected Object[] a(Object[] paramArrayOfObject)
  {
    if ((this.o == null) || (paramArrayOfObject == null))
      return paramArrayOfObject;
    ArrayList localArrayList = new ArrayList(paramArrayOfObject.length);
    for (int i = 0; i < paramArrayOfObject.length; i++)
    {
      File localFile = (File)paramArrayOfObject[i];
      if (!this.o.accept(localFile))
        continue;
      localArrayList.add(localFile);
    }
    return localArrayList.toArray();
  }

  protected DefaultMutableTreeNode b(Object paramObject)
  {
    bj localbj = new bj(this, paramObject);
    return localbj;
  }

  protected KeyListener h()
  {
    return new a(this, null);
  }

  protected static Object[] b(Object[] paramArrayOfObject)
  {
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length == 0))
      return null;
    ArrayList localArrayList = new ArrayList(Arrays.asList(paramArrayOfObject));
    a(localArrayList);
    localArrayList.toArray(paramArrayOfObject);
    return paramArrayOfObject;
  }

  protected static void a(List paramList)
  {
    if (paramList == null)
      return;
    try
    {
      ShellFolder.sortFiles(paramList);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    ArrayList localArrayList1 = new ArrayList(paramList.size());
    ArrayList localArrayList2 = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      File localFile = (File)localIterator.next();
      boolean bool = com.zend.ide.p.d.bl.q.isTraversable(localFile).booleanValue();
      if (bool)
        localArrayList1.add(localFile);
      else
        localArrayList2.add(localFile);
    }
    paramList.clear();
    paramList.addAll(localArrayList1);
    paramList.addAll(localArrayList2);
  }

  protected es d(Object paramObject)
  {
    if (paramObject == null)
      throw new RuntimeException("Invalid userObject " + paramObject);
    File localFile = (File)paramObject;
    if (com.zend.ide.p.d.bl.q.isDrive(localFile))
      return new bi(this, localFile);
    return new bh(this, paramObject);
  }

  public String getToolTipText(MouseEvent paramMouseEvent)
  {
    String str1 = null;
    TreePath localTreePath = getPathForLocation(paramMouseEvent.getX(), paramMouseEvent.getY());
    if (localTreePath != null)
    {
      bg localbg = (bg)localTreePath.getLastPathComponent();
      File localFile = (File)localbg.getUserObject();
      str1 = localFile.getAbsolutePath();
      if (str1.trim().endsWith("ShellFolder:"))
      {
        str1 = localbg.toString();
      }
      else
      {
        String str2 = localFile.getPath();
        if ((str2.length() > 0) && (str2.charAt(str2.length() - 1) == '}') && (localFile.getPath().startsWith("::{")))
          str1 = localFile.toString();
      }
    }
    return str1;
  }

  protected bb d()
  {
    return new h(this);
  }

  protected DefaultTreeModel a(DefaultMutableTreeNode paramDefaultMutableTreeNode)
  {
    bm localbm = new bm(this, paramDefaultMutableTreeNode);
    return localbm;
  }

  protected DefaultTreeCellRenderer f()
  {
    return new bl();
  }

  protected DefaultTreeCellEditor g()
  {
    return new bk(this);
  }

  public void a(FileFilter paramFileFilter)
  {
    this.o = paramFileFilter;
  }

  public FileFilter o()
  {
    return this.o;
  }

  public boolean isPathEditable(TreePath paramTreePath)
  {
    if ((paramTreePath.getLastPathComponent() instanceof bg))
      return ((bg)paramTreePath.getLastPathComponent()).n();
    return false;
  }

  public File l()
  {
    bg localbg = m();
    if (localbg == null)
      return null;
    File localFile = (File)localbg.getUserObject();
    return localFile;
  }

  public File x()
  {
    File[] arrayOfFile = b();
    if (arrayOfFile != null)
      return arrayOfFile[0];
    return null;
  }

  public File[] b()
  {
    TreePath[] arrayOfTreePath = getSelectionPaths();
    if (arrayOfTreePath == null)
      return null;
    File[] arrayOfFile = new File[arrayOfTreePath.length];
    for (int i = 0; i < arrayOfTreePath.length; i++)
    {
      TreePath localTreePath = arrayOfTreePath[i];
      bg localbg = (bg)localTreePath.getLastPathComponent();
      File localFile = (File)localbg.getUserObject();
      arrayOfFile[i] = localFile;
    }
    return arrayOfFile;
  }

  protected bg m()
  {
    TreePath localTreePath = getSelectionPath();
    if (localTreePath == null)
      return null;
    TreeNode localTreeNode = (TreeNode)localTreePath.getLastPathComponent();
    if (localTreeNode.isLeaf())
      localTreeNode = localTreeNode.getParent();
    return (bg)localTreeNode;
  }

  public void b(File paramFile)
  {
    bg localbg = e(paramFile);
    b(localbg);
  }

  public void b(boolean paramBoolean)
  {
    this.w = paramBoolean;
  }

  protected void p()
  {
    File[] arrayOfFile = b();
    if (arrayOfFile == null)
      return;
    c(arrayOfFile);
  }

  protected void c(File[] paramArrayOfFile)
  {
    new Thread(new c(this, paramArrayOfFile)).start();
  }

  public bg e(Object paramObject)
  {
    return (bg)this.l.get(paramObject);
  }

  protected bg f(Object paramObject)
  {
    return (bg)this.l.remove(paramObject);
  }

  protected void a(Object paramObject, bg parambg)
  {
    this.l.put(paramObject, parambg);
  }

  public String d(DefaultMutableTreeNode paramDefaultMutableTreeNode)
  {
    if (paramDefaultMutableTreeNode == null)
      return super.r();
    Object localObject = paramDefaultMutableTreeNode.getUserObject();
    if ((localObject instanceof u))
      return null;
    return ((bg)paramDefaultMutableTreeNode).i();
  }

  public void r(File paramFile)
  {
    bg localbg = e(paramFile.getParentFile());
    if (localbg == null)
      return;
    localbg.b(paramFile);
  }

  public void c(File paramFile, boolean paramBoolean)
  {
    bg localbg1 = e(paramFile);
    if (localbg1 != null)
    {
      bg localbg2 = (bg)localbg1.getParent();
      if (localbg2 != null)
        localbg2.a(new Object[] { paramFile });
    }
  }

  public void c(File paramFile1, File paramFile2)
  {
    bg localbg1 = e(paramFile1);
    int i = 0;
    bg localbg2 = null;
    if (localbg1 != null)
      localbg2 = (bg)localbg1.getParent();
    File localFile = paramFile2.getParentFile();
    bg localbg3 = e(localFile);
    int i1 = localbg3 != null ? 1 : 0;
    int i2 = localbg2 != null ? 1 : 0;
    if (i1 != 0)
      i = localbg3 == getLastSelectedPathComponent() ? 1 : 0;
    if ((i == 0) && (localbg1 != null))
      i = localbg1 == getLastSelectedPathComponent() ? 1 : 0;
    int i3 = 0;
    if ((i1 != 0) && (i2 != 0) && (localbg3.equals(localbg2)))
    {
      a(localbg3, b, false);
      i3 = 1;
    }
    if (i3 == 0)
    {
      if (i1 != 0)
        a(localbg3, b, false);
      if (i2 != 0)
        a(localbg2, b, false);
    }
    if (i != 0)
    {
      bg localbg4 = e(paramFile2);
      if (localbg4 != null)
        b(localbg4);
    }
  }

  public void s(File paramFile)
  {
    if (paramFile.isDirectory())
    {
      bg localbg = e(paramFile);
      if (localbg != null)
        a(localbg, b, true);
    }
  }

  public void t(File paramFile)
  {
    bg localbg = e(paramFile);
    if ((localbg instanceof bh))
    {
      bh localbh = (bh)localbg;
      localbh.d = null;
    }
  }

  public void a(File[] paramArrayOfFile)
  {
    bg localbg = e(this.n);
    a(localbg, b, false);
  }

  public void b(File[] paramArrayOfFile)
  {
    bg localbg1 = e(this.n);
    ArrayList localArrayList = new ArrayList(paramArrayOfFile.length);
    Enumeration localEnumeration = localbg1.children();
    while (localEnumeration.hasMoreElements())
    {
      bg localbg2 = (bg)localEnumeration.nextElement();
      Object localObject = localbg2.getUserObject();
      for (int i = 0; i < paramArrayOfFile.length; i++)
      {
        if (!paramArrayOfFile[i].equals(localObject))
          continue;
        localArrayList.add(localbg2);
        break;
      }
    }
    if (localArrayList.size() > 0)
      localbg1.b(localArrayList);
  }

  public void lostOwnership(Clipboard paramClipboard, Transferable paramTransferable)
  {
  }

  protected Transferable c(DefaultMutableTreeNode paramDefaultMutableTreeNode)
  {
    if (paramDefaultMutableTreeNode == null)
      return null;
    return t.e((File)paramDefaultMutableTreeNode.getUserObject());
  }

  public void a(f paramf)
  {
    this.m.a(paramf);
  }

  public void b(f paramf)
  {
    this.m.b(paramf);
  }

  public String getName()
  {
    String str = k().c();
    if (str == null)
      str = super.getName();
    return str;
  }

  protected void b(TreeNode paramTreeNode)
  {
    bg localbg = (bg)paramTreeNode;
    if (!localbg.isLeaf())
      return;
    p();
  }

  protected static boolean d(File paramFile)
  {
    return t.f(paramFile);
  }

  protected static boolean e(File paramFile)
  {
    if (paramFile == null)
      return false;
    return paramFile.canWrite();
  }

  protected static boolean f(File paramFile)
  {
    if (paramFile == null)
      return false;
    return paramFile.canRead();
  }

  protected synchronized void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.u += 1;
      setCursor(this.t);
    }
    else
    {
      this.u -= 1;
      if (this.u <= 0)
        setCursor(Cursor.getDefaultCursor());
      if (this.u < 0)
        this.u = 0;
    }
  }

  static com.zend.ide.p.d.bm a(be parambe)
  {
    return parambe.p;
  }

  static FileFilter b(be parambe)
  {
    return parambe.o;
  }

  static com.zend.ide.util.c.h c(be parambe)
  {
    return parambe.a;
  }

  static g a(be parambe)
  {
    return parambe.m;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.be
 * JD-Core Version:    0.6.0
 */
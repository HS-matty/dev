package com.zend.ide.p.d;

import com.zend.ide.p.ba;
import com.zend.ide.r.bo;
import com.zend.ide.r.o;
import com.zend.ide.r.p;
import com.zend.ide.r.r;
import com.zend.ide.r.s;
import com.zend.ide.util.bh;
import com.zend.ide.util.cl;
import com.zend.ide.util.cr;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.y.e;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.io.File;
import java.util.Iterator;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JRootPane;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.plaf.FileChooserUI;

public class bp extends JFileChooser
  implements cu, r
{
  private boolean a;
  private bh b = bh.a;
  private Object f = new Object();
  private e c;

  public bp()
  {
    this(true);
  }

  public bp(boolean paramBoolean)
  {
    super(bl.q);
    a(paramBoolean);
    g();
    e();
    p.e().a(this);
  }

  private void e()
  {
    com.zend.ide.y.f localf = new com.zend.ide.y.f();
    this.c = new e(localf);
    localf.a("desktop.showHiddenFiles", new bb(this, null));
    this.c.a("desktop.showHiddenFiles");
  }

  public void g()
  {
    resetChoosableFileFilters();
    b();
  }

  private void b()
  {
    o localo1 = p.e().a("Web Documents");
    if (localo1 != null)
      addChoosableFileFilter(localo1.j());
    Iterator localIterator = p.e().a(false);
    while (localIterator.hasNext())
    {
      o localo2 = (o)localIterator.next();
      addChoosableFileFilter(localo2.j());
    }
    setFileFilter(localo1.j());
  }

  public String getUIClassID()
  {
    return "ZFileChooserUI";
  }

  public void a(bh parambh)
  {
    if ((parambh == null) || (this.b.equals(parambh)))
      return;
    this.b = parambh;
    ((bw)getUI()).a(parambh);
  }

  public bh c()
  {
    return this.b;
  }

  public boolean d()
  {
    return this.a;
  }

  public void a(boolean paramBoolean)
  {
    if (this.a == paramBoolean)
      return;
    boolean bool = this.a;
    this.a = paramBoolean;
    firePropertyChange("EncodingPanelsAreShownChangedProperty", bool, this.a);
  }

  public File[] getSelectedFiles()
  {
    File[] arrayOfFile = super.getSelectedFiles();
    if (arrayOfFile.length == 0)
    {
      File localFile = super.getSelectedFile();
      if (localFile != null)
      {
        arrayOfFile = new File[1];
        arrayOfFile[0] = localFile;
      }
    }
    return arrayOfFile;
  }

  public boolean a(File paramFile)
  {
    return true;
  }

  public void setCurrentDirectory(File paramFile)
  {
    try
    {
      super.setCurrentDirectory(paramFile);
    }
    catch (Exception localException)
    {
      cl.a("Exception from ZFileChooser:" + localException.toString());
    }
  }

  public void approveSelection()
  {
    File localFile = getSelectedFile();
    if ((localFile == null) || (!a(localFile)))
      return;
    bh localbh = ((bw)getUI()).a();
    if ((localbh != null) && (!this.b.equals(localbh)))
      this.b = localbh;
    boolean bool = localFile.exists();
    Object localObject;
    if ((!bool) && (!b(localFile)) && (getDialogType() == 1))
    {
      localObject = getFileFilter();
      if ((localObject instanceof s))
      {
        String str1 = p.e().a(((FileFilter)localObject).getDescription()).c();
        String str2 = localFile.getPath();
        if ((str1 != null) && (str1.length() != 0))
          str2 = str2 + (str1.indexOf(".") > -1 ? str1 : new StringBuilder().append(".").append(str1).toString());
        localFile = getFileSystemView().createFileObject(str2);
        bool = localFile.exists();
      }
    }
    if (getDialogType() == 0)
    {
      if (bool)
      {
        setSelectedFile(localFile);
        super.approveSelection();
      }
      return;
    }
    setSelectedFile(localFile);
    if ((bool) && (getDialogType() == 1))
    {
      localObject = ct.a(275, localFile.getAbsolutePath());
      int i = ba.b(this, localObject, ct.a(150), 1);
      if (i == 1)
        return;
      f();
      if (i == 2)
      {
        super.cancelSelection();
        return;
      }
    }
    super.approveSelection();
  }

  private void f()
  {
    if (cr.c() == 3)
      try
      {
        Thread.sleep(500L);
      }
      catch (InterruptedException localInterruptedException)
      {
      }
  }

  private static final boolean b(File paramFile)
  {
    String str = paramFile.getName();
    int i = str.lastIndexOf(".");
    int j = i != -1 ? 1 : 0;
    if (j != 0)
    {
      int k = str.lastIndexOf("\\");
      j = i > k ? 1 : 0;
    }
    return j;
  }

  protected JDialog createDialog(Component paramComponent)
    throws HeadlessException
  {
    String str = getUI().getDialogTitle(this);
    JDialog localJDialog = null;
    if ((paramComponent instanceof Frame))
      localJDialog = new JDialog((Frame)paramComponent, str, true);
    else if ((paramComponent instanceof Dialog))
      localJDialog = new JDialog((Dialog)paramComponent, str, true);
    else
      localJDialog = new JDialog((Frame)SwingUtilities.getAncestorOfClass(Frame.class, paramComponent), str, true);
    Container localContainer1 = localJDialog.getParent();
    localJDialog.addWindowListener(new f(this, localContainer1));
    Container localContainer2 = localJDialog.getContentPane();
    localContainer2.setLayout(new BorderLayout());
    localContainer2.add(this, "Center");
    if (JDialog.isDefaultLookAndFeelDecorated())
    {
      boolean bool = UIManager.getLookAndFeel().getSupportsWindowDecorations();
      if (bool)
        localJDialog.getRootPane().setWindowDecorationStyle(6);
    }
    try
    {
      localJDialog.pack();
    }
    catch (Exception localException)
    {
    }
    localJDialog.setLocationRelativeTo(paramComponent);
    return localJDialog;
  }

  public int showDialog(Component paramComponent, String paramString)
    throws HeadlessException
  {
    synchronized (this.f)
    {
      int i = super.showDialog(paramComponent, paramString);
      return i;
    }
  }

  public int a(Component paramComponent, String paramString)
    throws HeadlessException
  {
    setDialogType(1);
    setApproveButtonText(paramString);
    return showDialog(paramComponent, null);
  }

  public void ensureFileIsVisible(File paramFile)
  {
    getUI().ensureFileIsVisible(this, paramFile);
  }

  public void a(bo parambo)
  {
    g();
  }

  public void a(o paramo)
  {
    g();
  }

  public void c(o paramo)
  {
    g();
  }

  static
  {
    UIManager.getDefaults().put("ZFileChooserUI", bw.class.getName());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bp
 * JD-Core Version:    0.6.0
 */
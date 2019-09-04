package com.zend.ide.h;

import com.zend.ide.bd.c;
import com.zend.ide.j.u;
import com.zend.ide.p.ba;
import com.zend.ide.util.bb;
import com.zend.ide.util.bs;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.eo;
import com.zend.ide.util.es;
import java.io.File;
import javax.swing.tree.TreePath;

public class bf extends be
  implements cu
{
  public static String t = "DeleteAction";
  public static String u = "CopyAction";
  public static String A = "PasteAction";
  public static String w = "CutAction";
  public static String x = "AddNewFileAction";
  public static String y = "AddNewFolderAction";
  public static String z = "RenameAction";
  com.zend.ide.y.i i;

  public bf()
  {
    super("test");
    u();
  }

  public bf(u paramu)
  {
    super(paramu);
    u();
  }

  protected void u()
  {
    d("filesystem");
    setToolTipText("");
    b();
    addTreeWillExpandListener(new ab(this));
  }

  private void b()
  {
    this.i = new com.zend.ide.y.i(c());
    this.i.a("phpEditorPane.copy", u, 2);
    this.i.a("phpEditorPane.copy", u, 1);
    this.i.a("phpEditorPane.copy", u, 0);
    this.i.a("phpEditorPane.paste", A, 2);
    this.i.a("phpEditorPane.paste", A, 1);
    this.i.a("phpEditorPane.paste", A, 0);
    this.i.a("phpEditorPane.cut", w, 2);
    this.i.a("phpEditorPane.cut", w, 1);
    this.i.a("phpEditorPane.cut", w, 0);
    this.i.a("phpEditorPane.delete", t, 2);
    this.i.a("phpEditorPane.delete", t, 1);
    this.i.a("phpEditorPane.delete", t, 0);
  }

  protected bb d()
  {
    return new i(this);
  }

  private File a(bg parambg)
  {
    if (parambg == null)
      return null;
    if (parambg.isLeaf())
    {
      if (!(parambg.getParent() instanceof bg))
        return null;
      parambg = (bg)parambg.getParent();
    }
    Object localObject = parambg.getUserObject();
    if ((localObject instanceof File))
      return (File)localObject;
    return null;
  }

  public void w()
  {
    TreePath localTreePath = getSelectionPath();
    if (localTreePath != null)
      startEditingAtPath(localTreePath);
  }

  protected bs e()
  {
    return new t(this, this);
  }

  private void a(TreePath paramTreePath)
  {
    es locales = (es)paramTreePath.getLastPathComponent();
    bg localbg = (bg)paramTreePath.getLastPathComponent();
    File localFile = (File)localbg.getUserObject();
    if (localFile == null)
      return;
    try
    {
      a(true);
      if ((!localFile.isFile()) && (!localFile.exists()))
      {
        n().a(locales, eo.d, false);
        ba.a(c.b().h(), ct.a(1567, localFile.getPath()), ct.a(1568), 2);
      }
    }
    finally
    {
      a(false);
    }
  }

  static void a(bf parambf, TreePath paramTreePath)
  {
    parambf.a(paramTreePath);
  }

  static File a(bf parambf, bg parambg)
  {
    return parambf.a(parambg);
  }

  static void a(bf parambf, TreePath paramTreePath, boolean paramBoolean)
  {
    parambf.setExpandedState(paramTreePath, paramBoolean);
  }

  static void b(bf parambf, TreePath paramTreePath, boolean paramBoolean)
  {
    parambf.setExpandedState(paramTreePath, paramBoolean);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.bf
 * JD-Core Version:    0.6.0
 */
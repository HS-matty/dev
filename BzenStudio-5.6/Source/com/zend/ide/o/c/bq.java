package com.zend.ide.o.c;

import com.zend.ide.bc.a;
import com.zend.ide.o.bc;
import com.zend.ide.o.bd;
import com.zend.ide.o.fk;
import com.zend.ide.p.f.f;
import com.zend.ide.util.bb;
import com.zend.ide.util.cv;
import javax.swing.GrayFilter;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.TreeNode;

public class bq extends bo
  implements bd
{
  private static final ImageIcon i = new ImageIcon(GrayFilter.createDisabledImage(cv.b("addWatch16.gif").getImage()));
  private static final ImageIcon l = new ImageIcon(cv.b("addWatch16.gif").getImage());
  private bc o;

  public bq(fk paramfk)
  {
    super(paramfk);
    setEditable(true);
    this.o = paramfk.u();
    d("watch");
    putClientProperty("help_file", "zend_ide_helpcreating_and_monitoring_watches.htm");
    j.a((j)q());
    InputMap localInputMap = getInputMap();
    localInputMap.put(KeyStroke.getKeyStroke(127, 0), "removeWatchkey");
    this.o.a(this);
    a.a(this, "WATCHES");
    setTransferHandler(new u(this));
  }

  protected DefaultMutableTreeNode b(Object paramObject)
  {
    return new q(this);
  }

  protected bb d()
  {
    return new j(this);
  }

  protected DefaultTreeCellEditor f()
  {
    return new r(this);
  }

  protected f a(TreeNode paramTreeNode)
  {
    return new s(this, paramTreeNode);
  }

  public void a(String paramString)
  {
    b();
  }

  public void a(String paramString1, String paramString2)
  {
    b();
  }

  public void b(String paramString)
  {
    b();
  }

  public void h()
  {
    b();
  }

  static bc a(bq parambq)
  {
    return parambq.o;
  }

  static ImageIcon k()
  {
    return i;
  }

  static ImageIcon a()
  {
    return l;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.bq
 * JD-Core Version:    0.6.0
 */
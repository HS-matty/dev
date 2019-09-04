package com.zend.ide.o.c;

import com.zend.ide.o.ab;
import com.zend.ide.o.fk;
import com.zend.ide.util.cv;
import javax.swing.GrayFilter;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

public class bp extends bo
{
  private static final ImageIcon l = cv.b("variable.gif");
  private static final ImageIcon o = new ImageIcon(GrayFilter.createDisabledImage(l.getImage()));
  private com.zend.ide.o.a p;

  public bp(fk paramfk)
  {
    super(paramfk);
    d("variable");
    this.p = this.m.a("$GLOBALS");
    com.zend.ide.bc.a.a(this, "VARIABLES");
  }

  protected DefaultMutableTreeNode b(Object paramObject)
  {
    return new p(this);
  }

  static com.zend.ide.o.a a(bp parambp)
  {
    return parambp.p;
  }

  static ImageIcon k()
  {
    return l;
  }

  static ImageIcon l()
  {
    return o;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.bp
 * JD-Core Version:    0.6.0
 */
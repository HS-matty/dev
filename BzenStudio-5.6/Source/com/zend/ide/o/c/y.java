package com.zend.ide.o.c;

import com.zend.ide.o.fk;
import com.zend.ide.o.ib;
import com.zend.ide.o.jb;
import com.zend.ide.o.kb;
import com.zend.ide.p.bf;
import com.zend.ide.util.bb;
import com.zend.ide.util.cv;
import com.zend.ide.util.s;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

public class y extends bo
{
  private static final ImageIcon o = cv.b("stack.gif");

  public y(fk paramfk)
  {
    super(paramfk);
    addMouseListener(new a(this));
    com.zend.ide.bc.a.a(this, "STACK");
  }

  protected DefaultMutableTreeNode b(Object paramObject)
  {
    return new z(this);
  }

  protected bb d()
  {
    bf localbf = new bf(this);
    x localx = new x(this, null);
    localbf.a("keys.gotoSource", localx, "stackRootContext", true);
    return localbf;
  }

  private void a()
  {
    Object localObject = getLastSelectedPathComponent();
    if ((localObject == null) || (!(localObject instanceof ab)))
      return;
    jb localjb = (jb)((ab)localObject).getUserObject();
    this.j.b(localjb.b(), localjb.c());
  }

  private ib b()
  {
    ib localib1 = new ib();
    ib localib2 = this.j.b();
    if (localib2 == null)
      return localib1;
    int i = localib2.a();
    String str1 = this.j.V();
    int j = this.j.U();
    Object localObject;
    for (int k = i - 1; k >= 0; k--)
    {
      localObject = localib2.b(k);
      String str2 = ((jb)localObject).g();
      if (str2.equals(""))
        str2 = "main";
      jb localjb2 = new jb(k, str1, j, str2, "", 0, "");
      Iterator localIterator = ((jb)localObject).j();
      while (localIterator.hasNext())
        localjb2.a((kb)localIterator.next());
      localib1.a(localjb2);
      str1 = ((jb)localObject).b();
      j = ((jb)localObject).c();
    }
    if (localib1.a() > 0)
    {
      jb localjb1 = localib1.b(localib1.a() - 1);
      localObject = localjb1.b();
      if (fk.i((String)localObject))
        localib1.a(localib1.a() - 1);
    }
    return (ib)localib1;
  }

  static void a(y paramy)
  {
    paramy.a();
  }

  static ib b(y paramy)
  {
    return paramy.b();
  }

  static ImageIcon c()
  {
    return o;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.c.y
 * JD-Core Version:    0.6.0
 */
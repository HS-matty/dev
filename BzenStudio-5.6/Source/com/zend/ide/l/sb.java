package com.zend.ide.l;

import com.zend.ide.f.zc.b.c;
import com.zend.ide.f.zc.b.j;
import com.zend.ide.f.zc.b.l;
import com.zend.ide.p.bw;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class sb extends JPanel
  implements cu
{
  private static final Icon a;
  private static final Icon b;
  private ub c;
  private tb d;
  private DefaultListModel e;
  private Dialog f;
  static final boolean g = !sb.class.desiredAssertionStatus();

  public sb(Dialog paramDialog)
  {
    this.f = paramDialog;
    c();
  }

  public j a()
  {
    return this.c.b();
  }

  public c b()
  {
    return this.d.a();
  }

  public void a(j paramj)
  {
    this.c.a();
    this.c.a(paramj);
  }

  public void a(c paramc)
  {
    this.d.a(paramc);
  }

  private void c()
  {
    setLayout(new BorderLayout());
    this.c = e();
    this.d = d();
    add(this.c, "North");
    add(this.d, "Center");
  }

  private tb d()
  {
    return new tb(this);
  }

  private ub e()
  {
    return new ub(this);
  }

  public eb f()
    throws IOException
  {
    eb localeb = new eb();
    j localj = l.a(ub.a(this.c).getSelectedItem().toString());
    if ((!g) && (localj == null))
      throw new AssertionError();
    localeb.a(localj);
    c localc = new c("JavaBuildPath");
    localc.a(0, localj);
    localc.a(g());
    localc.b(h());
    localeb.a(localc);
    return localeb;
  }

  private File[] g()
  {
    int i = this.e.getSize();
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < i; j++)
    {
      File localFile = new File((String)this.e.getElementAt(j));
      if (!localFile.isDirectory())
        continue;
      localArrayList.add(localFile);
    }
    File[] arrayOfFile = new File[localArrayList.size()];
    localArrayList.toArray(arrayOfFile);
    return arrayOfFile;
  }

  private File[] h()
  {
    int i = this.e.getSize();
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < i; j++)
    {
      File localFile = new File((String)this.e.getElementAt(j));
      if (localFile.isDirectory())
        continue;
      localArrayList.add(localFile);
    }
    File[] arrayOfFile = new File[localArrayList.size()];
    localArrayList.toArray(arrayOfFile);
    return arrayOfFile;
  }

  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    ub.a(this.c).setEnabled(paramBoolean);
    ub.b(this.c).setEnabled(paramBoolean);
    tb.c(this.d).setEnabled(paramBoolean);
    tb.d(this.d).setEnabled(paramBoolean);
    tb.b(this.d).setEnabled(paramBoolean);
  }

  static Dialog a(sb paramsb)
  {
    return paramsb.f;
  }

  static DefaultListModel a(sb paramsb, DefaultListModel paramDefaultListModel)
  {
    return paramsb.e = paramDefaultListModel;
  }

  static DefaultListModel b(sb paramsb)
  {
    return paramsb.e;
  }

  static Icon i()
  {
    return a;
  }

  static Icon j()
  {
    return b;
  }

  static
  {
    a = cv.b("jar.png");
    b = cv.b("classFolder.png");
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.sb
 * JD-Core Version:    0.6.0
 */
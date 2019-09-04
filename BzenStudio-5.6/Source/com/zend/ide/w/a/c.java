package com.zend.ide.w.a;

import com.zend.ide.util.bi;
import com.zend.ide.util.cr;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import com.zend.ide.util.dm;
import com.zend.ide.y.f;
import java.beans.PropertyChangeListener;
import java.io.File;
import javax.swing.JOptionPane;

public abstract class c extends com.zend.ide.w.e
  implements com.zend.ide.w.b, cu
{
  protected static String f;
  protected static final String g = new File(cv.d(), ".zdecvspass").getPath();
  protected String[] h;
  private String a = "";
  private PropertyChangeListener b = new e(this);
  private PropertyChangeListener i = new ab(this);
  private com.zend.ide.y.e c;
  private p d = new p();
  protected z e = new z();

  public c()
  {
    a();
  }

  private void a()
  {
    f = (String)com.zend.ide.y.b.a("cvs_rsh_env_var").c();
    String[] arrayOfString = dm.b();
    int j = (f == null) || (f.equals("")) ? 1 : 2;
    this.h = new String[arrayOfString.length + j];
    System.arraycopy(arrayOfString, 0, this.h, 0, arrayOfString.length);
    this.h[(this.h.length - j)] = ("CVS_PASSFILE=" + g);
    if (j == 2)
      this.h[(this.h.length - 1)] = ("CVS_RSH=" + f);
  }

  p h()
  {
    return this.d;
  }

  static void b()
  {
    JOptionPane.showMessageDialog(com.zend.ide.bd.c.b().h(), ct.a(744));
  }

  public static String c()
  {
    String str = bi.a("CVS_LOCATION", "./SourceControl/cvs/cvs");
    switch (cr.c())
    {
    case 1:
      str = str + ".exe";
    }
    return str;
  }

  private void a(String paramString)
  {
    this.a = paramString;
  }

  String d()
  {
    return this.a;
  }

  void e()
  {
    f localf = new f();
    this.c = new com.zend.ide.y.e(localf);
    localf.a("cvs.cvsCommandLine", this.b);
    localf.a("cvs_rsh_env_var", this.i);
    this.c.a("cvs.cvsCommandLine");
    this.c.a("cvs_rsh_env_var");
  }

  public boolean a(File paramFile)
  {
    return this.e.a(paramFile);
  }

  public boolean b(File paramFile)
  {
    return this.e.b(paramFile);
  }

  public boolean c(File paramFile)
  {
    return this.e.c(paramFile);
  }

  public boolean a(File[] paramArrayOfFile)
  {
    return z.a(paramArrayOfFile);
  }

  static void a(c paramc, String paramString)
  {
    paramc.a(paramString);
  }

  static void a(c paramc)
  {
    paramc.a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.a.c
 * JD-Core Version:    0.6.0
 */
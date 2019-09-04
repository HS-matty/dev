package com.zend.ide.l;

import com.zend.ide.desktop.cg;
import com.zend.ide.j.bd;
import com.zend.ide.j.y;
import com.zend.ide.p.ba;
import com.zend.ide.p.d.bp;
import com.zend.ide.p.x;
import com.zend.ide.r.p;
import com.zend.ide.util.bh;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.dj;
import com.zend.ide.y.b;
import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public abstract class f
  implements v, cu
{
  private y a;
  public static u b;
  private c c = new c();
  protected Hashtable d = new Hashtable(5);
  protected Hashtable e = new Hashtable(5);
  private bw f;
  private bp g;

  public f()
  {
    new cg(this);
  }

  public c i()
  {
    return this.c;
  }

  public void a(k paramk)
  {
    this.d.put(paramk.b(), paramk);
    this.e.put(paramk.b(), paramk.d());
  }

  public boolean e()
  {
    return f() != null;
  }

  public u j()
  {
    if (b != null)
    {
      if (!n())
        return null;
    }
    else if (a(this.e))
    {
      if ((!b(true)) || (!c(true)))
        return null;
      SwingUtilities.invokeLater(new h(this));
    }
    w().setVisible(true);
    u localu = this.f.m();
    if (localu == null)
      return null;
    a(localu, localu.c());
    m();
    a(localu);
    return localu;
  }

  public void k()
  {
    bp localbp = v();
    localbp.setDialogTitle(ct.a(77));
    int i = localbp.showOpenDialog(com.zend.ide.bd.c.b().h());
    if (i == 1)
      return;
    File localFile = localbp.getSelectedFile();
    a(localFile);
  }

  public void a(String paramString)
  {
    File localFile = com.zend.ide.j.h.m.g(paramString);
    a(localFile);
  }

  public void a(File paramFile)
  {
    u localu = b(paramFile.getPath());
    if (localu == null)
      return;
    File localFile = new File(paramFile.getParentFile(), paramFile.getName() + "-bak");
    String str = "5.5";
    if ((!localFile.exists()) && (!localu.a().equals(str)))
      if (a(localFile.getPath()))
        a(paramFile, localFile);
      else
        return;
    a(localu);
  }

  public void a(u paramu)
  {
    boolean bool = e();
    if ((bool) && (f().c().equals(paramu.c())))
      return;
    if ((!bool) && (a(this.e)) && ((!b(true)) || (!c(true))))
      return;
    if ((e()) && (!l()))
      return;
    i().e(paramu);
    Hashtable localHashtable = paramu.d();
    Enumeration localEnumeration = localHashtable.elements();
    b = paramu;
    while (localEnumeration.hasMoreElements())
    {
      l locall = (l)localEnumeration.nextElement();
      Object localObject = locall.c();
      k localk = (k)this.d.get(localObject);
      if (localk == null)
        continue;
      localk.a(locall.b());
    }
    bh localbh = (bh)b.a("editing.encoding");
    b.a("editing.encoding", b.b());
    b.a("editing.encoding", localbh);
    i().f(b);
  }

  public boolean l()
  {
    if (!c(true))
      return false;
    b(b);
    a(b, b.c());
    m();
    return true;
  }

  private void m()
  {
    boolean bool = e();
    if (bool)
      i().g(f());
    p();
    if (bool)
    {
      u localu = b;
      b = null;
      i().h(localu);
    }
  }

  public boolean n()
  {
    if (!c(false))
      return false;
    b(b);
    a(b, b.c());
    return true;
  }

  public boolean b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      int i = u();
      if (i == 2)
        return false;
      if (i == 1)
        return true;
      if (!c(false))
        return false;
    }
    bp localbp = v();
    localbp.setDialogTitle(ct.a(702));
    File localFile = null;
    boolean bool = true;
    while (bool)
    {
      int j = localbp.showSaveDialog(com.zend.ide.bd.c.b().h());
      if (j != 0)
        return false;
      localFile = localbp.getSelectedFile();
      bool = localFile instanceof bd;
      if (bool)
        ba.a(com.zend.ide.bd.c.b().h(), ct.a(1176), ct.a(94), 0);
    }
    String str1 = localFile.getAbsolutePath();
    if (localFile.exists())
      com.zend.ide.util.b.e.a().a(str1);
    if (localFile.getName().lastIndexOf(".") == -1)
    {
      str1 = str1 + ".zpj";
      localFile = com.zend.ide.j.h.m.g(str1);
    }
    u localu = o();
    localu.b(localFile.getAbsolutePath());
    String str2 = localFile.getName();
    if (str2.indexOf(".") != -1)
      localu.a(str2.substring(0, str2.lastIndexOf(".")));
    else
      localu.a(str2);
    a(localu, localFile.getAbsolutePath());
    b = localu;
    i().e(localu);
    i().f(localu);
    return true;
  }

  private u o()
  {
    i locali = new i();
    b(locali);
    return locali;
  }

  private static u b(String paramString)
  {
    i locali = null;
    try
    {
      locali = (i)com.a.f.a(paramString);
    }
    catch (Exception localException1)
    {
      cl.a(localException1);
      ba.a(com.zend.ide.bd.c.b().h(), ct.a(718), ct.a(94), 0);
    }
    if (locali != null)
      locali.b(paramString);
    else
      return null;
    try
    {
      String str1 = locali.a();
      if ((str1.equals("")) || (Double.parseDouble(str1) <= 4.0D))
      {
        String str2 = locali.c();
        ExecutorService localExecutorService = Executors.newFixedThreadPool(3);
        FutureTask localFutureTask = new FutureTask(new cc(str2, str1));
        localExecutorService.execute(localFutureTask);
      }
    }
    catch (Exception localException2)
    {
      cl.a(localException2);
    }
    return locali;
  }

  private void a(u paramu, String paramString)
  {
    File localFile = com.zend.ide.j.h.m.g(paramString);
    try
    {
      if (!localFile.getParentFile().exists())
        localFile.getParentFile().mkdirs();
      com.a.f.a(paramString, paramu);
    }
    catch (IOException localIOException)
    {
      int i = ba.a(com.zend.ide.bd.c.b().h(), ct.a(866), ct.a(94), 0, 0);
      if (i == 0)
        b(false);
    }
    v().setCurrentDirectory(localFile.getParentFile());
  }

  private boolean a(String paramString)
  {
    String str = ct.a(1929) + paramString;
    int i = ba.b(com.zend.ide.bd.c.b().h(), str, ct.a(1930), 2);
    return i == 0;
  }

  private void a(File paramFile1, File paramFile2)
  {
    InputStream localInputStream;
    try
    {
      localInputStream = com.zend.ide.j.h.m.f(paramFile1);
    }
    catch (Exception localException)
    {
      throw new dj(ct.a(871), ct.a(94), 0);
    }
    OutputStream localOutputStream = null;
    try
    {
      localOutputStream = com.zend.ide.j.h.m.b(paramFile2, false);
      byte[] arrayOfByte = new byte[2048];
      int i;
      while ((i = localInputStream.read(arrayOfByte)) != -1)
        localOutputStream.write(arrayOfByte, 0, i);
    }
    catch (IOException localIOException5)
    {
      cl.a(localIOException3);
    }
    finally
    {
      if (localInputStream != null)
        try
        {
          localInputStream.close();
        }
        catch (IOException localIOException6)
        {
        }
      if (localOutputStream != null)
        try
        {
          localOutputStream.close();
        }
        catch (IOException localIOException7)
        {
        }
    }
  }

  protected boolean a(Hashtable paramHashtable)
  {
    int i = 0;
    Enumeration localEnumeration = this.d.elements();
    while (localEnumeration.hasMoreElements())
    {
      k localk = (k)localEnumeration.nextElement();
      if (localk.b(paramHashtable.get(localk.b())))
        i = 1;
    }
    return i;
  }

  private boolean c(boolean paramBoolean)
  {
    Enumeration localEnumeration = this.d.elements();
    while (localEnumeration.hasMoreElements())
    {
      k localk = (k)localEnumeration.nextElement();
      if (!localk.a(paramBoolean))
        return false;
    }
    return true;
  }

  protected void p()
  {
    Enumeration localEnumeration = this.d.elements();
    while (localEnumeration.hasMoreElements())
    {
      k localk = (k)localEnumeration.nextElement();
      localk.a(this.e.get(localk.b()));
    }
  }

  private void b(u paramu)
  {
    Enumeration localEnumeration = this.d.elements();
    while (localEnumeration.hasMoreElements())
    {
      k localk = (k)localEnumeration.nextElement();
      paramu.a(new e(localk.m(), localk.b()));
    }
  }

  private int u()
  {
    boolean bool = ((Boolean)b.a("project.saveAsProjectDialog").c()).booleanValue();
    if (!bool)
      return 1;
    String str = ct.a(207);
    ba localba = new ba(str, 3, 1);
    JPanel localJPanel = new JPanel(new FlowLayout(0));
    x localx = new x(ct.b(5));
    localx.setFocusPainted(false);
    localx.addItemListener(new db(this));
    localJPanel.add(localx);
    localba.add(localJPanel, 1);
    JDialog localJDialog = localba.createDialog(c().getTopLevelAncestor(), ct.a(150));
    localJDialog.setVisible(true);
    Object localObject = localba.getValue();
    if ((localObject != null) && ((localObject instanceof Integer)))
      return ((Integer)localObject).intValue();
    return -1;
  }

  public void a(File[] paramArrayOfFile)
  {
    g().c(paramArrayOfFile);
    b(b);
  }

  public void b(File paramFile)
  {
    g().a(paramFile);
    b(b);
  }

  public void b(File[] paramArrayOfFile)
  {
    g().d(paramArrayOfFile);
    b(b);
  }

  public void c(File paramFile)
  {
    g().b(paramFile);
    b(b);
  }

  public u f()
  {
    return b;
  }

  public y g()
  {
    if (this.a == null)
      this.a = new d("project");
    return this.a;
  }

  protected void a(d paramd)
  {
    this.a = paramd;
  }

  protected bp v()
  {
    if (this.g == null)
    {
      this.g = new bp(false);
      this.g.addChoosableFileFilter(p.e().l());
      File localFile = new File(bw.A());
      if (!localFile.exists())
        localFile.mkdirs();
      this.g.setCurrentDirectory(localFile);
    }
    return this.g;
  }

  protected bw w()
  {
    if (this.f == null)
      this.f = new bw();
    return this.f;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.f
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.hb;

import com.zend.ide.j.h;
import com.zend.ide.j.t;
import com.zend.ide.j.u;
import com.zend.ide.j.y;
import com.zend.ide.l.v;
import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import java.awt.Frame;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

public class ab
  implements cu, m
{
  private pb a;
  private String b;
  private String c;
  private boolean d = true;
  private boolean e = false;
  private boolean f = false;
  private boolean g = false;
  private boolean h = false;
  private boolean i = false;
  private boolean j = false;
  private f k;
  private v l;
  private bw m;
  private cb n;
  private Frame o;
  private String p = "";
  private boolean q = false;
  private FileFilter r = null;

  public ab(Frame paramFrame)
  {
    this.o = paramFrame;
    this.k = new f();
  }

  public void a(cb paramcb)
  {
    this.n = paramcb;
    this.k.a(paramcb);
  }

  public boolean a()
  {
    return this.q;
  }

  public void b()
  {
    if (!c())
      return;
    b(0);
  }

  private boolean c()
  {
    if (this.a == null)
    {
      if (this.o == null)
        return false;
      this.a = new pb(this.o);
      this.a.a(this);
      this.a.a(0);
      if (!this.p.equals(""))
        this.a.c(this.p);
    }
    if ((this.m.k() != null) && ((this.a.s() == null) || (this.a.s().equals(""))))
    {
      File localFile = h.m.g(this.m.k());
      if ((localFile != null) && (localFile.exists()))
        this.a.c(localFile.getParent());
    }
    return true;
  }

  protected void b(int paramInt)
  {
    this.a.a(f());
    this.a.e(h());
    this.a.a(l());
    this.a.c(k());
    this.a.b(j());
    this.a.d(i());
    this.a.f(this.e);
    if (!this.p.equals(""))
      this.a.c(this.p);
    if ((this.l == null) || (!this.l.e()))
      this.a.g(false);
    else
      this.a.g(true);
    this.a.setVisible(true);
  }

  public void a(int paramInt)
  {
    a(this.a.b());
    b(this.a.g());
    b(this.a.a());
    e(this.a.c());
    d(this.a.f());
    c(this.a.e());
    a(this.a.j());
    this.e = this.a.h();
    if (paramInt == -1)
    {
      this.a.setVisible(false);
      return;
    }
    String str = this.a.a();
    if ((str == null) || (str.length() == 0) || ((!this.a.f()) && (this.a.s() == null)) || ((!this.a.f()) && (this.a.s().length() == 0)))
      return;
    Object localObject;
    if (this.e)
    {
      try
      {
        localObject = Pattern.compile(str);
      }
      catch (Exception localException)
      {
        ba.a(this.o, ct.a(748), ct.b(132), -1, 2);
        return;
      }
      Matcher localMatcher = ((Pattern)localObject).matcher("");
      if (localMatcher.matches())
      {
        ba.a(this.o, ct.a(712), ct.b(132), -1, 2);
        return;
      }
    }
    if (paramInt == 0)
    {
      if (this.a.f())
      {
        localObject = new File("dummy");
      }
      else
      {
        localObject = h.m.g(this.a.s());
        if (!((File)localObject).exists())
        {
          ba.a(this.a, ct.a(746, ((File)localObject).getAbsolutePath()), ct.b(132), 0);
          return;
        }
      }
      new Thread(new bb(this, (File)localObject)).start();
      return;
    }
  }

  public void a(v paramv)
  {
    this.l = paramv;
  }

  public void a(bw parambw)
  {
    this.m = parambw;
  }

  public void a(String paramString)
  {
    this.p = paramString;
  }

  public void a(FileFilter paramFileFilter)
  {
    this.r = paramFileFilter;
  }

  public FileFilter d()
  {
    return this.r;
  }

  public String e()
  {
    return this.a.s();
  }

  public boolean f()
  {
    return this.f;
  }

  public f g()
  {
    return this.k;
  }

  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  public boolean h()
  {
    return this.g;
  }

  public void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }

  public void c(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }

  public boolean i()
  {
    return this.j;
  }

  public void d(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }

  public boolean j()
  {
    return this.d;
  }

  public void e(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public boolean k()
  {
    return this.i;
  }

  public void f(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }

  public String l()
  {
    return this.c;
  }

  public void b(String paramString)
  {
    if (paramString == null)
    {
      this.c = "";
      f(false);
    }
    else if (paramString.indexOf("\n") >= 0)
    {
      this.c = "";
      f(true);
    }
    else
    {
      this.c = paramString;
      f(false);
    }
  }

  private File[] a(File[] paramArrayOfFile)
  {
    ArrayList localArrayList = new ArrayList(Arrays.asList(paramArrayOfFile));
    dz[] arrayOfdz = this.m.i();
    for (int i1 = 0; i1 < arrayOfdz.length; i1++)
    {
      File localFile = h.m.g(arrayOfdz[i1].k());
      if (t.a(this.l.g(), localFile))
        continue;
      localArrayList.add(localFile);
    }
    File[] arrayOfFile = new File[localArrayList.size()];
    localArrayList.toArray(arrayOfFile);
    return arrayOfFile;
  }

  private void a(File paramFile)
  {
    this.k.a(paramFile);
    this.b = this.a.t();
    this.k.a(this.b);
    this.k.d(this.d);
    this.k.a(this.e);
    this.k.c(this.g);
    this.k.b(this.f);
    int i1 = -1;
    try
    {
      this.a.setVisible(false);
      this.q = true;
      if ((this.j) && (this.l != null))
      {
        y localy = this.l.g();
        if (localy != null)
        {
          localObject1 = localy.b();
          this.k.a(a(localObject1));
          this.n.g();
          i1 = this.k.c();
        }
      }
      else
      {
        this.n.g();
        i1 = this.k.a();
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      this.n.i();
      Object localObject1 = JOptionPane.getRootFrame();
      ((Frame)localObject1).setIconImage(cv.a("null16.gif"));
      ba.a(this.a, ct.a(173), ct.a(174), -1, 2);
    }
    finally
    {
      this.q = false;
      if (i1 == 0)
        this.n.h();
      else
        this.n.i();
    }
    System.gc();
  }

  static void a(ab paramab, File paramFile)
  {
    paramab.a(paramFile);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.ab
 * JD-Core Version:    0.6.0
 */
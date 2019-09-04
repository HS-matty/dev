package com.zend.ide.f;

import com.zend.ide.b.d;
import com.zend.ide.b.m;
import com.zend.ide.m.ba;
import com.zend.ide.m.bh;
import com.zend.ide.m.c;
import com.zend.ide.m.o;
import com.zend.ide.m.v;
import com.zend.ide.m.x;
import com.zend.ide.m.z;
import com.zend.ide.n.bw;
import com.zend.ide.util.a.b;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;

class ca extends com.zend.ide.s.bd
{
  d[] g;
  final cj h;

  ca(cj paramcj)
  {
    super(paramcj);
  }

  protected void a(int paramInt, d[] paramArrayOfd, String paramString)
  {
    this.e = paramString;
    this.g = paramArrayOfd;
    c(paramInt);
  }

  protected int p()
  {
    int i = super.p();
    if (this.e.startsWith("$"))
      i--;
    return i;
  }

  protected d[] q()
  {
    d[] arrayOfd = bl.a(this.g, this.e);
    int i = this.e.length();
    if ((cj.a(this.h)) && (i > 0) && (arrayOfd.length > 0))
    {
      ArrayList localArrayList = new ArrayList();
      for (int j = 0; j < arrayOfd.length; j++)
      {
        if ((arrayOfd[j] instanceof com.zend.ide.m.bd))
        {
          String str = arrayOfd[j].a();
          str = str.substring(0, str.length() > i ? i : str.length());
          if (!str.equals(this.e))
            continue;
        }
        localArrayList.add(arrayOfd[j]);
      }
      arrayOfd = new d[localArrayList.size()];
      localArrayList.toArray(arrayOfd);
    }
    return arrayOfd;
  }

  public boolean a(d paramd)
  {
    Document localDocument = cj.o(this.h).getDocument();
    int i = b() - o();
    return cj.a(this.h, paramd, localDocument, i);
  }

  public boolean d()
  {
    return cj.b(this.h);
  }

  public int e()
  {
    return cj.c(this.h);
  }

  public String b(d paramd)
  {
    if (!(paramd instanceof ba))
      return "";
    if ((paramd instanceof bh))
      return jb.a((ba)paramd, cj.u);
    if ((paramd instanceof v))
      return jb.a((v)paramd, cj.u);
    if ((paramd instanceof z))
      return jb.a((z)paramd, cj.u);
    if ((paramd instanceof x))
      return jb.a((x)paramd);
    if ((paramd instanceof com.zend.ide.m.bd))
      return jb.a((com.zend.ide.m.bd)paramd);
    if ((paramd instanceof c))
      return jb.a((c)paramd, cj.u);
    return "";
  }

  public boolean a(String paramString)
  {
    return jb.a(paramString);
  }

  public d a(d paramd, String paramString1, String paramString2)
  {
    return jb.a(cj.u, paramd, paramString1, paramString2);
  }

  public void a(d paramd)
  {
    if (paramd == null)
      return;
    try
    {
      if (cj.p(this.h).a(paramd.f().c(), null, paramd.f().f()))
        cj.d(this.h).grabFocus();
    }
    catch (Exception localException)
    {
      b.a(localException);
    }
  }

  public void b(d paramd)
  {
    if (paramd == null)
      return;
    if (!paramd.e())
    {
      bm.a(cj.e(this.h).e().getTopLevelAncestor(), paramd.a());
      return;
    }
  }

  public void c(d paramd)
  {
    if (paramd == null)
      return;
    o.a(paramd, cj.a(this.h), true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.ca
 * JD-Core Version:    0.6.0
 */
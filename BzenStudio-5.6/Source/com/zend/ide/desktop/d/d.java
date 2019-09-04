package com.zend.ide.desktop.d;

import com.zend.ide.j.t;
import com.zend.ide.l.v;
import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import com.zend.ide.p.b.f;
import com.zend.ide.p.ba;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.y.b;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.AbstractAction;

class d extends AbstractAction
{
  HashMap b = new HashMap(50);
  final a a;

  public d(a parama)
  {
    super("AnalyzeTreeAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    a.j(this.a);
    a.g(this.a).clear();
    a.a(this.a, true);
    File[] arrayOfFile = a.b(this.a).h().b();
    int i = 0;
    try
    {
      this.b.clear();
      for (int j = 0; (j < arrayOfFile.length) && (a.k(this.a)); j++)
      {
        File localFile = arrayOfFile[j];
        a(localFile);
      }
    }
    finally
    {
      if (a.f(this.a) != null)
        a.f(this.a).d();
      a.h(this.a);
      if (i != 0)
        ba.a(com.zend.ide.bd.c.b().h(), ct.a(1095), ct.a(970), 1);
    }
  }

  private void a(File paramFile)
  {
    String str = paramFile.getAbsolutePath();
    Object localObject1;
    if (paramFile.isFile())
    {
      this.b.put(str, str);
      if (a.g(paramFile.getName()))
      {
        localObject1 = paramFile.getPath();
        Object localObject2 = localObject1;
        int j = 0;
        dz localdz = a.c(this.a).a((String)localObject1);
        if ((localdz != null) && (localdz.l()))
        {
          a.a(this.a, (String)localObject1);
        }
        else if (a.d(paramFile.getAbsolutePath()))
        {
          localObject2 = b(paramFile);
          j = 1;
        }
        f.a(a.e(this.a));
        a.f(this.a).a(ct.a(969, (String)localObject1));
        com.zend.ide.ba.h localh = com.zend.ide.ba.a.a((String)localObject2);
        if (localh != null)
        {
          localh.a((String)localObject1);
          if (localh.d().length != 0)
            a.g(this.a).add(localh);
        }
        if (j != 0)
          a((String)localObject2);
      }
    }
    else
    {
      localObject1 = paramFile.listFiles();
      if (localObject1 != null)
        for (int i = 0; (i < localObject1.length) && (a.k(this.a)); i++)
        {
          File localFile = localObject1[i];
          str = localFile.getAbsolutePath();
          if (this.b.get(str) != null)
            continue;
          this.b.put(str, str);
          a(localFile);
        }
    }
  }

  private String b(File paramFile)
  {
    File localFile = (File)b.a("debugging.tempFilesLocation").c();
    String str = localFile + File.separator + paramFile.getName();
    try
    {
      t.b(paramFile, localFile, a.b(this.a).c());
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
    return str;
  }

  private void a(String paramString)
  {
    com.zend.ide.j.h.m.g(new File(paramString));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.d.d
 * JD-Core Version:    0.6.0
 */
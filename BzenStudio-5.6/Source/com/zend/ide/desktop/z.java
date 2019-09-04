package com.zend.ide.desktop;

import com.zend.ide.j.bd;
import com.zend.ide.j.h;
import com.zend.ide.n.ck;
import com.zend.ide.util.cr;
import java.io.File;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

class z
{
  private ck e;
  final cj f;

  public z(cj paramcj, ck paramck)
  {
    this.e = paramck;
    paramck.a(new vb(this));
  }

  private void c()
  {
    JMenu localJMenu = cj.i(this.f).b("keys.recentFilesMenu");
    localJMenu.removeAll();
    for (int i = 0; (i < cj.j(this.f).e.g()) && (i < 10); i++)
    {
      String str = this.e.b(i);
      File localFile = h.m.g(str);
      boolean bool = localFile instanceof bd;
      if (((!bool) || (((bd)localFile).b())) && ((bool) || (!cr.a(localFile))) && (!localFile.exists()))
        continue;
      JMenuItem localJMenuItem = localJMenu.add(new dg(this, localFile.getPath()));
      localJMenuItem.setFont(localJMenu.getFont());
    }
    localJMenu.repaint();
    localJMenu.revalidate();
  }

  public Object b()
  {
    return this.e.f();
  }

  public void a(Object paramObject)
  {
    this.e.b(paramObject);
  }

  static void a(z paramz)
  {
    paramz.c();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.z
 * JD-Core Version:    0.6.0
 */
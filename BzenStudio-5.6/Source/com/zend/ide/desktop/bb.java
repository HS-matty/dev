package com.zend.ide.desktop;

import com.zend.ide.j.h;
import com.zend.ide.l.v;
import com.zend.ide.util.c.m;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

class bb
{
  private ArrayList b = null;
  final cj f;

  public bb(cj paramcj)
  {
    paramcj.l().a(new jc(this, paramcj));
  }

  private void a(String paramString)
  {
    this.b.remove(paramString);
    File localFile = h.m.g(paramString);
    if (localFile.exists())
    {
      this.b.add(0, paramString);
      while (this.b.size() > 10)
        this.b.remove(this.b.size() - 1);
    }
    c();
  }

  private void c()
  {
    JMenu localJMenu = cj.i(this.f).b("recentProjectsMenu");
    localJMenu.removeAll();
    for (int i = 0; (i < this.b.size()) && (i < 10); i++)
    {
      String str = (String)this.b.get(i);
      File localFile = h.m.g(str);
      if (!localFile.exists())
        continue;
      JMenuItem localJMenuItem = localJMenu.add(new m(new dh(this, localFile.getPath())));
      localJMenuItem.setFont(localJMenu.getFont());
    }
  }

  public Object b()
  {
    Object[] arrayOfObject = this.b.toArray();
    return arrayOfObject;
  }

  public void a(Object paramObject)
  {
    Object[] arrayOfObject = (Object[])(Object[])paramObject;
    this.b.clear();
    this.b.addAll(Arrays.asList(arrayOfObject));
    c();
  }

  static void a(bb parambb, String paramString)
  {
    parambb.a(paramString);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.bb
 * JD-Core Version:    0.6.0
 */
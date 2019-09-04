package com.zend.ide.n;

import com.zend.ide.j.bd;
import com.zend.ide.j.h;
import com.zend.ide.util.s;
import com.zend.ide.y.i;
import java.awt.Frame;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ActionMap;
import javax.swing.JComponent;

public class ck extends ca
{
  private ArrayList e = null;
  private int f = -1;
  private gt g = null;
  private eg h;
  private ArrayList i;

  public ck()
  {
    super("RecentFilesManagerTool");
    a(50);
    this.i = new ArrayList();
    this.h = new eg(this, null);
  }

  protected void a(bw parambw)
  {
    b().a(this.h);
    s locals = (s)parambw.q();
    ActionMap localActionMap = parambw.c().getActionMap();
    gk localgk = new gk(this);
    localActionMap.put("showRecentFiles", localgk);
    locals.a("keys.showRecentFiles", localgk, "textComponent", false);
  }

  protected void d()
  {
    c().a("editor.showRecentFiles", "showRecentFiles", 2);
  }

  public void a(int paramInt)
  {
    this.f = paramInt;
  }

  public int i()
  {
    return this.f;
  }

  private Object[] e()
  {
    int j = 0;
    ArrayList localArrayList = new ArrayList();
    while (j < this.e.size())
    {
      localObject = h.m.g((String)this.e.get(j));
      if ((((localObject instanceof bd)) && (!((bd)localObject).b())) || (((File)localObject).exists()))
      {
        localArrayList.add(((File)localObject).getAbsolutePath());
        j++;
      }
      else
      {
        this.e.remove(j);
        c(((File)localObject).getAbsolutePath());
      }
    }
    Object localObject = localArrayList.toArray();
    return (Object)localObject;
  }

  private void a(String paramString)
  {
    h();
    this.e.remove(paramString);
    File localFile = h.m.g(paramString);
    if (localFile.exists())
    {
      this.e.add(0, paramString);
      b(paramString);
      while (this.e.size() > i())
        this.e.remove(this.e.size() - 1);
    }
  }

  public Object f()
  {
    Object[] arrayOfObject = this.e.toArray();
    return arrayOfObject;
  }

  public void b(Object paramObject)
  {
    h();
    Object[] arrayOfObject = (Object[])(Object[])paramObject;
    this.e.clear();
    this.e.addAll(Arrays.asList(arrayOfObject));
    a(this.e);
  }

  public int g()
  {
    return this.e.size();
  }

  public String b(int paramInt)
  {
    return (String)this.e.get(paramInt);
  }

  private void h()
  {
    if (this.g == null)
      this.g = new gt(this, (Frame)b().c().getTopLevelAncestor(), this);
  }

  private void b(String paramString)
  {
    for (int j = 0; j < this.i.size(); j++)
      ((ds)this.i.get(j)).a(paramString);
  }

  private void c(String paramString)
  {
    for (int j = 0; j < this.i.size(); j++)
      ((ds)this.i.get(j)).b(paramString);
  }

  private void a(ArrayList paramArrayList)
  {
    for (int j = 0; j < this.i.size(); j++)
      ((ds)this.i.get(j)).a(paramArrayList);
  }

  public void a(ds paramds)
  {
    this.i.add(paramds);
  }

  static void a(ck paramck, String paramString)
  {
    paramck.a(paramString);
  }

  static gt a(ck paramck)
  {
    return paramck.g;
  }

  static Object[] b(ck paramck)
  {
    return paramck.e();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ck
 * JD-Core Version:    0.6.0
 */
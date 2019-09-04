package com.zend.ide.h;

import com.zend.ide.j.bd;
import com.zend.ide.j.h;
import com.zend.ide.j.t;
import com.zend.ide.j.u;
import com.zend.ide.p.d.bl;
import com.zend.ide.p.d.bm;
import com.zend.ide.util.c.f;
import com.zend.ide.util.cl;
import com.zend.ide.util.d.g;
import com.zend.ide.util.eo;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.filechooser.FileFilter;

public class bh extends bg
{
  final be l;

  public bh(be parambe, Object paramObject)
  {
    super(parambe, paramObject, bl.q.isTraversable((File)paramObject).booleanValue());
    parambe.a(paramObject, this);
  }

  protected Icon c(boolean paramBoolean)
  {
    File localFile = (File)getUserObject();
    return be.a(this.l).a(localFile, paramBoolean);
  }

  public Object b()
  {
    File localFile = (File)getUserObject();
    if ((!localFile.exists()) || (!bl.q.isTraversable(localFile).booleanValue()))
      return null;
    Object localObject = this.l.n.n(localFile);
    localObject = this.l.a(localObject);
    localObject = be.b(localObject);
    return localObject;
  }

  protected void d()
  {
    this.l.a(true);
    try
    {
      this.l.n.o((File)getUserObject());
    }
    finally
    {
      this.l.a(false);
    }
    g();
  }

  protected String h()
  {
    return be.a(this.l).getName((File)getUserObject());
  }

  public void setUserObject(Object paramObject)
  {
    Object localObject = getUserObject();
    if (localObject != null)
    {
      bg localbg = this.l.f(localObject);
      if (localbg != this)
        throw new RuntimeException(this + ": My User Object: " + paramObject + " in use by another node: " + localbg);
    }
    if (paramObject != null)
      this.l.a(paramObject, this);
    super.setUserObject(paramObject);
    g();
    a(true);
  }

  public void a(Object paramObject)
  {
    File localFile = (File)getUserObject();
    if ((paramObject instanceof String))
    {
      String str1 = (String)paramObject;
      String str2 = localFile.getParent();
      paramObject = h.m.a(str2, str1);
    }
    try
    {
      this.l.a(true);
      t.a(localFile, (File)paramObject, this.l);
    }
    finally
    {
      this.l.a(false);
    }
  }

  protected void j()
  {
    File localFile = (File)getUserObject();
    this.h = be.d(localFile);
    this.j = be.e(localFile);
    this.i = be.f(localFile);
    if (this.h)
      this.f = "root";
    else
      this.f = (localFile.isDirectory() ? "directory" : "file");
    this.g = false;
  }

  public boolean n()
  {
    return !be.d((File)getUserObject());
  }

  protected void a(int paramInt, f paramf)
  {
    if ((getUserObject() instanceof bd))
    {
      super.a(eo.c, paramf);
      return;
    }
    super.a(paramInt, paramf);
  }

  protected void b(Object paramObject)
  {
    if (!this.a)
      return;
    File localFile = (File)paramObject;
    if ((be.b(this.l) != null) && (!be.b(this.l).accept(localFile)))
      return;
    ArrayList localArrayList = new ArrayList();
    if (this.children != null)
      synchronized (this.children)
      {
        for (int i = 0; i < this.children.size(); i++)
          localArrayList.add(((bg)this.children.get(i)).getUserObject());
      }
    if (localArrayList.contains(paramObject))
      return;
    localArrayList.add(paramObject);
    try
    {
      be.a(localArrayList);
      __x = new ArrayList();
      ((ArrayList)__x).add(this.l.d(localFile));
      g localg = new g();
      localg.b(localArrayList.indexOf(paramObject));
      a(null, (ArrayList)__x, localg);
    }
    catch (Exception localException)
    {
      cl.a(localException);
      this.l.a(this, eo.b, false);
      return;
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.h.bh
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.j;

import com.zend.ide.y.b;
import com.zend.ide.y.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;

class o
{
  private Timer a;
  private List b = new ArrayList();
  private bb c;
  private int d = 1500;
  private boolean e;
  final e f;

  o(e parame)
  {
    a(((Boolean)b.a("filesystem.filesystemModificationCheckEnabled").c()).booleanValue());
  }

  public List a(File paramFile)
  {
    Iterator localIterator = this.b.iterator();
    ArrayList localArrayList = new ArrayList();
    while (localIterator.hasNext())
    {
      p localp = (p)localIterator.next();
      if (localp.a.getPath().startsWith(paramFile.getPath()))
        localArrayList.add(localp.a);
    }
    return localArrayList;
  }

  public synchronized void b(File paramFile)
  {
    p localp = new p(this, paramFile);
    if (!this.b.contains(localp))
      this.b.add(localp);
  }

  public synchronized boolean c(File paramFile)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      p localp = (p)localIterator.next();
      if (localp.a.equals(paramFile))
      {
        localIterator.remove();
        return true;
      }
    }
    return false;
  }

  public void a(boolean paramBoolean)
  {
    if (paramBoolean == this.e)
      return;
    this.e = paramBoolean;
    if (paramBoolean)
    {
      this.a = new Timer();
      this.c = new bb(this);
      this.a.scheduleAtFixedRate(this.c, this.d, this.d);
    }
    else
    {
      this.a.cancel();
      this.c.cancel();
    }
  }

  public void a(int paramInt)
  {
    this.d = paramInt;
    if (this.e)
    {
      this.a.cancel();
      this.a = new Timer();
      this.c = new bb(this);
      this.a.scheduleAtFixedRate(this.c, this.d, this.d);
    }
  }

  static List a(o paramo)
  {
    return paramo.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.o
 * JD-Core Version:    0.6.0
 */
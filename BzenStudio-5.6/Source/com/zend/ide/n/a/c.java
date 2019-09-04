package com.zend.ide.n.a;

import com.zend.ide.n.bu;
import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import java.awt.Color;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

public class c extends b
{
  private boolean g;
  private l h;
  private bu i;
  private Hashtable j = new Hashtable();

  public c(String paramString, bw parambw, int paramInt)
  {
    super(paramString, parambw);
    a(false);
    a(Color.red);
    this.i = new bu(parambw, paramInt);
  }

  protected void a(e parame, boolean paramBoolean)
  {
    super.a(parame, paramBoolean);
    if (j())
      e(parame);
  }

  protected void d(e parame)
  {
    super.d(parame);
    f(parame);
  }

  protected void a(e parame, int paramInt)
  {
    super.a(parame, paramInt);
    if (this.g)
    {
      f(parame);
      e(parame);
    }
  }

  private void e(e parame)
  {
    dz localdz = d().a(parame.j());
    if (localdz == null)
      return;
    try
    {
      int k = localdz.getLineStartOffset(parame.b());
      Object localObject = this.i.a(parame.j(), k, k + 1, this.h);
      this.j.put(parame, localObject);
    }
    catch (Exception localException)
    {
    }
  }

  private void f(e parame)
  {
    String str = parame.j();
    Object localObject = this.j.remove(parame);
    if (localObject != null)
      this.i.a(str, localObject);
  }

  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
    Iterator localIterator = m().iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      if (paramBoolean)
        e(locale);
      else
        f(locale);
    }
  }

  public boolean j()
  {
    return this.g;
  }

  public void a(Color paramColor)
  {
    this.h = new l(paramColor);
    if (j())
    {
      a(false);
      a(true);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.a.c
 * JD-Core Version:    0.6.0
 */
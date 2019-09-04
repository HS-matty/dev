package com.zend.ide.n.a;

import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import com.zend.ide.n.is;
import com.zend.ide.n.it;
import java.awt.Color;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

public class m extends b
{
  private Hashtable g = new Hashtable();
  private Color h;

  public m(String paramString, bw parambw)
  {
    super(paramString, parambw);
  }

  protected void a(e parame, boolean paramBoolean)
  {
    super.a(parame, paramBoolean);
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
    f(parame);
    e(parame);
  }

  private void e(e parame)
  {
    String str = parame.j();
    dz localdz = d().a(str);
    if (localdz == null)
      return;
    is localis = g(parame);
    this.g.put(parame, localis);
    d().a(str, localis, 0);
  }

  private void f(e parame)
  {
    String str = parame.j();
    is localis = (is)this.g.remove(parame);
    if (localis != null)
      d().a(str, localis);
  }

  public void a(Color paramColor)
  {
    this.h = paramColor;
    Iterator localIterator = m().iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      f(locale);
      e(locale);
    }
  }

  public Color j()
  {
    return this.h;
  }

  protected is g(e parame)
  {
    return new it(j(), parame.b(), "", 1);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.a.m
 * JD-Core Version:    0.6.0
 */
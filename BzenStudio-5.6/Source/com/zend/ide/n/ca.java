package com.zend.ide.n;

import com.zend.ide.a.a;
import com.zend.ide.y.i;

public abstract class ca
  implements a
{
  private Object a;
  private bw b;
  private i c;

  public ca(Object paramObject)
  {
    this.a = paramObject;
  }

  public void a(Object paramObject)
  {
    if (!(paramObject instanceof bw))
      throw new IllegalArgumentException("must install IDEEditor on IDEEditor");
    this.b = ((bw)paramObject);
    a(this.b);
    this.c = new i(b().c());
    d();
  }

  public Object j()
  {
    return this.a;
  }

  protected bw b()
  {
    return this.b;
  }

  protected i c()
  {
    return this.c;
  }

  protected abstract void a(bw parambw);

  protected abstract void d();
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ca
 * JD-Core Version:    0.6.0
 */
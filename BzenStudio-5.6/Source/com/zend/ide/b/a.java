package com.zend.ide.b;

public abstract class a
  implements h
{
  private b a = e();
  private String b = "...";
  protected StringBuffer c = new StringBuffer();
  protected int d;

  public String a(d paramd)
  {
    return b(paramd, -1);
  }

  public String a(d paramd, int paramInt)
  {
    return b(paramd, paramInt);
  }

  protected abstract b e();

  public String b()
  {
    return this.b;
  }

  public String b(d paramd, int paramInt)
  {
    this.c.setLength(0);
    this.d = paramInt;
    paramd.a(this.a);
    d();
    return this.c.toString();
  }

  private void d()
  {
    if (this.d < 0)
      return;
    if (this.c.length() <= this.d)
      return;
    int i = b().length();
    int j = Math.max(0, this.d - i);
    this.c.setLength(j);
    this.c.append(b());
    this.c.setLength(this.d);
  }

  protected void b(d paramd)
  {
    this.c.append(paramd.a());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.b.a
 * JD-Core Version:    0.6.0
 */
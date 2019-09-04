package com.zend.ide.fb;

public class j
{
  private Boolean[] a = { Boolean.FALSE, Boolean.FALSE };
  private int b = 0;

  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a[0] = Boolean.valueOf(paramBoolean1);
    this.a[1] = Boolean.valueOf(paramBoolean2);
  }

  public int a()
  {
    return this.b;
  }

  public void a(int paramInt)
  {
    this.b = paramInt;
  }

  public boolean b()
  {
    return this.a[0].booleanValue();
  }

  public boolean c()
  {
    return this.a[1].booleanValue();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.fb.j
 * JD-Core Version:    0.6.0
 */
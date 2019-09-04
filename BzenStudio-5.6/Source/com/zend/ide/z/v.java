package com.zend.ide.z;

class v
  implements Comparable
{
  private double a;
  private String b;

  public v(double paramDouble, String paramString)
  {
    this.a = paramDouble;
    this.b = paramString;
  }

  public double c()
  {
    return this.a;
  }

  public String b()
  {
    return this.b;
  }

  public void a(double paramDouble)
  {
    this.a = paramDouble;
  }

  public int compareTo(Object paramObject)
  {
    double d = ((v)paramObject).c();
    if (this.a - d <= 0.0D)
    {
      if (this.a - d == 0.0D)
        return 0;
      return -1;
    }
    return 1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.v
 * JD-Core Version:    0.6.0
 */
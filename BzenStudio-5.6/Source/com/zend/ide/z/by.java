package com.zend.ide.z;

import java.text.DecimalFormat;
import javax.swing.tree.DefaultMutableTreeNode;

public class by extends DefaultMutableTreeNode
  implements Comparable
{
  private double a = 100.0D;
  private int b = 0;
  private r c;
  private double d;

  private by(Object paramObject)
  {
    super(paramObject);
  }

  public int b()
  {
    return this.b;
  }

  private void a(int paramInt)
  {
    this.b = paramInt;
  }

  public r c()
  {
    return this.c;
  }

  private void a(r paramr)
  {
    this.c = paramr;
  }

  public String d()
  {
    return bp.d().format(this.d);
  }

  public double e()
  {
    return this.d;
  }

  private void b(double paramDouble)
  {
    this.d = paramDouble;
  }

  public double f()
  {
    return this.a;
  }

  private void a(double paramDouble)
  {
    this.a = (Math.round(paramDouble * 100.0D) / 100.0D);
  }

  public int compareTo(Object paramObject)
  {
    by localby = (by)paramObject;
    if (bp.e() == bp.f())
    {
      double d1 = localby.e();
      if (this.d == d1)
        return 0;
      if (this.d < d1)
        return 1;
      return -1;
    }
    int i = localby.b();
    if (this.b == i)
      return 0;
    if (this.b < i)
      return -1;
    return 1;
  }

  public String toString()
  {
    return "Total time=" + c().i() + ", Own time=" + c().j() + ", function=" + c().k() + ", file=" + c().b();
  }

  by(Object paramObject, a parama)
  {
    this(paramObject);
  }

  static void a(by paramby, r paramr)
  {
    paramby.a(paramr);
  }

  static void a(by paramby, int paramInt)
  {
    paramby.a(paramInt);
  }

  static void a(by paramby, double paramDouble)
  {
    paramby.b(paramDouble);
  }

  static void b(by paramby, double paramDouble)
  {
    paramby.a(paramDouble);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.by
 * JD-Core Version:    0.6.0
 */
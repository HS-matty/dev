package com.zend.ide.n.td;

import com.zend.ide.util.cl;
import java.util.ArrayList;
import java.util.List;

public class pb
{
  private Object a = new Object();
  private gb[] b = new gb[10];
  private int c = 0;
  private int d = -1;

  private void a(gb paramgb, int paramInt)
  {
    if (paramInt <= this.c)
    {
      a(this.c + 1);
      if (paramInt < this.c)
        System.arraycopy(this.b, paramInt, this.b, paramInt + 1, this.c - paramInt);
      this.b[paramInt] = paramgb;
      this.c += 1;
    }
  }

  private void a(int paramInt)
  {
    if (this.b == null)
    {
      this.b = new gb[10];
      return;
    }
    int i = this.b.length;
    if (paramInt > i)
    {
      gb[] arrayOfgb = this.b;
      int j = i * 3 / 2 + 1;
      if (j < paramInt)
        j = paramInt;
      this.b = new gb[j];
      System.arraycopy(arrayOfgb, 0, this.b, 0, this.c);
    }
  }

  public void a(gb paramgb)
  {
    synchronized (this.a)
    {
      int i = c(paramgb.d());
      gb localgb;
      if (i < this.c)
      {
        localgb = this.b[i];
        if (localgb.equals(paramgb))
        {
          a(i, paramgb);
          for (int j = i; j < this.c; j++)
          {
            localgb = this.b[i];
            if (!paramgb.equals(localgb))
              break;
            a(i, paramgb);
          }
          if (i > 0)
            for (j = i - 1; j > -1; j--)
            {
              localgb = this.b[j];
              if (!localgb.equals(paramgb))
                break;
              a(j, paramgb);
            }
        }
        else
        {
          if ((localgb.d() <= paramgb.d()) && (localgb.e() >= paramgb.d()))
          {
            localgb.j().a(paramgb);
            return;
          }
          if (i > 0)
          {
            localgb = this.b[(i - 1)];
            if ((localgb.d() <= paramgb.d()) && (localgb.e() >= paramgb.d()))
            {
              localgb.j().a(paramgb);
              return;
            }
          }
        }
      }
      else if (this.c > 0)
      {
        localgb = b(this.c - 1);
        if ((localgb.d() <= paramgb.d()) && (localgb.e() >= paramgb.d()))
          localgb.j().a(paramgb);
      }
    }
  }

  private void a(int paramInt, gb paramgb)
  {
    int i;
    if (paramgb.k() == 0)
    {
      i = this.c - paramInt - 1;
      if (i > 0)
        System.arraycopy(this.b, paramInt + 1, this.b, paramInt, i);
      this.b[(--this.c)] = null;
    }
    else
    {
      i = paramgb.k();
      gb[] arrayOfgb1 = paramgb.j().b;
      ArrayList localArrayList = new ArrayList(i);
      for (int j = 0; j < i; j++)
      {
        gb localgb = arrayOfgb1[j];
        if (localgb.d() == localgb.e())
          continue;
        localArrayList.add(localgb);
      }
      if (localArrayList.size() != i)
      {
        i = localArrayList.size();
        arrayOfgb1 = new gb[i];
        localArrayList.toArray(arrayOfgb1);
      }
      if (i > 1)
      {
        if (this.c + i - 1 > this.b.length)
        {
          gb[] arrayOfgb2 = new gb[(this.c + i - 1) * 3 / 2 + 1];
          System.arraycopy(this.b, 0, arrayOfgb2, 0, paramInt);
          System.arraycopy(arrayOfgb1, 0, arrayOfgb2, paramInt, i);
          System.arraycopy(this.b, paramInt + 1, arrayOfgb2, paramInt + i, this.c - paramInt - 1);
          this.b = arrayOfgb2;
        }
        else
        {
          System.arraycopy(this.b, paramInt + 1, this.b, paramInt + i, this.c - paramInt - 1);
          System.arraycopy(arrayOfgb1, 0, this.b, paramInt, i);
        }
        this.c += i - 1;
      }
      else if (i == 0)
      {
        this.c -= 1;
        this.b[paramInt] = null;
        if (paramInt < this.c)
        {
          System.arraycopy(this.b, 0, this.b, 0, paramInt);
          System.arraycopy(this.b, paramInt + 1, this.b, paramInt, this.c - paramInt);
        }
      }
      else
      {
        this.b[paramInt] = arrayOfgb1[0];
      }
    }
    if (this.d >= this.c)
      this.d = (this.c - 1);
  }

  public void a(List paramList)
  {
    synchronized (this.a)
    {
      for (int i = 0; i < paramList.size(); i++)
        c((gb)paramList.get(i));
    }
  }

  public void b(List paramList)
  {
    synchronized (this.a)
    {
      for (int i = 0; i < paramList.size(); i++)
        a((gb)paramList.get(i));
    }
  }

  public void a()
  {
    synchronized (this.a)
    {
      this.d = -1;
      if (this.c == 0)
        return;
      this.b = new gb[10];
      this.c = 0;
    }
  }

  public int b()
  {
    synchronized (this.a)
    {
      return this.c;
    }
  }

  public gb b(int paramInt)
    throws ArrayIndexOutOfBoundsException
  {
    synchronized (this.a)
    {
      if ((paramInt >= this.c) || (paramInt < 0))
        throw new ArrayIndexOutOfBoundsException("No such Fold at index - " + paramInt);
      return this.b[paramInt];
    }
  }

  protected int c(int paramInt)
  {
    synchronized (this.a)
    {
      if (this.c == 0)
        return 0;
      if (this.d < 0)
      {
        if (this.c > 16)
          return d(paramInt);
        return a(paramInt, 1);
      }
      gb localgb = this.b[this.d];
      int i = localgb.d();
      if (i == paramInt)
        return this.d;
      if (i < paramInt)
      {
        if (this.c - this.d > 16)
          return d(paramInt);
        return a(paramInt, 1);
      }
      if (this.d > 16)
        return d(paramInt);
      return a(paramInt, -1);
    }
  }

  private int a(int paramInt1, int paramInt2)
  {
    int j;
    if (paramInt2 > 0)
    {
      if ((this.d > -1) && (this.d < this.c))
      {
        if ((this.b[this.d].d() < paramInt1) && (this.d + 1 == this.c))
          return this.c;
        if (this.b[this.d].e() >= paramInt1)
          return this.d;
      }
      gb localgb = this.b[(this.c - 1)];
      if (paramInt1 > localgb.d())
        return this.c;
      this.d += 1;
      for (j = this.d; j < this.c; j++)
      {
        this.d = j;
        if (this.b[j].e() >= paramInt1)
          break;
      }
    }
    else
    {
      if (this.d > 0)
        this.d -= 1;
      for (int i = this.d; i >= 0; i--)
      {
        j = this.b[i].d();
        if (j < paramInt1)
        {
          if (this.b[i].e() < paramInt1)
          {
            this.d = (i + 1);
            break;
          }
          this.d = i;
          break;
        }
        if (j == paramInt1)
        {
          this.d = i;
          break;
        }
        this.d = i;
      }
    }
    return this.d;
  }

  private int d(int paramInt)
  {
    int j = 0;
    int k = this.c - 1;
    int m = 0;
    int n = this.b[0].d();
    if (this.c == 0)
      return 0;
    gb localgb1 = this.b[(this.c - 1)];
    if (paramInt > localgb1.d())
      return this.c;
    gb localgb2;
    if ((this.d >= j) && (this.d <= k))
    {
      localgb2 = this.b[this.d];
      n = localgb2.d();
      if (paramInt < n)
        k = this.d;
      else
        j = this.d;
    }
    int i;
    while (j <= k)
    {
      m = j + (k - j) / 2;
      localgb2 = this.b[m];
      n = localgb2.d();
      int i1 = localgb2.e() + 1;
      if ((paramInt >= n) && (paramInt <= i1))
      {
        i = m;
        this.d = i;
        return i;
      }
      if (paramInt < n)
        k = m - 1;
      else
        j = m + 1;
    }
    if (paramInt < n)
      i = m;
    else
      i = m + 1;
    this.d = i;
    return i;
  }

  public gb e(int paramInt)
  {
    gb localgb = f(paramInt);
    if (localgb == null)
      return null;
    if (localgb.c())
      return localgb;
    pb localpb = localgb.j();
    if ((localpb == null) || (localpb.b() == 0))
      return null;
    return localpb.e(paramInt);
  }

  public gb f(int paramInt)
  {
    gb localgb = h(paramInt);
    if ((localgb != null) && (localgb.d() <= paramInt) && (localgb.e() >= paramInt))
      return localgb;
    while (localgb != null)
    {
      localgb = b(localgb);
      if ((localgb != null) && (localgb.d() <= paramInt) && (localgb.e() >= paramInt))
        return localgb;
    }
    return null;
  }

  private gb b(gb paramgb)
  {
    int i = paramgb.d();
    if (b() == 0)
      return null;
    int j = c(i);
    if (j >= b())
      j--;
    gb localgb1 = b(j);
    if (paramgb.equals(localgb1))
      return null;
    pb localpb = localgb1.j();
    int k = localpb.c(i);
    if (k >= localpb.b())
      k--;
    gb localgb2 = null;
    try
    {
      localgb2 = localpb.b(k);
      if (paramgb.equals(localgb2))
        return localgb1;
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
    }
    return localgb2;
  }

  public List g(int paramInt)
  {
    ArrayList localArrayList = new ArrayList(3);
    int i = 0;
    pb localpb = this;
    while (i < 3)
    {
      int j = localpb.b();
      if (j == 0)
        break;
      int k = localpb.c(paramInt);
      if (j == k)
        k--;
      gb localgb = localpb.b(k);
      if (!b(paramInt, localgb))
        break;
      localArrayList.add(localgb);
      localpb = localgb.j();
      i++;
    }
    if (localArrayList.size() == 0)
      return null;
    return localArrayList;
  }

  private static boolean b(int paramInt, gb paramgb)
  {
    return (paramgb != null) && (paramgb.d() <= paramInt) && (paramgb.e() >= paramInt);
  }

  public gb h(int paramInt)
  {
    if (b() == 0)
      return null;
    int i = c(paramInt);
    if (b() == i)
      i--;
    gb localgb = b(i);
    if ((paramInt > localgb.d()) && (paramInt < localgb.e()))
    {
      pb localpb = localgb.j();
      if ((localpb == null) || (localpb.b() == 0))
        return localgb;
      return localpb.h(paramInt);
    }
    return localgb;
  }

  public void c(gb paramgb)
  {
    synchronized (this.a)
    {
      int i = paramgb.d();
      int j = c(i);
      gb localgb1;
      if (b() == j)
      {
        if (j > 0)
        {
          localgb1 = b(j - 1);
          if ((localgb1.d() < i) && (localgb1.e() > i))
          {
            localgb1.j().c(paramgb);
            return;
          }
          if (localgb1.d() == i)
            return;
        }
        a(paramgb, j);
        return;
      }
      if (j < b())
      {
        localgb1 = b(j);
        if (localgb1.d() == i)
          return;
        if ((localgb1.d() <= i) && (localgb1.e() >= i))
        {
          localgb1.j().c(paramgb);
          return;
        }
      }
      if (j > 0)
      {
        localgb1 = b(j - 1);
        if ((localgb1.d() <= i) && (localgb1.e() >= i))
        {
          localgb1.j().c(paramgb);
          return;
        }
      }
      if ((j == 0) && (this.c > 0))
      {
        localgb1 = b(0);
        if ((localgb1.d() <= i) && (localgb1.e() >= i))
        {
          localgb1.j().c(paramgb);
          return;
        }
      }
      a(paramgb, j);
      int k = paramgb.e();
      j++;
      int m = j;
      int n = 0;
      int i1 = this.c;
      while (j < i1)
      {
        gb localgb2 = this.b[j];
        if (k <= localgb2.d())
          break;
        n++;
        j++;
        paramgb.j().c(localgb2);
      }
      if (n > 0)
      {
        this.c -= n;
        try
        {
          int i2 = n + m;
          if (i2 < i1)
          {
            int i4 = i1 - i2 + 1;
            if (i4 + i2 > this.b.length)
              i4 = this.b.length - i2;
            System.arraycopy(this.b, i2, this.b, m, i4);
          }
        }
        catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
        {
          cl.a(localArrayIndexOutOfBoundsException);
          cl.a("ArrayIndexOutOfBoundsException: fromIndex = " + m + ", movedCount = " + n + ", folds length = " + this.b.length);
        }
        if (this.d >= this.c)
          this.d = (this.c - 1);
        for (int i3 = this.c; i3 < this.c + n; i3++)
          this.b[i3] = null;
      }
    }
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("FoldsArray(");
    localStringBuffer.append(b());
    localStringBuffer.append(") {");
    for (int i = 0; i < this.c; i++)
    {
      localStringBuffer.append(this.b[i]);
      if (i == this.c - 1)
        continue;
      localStringBuffer.append(", ");
    }
    localStringBuffer.append('}');
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.pb
 * JD-Core Version:    0.6.0
 */
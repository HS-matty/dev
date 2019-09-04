package com.zend.ide.s;

import com.zend.ide.util.d.a;
import javax.swing.text.Segment;

public class tb
  implements bk
{
  private static final char[] a = a("");
  private static final int[] b = { 0, 28, 56, 84, 112, 140, 168, 196, 224, 252, 280, 308, 308, 308, 336, 308, 364, 336, 308, 392, 420, 308, 336, 308, 308, 448, 336, 308, 308, 308, 476, 504, 308, 532, 560, 308, 308, 308, 588, 308, 616, 644, 672, 700, 728, 756, 784, 812, 840, 868, 896, 924, 952, 980, 1008, 1036, 308, 1064, 308, 308, 1092, 308, 308, 1120, 308, 1148, 1176, 1204, 308 };
  private static final int[] c = c();
  private static final String[] d = { "Unkown internal scanner error", "Internal error: unknown state", "Error: could not match input", "Error: pushback value was too large" };
  private static final byte[] e = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 1, 9, 1, 1, 9, 1, 1, 9, 1, 9, 9, 1, 1, 9, 9, 9, 1, 1, 9, 1, 1, 9, 9, 9, 1, 9, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 9, 9, 0, 9, 9, 0, 9, 0, 0, 0, 9 };
  private int f;
  private int g = 0;
  private char[] h = new char[16384];
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private boolean o = true;
  private boolean p;
  private int q = -1;
  private bm r;
  private static a s = new a(100);

  public tb(int paramInt)
  {
    a(paramInt);
  }

  public Object c()
  {
    d();
    return b();
  }

  public Object b()
  {
    int i1 = b();
    Object localObject = s.b(i1);
    if (localObject == null)
    {
      localObject = new ub(this);
      s.a(i1, localObject);
    }
    return localObject;
  }

  public int d()
  {
    int i1 = s();
    int i2 = i1;
    while (i1 != -1)
    {
      i2 = i1;
      i1 = s();
    }
    return i2;
  }

  public int a(int paramInt)
  {
    if (this.q + paramInt < this.i)
      throw new RuntimeException("Bad offset");
    for (int i1 = s(); (this.i < this.q + paramInt) && (i1 != -1); i1 = s());
    return i1;
  }

  public int e()
  {
    return this.i;
  }

  public int f()
  {
    return this.q;
  }

  public void a(int paramInt1, int paramInt2, Segment paramSegment)
  {
    if (paramInt1 + paramInt2 > this.m)
      throw new RuntimeException("bad segment !!");
    paramSegment.array = this.h;
    paramSegment.offset = paramInt1;
    paramSegment.count = paramInt2;
  }

  public void a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    this.h = paramArrayOfChar;
    this.k = paramInt1;
    this.i = paramInt1;
    this.j = paramInt1;
    this.n = paramInt1;
    this.m = (paramInt1 + paramInt2);
    this.l = paramInt1;
    this.p = (this.k >= this.m);
    this.q = paramInt1;
  }

  public void a(Segment paramSegment)
  {
    a(paramSegment.array, paramSegment.offset, paramSegment.count);
  }

  public void a(Object paramObject)
  {
    ((bl)paramObject).a(this);
  }

  public void a(int paramInt)
  {
    this.r = new bm();
    b(paramInt);
  }

  private void b(int paramInt)
  {
    d(paramInt);
  }

  private void c(int paramInt)
  {
    this.r.a(this.g);
    d(paramInt);
  }

  private void a()
  {
    d(this.r.b());
  }

  private int b()
  {
    int i1 = this.g;
    for (int i2 = 0; i2 < this.r.e(); i2++)
      i1 = 31 * i1 + this.r.c(i2);
    return i1;
  }

  private static int[] c()
  {
    int[] arrayOfInt = new int[1232];
    int i1 = 0;
    i1 = a("", i1, arrayOfInt);
    return arrayOfInt;
  }

  private static int a(String paramString, int paramInt, int[] paramArrayOfInt)
  {
    int i1 = 0;
    int i2 = paramInt;
    int i3 = paramString.length();
    while (i1 < i3)
    {
      int i4 = paramString.charAt(i1++);
      int i5 = paramString.charAt(i1++);
      i5--;
      do
      {
        paramArrayOfInt[(i2++)] = i5;
        i4--;
      }
      while (i4 > 0);
    }
    return i2;
  }

  private static char[] a(String paramString)
  {
    char[] arrayOfChar = new char[65536];
    int i1 = 0;
    int i2 = 0;
    while (i1 < 166)
    {
      int i3 = paramString.charAt(i1++);
      int i4 = paramString.charAt(i1++);
      do
      {
        arrayOfChar[(i2++)] = i4;
        i3--;
      }
      while (i3 > 0);
    }
    return arrayOfChar;
  }

  private boolean d()
  {
    return this.k >= this.m;
  }

  public final void d(int paramInt)
  {
    this.g = paramInt;
  }

  public final int g()
  {
    return this.i - this.l;
  }

  private void e(int paramInt)
  {
    String str;
    try
    {
      str = d[paramInt];
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      str = d[0];
    }
    throw new Error(str);
  }

  private void f(int paramInt)
  {
    if (paramInt > g())
      e(3);
    this.i -= paramInt;
  }

  public int s()
  {
    int i6 = this.m;
    char[] arrayOfChar1 = this.h;
    char[] arrayOfChar2 = a;
    int[] arrayOfInt1 = c;
    int[] arrayOfInt2 = b;
    byte[] arrayOfByte = e;
    while (true)
    {
      int i5 = this.i;
      int i2 = -1;
      int i3;
      int i4 = i3 = this.k = this.l = i5;
      this.f = this.g;
      int i1;
      while (true)
      {
        if (i3 < i6)
        {
          i1 = arrayOfChar1[(i3++)];
        }
        else
        {
          if (this.p)
          {
            i1 = -1;
            break;
          }
          this.k = i3;
          this.i = i5;
          boolean bool = d();
          i3 = this.k;
          i5 = this.i;
          arrayOfChar1 = this.h;
          i6 = this.m;
          if (bool)
          {
            i1 = -1;
            break;
          }
          i1 = arrayOfChar1[(i3++)];
        }
        int i7 = arrayOfInt1[(arrayOfInt2[this.f] + arrayOfChar2[i1])];
        if (i7 == -1)
          break;
        this.f = i7;
        int i8 = arrayOfByte[this.f];
        if ((i8 & 0x1) == 1)
        {
          i2 = this.f;
          i5 = i3;
          if ((i8 & 0x8) == 8)
            break;
        }
      }
      this.i = i5;
      switch (i2)
      {
      case 58:
        b(5);
        return sb.b;
      case 70:
        break;
      case 36:
        b(3);
        return sb.e;
      case 71:
        break;
      case 45:
        c(10);
        return sb.i;
      case 72:
        break;
      case 31:
      case 46:
        b(2);
        return sb.b;
      case 73:
        break;
      case 32:
      case 33:
        return sb.f;
      case 74:
        break;
      case 34:
        return sb.f;
      case 75:
        break;
      case 37:
        return sb.i;
      case 76:
        break;
      case 61:
        b(1);
        return sb.b;
      case 77:
        break;
      case 59:
        a();
        return sb.f;
      case 78:
        break;
      case 39:
        a();
        b(5);
        return sb.i;
      case 79:
        break;
      case 35:
        return sb.e;
      case 80:
        break;
      case 18:
        b(5);
        return sb.b;
      case 81:
        break;
      case 11:
        f(1);
        c(5);
      case 82:
        break;
      case 38:
        a();
        return sb.j;
      case 83:
        break;
      case 12:
      case 14:
        return sb.b;
      case 84:
        break;
      case 16:
        b(3);
      case 85:
        break;
      case 56:
        f(1);
        c(10);
      case 86:
        break;
      case 27:
        b(9);
        return sb.e;
      case 87:
        break;
      case 28:
        b(8);
        return sb.e;
      case 88:
        break;
      case 24:
      case 26:
        f(1);
        c(10);
      case 89:
        break;
      case 62:
        return sb.h;
      case 90:
        break;
      case 64:
        c(7);
        return sb.f;
      case 91:
        break;
      case 21:
      case 22:
        return sb.d;
      case 92:
        break;
      case 15:
      case 17:
      case 19:
      case 20:
        return sb.c;
      case 93:
        break;
      case 13:
        b(5);
        return sb.i;
      case 94:
        break;
      case 29:
        return sb.g;
      case 95:
        break;
      case 30:
        return sb.i;
      case 96:
        break;
      case 68:
        b(6);
        return sb.b;
      case 97:
        break;
      case 23:
        b(4);
        return sb.d;
      case 98:
        break;
      case 25:
        return sb.j;
      case 99:
        break;
      case 40:
      case 41:
      case 42:
      case 43:
      case 44:
      case 47:
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 57:
      case 60:
      case 63:
      case 65:
      case 66:
      case 67:
      case 69:
      default:
        if ((i1 == -1) && (this.l == this.k))
        {
          this.p = true;
          return -1;
        }
        e(2);
      }
    }
  }

  static int a(tb paramtb)
  {
    return paramtb.g;
  }

  static bm b(tb paramtb)
  {
    return paramtb.r;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.tb
 * JD-Core Version:    0.6.0
 */
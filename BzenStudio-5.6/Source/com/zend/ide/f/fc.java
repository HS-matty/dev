package com.zend.ide.f;

import com.b.a.b;
import com.b.a.c;
import com.zend.ide.s.bm;
import com.zend.ide.util.d.a;
import java.io.IOException;
import java.io.Reader;

class fc extends bi
  implements b
{
  private static final int[] a = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11 };
  private static final char[] b = a("");
  private static final int[] c = { 0, 66, 132, 198, 264, 330, 396, 462, 528, 594, 660, 726, 792, 858, 924, 990, 1056, 1122, 1188, 1254, 1320, 1386, 1452, 1518, 924, 1584, 1650, 1716, 1782, 1848, 1914, 1980, 2046, 2112, 2178, 2244, 2310, 2376, 2442, 2508, 2574, 2640, 2706, 2772, 2838, 924, 2904, 2970, 3036, 3102, 3168, 3234, 3300, 3366, 3432, 924, 924, 924, 924, 924, 3498, 3564, 924, 924, 924, 3630, 3696, 924, 3762, 3828, 3894, 3960, 4026, 4092, 924, 4158, 4224, 4290, 924, 4356, 4422, 4488, 924, 4554, 4620, 4686, 4752, 924, 4818, 924, 4884, 4950, 5016, 924, 5082, 924, 5148, 5214, 5280, 924, 924, 5346, 5412, 5478, 5544, 5610, 5676, 5742, 924, 5808, 5874, 5940, 6006, 6072, 6138, 924, 924, 6204, 6270, 6336, 1452, 6402, 6468, 6534, 6600, 1452, 6666, 1452, 6732, 6798, 6864, 6930, 6996, 7062, 7128, 7194, 7260, 7326, 7392, 7458, 7524, 7590, 7656, 7722, 1452, 7788, 7854, 924, 924, 924, 7920, 924, 924, 7986, 8052, 2772, 8118, 8184, 8250, 8316, 8382, 8448, 8514, 8580, 8646, 924, 8712, 8778, 924, 924, 8844, 8910, 924, 924, 8976, 9042, 924, 924, 924, 924, 924, 924, 9108, 9174, 3630, 924, 9240, 3696, 9306, 9372, 3828, 924, 924, 924, 924, 9438, 9504, 924, 9570, 9636, 924, 9702, 924, 924, 924, 924, 924, 9768, 9834, 9900, 9900, 9966, 10032, 10098, 10164, 10230, 10296, 10362, 6204, 1452, 10428, 10494, 10560, 10626, 10692, 1452, 10758, 10824, 10890, 10956, 11022, 11088, 11154, 11220, 1452, 1452, 11286, 11352, 11418, 11484, 11550, 11616, 11682, 11748, 1452, 11814, 11880, 924, 1452, 11946, 12012, 12078, 12144, 12210, 12276, 12342, 12408, 12474, 12540, 924, 924, 924, 12606, 12672, 12738, 12804, 12870, 12936, 924, 13002, 924, 9372, 13068, 13134, 13200, 13266, 13332, 13398, 13464, 13530, 13596, 13662, 13728, 1452, 1452, 13794, 13860, 13926, 13992, 14058, 14124, 14190, 14256, 1452, 14322, 14388, 14454, 14520, 14586, 14652, 14718, 14784, 14850, 14916, 1452, 14982, 15048, 15114, 15180, 15246, 15312, 15378, 15444, 15510, 15576, 15642, 15708, 15774, 15840, 15906, 15972, 16038, 16104, 16170, 16236, 16302, 16368, 16434, 16500, 1452, 16566, 16632, 16698, 16764, 1452, 1452, 16830, 1452, 16896, 16962, 17028, 17094, 17160, 17226, 17292, 17358, 17424, 17490, 1452, 17556, 1452, 1452, 17622, 17688, 17754, 17820, 1452, 1452, 1452, 17886, 17952, 18018, 924, 18084, 18150, 18216, 18282, 18348, 18414, 18480, 18546, 18612, 924, 18678, 18744, 18810, 924, 18876, 18942, 1452, 19008, 19074, 19140, 19206, 19272, 1452, 19338, 19404, 19470, 19536, 19602, 19668, 19734, 19800, 19866, 19932, 1452, 1452, 1452, 19998, 20064, 20130, 924, 20196, 20262, 20328, 20394, 20460, 924, 20526, 1452, 20592, 20658, 20724, 1452, 20790, 20856, 20922, 20988, 21054, 1452, 1452, 21120, 21186, 21252, 21318, 21384, 1452, 21450, 21516, 21582, 21648, 21714, 21780, 924, 21846, 924, 21912, 21978, 22044, 22110, 22176, 22242, 1452, 22308, 22374, 1452, 1452, 22440, 22506, 1452, 1452, 22572, 924, 924, 22638, 22704, 22770, 22836, 22902, 22968, 1452, 23034, 23100, 23166, 1452, 23232, 23298, 23364, 1452, 1452, 23430, 23496, 23562, 23628, 23694, 23760, 23826, 23892, 23958, 24024, 24090, 24156, 24222, 1452, 1452, 1452, 1452, 924, 24288, 24354, 24420, 24486, 24552, 24618, 24684, 24750, 24816, 24882, 24948, 25014, 25080, 25146, 924, 25212, 25278 };
  private static final int[] d = i();
  private static final String[] e = { "Unkown internal scanner error", "Internal error: unknown state", "Error: could not match input", "Error: pushback value was too large" };
  private static final byte[] f = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9, 1, 1, 9, 9, 9, 1, 1, 9, 1, 1, 1, 1, 1, 1, 9, 1, 1, 1, 9, 1, 1, 1, 9, 1, 1, 1, 1, 9, 1, 9, 1, 1, 1, 9, 1, 9, 1, 1, 1, 9, 9, 1, 0, 1, 1, 1, 1, 0, 9, 1, 1, 1, 1, 1, 1, 9, 9, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 1, 9, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 9, 1, 1, 9, 9, 1, 0, 9, 9, 1, 1, 9, 9, 9, 9, 9, 9, 1, 1, 0, 9, 0, 0, 0, 0, 1, 9, 9, 9, 9, 1, 1, 9, 0, 1, 9, 0, 9, 9, 9, 9, 9, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 9, 9, 9, 0, 0, 0, 1, 0, 1, 9, 1, 9, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 1, 1, 9, 0, 0, 1, 9, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 9, 0, 0, 0, 0, 0, 9, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 9, 0, 9, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0 };
  private Reader g;
  private int h;
  private int i = 0;
  private char[] j = new char[16384];
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private boolean q = true;
  private boolean r;
  private boolean s;
  private String t = null;
  private boolean u = false;
  private boolean v = true;
  private bm w = new bm();
  private int x;
  private bn y;
  private char[] z = new char[16384];
  private int A;
  private int B;
  private a C = new a();
  private a D = new a();
  private String E;
  private Integer K = new Integer(0);
  private Integer F = new Integer(0);
  private Integer L = new Integer(0);
  private Object[] G = new Object[2];
  private String H = null;
  private Integer I = null;
  private boolean J = true;

  private void a(int paramInt)
  {
    this.w.a(this.i);
    d(paramInt);
  }

  private void a()
  {
    d(this.w.b());
  }

  public int c()
  {
    return this.p;
  }

  private void b()
  {
    for (int i1 = this.n; i1 < this.k; i1++)
    {
      if (this.j[i1] != '\r')
        continue;
      this.x += 1;
    }
  }

  private int d()
  {
    return this.n - this.l - this.x;
  }

  private int e()
  {
    return this.k - this.n;
  }

  public void a(bn parambn)
  {
    this.y = parambn;
  }

  private void f()
  {
    if (this.y != null)
    {
      int i1 = d();
      this.y.b(i1, i1 + e());
    }
  }

  private void g()
  {
    if (this.y != null)
    {
      int i1 = d();
      this.y.c(i1, i1 + e());
    }
  }

  public int o()
  {
    return this.o - this.l;
  }

  private void h()
  {
    this.E = a(this.F.intValue() - this.l - this.x, this.k - this.l - this.x);
    if ((this.E != null) && (this.J) && ((this.I == null) || (this.I.compareTo(this.F) > 0)))
    {
      this.H = this.E;
      this.I = this.F;
    }
  }

  public Object[] a(int paramInt)
  {
    this.G[0] = this.C.b(paramInt);
    this.G[1] = this.D.b(paramInt);
    return this.G;
  }

  public Object[] a()
  {
    this.G[0] = this.H;
    this.G[1] = this.I;
    return this.G;
  }

  private c b(int paramInt)
  {
    c localc = c(paramInt);
    localc.f = l();
    return localc;
  }

  private c c(int paramInt)
  {
    int i1 = d();
    if (this.E != null)
    {
      if (this.E == this.H)
      {
        if ((paramInt == 32) || (paramInt == 42) || (paramInt == 59) || (paramInt == 63))
        {
          this.C.a(i1, this.E);
          this.D.a(i1, Integer.valueOf(this.F.intValue() - this.L.intValue()));
          this.H = null;
        }
      }
      else
      {
        this.C.a(i1, this.E);
        this.D.a(i1, this.K);
      }
      this.E = null;
    }
    this.J = false;
    return new c(paramInt, i1, i1 + e());
  }

  public String a(int paramInt1, int paramInt2)
  {
    int i1 = paramInt1 + this.l + this.x;
    int i2 = paramInt2 - paramInt1;
    if (i1 < 0)
    {
      i1 = paramInt1 + this.A + this.x;
      if (i1 + i2 < this.z.length)
        return new String(this.z, i1, i2);
      int i3 = i1 + i2 + this.B - this.z.length;
      i2 -= i3;
      return new String(this.z, i1, i2) + new String(this.j, 0, i3);
    }
    return new String(this.j, i1, i2);
  }

  fc(Reader paramReader)
  {
    this.g = paramReader;
  }

  private static int[] i()
  {
    int[] arrayOfInt = new int[25344];
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
    while (i1 < 192)
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

  private boolean j()
    throws IOException
  {
    char[] arrayOfChar;
    if (this.n > 0)
    {
      arrayOfChar = this.j;
      if ((this.o - this.n > 0) || (this.n == this.z.length))
      {
        arrayOfChar = this.z;
        this.z = this.j;
        this.A = this.l;
        this.B = (this.o - this.n);
      }
      System.arraycopy(this.j, this.n, arrayOfChar, 0, this.o - this.n);
      this.j = arrayOfChar;
      this.o -= this.n;
      this.m -= this.n;
      this.k -= this.n;
      this.l -= this.n;
      this.F = new Integer(this.F.intValue() - this.n);
      this.n = 0;
    }
    if (this.m >= this.j.length)
    {
      arrayOfChar = new char[this.m * 2];
      System.arraycopy(this.j, 0, arrayOfChar, 0, this.j.length);
      this.j = arrayOfChar;
      arrayOfChar = new char[this.m * 2];
      System.arraycopy(this.z, 0, arrayOfChar, 0, this.z.length);
      System.arraycopy(this.j, this.B, arrayOfChar, this.z.length, arrayOfChar.length - this.z.length);
      this.B += arrayOfChar.length - this.z.length;
      this.z = arrayOfChar;
    }
    int i1 = this.g.read(this.j, this.o, this.j.length - this.o);
    if (i1 < 0)
      return true;
    this.o += i1;
    return false;
  }

  public final void k()
    throws IOException
  {
    this.r = true;
    this.o = this.n;
    if (this.g != null)
      this.g.close();
  }

  public final void d(int paramInt)
  {
    this.i = paramInt;
  }

  public final String l()
  {
    return new String(this.j, this.n, this.k - this.n);
  }

  public final int m()
  {
    return this.k - this.n;
  }

  private void e(int paramInt)
  {
    String str;
    try
    {
      str = e[paramInt];
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      str = e[0];
    }
    throw new Error(str);
  }

  private void f(int paramInt)
  {
    if (paramInt > m())
      e(3);
    this.k -= paramInt;
  }

  private void n()
    throws IOException
  {
    if (!this.s)
    {
      this.s = true;
      k();
    }
  }

  public c d()
    throws IOException
  {
    int i6 = this.o;
    char[] arrayOfChar1 = this.j;
    char[] arrayOfChar2 = b;
    int[] arrayOfInt1 = d;
    int[] arrayOfInt2 = c;
    byte[] arrayOfByte = f;
    while (true)
    {
      int i5 = this.k;
      int i7 = 0;
      for (int i3 = this.n; i3 < i5; i3++)
        switch (arrayOfChar1[i3])
        {
        case '\013':
        case '\f':
        case '':
        case ' ':
        case ' ':
          this.p += 1;
          i7 = 0;
          break;
        case '\r':
          this.p += 1;
          i7 = 1;
          break;
        case '\n':
          if (i7 != 0)
            i7 = 0;
          else
            this.p += 1;
          break;
        default:
          i7 = 0;
        }
      boolean bool1;
      if (i7 != 0)
      {
        if (i5 < i6)
        {
          bool1 = arrayOfChar1[i5] == '\n';
        }
        else if (this.r)
        {
          bool1 = false;
        }
        else
        {
          boolean bool2 = j();
          i5 = this.k;
          arrayOfChar1 = this.j;
          if (bool2)
            bool1 = false;
          else
            bool1 = arrayOfChar1[i5] == '\n';
        }
        if (bool1)
          this.p -= 1;
      }
      if (i5 > this.n)
        switch (arrayOfChar1[(i5 - 1)])
        {
        case '\n':
        case '\013':
        case '\f':
        case '':
        case ' ':
        case ' ':
          this.q = true;
          break;
        case '\r':
          if (i5 < i6)
          {
            this.q = (arrayOfChar1[i5] != '\n');
          }
          else if (this.r)
          {
            this.q = false;
          }
          else
          {
            bool1 = j();
            i5 = this.k;
            arrayOfChar1 = this.j;
            if (bool1)
              this.q = false;
            else
              this.q = (arrayOfChar1[i5] != '\n');
          }
          break;
        default:
          this.q = false;
        }
      int i2 = -1;
      int i4 = i3 = this.m = this.n = i5;
      if (this.q)
        this.h = a[(this.i + 1)];
      else
        this.h = a[this.i];
      int i1;
      int i9;
      while (true)
      {
        if (i3 < i6)
        {
          i1 = arrayOfChar1[(i3++)];
        }
        else
        {
          if (this.r)
          {
            i1 = -1;
            break;
          }
          this.m = i3;
          this.k = i5;
          bool1 = j();
          i3 = this.m;
          i5 = this.k;
          arrayOfChar1 = this.j;
          i6 = this.o;
          if (bool1)
          {
            i1 = -1;
            break;
          }
          i1 = arrayOfChar1[(i3++)];
        }
        int i8 = arrayOfInt1[(arrayOfInt2[this.h] + arrayOfChar2[i1])];
        if (i8 == -1)
          break;
        this.h = i8;
        i9 = arrayOfByte[this.h];
        if ((i9 & 0x1) == 1)
        {
          i2 = this.h;
          i5 = i3;
          if ((i9 & 0x8) == 8)
            break;
        }
      }
      this.k = i5;
      String str;
      switch (i2)
      {
      case 72:
        return c(127);
      case 507:
        break;
      case 49:
        return c(101);
      case 508:
        break;
      case 46:
        return c(70);
      case 509:
        break;
      case 39:
        return c(100);
      case 510:
        break;
      case 16:
        return c(106);
      case 511:
        break;
      case 56:
        return c(65);
      case 512:
        break;
      case 59:
        return c(105);
      case 513:
        break;
      case 60:
        return c(127);
      case 514:
        break;
      case 47:
        return c(104);
      case 515:
        break;
      case 41:
        return c(126);
      case 516:
        break;
      case 18:
        return c(99);
      case 517:
        break;
      case 50:
        return c(102);
      case 518:
        break;
      case 52:
        return c(88);
      case 519:
        break;
      case 54:
        return c(87);
      case 520:
        break;
      case 55:
        return c(83);
      case 521:
        break;
      case 57:
        return c(117);
      case 522:
        break;
      case 58:
        return c(118);
      case 523:
        break;
      case 61:
        return c(82);
      case 524:
        break;
      case 45:
        return c(125);
      case 525:
        break;
      case 43:
        return c(124);
      case 526:
        break;
      case 48:
        return c(95);
      case 527:
        break;
      case 40:
        return c(96);
      case 528:
        break;
      case 51:
        return c(103);
      case 529:
        break;
      case 53:
        return c(86);
      case 530:
        break;
      case 62:
        return c(116);
      case 531:
        break;
      case 68:
      case 70:
      case 271:
        return c(9);
      case 532:
        break;
      case 265:
        this.K = Integer.valueOf(d());
        this.F = new Integer(this.n);
        this.L = new Integer(this.x);
        d(18);
      case 533:
        break;
      case 375:
      case 376:
        f();
        b();
        d(2);
      case 534:
        break;
      case 485:
        return c(33);
      case 535:
        break;
      case 94:
      case 95:
        b();
      case 536:
        break;
      case 91:
        b();
      case 537:
        break;
      case 90:
        a();
        a(2);
        return b(7);
      case 538:
        break;
      case 83:
        return c(13);
      case 539:
        break;
      case 80:
        return c(13);
      case 540:
        break;
      case 76:
        return c(13);
      case 541:
        break;
      case 23:
        b();
      case 542:
        break;
      case 152:
        return c(57);
      case 543:
        break;
      case 175:
      case 267:
      case 268:
        b();
        if (this.u)
        {
          g();
          d(0);
          return c(83);
        }
        return c(10);
      case 544:
        break;
      case 430:
        return c(63);
      case 545:
        break;
      case 427:
        return c(21);
      case 546:
        break;
      case 421:
        return c(23);
      case 547:
        break;
      case 420:
        return c(29);
      case 548:
        break;
      case 419:
        return c(60);
      case 549:
        break;
      case 414:
        return c(43);
      case 550:
        break;
      case 151:
        return c(94);
      case 551:
        break;
      case 169:
        return c(93);
      case 552:
        break;
      case 195:
      case 272:
        return c(11);
      case 553:
        break;
      case 197:
        return c(11);
      case 554:
        break;
      case 273:
        return c(11);
      case 555:
        break;
      case 379:
        return c(121);
      case 556:
        break;
      case 381:
        return c(20);
      case 557:
        break;
      case 396:
        return c(123);
      case 558:
        break;
      case 397:
        return c(26);
      case 559:
        break;
      case 398:
        return c(35);
      case 560:
        break;
      case 410:
        return c(37);
      case 561:
        break;
      case 470:
        return c(22);
      case 562:
        break;
      case 469:
        return c(24);
      case 563:
        break;
      case 465:
        return c(48);
      case 564:
        break;
      case 454:
        return c(111);
      case 565:
        break;
      case 453:
        return c(113);
      case 566:
        break;
      case 436:
        return c(112);
      case 567:
        break;
      case 434:
        return c(115);
      case 568:
        break;
      case 149:
        return c(72);
      case 569:
        break;
      case 127:
        return c(66);
      case 570:
        break;
      case 116:
        return c(71);
      case 571:
        break;
      case 63:
        a(2);
        return c(55);
      case 572:
        break;
      case 178:
        return c(85);
      case 573:
        break;
      case 180:
        return c(84);
      case 574:
        break;
      case 183:
      case 269:
      case 270:
        b();
        g();
        d(0);
        return c(83);
      case 575:
        break;
      case 219:
        return c(67);
      case 576:
        break;
      case 225:
        return c(2);
      case 577:
        break;
      case 244:
        return c(68);
      case 578:
        break;
      case 277:
        return c(122);
      case 579:
        break;
      case 283:
        return c(15);
      case 580:
        break;
      case 284:
        return c(62);
      case 581:
        break;
      case 293:
        return c(46);
      case 582:
        break;
      case 304:
        return c(28);
      case 583:
        break;
      case 329:
        return c(120);
      case 584:
        break;
      case 334:
        return c(41);
      case 585:
        break;
      case 335:
        return c(30);
      case 586:
        break;
      case 337:
        return c(40);
      case 587:
        break;
      case 348:
        return c(39);
      case 588:
        break;
      case 350:
        return c(34);
      case 589:
        break;
      case 351:
        return c(42);
      case 590:
        break;
      case 356:
        return c(17);
      case 591:
        break;
      case 357:
        return c(47);
      case 592:
        break;
      case 358:
        return c(69);
      case 593:
        break;
      case 408:
        return c(110);
      case 594:
        break;
      case 100:
      case 101:
      case 595:
        break;
      case 92:
      case 596:
        break;
      case 148:
      case 190:
        a(12);
        return c(44);
      case 597:
        break;
      case 74:
        d(2);
        return c(128);
      case 598:
        break;
      case 65:
        d(4);
        return c(128);
      case 599:
        break;
      case 205:
        if ((!this.u) && (l().charAt(1) == '%'))
          break;
        f(m());
        d(2);
      case 600:
        break;
      case 260:
        return c(92);
      case 601:
        break;
      case 12:
      case 13:
      case 105:
        b();
        return c(10);
      case 602:
        break;
      case 88:
        a();
        return b(6);
      case 603:
        break;
      case 87:
        b();
        f(m());
        a();
      case 604:
        break;
      case 64:
        if (!this.w.h())
          a();
        return c(56);
      case 605:
        break;
      case 461:
        return c(27);
      case 606:
        break;
      case 451:
        return c(31);
      case 607:
        break;
      case 450:
        return c(32);
      case 608:
        break;
      case 443:
        return c(18);
      case 609:
        break;
      case 78:
        d(2);
        return c(130);
      case 610:
        break;
      case 66:
        d(6);
        return c(130);
      case 611:
        break;
      case 67:
        d(8);
        return c(129);
      case 612:
        break;
      case 166:
        return c(89);
      case 613:
        break;
      case 172:
        return c(73);
      case 614:
        break;
      case 173:
        return c(74);
      case 615:
        break;
      case 176:
        return c(76);
      case 616:
        break;
      case 177:
        return c(77);
      case 617:
        break;
      case 179:
        return c(78);
      case 618:
        break;
      case 181:
        return c(79);
      case 619:
        break;
      case 247:
        return c(81);
      case 620:
        break;
      case 261:
        return c(80);
      case 621:
        break;
      case 362:
        return c(109);
      case 622:
        break;
      case 402:
        return c(114);
      case 623:
        break;
      case 82:
        d(2);
        return c(129);
      case 624:
        break;
      case 486:
        return c(49);
      case 625:
        break;
      case 150:
        return c(98);
      case 626:
        break;
      case 147:
        return c(108);
      case 627:
        break;
      case 144:
        return c(25);
      case 628:
        break;
      case 125:
        return c(16);
      case 629:
        break;
      case 120:
        return c(3);
      case 630:
        break;
      case 115:
        return c(107);
      case 631:
        break;
      case 77:
        b();
        return c(13);
      case 632:
        break;
      case 69:
      case 71:
      case 84:
        b();
        return c(13);
      case 633:
        break;
      case 170:
        return c(97);
      case 634:
        break;
      case 192:
        a(14);
        return c(54);
      case 635:
        break;
      case 231:
        return c(19);
      case 636:
        break;
      case 234:
        return c(36);
      case 637:
        break;
      case 235:
        return c(119);
      case 638:
        break;
      case 248:
        return c(38);
      case 639:
        break;
      case 103:
        if (this.u)
        {
          f();
          d(2);
        }
        else
        {
          return c(10);
        }
      case 640:
        break;
      case 202:
        d(2);
      case 641:
        break;
      case 488:
        b();
        return b(58);
      case 642:
        break;
      case 174:
        d(16);
      case 643:
        break;
      case 204:
        b();
        d(2);
      case 644:
        break;
      case 447:
        return c(51);
      case 645:
        break;
      case 446:
        return c(50);
      case 646:
        break;
      case 106:
      case 209:
        return b(5);
      case 647:
        break;
      case 15:
      case 19:
        return b(5);
      case 648:
        break;
      case 182:
        return b(8);
      case 649:
        break;
      case 218:
        return b(5);
      case 650:
        break;
      case 24:
        d(20);
      case 651:
        break;
      case 487:
        return c(64);
      case 652:
        break;
      case 484:
        return c(61);
      case 653:
        break;
      case 108:
        return c(75);
      case 654:
        break;
      case 165:
        return c(45);
      case 655:
        break;
      case 167:
      case 168:
        return c(90);
      case 656:
        break;
      case 259:
        return c(91);
      case 657:
        break;
      case 97:
      case 98:
      case 99:
        str = l();
        switch (str.charAt(str.length() - 1))
        {
        case '%':
        case '>':
        case '?':
          f(1);
          break;
        default:
          b();
          d(2);
        }
      case 658:
        break;
      case 191:
        b();
        if (m() == 2)
          f(1);
        return c(11);
      case 659:
        break;
      case 193:
        a(2);
        f(m() - 1);
        return c(55);
      case 660:
        break;
      case 86:
        return b(6);
      case 661:
        break;
      case 17:
      case 20:
      case 21:
      case 22:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
      case 37:
      case 38:
      case 42:
      case 44:
      case 109:
      case 110:
      case 111:
      case 112:
      case 113:
      case 114:
      case 118:
      case 119:
      case 121:
      case 122:
      case 123:
      case 124:
      case 126:
      case 128:
      case 129:
      case 130:
      case 131:
      case 132:
      case 133:
      case 134:
      case 135:
      case 136:
      case 137:
      case 138:
      case 139:
      case 140:
      case 141:
      case 142:
      case 143:
      case 145:
      case 146:
      case 153:
      case 164:
      case 211:
      case 212:
      case 213:
      case 214:
      case 215:
      case 216:
      case 217:
      case 220:
      case 221:
      case 222:
      case 223:
      case 224:
      case 226:
      case 227:
      case 228:
      case 229:
      case 230:
      case 232:
      case 233:
      case 236:
      case 237:
      case 238:
      case 239:
      case 240:
      case 241:
      case 242:
      case 243:
      case 245:
      case 246:
      case 258:
      case 276:
      case 278:
      case 279:
      case 280:
      case 281:
      case 282:
      case 285:
      case 286:
      case 287:
      case 288:
      case 289:
      case 290:
      case 291:
      case 292:
      case 294:
      case 295:
      case 296:
      case 297:
      case 298:
      case 299:
      case 300:
      case 301:
      case 302:
      case 303:
      case 305:
      case 306:
      case 307:
      case 308:
      case 309:
      case 310:
      case 311:
      case 321:
      case 327:
      case 328:
      case 330:
      case 331:
      case 332:
      case 333:
      case 336:
      case 338:
      case 339:
      case 340:
      case 341:
      case 342:
      case 343:
      case 344:
      case 345:
      case 346:
      case 347:
      case 349:
      case 352:
      case 353:
      case 354:
      case 355:
      case 370:
      case 378:
      case 380:
      case 382:
      case 383:
      case 384:
      case 386:
      case 387:
      case 388:
      case 389:
      case 390:
      case 391:
      case 392:
      case 393:
      case 394:
      case 395:
      case 399:
      case 415:
      case 416:
      case 417:
      case 418:
      case 422:
      case 423:
      case 424:
      case 425:
      case 426:
      case 428:
      case 429:
      case 440:
      case 441:
      case 442:
      case 444:
      case 445:
      case 448:
      case 449:
      case 452:
      case 459:
      case 460:
      case 462:
      case 463:
      case 464:
      case 466:
      case 471:
      case 472:
      case 473:
      case 474:
      case 477:
      case 478:
      case 479:
      case 480:
        return b(6);
      case 662:
        break;
      case 185:
        b();
        return b(14);
      case 663:
        break;
      case 104:
      case 503:
        b();
        if ((this.v) || (m() > 2))
        {
          f();
          d(2);
        }
        else
        {
          return c(10);
        }
      case 664:
        break;
      case 89:
        b();
        f(m());
        a();
        a(2);
      case 665:
        break;
      case 194:
      case 196:
        switch (l().charAt(1))
        {
        case 'n':
          break;
        case 't':
          break;
        case 'r':
          break;
        case '\\':
          break;
        case '$':
          break;
        case '{':
          break;
        default:
          b();
          return c(12);
        }
        return c(11);
      case 666:
        break;
      case 199:
      case 200:
        b();
        str = l();
        i9 = str.length();
        str = str.trim();
        int i10 = 0;
        if (str.endsWith(";"))
        {
          str = str.substring(0, str.length() - 1);
          i10 = 1;
        }
        if (str.equals(this.t))
        {
          if (i10 != 0)
            f(i9 - str.length());
          this.t = null;
          d(2);
          return c(53);
        }
        return b(6);
      case 667:
        break;
      case 203:
        h();
        d(2);
      case 668:
        break;
      case 371:
      case 372:
        b();
        this.t = l().substring(3).trim();
        d(10);
        return c(52);
      case 669:
        break;
      case 385:
        return b(59);
      case 670:
        break;
      case 14:
      case 73:
      case 75:
      case 79:
      case 81:
      case 85:
        b();
      case 671:
        break;
      case 93:
      case 96:
      case 672:
        break;
      case 206:
        str = l();
        if (((str.charAt(1) == '%') && (this.u)) || ((str.charAt(1) == '?') && (this.v)))
        {
          f();
          d(2);
        }
        else
        {
          return c(10);
        }
      case 673:
        break;
      case 102:
      case 107:
      case 117:
      case 154:
      case 155:
      case 156:
      case 157:
      case 158:
      case 159:
      case 160:
      case 161:
      case 162:
      case 163:
      case 171:
      case 184:
      case 186:
      case 187:
      case 188:
      case 189:
      case 198:
      case 201:
      case 207:
      case 208:
      case 210:
      case 249:
      case 250:
      case 251:
      case 252:
      case 253:
      case 254:
      case 255:
      case 256:
      case 257:
      case 262:
      case 263:
      case 264:
      case 266:
      case 274:
      case 275:
      case 312:
      case 313:
      case 314:
      case 315:
      case 316:
      case 317:
      case 318:
      case 319:
      case 320:
      case 322:
      case 323:
      case 324:
      case 325:
      case 326:
      case 359:
      case 360:
      case 361:
      case 363:
      case 364:
      case 365:
      case 366:
      case 367:
      case 368:
      case 369:
      case 373:
      case 374:
      case 377:
      case 400:
      case 401:
      case 403:
      case 404:
      case 405:
      case 406:
      case 407:
      case 409:
      case 411:
      case 412:
      case 413:
      case 431:
      case 432:
      case 433:
      case 435:
      case 437:
      case 438:
      case 439:
      case 455:
      case 456:
      case 457:
      case 458:
      case 467:
      case 468:
      case 475:
      case 476:
      case 481:
      case 482:
      case 483:
      case 489:
      case 490:
      case 491:
      case 492:
      case 493:
      case 494:
      case 495:
      case 496:
      case 497:
      case 498:
      case 499:
      case 500:
      case 501:
      case 502:
      case 504:
      case 505:
      case 506:
      }
      if ((i1 == -1) && (this.n == this.m))
      {
        this.r = true;
        n();
        return c(0);
      }
      e(2);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.fc
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.f;

import com.b.a.b;
import com.b.a.c;
import com.zend.ide.s.bm;
import com.zend.ide.util.d.a;
import java.io.IOException;
import java.io.Reader;

class gc extends bi
  implements b
{
  private static final char[] b = a("");
  private static final int[] c = { 0, 65, 130, 195, 260, 325, 390, 455, 520, 585, 650, 715, 780, 845, 910, 975, 1040, 1105, 1170, 1235, 1300, 1365, 1430, 1495, 1560, 1625, 1690, 975, 975, 975, 1755, 1820, 1885, 1950, 2015, 2080, 2145, 2210, 2275, 2340, 2405, 2470, 2535, 2600, 2665, 2730, 2795, 2860, 2925, 2990, 975, 3055, 3120, 3185, 3250, 3315, 3380, 3445, 3510, 3575, 3640, 975, 975, 975, 975, 3705, 975, 975, 3770, 975, 3835, 3900, 3965, 4030, 975, 4095, 4160, 4225, 4290, 4355, 4420, 4485, 975, 4550, 4615, 4680, 4745, 4810, 4875, 4940, 5005, 975, 5070, 975, 975, 5135, 5200, 975, 5265, 5330, 975, 975, 5395, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 975, 5460, 5525, 975, 5590, 975, 5655, 5720, 5785, 975, 975, 5850, 5915, 5980, 6045, 6110, 6175, 6240, 975, 6305, 6370, 6435, 6500, 6565, 6630, 975, 975, 6695, 6760, 6825, 6890, 3770, 6955, 1690, 7020, 975, 7085, 7150, 1495, 7215, 7280, 7345, 7410, 7475, 7540, 7605, 1495, 7670, 7735, 7800, 7865, 7930, 7995, 8060, 8125, 8190, 8255, 1495, 8320, 8385, 8450, 8515, 8580, 1495, 8645, 8710, 8775, 8840, 8905, 975, 975, 975, 8970, 975, 975, 9035, 9100, 2925, 9165, 9230, 9295, 9360, 9425, 9490, 9555, 9620, 9685, 9750, 975, 9815, 9880, 975, 975, 9945, 10010, 975, 975, 10075, 10140, 975, 975, 975, 975, 975, 975, 10205, 10270, 10335, 4095, 10400, 10465, 10530, 10335, 975, 975, 975, 10400, 10595, 4485, 10660, 10725, 10595, 975, 10660, 10790, 4940, 10855, 10920, 10985, 10790, 10855, 5070, 975, 11050, 975, 11115, 975, 975, 975, 975, 975, 11180, 11245, 11310, 11310, 11375, 11440, 11505, 11570, 11635, 11700, 11765, 6695, 1495, 11830, 11895, 11960, 12025, 12090, 12155, 12220, 1495, 12285, 12350, 12415, 1495, 12480, 12545, 12610, 12675, 1495, 1495, 12740, 12805, 12870, 12935, 13000, 13065, 13130, 13195, 13260, 13325, 1495, 13390, 13455, 13520, 13585, 13650, 13715, 975, 1495, 13780, 13845, 13910, 13975, 14040, 14105, 14170, 14235, 14300, 14365, 14430, 14495, 14560, 14625, 14690, 14755, 975, 975, 975, 14820, 14885, 14950, 15015, 15080, 15145, 975, 15210, 975, 10465, 15275, 975, 10725, 10920, 975, 15340, 11115, 15405, 15470, 15535, 15600, 15665, 15730, 15795, 15860, 1495, 15925, 15990, 1495, 16055, 16120, 16185, 16250, 16315, 16380, 16445, 16510, 16575, 16640, 16705, 16770, 16835, 16900, 16965, 17030, 17095, 1495, 17160, 17225, 17290, 17355, 17420, 17485, 17550, 17615, 17680, 1495, 17745, 17810, 17875, 17940, 18005, 18070, 18135, 18200, 18265, 18330, 18395, 18460, 18525, 18590, 18655, 18720, 18785, 18850, 18915, 18980, 19045, 19110, 19175, 19240, 19305, 19370, 19435, 19500, 1495, 19565, 19630, 19695, 19760, 19825, 1495, 1495, 19890, 19955, 20020, 1495, 20085, 1495, 20150, 20215, 20280, 1495, 20345, 20410, 1495, 20475, 1495, 1495, 1495, 1495, 20540, 20605, 20670, 20735, 20800, 1495, 1495, 20865, 1495, 20930, 20995, 21060, 21125, 21190, 21255, 975, 21320, 21385, 21450, 21515, 21580, 21645, 21710, 21775, 21840, 21905, 21970, 22035, 22100, 22165, 22230, 975, 22295, 22360, 975, 22425, 975, 22490, 22555, 22620, 22685, 22750, 22815, 1495, 22880, 22945, 23010, 23075, 1495, 23140, 23205, 23270, 23335, 23400, 1495, 1495, 1495, 23465, 23530, 1495, 23595, 23660, 23725, 23790, 23855, 975, 23920, 23985, 24050, 24115, 24180, 975, 24245, 1495, 24310, 24375, 24440, 24505, 24570, 24635, 24700, 24765, 24830, 1495, 24895, 24960, 25025, 25090, 25155, 25220, 25285, 25350, 1495, 1495, 25415, 1495, 25480, 25545, 25610, 1495, 25675, 25740, 25805, 25870, 975, 25935, 975, 26000, 26065, 26130, 26195, 26260, 26325, 26390, 26455, 26520, 26585, 26650, 26715, 1495, 26780, 26845, 26910, 26975, 1495, 1495, 27040, 1495, 27105, 975, 975, 1495, 27170, 27235, 27300, 1495, 27365, 27430, 27495, 27560, 27625, 27690, 27755, 1495, 1495, 27820, 27885, 27950, 28015, 1495, 28080, 1495, 28145, 28210, 28275, 28340, 1495, 1495, 28405, 1495, 1495, 28470, 28535, 28600, 1495, 28665, 28730, 28795, 28860, 28925, 28990, 29055, 29120, 29185, 1495, 1495, 1495, 29250, 975, 29315, 29380, 29445, 29510, 29575, 1495, 29640, 29705, 29770, 29835, 29900, 29965, 30030, 30095, 30160, 30225, 30290, 30355, 975, 30420 };
  private static final int[] d = i();
  private static final String[] e = { "Unkown internal scanner error", "Internal error: unknown state", "Error: could not match input", "Error: pushback value was too large" };
  private static final byte[] f = { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 1, 9, 9, 1, 9, 1, 1, 1, 1, 9, 1, 1, 1, 1, 1, 1, 1, 9, 1, 1, 1, 1, 1, 1, 1, 1, 9, 1, 9, 9, 1, 1, 9, 1, 1, 9, 9, 1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 1, 1, 9, 1, 9, 1, 1, 1, 9, 9, 1, 0, 1, 1, 1, 1, 0, 9, 1, 1, 1, 1, 1, 1, 9, 9, 0, 1, 1, 0, 0, 1, 0, 0, 9, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 1, 9, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 9, 1, 1, 9, 9, 1, 0, 9, 9, 1, 1, 9, 9, 9, 9, 9, 9, 1, 0, 0, 0, 0, 1, 1, 1, 9, 9, 9, 1, 0, 0, 0, 1, 1, 9, 1, 0, 0, 0, 1, 1, 1, 1, 0, 9, 0, 9, 0, 9, 9, 9, 9, 9, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 9, 9, 9, 0, 0, 0, 1, 0, 1, 9, 1, 9, 1, 0, 9, 1, 1, 9, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 9, 0, 0, 9, 1, 9, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 9, 0, 0, 0, 0, 0, 9, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 9, 0, 9, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 9, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0 };
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
  private Integer a = new Integer(0);
  private Integer F = new Integer(0);
  private Integer K = new Integer(0);
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
        if ((paramInt == 34) || (paramInt == 47) || (paramInt == 67) || (paramInt == 71))
        {
          this.C.a(i1, this.E);
          this.D.a(i1, Integer.valueOf(this.F.intValue() - this.K.intValue()));
          this.H = null;
        }
      }
      else
      {
        this.C.a(i1, this.E);
        this.D.a(i1, this.a);
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

  gc(Reader paramReader)
  {
    this.g = paramReader;
  }

  private static int[] i()
  {
    int[] arrayOfInt = new int[30485];
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
    while (i1 < 190)
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
      int i2 = -1;
      int i4 = i3 = this.m = this.n = i5;
      this.h = this.i;
      int i1;
      int i10;
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
        i10 = arrayOfByte[this.h];
        if ((i10 & 0x1) == 1)
        {
          i2 = this.h;
          i5 = i3;
          if ((i10 & 0x8) == 8)
            break;
        }
      }
      this.k = i5;
      String str2;
      switch (i2)
      {
      case 114:
        return c(109);
      case 643:
        break;
      case 111:
        return c(78);
      case 644:
        break;
      case 107:
        return c(108);
      case 645:
        break;
      case 104:
        return c(141);
      case 646:
        break;
      case 100:
        return c(114);
      case 647:
        break;
      case 44:
        return c(108);
      case 648:
        break;
      case 25:
        return c(140);
      case 649:
        break;
      case 17:
        return c(114);
      case 650:
        break;
      case 52:
        return c(78);
      case 651:
        break;
      case 55:
        return c(109);
      case 652:
        break;
      case 61:
        return c(73);
      case 653:
        break;
      case 64:
        return c(113);
      case 654:
        break;
      case 119:
        return c(95);
      case 655:
        break;
      case 117:
        return c(96);
      case 656:
        break;
      case 115:
        return c(110);
      case 657:
        break;
      case 112:
        return c(112);
      case 658:
        break;
      case 109:
        return c(139);
      case 659:
        break;
      case 106:
        return c(63);
      case 660:
        break;
      case 105:
        return c(142);
      case 661:
        break;
      case 101:
        return c(107);
      case 662:
        break;
      case 46:
        return c(139);
      case 663:
        break;
      case 29:
        return c(91);
      case 664:
        break;
      case 19:
        return c(107);
      case 665:
        break;
      case 53:
        return c(112);
      case 666:
        break;
      case 56:
        return c(110);
      case 667:
        break;
      case 58:
        return c(96);
      case 668:
        break;
      case 60:
        return c(95);
      case 669:
        break;
      case 62:
        return c(125);
      case 670:
        break;
      case 63:
        return c(126);
      case 671:
        break;
      case 121:
        return c(90);
      case 672:
        break;
      case 65:
        return c(90);
      case 673:
        break;
      case 110:
        return c(137);
      case 674:
        break;
      case 48:
        return c(137);
      case 675:
        break;
      case 50:
        return c(138);
      case 676:
        break;
      case 116:
        return c(111);
      case 677:
        break;
      case 113:
        return c(103);
      case 678:
        break;
      case 108:
        return c(104);
      case 679:
        break;
      case 45:
        return c(104);
      case 680:
        break;
      case 54:
        return c(103);
      case 681:
        break;
      case 57:
        return c(111);
      case 682:
        break;
      case 118:
        return c(94);
      case 683:
        break;
      case 59:
        return c(94);
      case 684:
        break;
      case 66:
        return c(124);
      case 685:
        break;
      case 122:
        return c(64);
      case 686:
        break;
      case 71:
      case 72:
      case 78:
      case 79:
      case 85:
      case 86:
      case 341:
      case 344:
      case 345:
        return c(9);
      case 687:
        break;
      case 478:
      case 479:
        f();
        b();
        d(1);
      case 688:
        break;
      case 91:
      case 92:
        f(1);
        d(4);
      case 689:
        break;
      case 335:
        this.a = Integer.valueOf(d());
        this.F = new Integer(this.n);
        this.K = new Integer(this.x);
        d(11);
      case 690:
        break;
      case 343:
        f(1);
        a(9);
        return b(8);
      case 691:
        break;
      case 123:
        b();
      case 692:
        break;
      case 98:
        a();
        a(1);
        return b(7);
      case 693:
        break;
      case 93:
        this.t = null;
        d(1);
        return b(61);
      case 694:
        break;
      case 24:
        b();
      case 695:
        break;
      case 126:
      case 127:
        b();
      case 696:
        break;
      case 196:
        return c(65);
      case 697:
        break;
      case 220:
      case 337:
      case 338:
        b();
        if (this.u)
        {
          g();
          d(0);
          return c(91);
        }
        return c(10);
      case 698:
        break;
      case 234:
      case 235:
      case 238:
        f(1);
        b();
        return c(13);
      case 699:
        break;
      case 251:
      case 252:
        f(1);
        b();
        return c(13);
      case 700:
        break;
      case 542:
        return c(134);
      case 701:
        break;
      case 540:
        return c(71);
      case 702:
        break;
      case 538:
        return c(21);
      case 703:
        break;
      case 536:
        return c(23);
      case 704:
        break;
      case 535:
        return c(31);
      case 705:
        break;
      case 532:
        return c(68);
      case 706:
        break;
      case 526:
        return c(49);
      case 707:
        break;
      case 516:
        return c(41);
      case 708:
        break;
      case 502:
        return c(136);
      case 709:
        break;
      case 499:
        return c(36);
      case 710:
        break;
      case 498:
        return c(28);
      case 711:
        break;
      case 497:
        return c(131);
      case 712:
        break;
      case 486:
        return c(129);
      case 713:
        break;
      case 483:
        return c(20);
      case 714:
        break;
      case 99:
      case 102:
        return b(9);
      case 715:
        break;
      case 195:
        return c(102);
      case 716:
        break;
      case 214:
        return c(101);
      case 717:
        break;
      case 348:
        return b(9);
      case 718:
        break;
      case 607:
        return c(56);
      case 719:
        break;
      case 603:
        return c(50);
      case 720:
        break;
      case 602:
        return c(25);
      case 721:
        break;
      case 600:
        return c(22);
      case 722:
        break;
      case 599:
        return c(24);
      case 723:
        break;
      case 594:
        return c(55);
      case 724:
        break;
      case 573:
        return c(121);
      case 725:
        break;
      case 572:
        return c(119);
      case 726:
        break;
      case 549:
        return c(120);
      case 727:
        break;
      case 547:
        return c(123);
      case 728:
        break;
      case 514:
        return c(118);
      case 729:
        break;
      case 451:
        return c(77);
      case 730:
        break;
      case 449:
        return c(17);
      case 731:
        break;
      case 448:
        return c(54);
      case 732:
        break;
      case 442:
        return c(47);
      case 733:
        break;
      case 441:
        return c(26);
      case 734:
        break;
      case 440:
        return c(38);
      case 735:
        break;
      case 439:
        return c(35);
      case 736:
        break;
      case 437:
        return c(43);
      case 737:
        break;
      case 434:
        return c(133);
      case 738:
        break;
      case 430:
        return c(39);
      case 739:
        break;
      case 428:
        return c(44);
      case 740:
        break;
      case 424:
        return c(32);
      case 741:
        break;
      case 423:
        return c(45);
      case 742:
        break;
      case 417:
        return c(128);
      case 743:
        break;
      case 28:
        a(1);
        return c(63);
      case 744:
        break;
      case 148:
        return c(79);
      case 745:
        break;
      case 179:
        return c(74);
      case 746:
        break;
      case 193:
        return c(80);
      case 747:
        break;
      case 223:
        return c(93);
      case 748:
        break;
      case 225:
        return c(92);
      case 749:
        break;
      case 227:
      case 339:
      case 340:
        b();
        g();
        d(0);
        return c(91);
      case 750:
        break;
      case 275:
        return c(75);
      case 751:
        break;
      case 287:
        return c(2);
      case 752:
        break;
      case 304:
        return c(76);
      case 753:
        break;
      case 357:
        return c(15);
      case 754:
        break;
      case 358:
        return c(130);
      case 755:
        break;
      case 360:
        return c(70);
      case 756:
        break;
      case 378:
        return c(30);
      case 757:
        break;
      case 388:
        return c(53);
      case 758:
        break;
      case 124:
      case 759:
        break;
      case 132:
      case 133:
      case 760:
        break;
      case 256:
        return c(51);
      case 761:
        break;
      case 74:
        d(1);
        return c(141);
      case 762:
        break;
      case 26:
        d(2);
        return c(141);
      case 763:
        break;
      case 192:
        a(7);
        return c(51);
      case 764:
        break;
      case 261:
        if ((!this.u) && (l().charAt(1) == '%'))
          break;
        f(m());
        d(1);
      case 765:
        break;
      case 330:
        return c(100);
      case 766:
        break;
      case 13:
      case 14:
      case 137:
        b();
        return c(10);
      case 767:
        break;
      case 243:
      case 244:
      case 245:
        f(1);
        b();
        return c(13);
      case 768:
        break;
      case 95:
        a();
        return b(6);
      case 769:
        break;
      case 94:
      case 96:
        b();
        f(m());
        a();
      case 770:
        break;
      case 67:
        if (!this.w.h())
          a();
        return c(64);
      case 771:
        break;
      case 254:
        String str1 = l();
        i10 = str1.length() - 1;
        str1 = str1.trim();
        f(1);
        if (str1.endsWith(";"))
        {
          str1 = str1.substring(0, str1.length() - 1);
          f(1);
        }
        if (str1.equals(this.t))
        {
          this.t = null;
          d(1);
          return c(61);
        }
        d(4);
      case 772:
        break;
      case 592:
        return c(135);
      case 773:
        break;
      case 587:
        return c(48);
      case 774:
        break;
      case 586:
        return c(29);
      case 775:
        break;
      case 570:
        return c(132);
      case 776:
        break;
      case 568:
        return c(33);
      case 777:
        break;
      case 567:
        return c(34);
      case 778:
        break;
      case 562:
        return c(18);
      case 779:
        break;
      case 508:
        return c(122);
      case 780:
        break;
      case 458:
        return c(117);
      case 781:
        break;
      case 77:
      case 242:
        b();
        return c(13);
      case 782:
        break;
      case 70:
      case 232:
        b();
        return c(13);
      case 783:
        break;
      case 27:
        d(3);
        return c(142);
      case 784:
        break;
      case 4:
      case 84:
      case 87:
      case 249:
      case 250:
      case 347:
        b();
        return c(13);
      case 785:
        break;
      case 211:
        return c(97);
      case 786:
        break;
      case 217:
        return c(81);
      case 787:
        break;
      case 218:
        return c(82);
      case 788:
        break;
      case 221:
        return c(84);
      case 789:
        break;
      case 222:
        return c(85);
      case 790:
        break;
      case 224:
        return c(86);
      case 791:
        break;
      case 226:
        return c(87);
      case 792:
        break;
      case 311:
        return c(89);
      case 793:
        break;
      case 331:
        return c(88);
      case 794:
        break;
      case 82:
        d(1);
        return c(142);
      case 795:
        break;
      case 120:
        a();
        return b(126);
      case 796:
        break;
      case 103:
        f(1);
        a();
        return c(13);
      case 797:
        break;
      case 619:
        return c(57);
      case 798:
        break;
      case 147:
        return c(115);
      case 799:
        break;
      case 160:
        return c(3);
      case 800:
        break;
      case 168:
        return c(16);
      case 801:
        break;
      case 185:
        return c(27);
      case 802:
        break;
      case 191:
        return c(116);
      case 803:
        break;
      case 194:
        return c(106);
      case 804:
        break;
      case 215:
        return c(105);
      case 805:
        break;
      case 236:
        a(8);
        return c(62);
      case 806:
        break;
      case 283:
        return c(37);
      case 807:
        break;
      case 290:
        return c(19);
      case 808:
        break;
      case 292:
        return c(40);
      case 809:
        break;
      case 293:
        return c(127);
      case 810:
        break;
      case 312:
        return c(42);
      case 811:
        break;
      case 135:
        if (this.u)
        {
          f();
          d(1);
        }
        else
        {
          return c(10);
        }
      case 812:
        break;
      case 258:
        d(1);
      case 813:
        break;
      case 621:
        b();
        return b(66);
      case 814:
        break;
      case 219:
        d(10);
      case 815:
        break;
      case 260:
        b();
        d(1);
      case 816:
        break;
      case 578:
        return c(58);
      case 817:
        break;
      case 574:
        return c(59);
      case 818:
        break;
      case 16:
      case 20:
        return b(5);
      case 819:
        break;
      case 138:
      case 265:
        return b(5);
      case 820:
        break;
      case 154:
      case 233:
        return b(8);
      case 821:
        break;
      case 274:
        return b(5);
      case 822:
        break;
      case 69:
        d(12);
      case 823:
        break;
      case 627:
        return c(46);
      case 824:
        break;
      case 618:
        return c(72);
      case 825:
        break;
      case 617:
        return c(69);
      case 826:
        break;
      case 140:
        return c(83);
      case 827:
        break;
      case 210:
        return c(52);
      case 828:
        break;
      case 212:
      case 213:
        return c(98);
      case 829:
        break;
      case 329:
        return c(99);
      case 830:
        break;
      case 237:
        a(1);
        f(m() - 1);
        return c(63);
      case 831:
        break;
      case 473:
      case 474:
        b();
        int i9 = l().charAt(0) == 'b' ? 4 : 3;
        this.t = l().substring(i9).trim();
        d(5);
        return c(60);
      case 832:
        break;
      case 346:
        str2 = l();
        if (str2.charAt(str2.length() - 2) == ';')
        {
          str2 = str2.substring(0, str2.length() - 2);
          f(1);
        }
        else
        {
          str2 = str2.substring(0, str2.length() - 1);
        }
        i10 = str2.length();
        int i11 = this.t.length();
        if ((i10 > i11) && (str2.substring(i10 - i11, i10).equals(this.t)))
        {
          f(2);
          b();
          d(6);
          return b(13);
        }
        f(1);
      case 833:
        break;
      case 18:
      case 21:
      case 22:
      case 23:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
      case 37:
      case 38:
      case 39:
      case 40:
      case 41:
      case 42:
      case 43:
      case 47:
      case 49:
      case 51:
      case 141:
      case 142:
      case 143:
      case 144:
      case 145:
      case 146:
      case 150:
      case 151:
      case 161:
      case 162:
      case 163:
      case 164:
      case 165:
      case 166:
      case 167:
      case 169:
      case 170:
      case 171:
      case 172:
      case 173:
      case 174:
      case 175:
      case 176:
      case 177:
      case 178:
      case 180:
      case 181:
      case 182:
      case 183:
      case 184:
      case 186:
      case 187:
      case 188:
      case 189:
      case 190:
      case 197:
      case 208:
      case 209:
      case 267:
      case 268:
      case 269:
      case 270:
      case 271:
      case 272:
      case 273:
      case 276:
      case 278:
      case 279:
      case 280:
      case 281:
      case 282:
      case 284:
      case 285:
      case 286:
      case 288:
      case 289:
      case 291:
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
      case 323:
      case 324:
      case 325:
      case 326:
      case 327:
      case 328:
      case 351:
      case 352:
      case 353:
      case 354:
      case 355:
      case 356:
      case 359:
      case 361:
      case 362:
      case 363:
      case 364:
      case 365:
      case 366:
      case 367:
      case 368:
      case 369:
      case 370:
      case 371:
      case 372:
      case 373:
      case 374:
      case 375:
      case 376:
      case 377:
      case 379:
      case 380:
      case 381:
      case 382:
      case 383:
      case 384:
      case 385:
      case 386:
      case 387:
      case 389:
      case 390:
      case 391:
      case 392:
      case 403:
      case 404:
      case 405:
      case 406:
      case 407:
      case 408:
      case 409:
      case 416:
      case 418:
      case 419:
      case 420:
      case 421:
      case 422:
      case 425:
      case 426:
      case 427:
      case 429:
      case 431:
      case 432:
      case 433:
      case 435:
      case 436:
      case 438:
      case 443:
      case 444:
      case 445:
      case 446:
      case 447:
      case 450:
      case 452:
      case 453:
      case 466:
      case 467:
      case 468:
      case 469:
      case 470:
      case 471:
      case 472:
      case 481:
      case 482:
      case 484:
      case 485:
      case 487:
      case 488:
      case 489:
      case 490:
      case 492:
      case 493:
      case 494:
      case 495:
      case 496:
      case 500:
      case 501:
      case 503:
      case 504:
      case 517:
      case 518:
      case 519:
      case 520:
      case 521:
      case 522:
      case 527:
      case 528:
      case 529:
      case 530:
      case 531:
      case 533:
      case 534:
      case 537:
      case 539:
      case 541:
      case 543:
      case 550:
      case 551:
      case 552:
      case 553:
      case 554:
      case 555:
      case 559:
      case 560:
      case 561:
      case 563:
      case 564:
      case 565:
      case 566:
      case 569:
      case 571:
      case 575:
      case 576:
      case 577:
      case 579:
      case 584:
      case 585:
      case 588:
      case 589:
      case 590:
      case 591:
      case 593:
      case 595:
      case 596:
      case 601:
      case 604:
      case 605:
      case 606:
      case 610:
      case 611:
      case 612:
      case 613:
      case 620:
      case 623:
      case 625:
        return b(6);
      case 834:
        break;
      case 157:
        b();
        return b(14);
      case 835:
        break;
      case 491:
        return b(67);
      case 836:
        break;
      case 97:
        b();
        f(m());
        a();
        a(1);
      case 837:
        break;
      case 136:
      case 640:
        b();
        if ((this.v) || (m() > 2))
        {
          f();
          d(1);
        }
        else
        {
          return c(10);
        }
      case 838:
        break;
      case 259:
        h();
        d(1);
      case 839:
        break;
      case 15:
      case 68:
      case 73:
      case 75:
      case 76:
      case 80:
      case 81:
      case 83:
      case 88:
      case 89:
      case 90:
        b();
      case 840:
        break;
      case 477:
        f(3);
        a(7);
        return b(8);
      case 841:
        break;
      case 125:
      case 128:
      case 842:
        break;
      case 262:
        str2 = l();
        if (((str2.charAt(1) == '%') && (this.u)) || ((str2.charAt(1) == '?') && (this.v)))
        {
          f();
          d(1);
        }
        else
        {
          return c(10);
        }
      case 843:
        break;
      case 129:
      case 130:
      case 131:
        str2 = l();
        switch (str2.charAt(str2.length() - 1))
        {
        case '%':
        case '>':
        case '?':
          f(1);
          break;
        default:
          b();
          d(1);
        }
      case 844:
        break;
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 134:
      case 139:
      case 149:
      case 152:
      case 153:
      case 155:
      case 156:
      case 158:
      case 159:
      case 198:
      case 199:
      case 200:
      case 201:
      case 202:
      case 203:
      case 204:
      case 205:
      case 206:
      case 207:
      case 216:
      case 228:
      case 229:
      case 230:
      case 231:
      case 239:
      case 240:
      case 241:
      case 246:
      case 247:
      case 248:
      case 253:
      case 255:
      case 257:
      case 263:
      case 264:
      case 266:
      case 277:
      case 313:
      case 314:
      case 315:
      case 316:
      case 317:
      case 318:
      case 319:
      case 320:
      case 321:
      case 322:
      case 332:
      case 333:
      case 334:
      case 336:
      case 342:
      case 349:
      case 350:
      case 393:
      case 394:
      case 395:
      case 396:
      case 397:
      case 398:
      case 399:
      case 400:
      case 401:
      case 402:
      case 410:
      case 411:
      case 412:
      case 413:
      case 414:
      case 415:
      case 454:
      case 455:
      case 456:
      case 457:
      case 459:
      case 460:
      case 461:
      case 462:
      case 463:
      case 464:
      case 465:
      case 475:
      case 476:
      case 480:
      case 505:
      case 506:
      case 507:
      case 509:
      case 510:
      case 511:
      case 512:
      case 513:
      case 515:
      case 523:
      case 524:
      case 525:
      case 544:
      case 545:
      case 546:
      case 548:
      case 556:
      case 557:
      case 558:
      case 580:
      case 581:
      case 582:
      case 583:
      case 597:
      case 598:
      case 608:
      case 609:
      case 614:
      case 615:
      case 616:
      case 622:
      case 624:
      case 626:
      case 628:
      case 629:
      case 630:
      case 631:
      case 632:
      case 633:
      case 634:
      case 635:
      case 636:
      case 637:
      case 638:
      case 639:
      case 641:
      case 642:
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
 * Qualified Name:     com.zend.ide.f.gc
 * JD-Core Version:    0.6.0
 */
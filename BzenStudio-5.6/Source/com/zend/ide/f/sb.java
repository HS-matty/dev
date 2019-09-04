package com.zend.ide.f;

import com.zend.ide.m.f;
import com.zend.ide.m.g;
import com.zend.ide.m.i;
import com.zend.ide.util.cl;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class sb
{
  private static final int[] a = { 0, 1, 2, 3, 4, 5, 6, 7 };
  private static final char[] b = c("");
  private static final int[] c = { 0, 31, 62, 93, 124, 155, 186, 217, 248, 279, 310, 248, 341, 372, 403, 434, 248, 465, 496, 527, 558, 248, 589, 620, 651, 682, 713, 744, 775, 806, 837, 868, 310, 372, 248, 248, 899, 930, 434, 496, 527, 961, 248, 992, 1023, 1054, 1085, 1116, 1147, 1178, 1209, 1240, 1271, 1302, 1333, 1364, 1395, 1426, 558, 620, 248, 1457, 713, 744, 248, 837, 1488, 1519, 1550, 1581, 1612, 1643, 1674, 1705, 1736, 1767, 1798, 1829, 1860, 1891, 1922, 1953, 1984, 2015, 2046, 2077, 2108, 2139, 2170, 2201, 2232, 2263, 2294, 2325, 2356, 2387, 2418, 2449, 2480, 2511, 2542, 2573, 2604, 2635, 2666, 2697, 2728, 2759, 2790, 2821, 2852, 2883, 2914, 2945, 2976, 3007, 3038, 3069, 3100, 3131, 3162, 3193, 3224, 3255, 3286, 3317, 3348, 3379, 3410, 3441, 3472, 3503, 3534, 248, 3565, 3596, 3627, 3658, 3689, 248, 3720, 3751, 3782, 3813, 3844, 3875, 3906, 3937, 3968, 3999, 4030, 4061, 4092, 4123, 4154, 4185, 4216, 4247, 4278, 4309, 4340, 4371, 248, 4402, 4433, 4464, 4495, 4526, 248, 4557, 4588, 4619, 4650, 4681, 4712, 4743, 4774, 4805, 4836, 4867, 4898, 4929, 4960, 4991, 5022, 5053, 5084, 5115, 5146, 5177, 5208, 248, 5239, 5270, 5301, 5332, 5363, 5394, 5425, 5456, 5487, 248, 5518, 5549, 5580, 5611, 248, 5642, 5673, 5704, 5735, 5766, 248, 5797, 5828, 248, 5859, 5890, 248, 5921, 5952, 5983, 6014, 6045, 6076, 6107, 6138, 6169, 248, 6200, 6231, 6262, 6293, 248, 6324, 6355, 6386, 6417, 6448, 248, 6479, 6510, 248, 6541, 6572, 248, 6603, 6634, 6665, 6696, 6727, 6758, 248, 6789, 6820, 6851, 6882, 6913, 6944, 6975, 248, 7006, 7037, 7068, 7099, 7130, 7161, 248, 7192, 7223, 7254, 7285, 7316, 7347, 248, 7378, 7409, 7440, 7471, 7502, 7533, 7564, 248, 7595, 7626, 7657, 7688, 7719, 7750, 248, 7781, 7812, 248, 248, 7843, 7874, 7905, 248, 248, 7936, 7967, 7998, 248, 8029, 248, 8060, 8091, 8122, 8153, 8184, 8215, 248, 248, 8246, 8277, 8308, 248, 248, 8339, 8370, 8401, 248, 8432, 248, 8463, 8494, 8525, 8556, 8587, 8618, 8649, 8680, 8711, 8742, 8773, 248, 248, 8804, 8835, 248, 8866, 248, 8897, 8928, 8959, 8990, 9021, 9052, 248, 248, 9083, 9114, 248, 9145, 248, 248, 9176, 9207, 248, 248, 9238, 248, 9269, 9300, 248, 9331, 9362, 248, 248, 9393, 248, 9424, 9455, 248, 9486, 248, 9517, 9548, 248, 9579, 248, 9610, 9641, 248, 248, 248, 248, 248, 248 };
  private static final int[] d = h();
  private static final String[] e = { "Unkown internal scanner error", "Internal error: unknown state", "Error: could not match input", "Error: pushback value was too large" };
  private static final byte[] f = { 0, 0, 0, 1, 0, 1, 0, 1, 9, 1, 1, 9, 1, 1, 1, 1, 9, 1, 1, 1, 1, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 9, 9, 1, 1, 1, 1, 0, 1, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 1, 0, 0, 9, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 1, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 9, 0, 0, 9, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 9, 0, 0, 9, 0, 0, 9, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 9, 0, 0, 9, 9, 1, 0, 0, 9, 9, 0, 0, 0, 9, 0, 9, 0, 0, 0, 0, 0, 0, 9, 9, 1, 0, 0, 9, 9, 0, 0, 0, 9, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 9, 0, 0, 9, 0, 9, 0, 0, 0, 0, 0, 0, 9, 9, 0, 0, 9, 0, 9, 9, 0, 0, 9, 9, 0, 9, 0, 0, 9, 0, 0, 9, 9, 0, 9, 0, 0, 9, 0, 9, 0, 0, 9, 0, 9, 0, 0, 9, 9, 9, 9, 9, 9 };
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
  private String u = null;
  private ArrayList v = null;
  private int w = 0;
  private StringBuffer x = null;
  private boolean y = false;
  private int z = 0;
  private int A = 0;
  int B = 4;

  public g a()
  {
    this.u = "";
    this.v = new ArrayList();
    this.x = new StringBuffer();
    this.z = 1;
    while (!this.r)
      try
      {
        l();
      }
      catch (IOException localIOException)
      {
        cl.a(localIOException);
      }
    f[] arrayOff = new f[this.v.size()];
    this.v.toArray(arrayOff);
    i locali = new i(this.t, this.u, arrayOff, 0);
    return locali;
  }

  private void a(String paramString)
  {
    g();
    this.y = true;
    d();
    this.w = f.a(paramString);
    this.x = new StringBuffer();
    a(6);
  }

  private void b(String paramString)
  {
    g();
    b();
    this.x = new StringBuffer();
    this.w = f.a(paramString);
  }

  private void b()
  {
    String str = this.x.toString().trim();
    if (this.w == 17)
    {
      this.t += str;
      return;
    }
    f localf = new f(this.w, str);
    this.v.add(localf);
  }

  private void c()
  {
    this.x.append(this.j, this.A, this.k - this.A);
    g();
  }

  private void d()
  {
    if (this.i == 2)
      this.t = this.x.toString().trim();
    else
      this.u = this.x.toString().trim();
    this.x = new StringBuffer();
  }

  private void e()
  {
    d();
    g();
    a(4);
  }

  private void f()
  {
    c();
    if (this.z == 4)
    {
      int i1 = this.x.indexOf("\n", 1);
      this.t = this.x.substring(0, i1);
      this.t = this.t.trim();
      this.x.delete(0, i1);
      a(4);
    }
    else
    {
      this.z += 1;
    }
  }

  private void a()
  {
    this.x.append(this.j, this.A, this.k - this.A - 2);
    g();
  }

  private void h()
  {
    a();
    if (this.z == this.B)
    {
      int i1 = this.x.indexOf("\n", 1);
      this.t = this.x.substring(0, i1);
      this.t = this.t.trim();
      this.x.delete(0, i1);
      this.u = this.x.toString().trim();
    }
    else
    {
      this.t = this.x.toString().trim();
    }
  }

  private void i()
  {
    a();
    this.u = this.x.toString().trim();
  }

  private void l()
  {
    a();
    b();
  }

  private void g()
  {
    this.A = this.k;
  }

  public sb(Reader paramReader)
  {
    this.g = paramReader;
  }

  private static int[] h()
  {
    int[] arrayOfInt = new int[9672];
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

  private static char[] c(String paramString)
  {
    char[] arrayOfChar = new char[65536];
    int i1 = 0;
    int i2 = 0;
    while (i1 < 132)
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

  private boolean i()
    throws IOException
  {
    if (this.n > 0)
    {
      System.arraycopy(this.j, this.n, this.j, 0, this.o - this.n);
      this.o -= this.n;
      this.m -= this.n;
      this.k -= this.n;
      this.l -= this.n;
      this.n = 0;
    }
    if (this.m >= this.j.length)
    {
      char[] arrayOfChar = new char[this.m * 2];
      System.arraycopy(this.j, 0, arrayOfChar, 0, this.j.length);
      this.j = arrayOfChar;
    }
    int i1 = this.g.read(this.j, this.o, this.j.length - this.o);
    if (i1 < 0)
      return true;
    this.o += i1;
    return false;
  }

  public final void j()
    throws IOException
  {
    this.r = true;
    this.o = this.n;
    if (this.g != null)
      this.g.close();
  }

  public final void a(int paramInt)
  {
    this.i = paramInt;
  }

  private void b(int paramInt)
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

  private void k()
    throws IOException
  {
    if (!this.s)
    {
      this.s = true;
      j();
    }
  }

  public int l()
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
          boolean bool2 = i();
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
            bool1 = i();
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
          bool1 = i();
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
        int i9 = arrayOfByte[this.h];
        if ((i9 & 0x1) == 1)
        {
          i2 = this.h;
          i5 = i3;
          if ((i9 & 0x8) == 8)
            break;
        }
      }
      this.k = i5;
      switch (i2)
      {
      case 21:
      case 22:
        c();
      case 390:
        break;
      case 385:
        a("filesource");
      case 391:
        break;
      case 289:
        b("final");
      case 392:
        break;
      case 282:
        b("param");
      case 393:
        break;
      case 274:
        b("since");
      case 394:
        break;
      case 245:
        b("name");
      case 395:
        break;
      case 242:
        b("link");
      case 396:
        break;
      case 239:
        b("desc");
      case 397:
        break;
      case 233:
        b("uses");
      case 398:
        break;
      case 228:
        b("todo");
      case 399:
        break;
      case 373:
        a("staticvar");
      case 400:
        break;
      case 375:
        a("copyright");
      case 401:
        break;
      case 383:
        a("subpackage");
      case 402:
        break;
      case 384:
        a("deprecated");
      case 403:
        break;
      case 311:
        b("access");
      case 404:
        break;
      case 312:
        b("author");
      case 405:
        break;
      case 313:
        b("static");
      case 406:
        break;
      case 316:
        b("throws");
      case 407:
        break;
      case 317:
        b("return");
      case 408:
        break;
      case 321:
        b("global");
      case 409:
        break;
      case 323:
        b("ignore");
      case 410:
        break;
      case 348:
        b("example");
      case 411:
        break;
      case 349:
        b("package");
      case 412:
        break;
      case 352:
        b("license");
      case 413:
        break;
      case 354:
        b("version");
      case 414:
        break;
      case 34:
      case 36:
      case 37:
        c();
        e();
      case 415:
        break;
      case 35:
        this.B = 4;
        h();
      case 416:
        break;
      case 42:
        this.B = 5;
        h();
      case 417:
        break;
      case 82:
        g();
        a(2);
      case 418:
        break;
      case 133:
      case 134:
        g();
        a(2);
      case 419:
        break;
      case 386:
        b("subpackage");
      case 420:
        break;
      case 267:
        a("final");
      case 421:
        break;
      case 260:
        a("param");
      case 422:
        break;
      case 252:
        a("since");
      case 423:
        break;
      case 292:
        a("access");
      case 424:
        break;
      case 293:
        a("author");
      case 425:
        break;
      case 294:
        a("static");
      case 426:
        break;
      case 297:
        a("throws");
      case 427:
        break;
      case 298:
        a("return");
      case 428:
        break;
      case 302:
        a("global");
      case 429:
        break;
      case 304:
        a("ignore");
      case 430:
        break;
      case 367:
        b("tutorial");
      case 431:
        break;
      case 378:
        b("staticvar");
      case 432:
        break;
      case 11:
      case 12:
        f();
      case 433:
        break;
      case 388:
        b("filesource");
      case 434:
        break;
      case 370:
        b("internal");
      case 435:
        break;
      case 191:
        b("var");
      case 436:
        break;
      case 168:
        b("see");
      case 437:
        break;
      case 387:
        b("deprecated");
      case 438:
        break;
      case 16:
      case 17:
        e();
      case 439:
        break;
      case 335:
        a("example");
      case 440:
        break;
      case 336:
        a("package");
      case 441:
        break;
      case 339:
        a("license");
      case 442:
        break;
      case 341:
        a("version");
      case 443:
        break;
      case 355:
        a("abstract");
      case 444:
        break;
      case 358:
        a("tutorial");
      case 445:
        break;
      case 359:
        a("category");
      case 446:
        break;
      case 361:
        a("internal");
      case 447:
        break;
      case 3:
      case 5:
      case 7:
      case 24:
      case 25:
      case 28:
      case 29:
      case 38:
      case 39:
      case 41:
      case 61:
      case 66:
        g();
      case 448:
        break;
      case 368:
        b("category");
      case 449:
        break;
      case 380:
        b("copyright");
      case 450:
        break;
      case 218:
        a("name");
      case 451:
        break;
      case 215:
        a("link");
      case 452:
        break;
      case 212:
        a("desc");
      case 453:
        break;
      case 206:
        a("uses");
      case 454:
        break;
      case 201:
        a("todo");
      case 455:
        break;
      case 139:
        a("see");
      case 456:
        break;
      case 162:
        a("var");
      case 457:
        break;
      case 364:
        b("abstract");
      case 458:
        break;
      case 64:
        l();
      case 459:
        break;
      case 60:
        i();
      case 460:
        break;
      case 26:
      case 27:
      case 30:
      case 461:
        break;
      case 20:
      case 23:
      case 462:
        break;
      case 10:
      case 13:
      case 14:
      case 15:
      case 18:
      case 19:
      case 463:
        break;
      case 8:
      case 9:
      case 464:
        break;
      case 4:
      case 6:
      case 31:
      case 32:
      case 33:
      case 40:
      case 43:
      case 44:
      case 45:
      case 46:
      case 47:
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
      case 58:
      case 59:
      case 62:
      case 63:
      case 65:
      case 67:
      case 68:
      case 69:
      case 70:
      case 71:
      case 72:
      case 73:
      case 74:
      case 75:
      case 76:
      case 77:
      case 78:
      case 79:
      case 80:
      case 81:
      case 83:
      case 84:
      case 85:
      case 86:
      case 87:
      case 88:
      case 89:
      case 90:
      case 91:
      case 92:
      case 93:
      case 94:
      case 95:
      case 96:
      case 97:
      case 98:
      case 99:
      case 100:
      case 101:
      case 102:
      case 103:
      case 104:
      case 105:
      case 106:
      case 107:
      case 108:
      case 109:
      case 110:
      case 111:
      case 112:
      case 113:
      case 114:
      case 115:
      case 116:
      case 117:
      case 118:
      case 119:
      case 120:
      case 121:
      case 122:
      case 123:
      case 124:
      case 125:
      case 126:
      case 127:
      case 128:
      case 129:
      case 130:
      case 131:
      case 132:
      case 135:
      case 136:
      case 137:
      case 138:
      case 140:
      case 141:
      case 142:
      case 143:
      case 144:
      case 145:
      case 146:
      case 147:
      case 148:
      case 149:
      case 150:
      case 151:
      case 152:
      case 153:
      case 154:
      case 155:
      case 156:
      case 157:
      case 158:
      case 159:
      case 160:
      case 161:
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
      case 179:
      case 180:
      case 181:
      case 182:
      case 183:
      case 184:
      case 185:
      case 186:
      case 187:
      case 188:
      case 189:
      case 190:
      case 192:
      case 193:
      case 194:
      case 195:
      case 196:
      case 197:
      case 198:
      case 199:
      case 200:
      case 202:
      case 203:
      case 204:
      case 205:
      case 207:
      case 208:
      case 209:
      case 210:
      case 211:
      case 213:
      case 214:
      case 216:
      case 217:
      case 219:
      case 220:
      case 221:
      case 222:
      case 223:
      case 224:
      case 225:
      case 226:
      case 227:
      case 229:
      case 230:
      case 231:
      case 232:
      case 234:
      case 235:
      case 236:
      case 237:
      case 238:
      case 240:
      case 241:
      case 243:
      case 244:
      case 246:
      case 247:
      case 248:
      case 249:
      case 250:
      case 251:
      case 253:
      case 254:
      case 255:
      case 256:
      case 257:
      case 258:
      case 259:
      case 261:
      case 262:
      case 263:
      case 264:
      case 265:
      case 266:
      case 268:
      case 269:
      case 270:
      case 271:
      case 272:
      case 273:
      case 275:
      case 276:
      case 277:
      case 278:
      case 279:
      case 280:
      case 281:
      case 283:
      case 284:
      case 285:
      case 286:
      case 287:
      case 288:
      case 290:
      case 291:
      case 295:
      case 296:
      case 299:
      case 300:
      case 301:
      case 303:
      case 305:
      case 306:
      case 307:
      case 308:
      case 309:
      case 310:
      case 314:
      case 315:
      case 318:
      case 319:
      case 320:
      case 322:
      case 324:
      case 325:
      case 326:
      case 327:
      case 328:
      case 329:
      case 330:
      case 331:
      case 332:
      case 333:
      case 334:
      case 337:
      case 338:
      case 340:
      case 342:
      case 343:
      case 344:
      case 345:
      case 346:
      case 347:
      case 350:
      case 351:
      case 353:
      case 356:
      case 357:
      case 360:
      case 362:
      case 363:
      case 365:
      case 366:
      case 369:
      case 371:
      case 372:
      case 374:
      case 376:
      case 377:
      case 379:
      case 381:
      case 382:
      case 389:
      default:
        if ((i1 == -1) && (this.n == this.m))
        {
          this.r = true;
          k();
          return -1;
        }
        b(2);
      }
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.sb
 * JD-Core Version:    0.6.0
 */
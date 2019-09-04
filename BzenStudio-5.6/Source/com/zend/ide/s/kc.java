package com.zend.ide.s;

import com.zend.ide.y.b;
import com.zend.ide.y.c;

public class kc
{
  private static int a;
  private static boolean b;
  private static int[] c;
  private static int[] d;
  static final boolean e = !kc.class.desiredAssertionStatus();

  public static void a()
  {
    b = b.a("desktop.phpVersion").c().toString().equals("PHP5");
    b();
  }

  public static final boolean a(int paramInt)
  {
    paramInt = g(paramInt);
    return (paramInt >= 114) && (paramInt <= 125);
  }

  public static final boolean b(int paramInt)
  {
    paramInt = g(paramInt);
    return (paramInt >= 126) && (paramInt <= 131);
  }

  public static final boolean c(int paramInt)
  {
    paramInt = g(paramInt);
    return (paramInt == 133) || (paramInt == 134) || (paramInt == 139);
  }

  public static final boolean d(int paramInt)
  {
    paramInt = g(paramInt);
    return (paramInt == 135) || (paramInt == 142) || (paramInt == 137) || (paramInt == 143) || (paramInt == 136) || (paramInt == 138);
  }

  public static final boolean e(int paramInt)
  {
    return (!c(paramInt)) && (!d(paramInt));
  }

  public static final boolean f(int paramInt)
  {
    paramInt = g(paramInt);
    return (paramInt >= 132) && (paramInt <= 145);
  }

  public static int g(int paramInt)
  {
    if ((!e) && (paramInt >= a))
      throw new AssertionError("State provided is not version dependent state");
    if (paramInt == -1)
      return -1;
    return d[paramInt];
  }

  public static int h(int paramInt)
  {
    if ((!e) && (paramInt < a))
      throw new AssertionError("State provided is not universal state");
    return c[(paramInt - a)];
  }

  public static void b()
  {
    for (int i = 0; i < 100; i++)
    {
      c[i] = -1;
      d[i] = -1;
    }
    if (b)
    {
      c[(100 - a)] = 32;
      c[(101 - a)] = 36;
      c[(102 - a)] = 38;
      c[(103 - a)] = 11;
      c[(104 - a)] = 37;
      c[(105 - a)] = 41;
      c[(106 - a)] = 43;
      c[(107 - a)] = 40;
      c[(108 - a)] = 42;
      c[(109 - a)] = 34;
      c[(110 - a)] = 33;
      c[(111 - a)] = 39;
      c[(112 - a)] = 31;
      c[(113 - a)] = 35;
      c[(114 - a)] = 4;
      c[(115 - a)] = 7;
      c[(116 - a)] = 9;
      c[(117 - a)] = 11;
      c[(118 - a)] = 3;
      c[(119 - a)] = 6;
      c[(120 - a)] = 1;
      c[(121 - a)] = 5;
      c[(122 - a)] = 8;
      c[(123 - a)] = 10;
      c[(124 - a)] = 2;
      c[(125 - a)] = 2;
      c[(126 - a)] = 27;
      c[(127 - a)] = 29;
      c[(128 - a)] = 25;
      c[(129 - a)] = 26;
      c[(130 - a)] = 28;
      c[(131 - a)] = 30;
      c[(138 - a)] = 15;
      c[(133 - a)] = 22;
      c[(134 - a)] = 23;
      c[(135 - a)] = 13;
      c[(136 - a)] = 19;
      c[(137 - a)] = 17;
      c[(145 - a)] = 25;
      c[(132 - a)] = 12;
      c[(139 - a)] = 24;
      c[(140 - a)] = 20;
      c[(141 - a)] = 16;
      c[(142 - a)] = 14;
      c[(143 - a)] = 18;
      c[(144 - a)] = 21;
      c[(146 - a)] = 0;
      d[32] = 100;
      d[36] = 101;
      d[38] = 102;
      d[11] = 103;
      d[37] = 104;
      d[41] = 105;
      d[43] = 106;
      d[40] = 107;
      d[42] = 108;
      d[34] = 109;
      d[33] = 110;
      d[39] = 111;
      d[31] = 112;
      d[35] = 113;
      d[4] = 114;
      d[7] = 115;
      d[9] = 116;
      d[11] = 117;
      d[3] = 118;
      d[6] = 119;
      d[1] = 120;
      d[5] = 121;
      d[8] = 122;
      d[10] = 123;
      d[2] = 124;
      d[2] = 125;
      d[27] = 126;
      d[29] = 127;
      d[25] = 128;
      d[26] = 129;
      d[28] = 130;
      d[30] = 131;
      d[15] = 138;
      d[22] = 133;
      d[23] = 134;
      d[13] = 135;
      d[19] = 136;
      d[17] = 137;
      d[25] = 145;
      d[12] = 132;
      d[24] = 139;
      d[20] = 140;
      d[16] = 141;
      d[14] = 142;
      d[18] = 143;
      d[21] = 144;
      d[0] = 146;
    }
    else
    {
      c[(100 - a)] = 62;
      c[(101 - a)] = 70;
      c[(102 - a)] = 74;
      c[(103 - a)] = 86;
      c[(104 - a)] = 72;
      c[(105 - a)] = 80;
      c[(106 - a)] = 84;
      c[(107 - a)] = 78;
      c[(108 - a)] = 82;
      c[(109 - a)] = 66;
      c[(110 - a)] = 64;
      c[(111 - a)] = 76;
      c[(112 - a)] = 60;
      c[(113 - a)] = 68;
      c[(114 - a)] = 8;
      c[(115 - a)] = 16;
      c[(116 - a)] = 20;
      c[(117 - a)] = 24;
      c[(118 - a)] = 6;
      c[(119 - a)] = 14;
      c[(120 - a)] = 2;
      c[(121 - a)] = 10;
      c[(122 - a)] = 18;
      c[(123 - a)] = 22;
      c[(124 - a)] = 4;
      c[(125 - a)] = 12;
      c[(126 - a)] = 50;
      c[(127 - a)] = 54;
      c[(128 - a)] = 58;
      c[(129 - a)] = 48;
      c[(130 - a)] = 52;
      c[(131 - a)] = 56;
      c[(138 - a)] = 32;
      c[(133 - a)] = 40;
      c[(134 - a)] = 42;
      c[(135 - a)] = 28;
      c[(136 - a)] = -1;
      c[(137 - a)] = 36;
      c[(145 - a)] = 46;
      c[(132 - a)] = 26;
      c[(139 - a)] = 44;
      c[(140 - a)] = 38;
      c[(141 - a)] = 34;
      c[(142 - a)] = 30;
      c[(143 - a)] = -1;
      c[(144 - a)] = -1;
      c[(146 - a)] = 0;
      d[62] = 100;
      d[70] = 101;
      d[74] = 102;
      d[86] = 103;
      d[72] = 104;
      d[80] = 105;
      d[84] = 106;
      d[78] = 107;
      d[82] = 108;
      d[66] = 109;
      d[64] = 110;
      d[76] = 111;
      d[60] = 112;
      d[68] = 113;
      d[8] = 114;
      d[16] = 115;
      d[20] = 116;
      d[24] = 117;
      d[6] = 118;
      d[14] = 119;
      d[2] = 120;
      d[10] = 121;
      d[18] = 122;
      d[22] = 123;
      d[4] = 124;
      d[12] = 125;
      d[50] = 126;
      d[54] = 127;
      d[58] = 128;
      d[48] = 129;
      d[52] = 130;
      d[56] = 131;
      d[32] = 138;
      d[40] = 133;
      d[42] = 134;
      d[28] = 135;
      d[30] = 142;
      d[36] = 137;
      d[46] = 145;
      d[26] = 132;
      d[44] = 139;
      d[38] = 140;
      d[34] = 141;
      d[0] = 146;
    }
  }

  static
  {
    a = 100;
    c = new int[100];
    d = new int[100];
    b.a(new lc(), "desktop.phpVersion");
    a();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.s.kc
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.util;

public class zb
{
  private int[] a;
  private byte[] b;
  private int c;
  protected static final char[] d = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

  public zb(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    this.a = new int[4];
    if (i != 16)
      throw new ArrayIndexOutOfBoundsException(getClass().getName() + ": Key is not 16 bytes");
    int k = 0;
    int j = 0;
    while (j < i)
    {
      this.a[k] = (paramArrayOfByte[j] << 24 | (paramArrayOfByte[(j + 1)] & 0xFF) << 16 | (paramArrayOfByte[(j + 2)] & 0xFF) << 8 | paramArrayOfByte[(j + 3)] & 0xFF);
      j += 4;
      k++;
    }
    this.b = paramArrayOfByte;
  }

  public String toString()
  {
    String str = getClass().getName();
    str = str + ": Tiny Encryption Algorithm (TEA)  key: " + a(this.b);
    return str;
  }

  public int[] a(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[0];
    int j = paramArrayOfInt[1];
    int k = 0;
    int m = -1640531527;
    int n = 32;
    while (n-- > 0)
    {
      i += ((j << 4 ^ j >>> 5) + j ^ k + this.a[(k & 0x3)]);
      k += m;
      j += ((i << 4 ^ i >>> 5) + i ^ k + this.a[(k >>> 11 & 0x3)]);
    }
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = i;
    arrayOfInt[1] = j;
    return arrayOfInt;
  }

  public int[] b(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[0];
    int j = paramArrayOfInt[1];
    int k = -957401312;
    int m = -1640531527;
    int n = 32;
    while (n-- > 0)
    {
      j -= ((i << 4 ^ i >>> 5) + i ^ k + this.a[(k >>> 11 & 0x3)]);
      k -= m;
      i -= ((j << 4 ^ j >>> 5) + j ^ k + this.a[(k & 0x3)]);
    }
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = i;
    arrayOfInt[1] = j;
    return arrayOfInt;
  }

  public int[] a(byte[] paramArrayOfByte, int paramInt)
  {
    int k = paramInt;
    byte[] arrayOfByte = paramArrayOfByte;
    this.c = (k % 8);
    if (this.c != 0)
    {
      this.c = (8 - k % 8);
      arrayOfByte = new byte[k + this.c];
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, k);
      k = arrayOfByte.length;
    }
    int m = k / 4;
    int[] arrayOfInt1 = new int[2];
    int[] arrayOfInt2 = new int[m];
    int j = 0;
    int i = 0;
    while (i < k)
    {
      arrayOfInt1[0] = (arrayOfByte[i] << 24 | (arrayOfByte[(i + 1)] & 0xFF) << 16 | (arrayOfByte[(i + 2)] & 0xFF) << 8 | arrayOfByte[(i + 3)] & 0xFF);
      arrayOfInt1[1] = (arrayOfByte[(i + 4)] << 24 | (arrayOfByte[(i + 5)] & 0xFF) << 16 | (arrayOfByte[(i + 6)] & 0xFF) << 8 | arrayOfByte[(i + 7)] & 0xFF);
      arrayOfInt1 = a(arrayOfInt1);
      arrayOfInt2[j] = arrayOfInt1[0];
      arrayOfInt2[(j + 1)] = arrayOfInt1[1];
      i += 8;
      j += 2;
    }
    return arrayOfInt2;
  }

  public byte[] c(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    byte[] arrayOfByte = new byte[i * 4];
    int[] arrayOfInt = new int[2];
    int k = 0;
    int j = 0;
    while (j < i)
    {
      arrayOfInt[0] = paramArrayOfInt[j];
      arrayOfInt[1] = paramArrayOfInt[(j + 1)];
      arrayOfInt = b(arrayOfInt);
      arrayOfByte[k] = (byte)(arrayOfInt[0] >>> 24);
      arrayOfByte[(k + 1)] = (byte)(arrayOfInt[0] >>> 16);
      arrayOfByte[(k + 2)] = (byte)(arrayOfInt[0] >>> 8);
      arrayOfByte[(k + 3)] = (byte)arrayOfInt[0];
      arrayOfByte[(k + 4)] = (byte)(arrayOfInt[1] >>> 24);
      arrayOfByte[(k + 5)] = (byte)(arrayOfInt[1] >>> 16);
      arrayOfByte[(k + 6)] = (byte)(arrayOfInt[1] >>> 8);
      arrayOfByte[(k + 7)] = (byte)arrayOfInt[1];
      j += 2;
      k += 8;
    }
    return arrayOfByte;
  }

  public int[] a(String paramString)
    throws ArrayIndexOutOfBoundsException
  {
    int i = paramString.length();
    if (i % 8 != 0)
      throw new ArrayIndexOutOfBoundsException("Hex string has incorrect length, required to be divisible by eight: " + i);
    int j = i / 8;
    int[] arrayOfInt = new int[j];
    byte[] arrayOfByte1 = new byte[2];
    byte[] arrayOfByte2 = new byte[4];
    int k = 0;
    for (int m = 0; m < j; m++)
    {
      for (int n = 0; n < 4; n++)
      {
        for (int i1 = 0; i1 < 2; i1++)
          switch (paramString.charAt(k++))
          {
          case '0':
            arrayOfByte1[i1] = 0;
            break;
          case '1':
            arrayOfByte1[i1] = 1;
            break;
          case '2':
            arrayOfByte1[i1] = 2;
            break;
          case '3':
            arrayOfByte1[i1] = 3;
            break;
          case '4':
            arrayOfByte1[i1] = 4;
            break;
          case '5':
            arrayOfByte1[i1] = 5;
            break;
          case '6':
            arrayOfByte1[i1] = 6;
            break;
          case '7':
            arrayOfByte1[i1] = 7;
            break;
          case '8':
            arrayOfByte1[i1] = 8;
            break;
          case '9':
            arrayOfByte1[i1] = 9;
            break;
          case 'A':
            arrayOfByte1[i1] = 10;
            break;
          case 'B':
            arrayOfByte1[i1] = 11;
            break;
          case 'C':
            arrayOfByte1[i1] = 12;
            break;
          case 'D':
            arrayOfByte1[i1] = 13;
            break;
          case 'E':
            arrayOfByte1[i1] = 14;
            break;
          case 'F':
            arrayOfByte1[i1] = 15;
            break;
          case 'a':
            arrayOfByte1[i1] = 10;
            break;
          case 'b':
            arrayOfByte1[i1] = 11;
            break;
          case 'c':
            arrayOfByte1[i1] = 12;
            break;
          case 'd':
            arrayOfByte1[i1] = 13;
            break;
          case 'e':
            arrayOfByte1[i1] = 14;
            break;
          case 'f':
            arrayOfByte1[i1] = 15;
          case ':':
          case ';':
          case '<':
          case '=':
          case '>':
          case '?':
          case '@':
          case 'G':
          case 'H':
          case 'I':
          case 'J':
          case 'K':
          case 'L':
          case 'M':
          case 'N':
          case 'O':
          case 'P':
          case 'Q':
          case 'R':
          case 'S':
          case 'T':
          case 'U':
          case 'V':
          case 'W':
          case 'X':
          case 'Y':
          case 'Z':
          case '[':
          case '\\':
          case ']':
          case '^':
          case '_':
          case '`':
          }
        arrayOfByte2[n] = (byte)(arrayOfByte1[0] << 4 | arrayOfByte1[1]);
      }
      arrayOfInt[m] = (arrayOfByte2[0] << 24 | (arrayOfByte2[1] & 0xFF) << 16 | (arrayOfByte2[2] & 0xFF) << 8 | arrayOfByte2[3] & 0xFF);
    }
    return arrayOfInt;
  }

  public String d(int[] paramArrayOfInt)
    throws ArrayIndexOutOfBoundsException
  {
    if (paramArrayOfInt.length % 2 == 1)
      throw new ArrayIndexOutOfBoundsException("Odd number of ints found: " + paramArrayOfInt.length);
    StringBuffer localStringBuffer = new StringBuffer();
    byte[] arrayOfByte = new byte[8];
    for (int i = 0; i < paramArrayOfInt.length; i += 2)
    {
      arrayOfByte[0] = (byte)(paramArrayOfInt[i] >>> 24);
      arrayOfByte[1] = (byte)(paramArrayOfInt[i] >>> 16);
      arrayOfByte[2] = (byte)(paramArrayOfInt[i] >>> 8);
      arrayOfByte[3] = (byte)paramArrayOfInt[i];
      arrayOfByte[4] = (byte)(paramArrayOfInt[(i + 1)] >>> 24);
      arrayOfByte[5] = (byte)(paramArrayOfInt[(i + 1)] >>> 16);
      arrayOfByte[6] = (byte)(paramArrayOfInt[(i + 1)] >>> 8);
      arrayOfByte[7] = (byte)paramArrayOfInt[(i + 1)];
      localStringBuffer.append(a(arrayOfByte));
    }
    return localStringBuffer.toString();
  }

  public String a(byte[] paramArrayOfByte)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < paramArrayOfByte.length; i++)
    {
      int j = paramArrayOfByte[i] >>> 4 & 0xF;
      localStringBuffer.append(d[j]);
      j = paramArrayOfByte[i] & 0xF;
      localStringBuffer.append(d[j]);
    }
    return localStringBuffer.toString();
  }

  public String a(String paramString, char paramChar)
  {
    StringBuffer localStringBuffer = new StringBuffer(paramString);
    int i = localStringBuffer.length() % 8;
    for (int j = 0; j < i; j++)
      localStringBuffer.append(paramChar);
    return localStringBuffer.toString();
  }

  public String b(String paramString)
  {
    return a(paramString, ' ');
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.zb
 * JD-Core Version:    0.6.0
 */
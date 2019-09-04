package com.zend.ide.n;

import com.zend.ide.util.cr;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class ue extends OutputStreamWriter
  implements qf
{
  private ve g;

  public ue(OutputStream paramOutputStream, String paramString)
    throws UnsupportedEncodingException
  {
    super(paramOutputStream, paramString);
    paramString = getEncoding();
    int i = cr.c() == 1 ? 1 : 0;
    if (i != 0)
    {
      if (paramString.equals("EUC_JP"))
        this.g = ve.EUC_JP;
      else if (paramString.equals("SJIS"))
        this.g = ve.SHIFT_JIS;
      else if (paramString.equals("ISO2022JP"))
        this.g = ve.JIS;
    }
    else if (paramString.equals("UTF8"))
      this.g = ve.UTF8;
    else if (paramString.equals("MS932"))
      this.g = ve.MS932;
    if (this.g == null)
      this.g = ve.OK;
  }

  public void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
    throws IOException
  {
    char[] arrayOfChar = new char[paramInt2];
    System.arraycopy(paramArrayOfChar, paramInt1, arrayOfChar, 0, paramInt2);
    switch (pf.a[this.g.ordinal()])
    {
    case 1:
    case 2:
    case 3:
      for (int i = 0; i < paramInt2; i++)
        arrayOfChar[i] = a(arrayOfChar[i]);
    }
    super.write(arrayOfChar, 0, paramInt2);
  }

  public void write(String paramString, int paramInt1, int paramInt2)
    throws IOException
  {
    char[] arrayOfChar = new char[paramInt2];
    paramString.getChars(paramInt1, paramInt1 + paramInt2, arrayOfChar, 0);
    write(arrayOfChar, 0, paramInt2);
  }

  public void write(int paramInt)
    throws IOException
  {
    switch (pf.a[this.g.ordinal()])
    {
    case 1:
    case 2:
    case 3:
      super.write(a((char)paramInt));
      break;
    default:
      super.write(paramInt);
    }
  }

  private char a(char paramChar)
  {
    if (paramChar == a[0])
      return a[1];
    if (paramChar == e[0])
      return e[1];
    if (paramChar == f[0])
      return f[1];
    if (paramChar == c[0])
      return c[1];
    if (paramChar == b[0])
      return b[1];
    if (paramChar == d[0])
      return d[1];
    return paramChar;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ue
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.n;

import com.zend.ide.util.cr;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class te extends InputStreamReader
  implements qf
{
  private ve g;

  public te(InputStream paramInputStream, String paramString)
    throws UnsupportedEncodingException
  {
    super(paramInputStream, paramString);
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

  public int read()
    throws IOException
  {
    int i = super.read();
    if (i == -1)
      return i;
    switch (of.a[this.g.ordinal()])
    {
    case 1:
    case 2:
    case 3:
      return a((char)i);
    }
    return i;
  }

  public int read(char[] paramArrayOfChar, int paramInt1, int paramInt2)
    throws IOException
  {
    int i = super.read(paramArrayOfChar, paramInt1, paramInt2);
    switch (of.a[this.g.ordinal()])
    {
    case 1:
    case 2:
    case 3:
      for (int j = paramInt1; j < i; j++)
        paramArrayOfChar[j] = a(paramArrayOfChar[j]);
    }
    return i;
  }

  private char a(char paramChar)
  {
    if (paramChar == a[1])
      return a[0];
    if (paramChar == e[1])
      return e[0];
    if (paramChar == f[1])
      return f[0];
    if (paramChar == c[1])
      return c[0];
    if (paramChar == b[1])
      return b[0];
    if (paramChar == d[1])
      return d[0];
    return paramChar;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.te
 * JD-Core Version:    0.6.0
 */
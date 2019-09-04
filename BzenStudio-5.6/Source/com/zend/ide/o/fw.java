package com.zend.ide.o;

import com.zend.ide.n.bw;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import javax.swing.SwingUtilities;

public class fw extends ci
{
  private de a;
  private String b;
  private bw c;

  public fw(bw parambw, de paramde)
  {
    this.a = paramde;
    this.c = parambw;
  }

  public void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.b = c(paramString3);
    int i = d(paramString3);
    try
    {
      this.b = URLDecoder.decode(this.b, "UTF-8");
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    byte[] arrayOfByte = this.a.a(this.b);
    ByteArrayInputStream localByteArrayInputStream = null;
    if ((arrayOfByte != null) && (arrayOfByte.length > 0))
    {
      localByteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
      a(localByteArrayInputStream, i);
    }
    this.a.k();
    this.a.f();
  }

  private String c(String paramString)
  {
    String str1 = "";
    String str2 = "get_file_content=";
    if (paramString.indexOf(str2) != -1)
    {
      str1 = paramString.substring(paramString.indexOf(str2) + str2.length());
      str1 = str1.substring(0, str1.indexOf('&') != -1 ? str1.indexOf('&') : str1.length());
    }
    return str1;
  }

  private int d(String paramString)
  {
    int i = -1;
    String str1 = "line_number=";
    if (paramString.indexOf(str1) != -1)
    {
      String str2 = paramString.substring(paramString.indexOf(str1) + str1.length());
      str2 = str2.substring(0, str2.indexOf('&') != -1 ? str2.indexOf('&') : str2.length());
      try
      {
        i = Integer.parseInt(str2);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        i = -1;
      }
    }
    return i;
  }

  private void a(InputStream paramInputStream, int paramInt)
  {
    if (paramInputStream != null)
    {
      this.c.a(this.b, null, paramInputStream);
      SwingUtilities.invokeLater(new fv(this, paramInt));
    }
    try
    {
      paramInputStream.close();
    }
    catch (Exception localException)
    {
    }
  }

  static bw a(fw paramfw)
  {
    return paramfw.c;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.fw
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.w;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class cb
{
  private static final SimpleDateFormat a = new SimpleDateFormat("dd MMM yyyy HH:mm:ss", Locale.US);
  private static SimpleDateFormat b = new SimpleDateFormat("E MMM dd HH:mm:ss yyyy", Locale.US);

  public static synchronized Date a(String paramString)
    throws ParseException
  {
    try
    {
      if (paramString.charAt(8) == ' ')
      {
        StringBuffer localStringBuffer = new StringBuffer(paramString);
        localStringBuffer.setCharAt(8, '0');
        paramString = localStringBuffer.toString();
      }
    }
    catch (StringIndexOutOfBoundsException localStringIndexOutOfBoundsException)
    {
      throw new ParseException(localStringIndexOutOfBoundsException.getMessage(), 8);
    }
    return b.parse(paramString);
  }

  static
  {
    b.setTimeZone(TimeZone.getTimeZone("GMT"));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.cb
 * JD-Core Version:    0.6.0
 */
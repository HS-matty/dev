package com.zend.ide.u;

import com.jscape.inet.ftp.FtpFile;
import com.jscape.inet.ftp.FtpFileParser;
import com.jscape.inet.ftp.NTParser;
import com.jscape.inet.ftp.UnixParser;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

class z
{
  FtpFileParser a;
  final i b;

  z(i parami, FtpFileParser paramFtpFileParser)
  {
    this.a = paramFtpFileParser;
  }

  public Date a(FtpFile paramFtpFile, TimeZone paramTimeZone, Locale paramLocale)
    throws ParseException
  {
    if ((this.a instanceof NTParser))
      return ((NTParser)this.a).getDateTime(paramFtpFile, paramTimeZone, paramLocale);
    if ((this.a instanceof UnixParser))
      return ((UnixParser)this.a).getDateTime(paramFtpFile, paramTimeZone, paramLocale);
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.u.z
 * JD-Core Version:    0.6.0
 */
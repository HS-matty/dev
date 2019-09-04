package com.zend.ide.util.f;

import java.util.Calendar;
import java.util.zip.CRC32;

public class x
{
  private static x a = new x();

  public static y a(int paramInt)
  {
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.add(5, paramInt);
    return a("StudioPro", localCalendar);
  }

  public static y a(String paramString, Calendar paramCalendar)
  {
    return a(paramString, paramCalendar, "Evaluation User", 1, 5, 5);
  }

  public static y a(String paramString1, Calendar paramCalendar, String paramString2, int paramInt1, int paramInt2, int paramInt3)
  {
    String str1 = String.format("%1$s%2$s%3$td%3$tm%3$tY%4$d%5$d%6$d", new Object[] { paramString1, paramString2, paramCalendar, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt1) });
    CRC32 localCRC32 = new CRC32();
    localCRC32.update(str1.getBytes());
    long l = localCRC32.getValue();
    String str2 = String.format("%1$08X%2$td%2$tm%2$tY%3$d%4$d%5$d", new Object[] { Long.valueOf(localCRC32.getValue()), paramCalendar, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt1) });
    x tmp129_126 = a;
    tmp129_126.getClass();
    return new y(tmp129_126, paramString2, tmp129_126);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.f.x
 * JD-Core Version:    0.6.0
 */
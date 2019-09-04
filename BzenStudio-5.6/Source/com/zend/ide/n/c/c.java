package com.zend.ide.n.c;

import com.zend.ide.n.bw;
import com.zend.ide.n.ho;
import com.zend.ide.s.bl;
import com.zend.ide.util.cl;

public class c
{
  public static void a(bw parambw, int paramInt1, int paramInt2)
  {
    try
    {
      int i = ((bl)((ho)parambw.getDocument()).b(paramInt1)).c();
      int j = ((bl)((ho)parambw.getDocument()).b(paramInt2)).c();
      a locala = b.a(i, j);
      if (locala != null)
        locala.a(parambw, paramInt1, paramInt2, i, j);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }

  public static void b(bw parambw, int paramInt1, int paramInt2)
  {
    try
    {
      int i = ((bl)((ho)parambw.getDocument()).b(paramInt1)).c();
      int j = ((bl)((ho)parambw.getDocument()).b(paramInt2)).c();
      a locala = b.a(i, j);
      if (locala != null)
        locala.b(parambw, paramInt1, paramInt2, i, j);
    }
    catch (Exception localException)
    {
      cl.a(localException);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.c.c
 * JD-Core Version:    0.6.0
 */
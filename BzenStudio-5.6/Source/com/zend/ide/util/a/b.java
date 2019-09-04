package com.zend.ide.util.a;

import com.zend.ide.bd.c;
import com.zend.ide.util.cl;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.dj;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class b
  implements cu
{
  private static h a = null;

  private static JFrame b()
  {
    return c.b().h();
  }

  public static synchronized void a(Exception paramException)
  {
    if (!(paramException instanceof dj))
    {
      localObject = ct.a(858, cl.d);
      cl.a(paramException);
      JOptionPane.showMessageDialog(b(), localObject, ct.a(132), 0);
      return;
    }
    Object localObject = (dj)paramException;
    String str1 = ((dj)localObject).getMessage();
    String str2 = ((dj)localObject).d();
    String str3 = ((dj)localObject).b();
    int i = ((dj)localObject).c();
    if ((str2 != null) && (str2.length() > 0))
    {
      a(str1, str2);
      return;
    }
    JOptionPane.showMessageDialog(b(), str1, str3, i);
  }

  private static void a(String paramString1, String paramString2)
  {
    if (a == null)
      a = new h(b());
    a.b(paramString2);
    a.a(paramString1);
    a.setVisible(true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.a.b
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.util.f;

import com.zend.ide.i.y;
import com.zend.ide.p.ba;
import com.zend.ide.p.cb;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import com.zend.ide.util.cv;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Frame;
import javax.swing.JFrame;

public class k
  implements cu
{
  public void a(int paramInt, boolean paramBoolean)
  {
    String str = "5.5";
    if (paramBoolean)
    {
      if ("".length() > 0)
      {
        str = str + " ";
        a(ct.a(890), ct.a(1537, str), false);
      }
      else
      {
        a(ct.a(890), ct.a(1537, str));
      }
    }
    else if (paramInt == 3)
    {
      a(ct.a(475), ct.a(1575, str, str));
    }
    else if (paramInt == 2)
    {
      a(ct.a(475), ct.a(1650, str, str));
    }
    else
    {
      str = "".length() > 0 ? str + " " + "" : str;
      if ("".length() == 0)
        a(ct.a(475), ct.a(1536, str));
      else
        a(ct.a(475), ct.a(1536, str), false);
    }
  }

  public void a(int paramInt, long paramLong, Component paramComponent)
  {
    String str1 = paramLong == 1L ? ct.a(136) : ct.a(137);
    String str2 = "5.5";
    String str3 = ct.a(138);
    if (paramInt == 3)
      a(str3, ct.a(1574, str2, "" + paramLong, str1, str2), false);
    else if (paramInt == 2)
      a(str3, ct.a(1651, str2, "" + paramLong, str1, str2), false);
    else
      a(str3, ct.a(1127, "" + paramLong, str1), false);
  }

  public void a(Component paramComponent)
  {
    String str1 = ct.a(491);
    String str2 = ct.a(492);
    a(str2, str1, paramComponent);
  }

  public void b(Component paramComponent)
  {
    String str1 = ct.a(467);
    String str2 = ct.a(1295);
    a(str1, str2, paramComponent);
  }

  public void a(Component paramComponent, String paramString, int paramInt)
  {
    if (paramInt == 0)
      return;
    String str1 = ct.a(499);
    String str2 = str1 + "!\n" + paramString + "\n" + ct.a(497, String.valueOf(paramInt));
    ba.a(paramComponent, str2, str1, -1, 1);
  }

  public void a(String paramString1, String paramString2, Component paramComponent)
  {
    if (paramComponent == null)
    {
      paramComponent = new JFrame();
      ((JFrame)paramComponent).setIconImage(cv.a("application32.gif"));
    }
    ba.a(paramComponent, paramString2, paramString1, -1, 2);
  }

  public void c(Component paramComponent)
  {
    a(ct.a(1538), ct.a(1690), paramComponent);
  }

  public void d(Component paramComponent)
  {
    a(ct.a(1691), ct.a(1692), paramComponent);
  }

  public void a(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, true);
  }

  public void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject;
    if (paramBoolean)
      localObject = new w(paramString1, paramString2);
    else
      localObject = new cb(paramString1, paramString2);
    ((cb)localObject).setVisible(true);
  }

  public void a(String paramString, Component paramComponent)
  {
    String str1 = ct.a(881);
    String str2 = ct.a(882, paramString, paramString);
    y localy;
    if ((paramComponent != null) && ((paramComponent instanceof Frame)))
      localy = new y((Frame)paramComponent, str1, str2);
    else if ((paramComponent != null) && ((paramComponent instanceof Dialog)))
      localy = new y((Dialog)paramComponent, str1, str2);
    else
      localy = new y(new Frame(), str1, str2);
    localy.e();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.f.k
 * JD-Core Version:    0.6.0
 */
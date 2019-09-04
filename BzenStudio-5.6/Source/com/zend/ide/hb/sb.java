package com.zend.ide.hb;

import com.zend.ide.p.q;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.File;
import javax.swing.JList;

class sb extends q
{
  final ub b;

  private sb(ub paramub)
  {
  }

  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.getListCellRendererComponent(paramJList, paramObject, paramInt, paramBoolean1, paramBoolean2);
    o();
    Object localObject;
    if ((paramObject instanceof d))
    {
      localObject = (d)paramObject;
      String str1 = ((d)localObject).f().getAbsolutePath();
      String str2 = " (" + ((d)localObject).a() + ") ";
      ub.a(this.b, ((d)localObject).d());
      ub.a(this.b, ((d)localObject).b().trim());
      ub.b(this.b, ((d)localObject).g().length());
      a(str1, null, null);
      a(str2, null, null);
      if ((ub.a(this.b) >= 0) && (ub.a(this.b) + ub.b(this.b) <= ub.c(this.b).length()))
      {
        String str3 = ub.c(this.b);
        int j;
        while ((j = str3.indexOf("\t")) != -1)
        {
          str3 = str3.substring(0, j) + ub.d(this.b) + str3.substring(j + 1);
          if (j >= ub.a(this.b))
            continue;
          ub.c(this.b, ub.d(this.b).length() - 1);
        }
        a(str3.substring(0, ub.a(this.b)), null, null);
        a(str3.substring(ub.a(this.b), ub.a(this.b) + ub.b(this.b)), null, Color.RED);
        a(str3.substring(ub.a(this.b) + ub.b(this.b)), null, null);
      }
      else
      {
        a(ub.c(this.b), null, null);
      }
    }
    else
    {
      localObject = paramObject.toString();
      int i = ((String)localObject).indexOf(":");
      a(((String)localObject).substring(0, i + 1), getFont().deriveFont(1), null);
      a(((String)localObject).substring(i + 1), getFont().deriveFont(1), Color.red);
    }
    setToolTipText(getText());
    return (Component)this;
  }

  sb(ub paramub, eb parameb)
  {
    this(paramub);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.hb.sb
 * JD-Core Version:    0.6.0
 */
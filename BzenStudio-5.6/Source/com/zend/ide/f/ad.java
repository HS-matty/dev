package com.zend.ide.f;

import com.zend.ide.b.m;
import com.zend.ide.m.ab;
import com.zend.ide.m.bh;
import com.zend.ide.m.c;
import com.zend.ide.m.g;
import com.zend.ide.m.t;
import com.zend.ide.m.w;
import com.zend.ide.m.y;
import com.zend.ide.m.z;

public class ad extends cd
  implements t
{
  private String e = null;
  private ab[] o = null;

  public ad(String paramString1, int paramInt, g paramg, m paramm, y paramy, w[] paramArrayOfw, z[] paramArrayOfz, c[] paramArrayOfc, bh[] paramArrayOfbh, ab[] paramArrayOfab, String paramString2)
  {
    super(paramString1, paramInt, paramg, paramm, paramy, paramArrayOfw, paramArrayOfz, paramArrayOfc, paramArrayOfbh, null);
    this.e = paramString2;
    this.o = paramArrayOfab;
  }

  public String c()
  {
    return this.e;
  }

  public ab[] d()
  {
    return this.o;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.f.ad
 * JD-Core Version:    0.6.0
 */
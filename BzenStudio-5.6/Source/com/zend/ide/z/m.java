package com.zend.ide.z;

import com.zend.ide.y.b;
import java.util.ArrayList;

public class m
  implements l
{
  private l a;
  private boolean b = false;

  public m(l paraml)
  {
    this.a = paraml;
  }

  public r a(int paramInt)
  {
    return this.a.a(paramInt);
  }

  public n a(String paramString)
  {
    return this.a.a(paramString);
  }

  public n[] c()
  {
    return this.a.c();
  }

  public ArrayList a()
  {
    return this.a.a();
  }

  public i b()
  {
    return this.a.b();
  }

  public u d()
  {
    return this.a.d();
  }

  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
    if (paramBoolean)
    {
      String str = (String)b.a("debugging.dummyFile");
      this.a.d().f(str);
      ArrayList localArrayList = this.a.a();
      for (int i = 0; i < localArrayList.size(); i++)
      {
        n localn = (n)localArrayList.get(i);
        if (!localn.e().endsWith(str))
          continue;
        localArrayList.remove(i);
        break;
      }
      i locali = this.a.b();
      locali.a();
    }
  }

  public boolean a()
  {
    return this.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.m
 * JD-Core Version:    0.6.0
 */
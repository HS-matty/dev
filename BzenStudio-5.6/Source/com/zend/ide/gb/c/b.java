package com.zend.ide.gb.c;

import com.a.e;
import com.a.h;
import com.zend.ide.gb.b.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class b extends com.a.a.a
{
  com.a.a.b d = new com.a.a.b("classes", new a());

  public b()
  {
    super("InputFileProperties", c.class);
  }

  public void a(Object paramObject)
  {
    super.a(paramObject);
    if (paramObject != null)
      this.d.a(((c)paramObject).e().toArray());
  }

  public Object a(e parame)
  {
    String str1 = parame.a("fileName");
    boolean bool = parame.a("includeFreeFunctions").equals("true");
    String str2 = parame.a("freeFunctionsURL");
    h localh = (h)parame.b().get(0);
    ArrayList localArrayList = new ArrayList(Arrays.asList((Object[])(Object[])localh.b()));
    return new c(str1, bool, str2, localArrayList);
  }

  public e e()
  {
    c localc = (c)c();
    e locale = new e();
    locale.a("fileName", localc.b());
    String str = localc.c() ? "true" : "false";
    locale.a("includeFreeFunctions", str);
    locale.a("freeFunctionsURL", localc.d());
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(this.d);
    locale.a(localArrayList);
    return locale;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.gb.c.b
 * JD-Core Version:    0.6.0
 */
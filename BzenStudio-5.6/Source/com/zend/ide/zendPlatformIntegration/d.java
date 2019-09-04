package com.zend.ide.zendPlatformIntegration;

import com.zend.ide.y.b;
import com.zend.ide.zendPlatformIntegration.a.hb;
import com.zend.ide.zendPlatformIntegration.b.b.e;
import com.zend.ide.zendPlatformIntegration.b.b.f;
import java.util.TimerTask;

class d extends TimerTask
{
  final c a;

  d(c paramc)
  {
  }

  public void run()
  {
    String str = b.a("platform.guiURL").c().toString();
    e locale = new e(str, c.a(this.a).c(), true);
    c.a(this.a).a(locale);
    this.a.c.b(c.a(this.a).e());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.d
 * JD-Core Version:    0.6.0
 */
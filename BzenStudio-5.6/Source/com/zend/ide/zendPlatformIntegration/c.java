package com.zend.ide.zendPlatformIntegration;

import com.zend.ide.zendPlatformIntegration.a.hb;
import com.zend.ide.zendPlatformIntegration.a.s;
import com.zend.ide.zendPlatformIntegration.b.b.f;
import java.util.Timer;

public class c
{
  private Timer a;
  private f b;
  hb c;

  public c(hb paramhb, f paramf)
  {
    this.c = paramhb;
    this.a = new Timer();
    this.a.schedule(new d(this), s.a().b * 60 * 1000, s.a().b * 60 * 1000);
    this.b = paramf;
  }

  public void a()
  {
    this.a.cancel();
  }

  static f a(c paramc)
  {
    return paramc.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.c
 * JD-Core Version:    0.6.0
 */
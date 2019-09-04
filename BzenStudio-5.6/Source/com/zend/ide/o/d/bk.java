package com.zend.ide.o.d;

import com.zend.ide.util.cl;
import com.zend.ide.util.d.a;

public class bk
  implements com.zend.ide.t.i
{
  private a a = new a(50);

  public bk()
  {
    this.a.a(2, new h());
    this.a.a(3, new j());
    this.a.a(4, new i());
    this.a.a(5, new r());
    this.a.a(6, new t());
    this.a.a(7, new s());
    this.a.a(8, new k());
    this.a.a(12, new p());
    this.a.a(13, new l());
    this.a.a(23, new db());
    this.a.a(14, new u());
    this.a.a(16, new q());
    this.a.a(17, new o());
    this.a.a(18, new m());
    this.a.a(19, new n());
    this.a.a(41, new bq());
    this.a.a(42, new bp());
    this.a.a(43, new bo());
    this.a.a(1002, new v());
    this.a.a(1003, new x());
    this.a.a(1004, new w());
    this.a.a(1005, new bf());
    this.a.a(1006, new bh());
    this.a.a(1007, new bg());
    this.a.a(1008, new y());
    this.a.a(1012, new bd());
    this.a.a(1013, new z());
    this.a.a(1014, new bi());
    this.a.a(1016, new be());
    this.a.a(1017, new bc());
    this.a.a(1018, new ba());
    this.a.a(1019, new bb());
    this.a.a(22, new ab());
    this.a.a(1022, new cb());
    this.a.a(4001, new bt());
    this.a.a(4002, new bs());
    this.a.a(4003, new br());
    this.a.a(2001, new g());
    this.a.a(2002, new e());
    this.a.a(2003, new f());
    this.a.a(2004, new b());
    this.a.a(2005, new c());
    this.a.a(2007, new bm());
    this.a.a(2006, new d());
    this.a.a(20, new bn());
  }

  public com.zend.ide.t.g a(int paramInt)
  {
    try
    {
      return (com.zend.ide.t.g)this.a.b(paramInt).getClass().newInstance();
    }
    catch (Exception localException)
    {
      cl.a("Error creating message. type: " + paramInt + ".\n message:" + localException.getMessage());
    }
    return null;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.o.d.bk
 * JD-Core Version:    0.6.0
 */
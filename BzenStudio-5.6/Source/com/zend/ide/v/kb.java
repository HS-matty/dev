package com.zend.ide.v;

import com.zend.ide.f.bp;
import com.zend.ide.m.bf;
import com.zend.ide.m.k;
import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import com.zend.ide.n.ob;
import com.zend.ide.n.pb;
import com.zend.ide.n.sb;
import com.zend.ide.util.bl;
import com.zend.ide.util.bt;
import com.zend.ide.util.ct;
import com.zend.ide.util.n;
import com.zend.ide.util.o;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Action;

class kb extends x
  implements bl
{
  private com.zend.ide.f.s a = bp.d().b();
  private Pattern b = Pattern.compile("=\\s*new\\s+soapclient\\s*\\(\\s*\"", 2);
  private ob c = null;
  private boolean d;
  private Action e = new mb(this, null);
  final d f;

  public kb(d paramd)
  {
    lb locallb = new lb(this, null);
    locallb.b(this.e);
    ((com.zend.ide.util.s)paramd.q()).a(locallb);
  }

  public void b()
  {
    int i = this.f.getCaretPosition();
    this.c = this.f.a().a(this.f, i);
    if ((this.c != null) && (a(this.c.a())))
    {
      o localo = n.c().a("keys.refreshWSDLFromSelectedText");
      localo.a(ct.a(1899));
      if (!this.d)
      {
        ((com.zend.ide.util.s)this.f.q()).a("keys.refreshWSDLFromSelectedText", this.e, "textComponent", true);
        this.d = true;
      }
      return;
    }
    if (this.d)
    {
      ((com.zend.ide.util.s)this.f.q()).a("keys.refreshWSDLFromSelectedText", "textComponent", true);
      this.d = false;
    }
  }

  private boolean a(int paramInt)
  {
    bf localbf = this.a.a(this.f.k());
    if (localbf == null)
      return false;
    sb localsb = k.a(paramInt, localbf, this.f.a(this.f.k()), true);
    Matcher localMatcher = this.b.matcher(localsb);
    return localMatcher.find();
  }

  public void a(dz paramdz, boolean paramBoolean)
  {
    bw localbw = (bw)paramdz;
    bt localbt = (bt)localbw.t();
    if (localbt != null)
      localbt.b(this);
  }

  public void b(dz paramdz, boolean paramBoolean)
  {
    bw localbw = (bw)paramdz;
    bt localbt = (bt)localbw.t();
    if (localbt != null)
      localbt.a(this);
  }

  static com.zend.ide.f.s a(kb paramkb)
  {
    return paramkb.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.kb
 * JD-Core Version:    0.6.0
 */
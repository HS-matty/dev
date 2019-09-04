package com.zend.ide.v;

import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import com.zend.ide.n.ob;
import com.zend.ide.n.pb;
import com.zend.ide.util.bl;
import com.zend.ide.util.bt;
import com.zend.ide.util.n;
import com.zend.ide.util.o;
import com.zend.ide.util.s;
import javax.swing.Action;

class cb extends x
  implements bl
{
  private ob b = null;
  private boolean c;
  private Action d = new eb(this, null);
  final d e;

  public cb(d paramd)
  {
    db localdb = new db(this, null);
    localdb.b(this.d);
    ((s)paramd.q()).a(localdb);
  }

  public void b()
  {
    int i = this.e.getCaretPosition();
    this.b = this.e.a().a(this.e, i);
    if (this.b != null)
    {
      o localo = n.c().a("keys.openDocumentFromSelectedText");
      localo.a(this.b.c());
      if (!this.c)
      {
        ((s)this.e.q()).a("keys.openDocumentFromSelectedText", this.d, "textComponent", true);
        this.c = true;
      }
      return;
    }
    if (this.c)
    {
      ((s)this.e.q()).a("keys.openDocumentFromSelectedText", "textComponent", true);
      this.c = false;
    }
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

  static ob a(cb paramcb)
  {
    return paramcb.b;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.cb
 * JD-Core Version:    0.6.0
 */
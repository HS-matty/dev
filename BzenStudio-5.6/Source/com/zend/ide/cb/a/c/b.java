package com.zend.ide.cb.a.c;

import com.zend.ide.n.bf;
import com.zend.ide.n.gz;
import com.zend.ide.y.e;
import com.zend.ide.y.f;
import javax.swing.JComponent;

public class b
  implements a
{
  private gz a = new gz();

  public b()
  {
    this.a.a(new bf());
    a();
    this.a.setEditable(false);
  }

  public b(byte[] paramArrayOfByte)
  {
    this();
    a(paramArrayOfByte);
  }

  public void a(byte[] paramArrayOfByte)
  {
    this.a.setText(new String(paramArrayOfByte));
  }

  public void a(String paramString)
  {
    this.a.setText(paramString);
  }

  public JComponent a()
  {
    return this.a.c();
  }

  private void a()
  {
    f localf = new f();
    localf.a("editing.styleManager", new d(this, null));
    e locale = new e(localf);
    locale.a("editing.styleManager");
  }

  static gz a(b paramb)
  {
    return paramb.a;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.c.b
 * JD-Core Version:    0.6.0
 */
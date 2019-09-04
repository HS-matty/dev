package com.zend.ide.g;

import com.zend.ide.util.r;
import com.zend.ide.util.s;
import javax.swing.Action;

public class g extends s
  implements r
{
  final n f;

  public g(n paramn)
  {
  }

  public void a()
  {
    Object localObject = new h(this.f);
    a("keys.clear", (Action)localObject, "outputComponent", true);
    localObject = new i(this.f);
    a("keys.print", (Action)localObject, "outputComponent", true);
    localObject = new j(this.f);
    a("keys.saveOutputAsFile", (Action)localObject, "outputComponent", true);
    localObject = new o(this.f);
    a("keys.copy", (Action)localObject, "outputComponent", true);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.g.g
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.desktop;

import com.zend.ide.e.c;
import com.zend.ide.e.d;
import com.zend.ide.j.h;
import com.zend.ide.o.fk;
import com.zend.ide.util.ei;
import java.io.File;

class bd
  implements d
{
  final cj a;

  private bd(cj paramcj)
  {
  }

  public void b()
  {
    String str1 = System.getProperty("user.dir");
    File localFile = h.m.a(str1, "examples/debugdemo/DebugDemo.php");
    String str2 = localFile.getAbsolutePath();
    cj.d(this.a).c(str2, 45);
    this.a.a(str2, null, -1);
    this.a.Y();
    ei localei = new ei(h.m.g(cj.t), cj.a(this.a).h());
    localei.doLayout();
    localei.setVisible(true);
    cj.k(this.a).j().setVisible(false);
    localei.requestFocus();
  }

  bd(cj paramcj, n paramn)
  {
    this(paramcj);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.desktop.bd
 * JD-Core Version:    0.6.0
 */
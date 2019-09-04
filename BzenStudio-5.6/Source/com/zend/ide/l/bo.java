package com.zend.ide.l;

import com.zend.ide.j.y;
import com.zend.ide.p.ba;
import com.zend.ide.q.d;
import com.zend.ide.util.ct;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.JComponent;

public class bo extends AbstractAction
{
  final g a;

  public bo(g paramg)
  {
    super("EncodeProjectAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    String str = "";
    File[] arrayOfFile = this.a.g().b();
    try
    {
      d.a(this.a.f().b(), arrayOfFile, str);
    }
    catch (Exception localException)
    {
      ba.a(this.a.c().getTopLevelAncestor(), ct.a(1152), ct.a(1153), 1);
      return;
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.l.bo
 * JD-Core Version:    0.6.0
 */
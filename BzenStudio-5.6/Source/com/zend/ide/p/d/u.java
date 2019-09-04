package com.zend.ide.p.d;

import com.zend.ide.bd.c;
import com.zend.ide.j.h;
import com.zend.ide.j.s;
import com.zend.ide.u.bd;
import com.zend.ide.u.bh;
import com.zend.ide.u.bi;
import com.zend.ide.util.dj;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

public class u extends AbstractAction
{
  final bw a;

  protected u(bw parambw)
  {
    super("DirectoryComboBoxAction");
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    File localFile = (File)bw.a(this.a).getSelectedItem();
    if (localFile != null)
    {
      s locals = h.m.h(localFile.getPath());
      if ((locals instanceof bh))
      {
        bh localbh = (bh)locals;
        if (!localbh.v().h())
          try
          {
            bd.a(c.b().h(), localbh, false, false, null);
          }
          catch (dj localdj)
          {
            return;
          }
      }
    }
    this.a.getFileChooser().setCurrentDirectory(localFile);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.u
 * JD-Core Version:    0.6.0
 */
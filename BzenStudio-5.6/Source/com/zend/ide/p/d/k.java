package com.zend.ide.p.d;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.plaf.basic.BasicDirectoryModel;

class k
  implements Runnable
{
  final JFileChooser b;
  final File c;
  final bw a;

  k(bw parambw, JFileChooser paramJFileChooser, File paramFile)
  {
  }

  public void run()
  {
    if (this.b.isMultiSelectionEnabled())
    {
      int i = this.a.getModel().indexOf(this.c);
      this.b.setSelectedFiles(new File[] { this.c });
    }
    else
    {
      this.b.setSelectedFile(this.c);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.k
 * JD-Core Version:    0.6.0
 */
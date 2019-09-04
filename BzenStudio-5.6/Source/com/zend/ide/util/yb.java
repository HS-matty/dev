package com.zend.ide.util;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class yb
  implements ActionListener
{
  final bg a;

  yb(bg parambg)
  {
  }

  public void actionPerformed(ActionEvent paramActionEvent)
  {
    cv.d(bg.a(this.a), bg.b(this.a));
    File localFile1 = new File(cv.a(), bg.b(this.a));
    File localFile2 = new File(localFile1, "fileTypes");
    if (localFile2.exists())
    {
      File[] arrayOfFile = localFile2.listFiles();
      for (int i = 0; (arrayOfFile != null) && (i < arrayOfFile.length); i++)
      {
        File localFile3 = arrayOfFile[i];
        localFile3.delete();
      }
      localFile2.delete();
    }
    this.a.setVisible(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.util.yb
 * JD-Core Version:    0.6.0
 */
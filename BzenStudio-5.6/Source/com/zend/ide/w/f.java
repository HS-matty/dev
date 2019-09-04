package com.zend.ide.w;

import com.zend.ide.desktop.cj;
import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import com.zend.ide.n.ho;
import java.io.File;
import javax.swing.SwingUtilities;

public abstract class f
  implements k
{
  protected cj a;

  public f(cj paramcj)
  {
    this.a = paramcj;
  }

  public void a(File[] paramArrayOfFile)
  {
    a(paramArrayOfFile, false);
  }

  public void b(File[] paramArrayOfFile)
  {
    a(paramArrayOfFile, true);
  }

  private void a(File[] paramArrayOfFile, boolean paramBoolean)
  {
    if (paramArrayOfFile == null)
      return;
    bw localbw = this.a.X();
    dz[] arrayOfdz = localbw.i();
    for (int i = 0; i < arrayOfdz.length; i++)
    {
      File localFile1 = new File(arrayOfdz[i].k());
      for (int j = 0; j < paramArrayOfFile.length; j++)
      {
        File localFile2 = paramArrayOfFile[j];
        if (localFile2.isDirectory())
        {
          if (!localFile1.getAbsolutePath().startsWith(localFile2.getAbsolutePath()))
            continue;
          localho = (ho)arrayOfdz[i].getDocument();
          if ((paramBoolean) && (localho.a()))
          {
            a(arrayOfdz[i]);
            break;
          }
          localho.a(paramBoolean);
          break;
        }
        if (!localFile2.equals(localFile1))
          continue;
        ho localho = (ho)arrayOfdz[i].getDocument();
        if ((paramBoolean) && (localho.a()))
        {
          a(arrayOfdz[i]);
          break;
        }
        localho.a(paramBoolean);
        break;
      }
    }
  }

  private void a(dz paramdz)
  {
    SwingUtilities.invokeLater(new g(this, paramdz));
  }

  public void c()
  {
    this.a.X().d(false);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.w.f
 * JD-Core Version:    0.6.0
 */
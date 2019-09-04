package com.zend.ide.v;

import com.zend.ide.n.bw;
import com.zend.ide.n.dz;
import com.zend.ide.n.td.hb;
import java.util.ArrayList;
import javax.swing.text.JTextComponent;

class l
  implements Runnable
{
  final o a;
  final ArrayList b;
  final d c;

  l(d paramd, o paramo, ArrayList paramArrayList)
  {
  }

  public void run()
  {
    d.a(this.c).c(this.a);
    for (int i = this.b.size() - 1; i >= 0; i--)
    {
      p localp = (p)this.b.get(i);
      bw localbw = this.c.b("clone");
      dz localdz = this.c.a(localp.e());
      if (localdz != null)
      {
        localbw.e().setDocument(localdz.getDocument());
        localbw.setCaretPosition(localp.c());
        JTextComponent localJTextComponent1 = localbw.e();
        if ((localdz instanceof bw))
        {
          JTextComponent localJTextComponent2 = ((bw)localdz).e();
          if (((localJTextComponent2 instanceof hb)) && ((localJTextComponent1 instanceof hb)))
            ((hb)localJTextComponent1).a(((hb)localJTextComponent2).a());
        }
      }
      else
      {
        try
        {
          localbw.c(localp);
        }
        catch (Exception localException)
        {
          localbw.d(true);
          continue;
        }
      }
      this.c.b(localbw);
    }
    if (this.c.j() == 0)
      this.c.f();
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.v.l
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.n.td;

import com.zend.ide.n.ho;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.text.Document;

class yb
  implements PropertyChangeListener
{
  final ic a;

  yb(ic paramic)
  {
  }

  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent)
  {
    Document localDocument1 = (Document)paramPropertyChangeEvent.getOldValue();
    Document localDocument2 = (Document)paramPropertyChangeEvent.getNewValue();
    ho localho;
    if ((localDocument1 instanceof ho))
    {
      localho = (ho)localDocument1;
      localho.b(this.a.d);
    }
    if ((localDocument2 instanceof ho))
    {
      localho = (ho)localDocument2;
      localho.a(this.a.d);
    }
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.td.yb
 * JD-Core Version:    0.6.0
 */
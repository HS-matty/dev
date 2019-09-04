package com.zend.ide.d;

import com.zend.ide.p.z;
import javax.swing.BorderFactory;

public class dt extends z
{
  final dm a;

  dt(dm paramdm)
  {
    super("");
    setBorder(BorderFactory.createRaisedBevelBorder());
    addMouseListener(new ab(this));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.d.dt
 * JD-Core Version:    0.6.0
 */
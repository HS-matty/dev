package com.zend.ide.cb.a;

import javax.swing.JFormattedTextField;
import javax.swing.SpinnerNumberModel;

class wc
  implements Runnable
{
  final int a;
  final ke b;

  wc(ke paramke, int paramInt)
  {
  }

  public void run()
  {
    SpinnerNumberModel localSpinnerNumberModel = (SpinnerNumberModel)this.b.getModel();
    int i = ((Integer)localSpinnerNumberModel.getMinimum()).intValue();
    if (this.a < i)
      ke.a(this.b).setValue(new Integer(i));
    else
      ke.a(this.b).setValue(new Integer(((Integer)localSpinnerNumberModel.getMaximum()).intValue()));
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.cb.a.wc
 * JD-Core Version:    0.6.0
 */
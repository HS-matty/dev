package com.zend.ide.zendPlatformIntegration.b.b;

import com.zend.ide.p.ba;
import com.zend.ide.util.ct;
import com.zend.ide.util.cu;
import javax.swing.JButton;
import javax.swing.JCheckBox;

class h extends ba
  implements cu
{
  private static final long serialVersionUID = 1L;
  final f a;

  public h(f paramf, String paramString)
  {
    super(paramString, 0);
    JCheckBox localJCheckBox = new JCheckBox();
    localJCheckBox.setText(ct.a(1912));
    JButton localJButton = new JButton(ct.a(116));
    localJButton.addActionListener(new g(this, paramf));
    Object[] arrayOfObject = { localJCheckBox, localJButton };
    setOptions(arrayOfObject);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.b.b.h
 * JD-Core Version:    0.6.0
 */
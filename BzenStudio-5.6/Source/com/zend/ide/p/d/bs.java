package com.zend.ide.p.d;

import java.awt.Point;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.ListModel;
import javax.swing.plaf.ListUI;
import javax.swing.text.Position.Bias;

class bs extends com.zend.ide.p.bw
{
  final JFileChooser a;
  final bw b;

  bs(bw parambw, JFileChooser paramJFileChooser)
  {
  }

  public int getNextMatch(String paramString, int paramInt, Position.Bias paramBias)
  {
    ListModel localListModel = getModel();
    int i = localListModel.getSize();
    if ((paramString == null) || (paramInt < 0) || (paramInt >= i))
      throw new IllegalArgumentException();
    int j = paramBias == Position.Bias.Backward ? 1 : 0;
    int k = paramInt;
    while (j != 0 ? k >= 0 : k < i)
    {
      String str = this.a.getName((File)localListModel.getElementAt(k));
      if (str.regionMatches(true, 0, paramString, 0, paramString.length()))
        return k;
      k += (j != 0 ? -1 : 1);
    }
    return -1;
  }

  public int locationToIndex(Point paramPoint)
  {
    ListUI localListUI = getUI();
    return localListUI != null ? localListUI.locationToIndex(this, paramPoint) : -1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.p.d.bs
 * JD-Core Version:    0.6.0
 */
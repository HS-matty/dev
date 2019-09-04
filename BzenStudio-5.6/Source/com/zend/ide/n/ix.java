package com.zend.ide.n;

import com.zend.ide.j.h;
import java.io.File;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.text.Position.Bias;

class ix extends JList
{
  final ck a;

  ix(ck paramck)
  {
  }

  public int getNextMatch(String paramString, int paramInt, Position.Bias paramBias)
  {
    ListModel localListModel = getModel();
    int i = localListModel.getSize();
    if (paramString == null)
      throw new IllegalArgumentException();
    if ((paramInt < 0) || (paramInt >= i))
      throw new IllegalArgumentException();
    paramString = paramString.toUpperCase();
    int j = paramBias == Position.Bias.Forward ? 1 : -1;
    int k = paramInt;
    do
    {
      Object localObject = localListModel.getElementAt(k);
      if (localObject != null)
      {
        File localFile = h.m.g((String)localObject);
        String str = localFile.getName().toUpperCase();
        if ((str != null) && (str.startsWith(paramString)))
          return k;
      }
      k = (k + j + i) % i;
    }
    while (k != paramInt);
    return -1;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.ix
 * JD-Core Version:    0.6.0
 */
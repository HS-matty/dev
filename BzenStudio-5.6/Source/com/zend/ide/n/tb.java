package com.zend.ide.n;

import com.zend.ide.s.bl;
import com.zend.ide.util.dj;
import javax.swing.text.BadLocationException;
import javax.swing.text.Segment;

public final class tb
{
  public static sb a(ho paramho, int paramInt1, int paramInt2)
  {
    Segment localSegment = new Segment();
    try
    {
      paramho.getText(paramInt1, paramInt2, localSegment);
    }
    catch (BadLocationException localBadLocationException)
    {
      throw new dj(localBadLocationException);
    }
    return new wb(paramho, localSegment, 0, localSegment.count, paramInt1);
  }

  public static int a(sb paramsb, int paramInt)
  {
    try
    {
      ho localho = paramsb.a();
      int i = paramsb.a(paramInt);
      return ((bl)localho.b(i)).c();
    }
    catch (Exception localException)
    {
    }
    throw new dj(localException);
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.n.tb
 * JD-Core Version:    0.6.0
 */
package com.zend.ide.z;

import java.io.File;
import java.util.Comparator;

class db
  implements Comparator
{
  final y a;

  db(y paramy)
  {
  }

  public int compare(Object paramObject1, Object paramObject2)
  {
    File localFile1 = new File((String)paramObject1);
    File localFile2 = new File((String)paramObject2);
    return localFile1.getName().compareToIgnoreCase(localFile2.getName());
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.z.db
 * JD-Core Version:    0.6.0
 */
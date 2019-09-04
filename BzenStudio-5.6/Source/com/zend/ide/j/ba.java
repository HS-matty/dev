package com.zend.ide.j;

import com.zend.ide.p.d.bl;
import com.zend.ide.util.bk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ba extends bk
{
  ba(long paramLong)
  {
    super(paramLong);
  }

  protected Object b(Object paramObject)
  {
    ArrayList localArrayList = new ArrayList(10);
    localArrayList.addAll(Arrays.asList(bl.q.d()));
    localArrayList.addAll(Arrays.asList(bl.q.c()));
    localArrayList.addAll(Arrays.asList(bl.q.b()));
    return localArrayList;
  }
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.j.ba
 * JD-Core Version:    0.6.0
 */
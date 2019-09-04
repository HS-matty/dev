package com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient;

import java.math.BigInteger;
import java.rmi.Remote;
import java.rmi.RemoteException;

public abstract interface d extends Remote
{
  public abstract ServiceResponse addAllowedHostOnCluster(String paramString1, String paramString2)
    throws RemoteException;

  public abstract ServiceResponse addAllowedHostOnServer(String paramString1, String paramString2)
    throws RemoteException;

  public abstract ServiceResponse closeEvent(BigInteger paramBigInteger)
    throws RemoteException;

  public abstract ServiceResponse debugEvent(BigInteger paramBigInteger)
    throws RemoteException;

  public abstract ServiceResponse deleteEvent(BigInteger paramBigInteger)
    throws RemoteException;

  public abstract DirectiveServiceResponse getAllDirectives(String paramString)
    throws RemoteException;

  public abstract EventServiceResponse getAllEvents(Object paramObject, BigInteger paramBigInteger1, BigInteger paramBigInteger2, String paramString, boolean paramBoolean)
    throws RemoteException;

  public abstract DirectiveServiceResponse getDirective(String paramString1, String paramString2)
    throws RemoteException;

  public abstract EventServiceResponse getEventData(BigInteger paramBigInteger)
    throws RemoteException;

  public abstract FilterOptionsServiceResponse getEventFilterAvailableOptions(String paramString)
    throws RemoteException;

  public abstract ServiceResponse getEventFilterNames()
    throws RemoteException;

  public abstract ServiceResponse getEventSortOptions()
    throws RemoteException;

  public abstract ServiceResponse getServers()
    throws RemoteException;

  public abstract ServiceResponse getTotalNumberOfEvents(Object paramObject)
    throws RemoteException;

  public abstract ServiceResponse getVersion()
    throws RemoteException;

  public abstract ServiceResponse ignoreEvent(BigInteger paramBigInteger)
    throws RemoteException;

  public abstract ServiceResponse isHostAllowed(String paramString1, String paramString2)
    throws RemoteException;

  public abstract ServiceResponse login(String paramString1, String paramString2)
    throws RemoteException;

  public abstract ServiceResponse preserveEvent(BigInteger paramBigInteger)
    throws RemoteException;

  public abstract ServiceResponse profileEvent(BigInteger paramBigInteger)
    throws RemoteException;

  public abstract ServiceResponse removeAllowedHostFromCluster(String paramString1, String paramString2)
    throws RemoteException;

  public abstract ServiceResponse removeAllowedHostFromServer(String paramString1, String paramString2)
    throws RemoteException;

  public abstract ServiceResponse restartCluster(String paramString1, String paramString2, boolean paramBoolean)
    throws RemoteException;

  public abstract ServiceResponse restartServer(String paramString1, String paramString2, boolean paramBoolean)
    throws RemoteException;

  public abstract ServiceResponse setDirectiveOnCluster(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
    throws RemoteException;

  public abstract ServiceResponse setDirectiveOnServer(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
    throws RemoteException;

  public abstract ServiceResponse unpreserveEvent(BigInteger paramBigInteger)
    throws RemoteException;
}

/* Location:           C:\Program Files\Zend\ZendStudio-5.5.1\bin\ZendIDE.jar
 * Qualified Name:     com.zend.ide.zendPlatformIntegration.wsClient.platformWSClient.d
 * JD-Core Version:    0.6.0
 */
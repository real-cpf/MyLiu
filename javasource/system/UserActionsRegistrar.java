package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(dataauth.actions.CommitWithDataWay.class);
    registrator.registerUserAction(datashare.actions.TableRequestHandler.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}

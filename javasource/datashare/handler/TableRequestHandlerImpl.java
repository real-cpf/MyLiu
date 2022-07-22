package datashare.handler;

import com.google.gson.Gson;
import com.mendix.core.Core;
import com.mendix.externalinterface.connector.RequestHandler;
import com.mendix.m2ee.api.IMxRuntimeRequest;
import com.mendix.m2ee.api.IMxRuntimeResponse;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.ISession;
import com.mendix.systemwideinterfaces.core.IUser;
import dataauth.proxies.AkSk;
import datashare.vo.PageVo;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class TableRequestHandlerImpl extends RequestHandler {
    @Override
    protected void processRequest(IMxRuntimeRequest iMxRuntimeRequest, IMxRuntimeResponse iMxRuntimeResponse, String s) throws Exception {
        String fullName = s.replace("$",".");
        String body = iMxRuntimeRequest.getRequestString();
        Gson gson = new Gson();
        PageVo pageVo = gson.fromJson(body, PageVo.class);

        String ak = pageVo.getAk();
        String sk = pageVo.getSk();

        IContext sysContent = Core.createSystemContext();
        List<IMendixObject> akSk = Core.retrieveXPathQuery(sysContent,"");
        if (akSk.isEmpty()){
            iMxRuntimeResponse.getWriter().write("No Ak Sk can found!");
            return;
        }
        AkSk akSk1 = AkSk.initialize(sysContent,akSk.get(0));
        // need default account for ak sk
        String Name = akSk1.getAkSk_Group().getTelnet_Group().get(0).getTelnet_Account().getName();
        IUser iUser = Core.getUser(sysContent,Name);
        String newId = UUID.randomUUID().toString();
        ISession iSession = Core.initializeSession(iUser,newId);
        IContext iContext = iSession.createContext();
        List<IMendixObject> dataList = Core.retrieveXPathQuery(iContext,fullName,pageVo.getPageSize().intValue(),pageVo.getPageNum().intValue(),new HashMap<>());

    }
}

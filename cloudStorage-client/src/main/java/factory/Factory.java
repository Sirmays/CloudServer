package factory;

import service.impl.NetworkServiceImpl;
import service.impl.NetworkSettingImpl;

public class Factory {
    public static NetworkServiceImpl getNetworkService() {
        return NetworkServiceImpl.getInstance();
    }

}

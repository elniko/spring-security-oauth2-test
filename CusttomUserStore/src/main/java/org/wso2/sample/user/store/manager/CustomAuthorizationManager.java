package org.wso2.sample.user.store.manager;

import org.wso2.carbon.user.api.RealmConfiguration;
import org.wso2.carbon.user.core.AuthorizationManager;
import org.wso2.carbon.user.core.UserRealm;
import org.wso2.carbon.user.core.UserStoreException;
import org.wso2.carbon.user.core.authorization.AuthorizationCache;
import org.wso2.carbon.user.core.authorization.PermissionTree;
import org.wso2.carbon.user.core.claim.ClaimManager;
import org.wso2.carbon.user.core.profile.ProfileConfigurationManager;
import org.wso2.carbon.user.core.util.DatabaseUtil;

import javax.sql.DataSource;
import java.util.Map;

public class CustomAuthorizationManager implements AuthorizationManager {


    private final UserRealm userRealm;
    private final RealmConfiguration realmConfig;
    private final Integer tenantId;

    public CustomAuthorizationManager(RealmConfiguration realmConfig, Map<String, Object> properties, ClaimManager claimManager, ProfileConfigurationManager profileManager, UserRealm realm, Integer tenantId) throws UserStoreException {
        this.realmConfig = realmConfig;
        this.userRealm = realm;
        this.tenantId = tenantId;

    }




    @Override
    public boolean isUserAuthorized(String s, String s1, String s2) throws UserStoreException {
        return true;
    }

    @Override
    public boolean isRoleAuthorized(String s, String s1, String s2) throws UserStoreException {
        return true;
    }

    @Override
    public String[] getExplicitlyAllowedUsersForResource(String s, String s1) throws UserStoreException {
        return new String[0];
    }

    @Override
    public String[] getAllowedRolesForResource(String s, String s1) throws UserStoreException {
        return new String[0];
    }

    @Override
    public String[] getDeniedRolesForResource(String s, String s1) throws UserStoreException {
        return new String[0];
    }

    @Override
    public String[] getExplicitlyDeniedUsersForResource(String s, String s1) throws UserStoreException {
        return new String[0];
    }

    @Override
    public void authorizeUser(String s, String s1, String s2) throws UserStoreException {

    }

    @Override
    public void authorizeRole(String s, String s1, String s2) throws UserStoreException {

    }

    @Override
    public void denyUser(String s, String s1, String s2) throws UserStoreException {

    }

    @Override
    public void denyRole(String s, String s1, String s2) throws UserStoreException {

    }

    @Override
    public void clearUserAuthorization(String s, String s1, String s2) throws UserStoreException {

    }

    @Override
    public void clearUserAuthorization(String s) throws UserStoreException {

    }

    @Override
    public void clearRoleAuthorization(String s, String s1, String s2) throws UserStoreException {

    }

    @Override
    public void clearRoleActionOnAllResources(String s, String s1) throws UserStoreException {

    }

    @Override
    public void clearRoleAuthorization(String s) throws UserStoreException {

    }

    @Override
    public void clearResourceAuthorizations(String s) throws UserStoreException {

    }

    @Override
    public String[] getAllowedUIResourcesForUser(String s, String s1) throws UserStoreException {
        return new String[0];
    }

    @Override
    public int getTenantId() throws UserStoreException {
        return this.tenantId;
    }

    @Override
    public void resetPermissionOnUpdateRole(String s, String s1) throws UserStoreException {

    }

    @Override
    public String[] normalizeRoles(String[] strings) {
        return new String[0];
    }
}

package org.wso2.sample.user.store.manager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.user.api.Properties;
import org.wso2.carbon.user.api.RealmConfiguration;
import org.wso2.carbon.user.core.UserRealm;
import org.wso2.carbon.user.core.UserStoreException;
import org.wso2.carbon.user.core.claim.ClaimManager;
import org.wso2.carbon.user.core.common.AbstractUserStoreManager;
import org.wso2.carbon.user.core.common.RoleContext;
import org.wso2.carbon.user.core.profile.ProfileConfigurationManager;
import org.wso2.carbon.user.core.tenant.Tenant;

import java.util.Map;

public class CustomUserManager extends AbstractUserStoreManager {
    private static Log log = LogFactory.getLog(CustomUserManager.class);







    public CustomUserManager() {}
    public CustomUserManager(RealmConfiguration realmConfig, Map tenantId) throws UserStoreException {

            log.warn("Constr");
    }

    @Override
    public String[] getRoleListOfUser(String userName) throws UserStoreException {
        return new String[]{"Internal/publisher"};
    }

    @Override
    public boolean isExistingRole(String roleName) throws UserStoreException {
        log.warn("isExistingRole");
        return true;
    }

    @Override
    public boolean isExistingUser(String userName) throws UserStoreException {
        log.warn("isExistingUser " + userName);
        return true;
    }

    public CustomUserManager(RealmConfiguration realmConfig, Map<String, Object> properties, ClaimManager
            claimManager, ProfileConfigurationManager profileManager, UserRealm realm, Integer tenantId)
            throws org.wso2.carbon.user.api.UserStoreException {
        //super(realmConfig, tenantId);
        this.tenantId = tenantId;
        this.realmConfig = realmConfig;
        this.userRealm = realm;



        log.warn("Constructor lol");

    }


    @Override
    protected String getMyDomainName() {

        log.warn("Domain name " );


        return "PRIMARY";
    }


    @Override
    protected Map<String, String> getUserPropertyValues(String s, String[] strings, String s1) throws UserStoreException {
        log.warn("get user prop val");

        return null;
    }

    @Override
    protected boolean doCheckExistingRole(String s) throws UserStoreException {
        log.warn("check existing role");
        return true;
    }

    @Override
    protected RoleContext createRoleContext(String s) throws UserStoreException {
        log.warn("create role context");
        return null;
    }

    @Override
    protected boolean doCheckExistingUser(String s) throws UserStoreException {
        log.warn("check existing user");
        return true;
    }

    @Override
    protected String[] getUserListFromProperties(String s, String s1, String s2) throws UserStoreException {
        log.warn("get user list from prop");
        String[] ll ={"admin"};
        return ll;
    }

    @Override
    protected boolean doAuthenticate(String s, Object o) throws UserStoreException {
        log.warn("do auth");
        return true;
    }

    @Override
    protected void doAddUser(String s, Object o, String[] strings, Map<String, String> map, String s1, boolean b) throws UserStoreException {
        log.warn("doAddUser");
    }

    @Override
    protected void doUpdateCredential(String s, Object o, Object o1) throws UserStoreException {
        log.warn("doUpdateCredential");
    }

    @Override
    protected void doUpdateCredentialByAdmin(String s, Object o) throws UserStoreException {
        log.warn("doUpdateCredentialByAdmin");
    }

    @Override
    protected void doDeleteUser(String s) throws UserStoreException {
        log.warn("doDeleteUser");
    }

    @Override
    protected void doSetUserClaimValue(String s, String s1, String s2, String s3) throws UserStoreException {
        log.warn("doSetUserClaimValue");
    }

    @Override
    protected void doSetUserClaimValues(String s, Map<String, String> map, String s1) throws UserStoreException {
        log.warn("doSetUserClaimValues");
    }

    @Override
    protected void doDeleteUserClaimValue(String s, String s1, String s2) throws UserStoreException {
        log.warn("doDeleteUserClaimValue");
    }

    @Override
    protected void doDeleteUserClaimValues(String s, String[] strings, String s1) throws UserStoreException {
        log.warn("doDeleteUserClaimValues");
    }

    @Override
    protected void doUpdateUserListOfRole(String s, String[] strings, String[] strings1) throws UserStoreException {
        log.warn("doUpdateUserListOfRole");
    }

    @Override
    protected void doUpdateRoleListOfUser(String s, String[] strings, String[] strings1) throws UserStoreException {
        log.warn("doUpdateRoleListOfUser");
    }

    @Override
    protected String[] doGetExternalRoleListOfUser(String s, String s1) throws UserStoreException {
        log.warn("get ext role list user");
        return new String[0];
    }

    @Override
    protected String[] doGetSharedRoleListOfUser(String s, String s1, String s2) throws UserStoreException {
        log.warn("get shared roles user");
        return new String[0];
    }

    @Override
    protected void doAddRole(String s, String[] strings, boolean b) throws UserStoreException {
        log.warn("doAddRole");
    }

    @Override
    protected void doDeleteRole(String s) throws UserStoreException {
        log.warn("doDeleteRole");
    }

    @Override
    protected void doUpdateRoleName(String s, String s1) throws UserStoreException {
        log.warn("doUpdateRoleName");
    }

    @Override
    protected String[] doGetRoleNames(String s, int i) throws UserStoreException {
        log.warn("get role names");
        return new String[0];
    }

    @Override
    protected String[] doListUsers(String s, int i) throws UserStoreException {
        log.warn("do list users");
        return new String[0];
    }

    @Override
    protected String[] doGetDisplayNamesForInternalRole(String[] strings) throws UserStoreException {
        log.warn("get display names for internal role");
        return new String[0];
    }

    @Override
    protected boolean authenticate(String userName, Object credential, boolean domainProvided) throws UserStoreException {
        log.warn("authenticate");
        return true;
    }

    @Override
    public boolean doCheckIsUserInRole(String s, String s1) throws UserStoreException {
        log.warn("check is user in role");
        return false;
    }

    @Override
    protected String[] doGetSharedRoleNames(String s, String s1, int i) throws UserStoreException {
        log.warn("get shared role names");
        return new String[0];
    }

    @Override
    protected String[] doGetUserListOfRole(String s, String s1) throws UserStoreException {
        log.warn("get user loist of role");
        return new String[0];
    }

    @Override
    public String[] getProfileNames(String s) throws UserStoreException {
        log.warn("get profile names");
        return new String[0];
    }

    @Override
    public String[] getAllProfileNames() throws UserStoreException {
        log.warn("get all profile names");
        return new String[0];
    }

    @Override
    public boolean isReadOnly() throws UserStoreException {
        return false;
    }

    @Override
    public int getUserId(String s) throws UserStoreException {
        log.warn("get user id");
        return 0;
    }

    @Override
    public int getTenantId(String s) throws UserStoreException {
        log.warn("get tenant id");
        return 0;
    }

    @Override
    public int getTenantId() throws UserStoreException {
        log.warn("get tenant id");
        return 0;
    }

    @Override
    public Map<String, String> getProperties(org.wso2.carbon.user.api.Tenant tenant) throws org.wso2.carbon.user.api.UserStoreException {
        log.warn("get props");
        return null;
    }

    @Override
    public boolean isMultipleProfilesAllowed() {
        return false;
    }

    @Override
    public void addRememberMe(String s, String s1) throws org.wso2.carbon.user.api.UserStoreException {

    }

    @Override
    public boolean isValidRememberMeToken(String s, String s1) throws org.wso2.carbon.user.api.UserStoreException {
        return false;
    }

    @Override
    public Properties getDefaultUserStoreProperties() {
        log.warn("get default user store props");
        return null;
    }

    @Override
    public Map<String, String> getProperties(Tenant tenant) throws UserStoreException {
        log.warn("get props");
        return null;
    }

    @Override
    public boolean isBulkImportSupported() throws UserStoreException {

        return false;
    }

    @Override
    public RealmConfiguration getRealmConfiguration() {
        log.warn("get realm conf");
        return this.realmConfig;
    }
}

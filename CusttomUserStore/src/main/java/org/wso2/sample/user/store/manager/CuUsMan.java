package org.wso2.sample.user.store.manager;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.user.api.Properties;
import org.wso2.carbon.user.api.RealmConfiguration;
import org.wso2.carbon.user.api.Tenant;
import org.wso2.carbon.user.api.UserStoreException;
import org.wso2.carbon.user.core.UserRealm;
import org.wso2.carbon.user.core.claim.ClaimManager;

import org.wso2.carbon.user.core.common.RoleContext;
import org.wso2.carbon.user.core.dto.RoleDTO;
import org.wso2.carbon.user.core.jdbc.JDBCUserStoreManager;
import org.wso2.carbon.user.core.profile.ProfileConfigurationManager;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.Map;

public class CuUsMan extends JDBCUserStoreManager {

    private static Log log = LogFactory.getLog(JDBCUserStoreManager.class);

    public CuUsMan() {
        super();
        log.warn("Constructor 1");
    }

    public CuUsMan(RealmConfiguration realmConfig, int tenantId) throws org.wso2.carbon.user.core.UserStoreException {
        super(realmConfig, tenantId);
        log.warn("Constructor 1");
    }

    public CuUsMan(DataSource ds, RealmConfiguration realmConfig, int tenantId, boolean addInitData) throws org.wso2.carbon.user.core.UserStoreException {
        super(ds, realmConfig, tenantId, addInitData);
        log.warn("Constructor 1");
    }

    public CuUsMan(DataSource ds, RealmConfiguration realmConfig) throws org.wso2.carbon.user.core.UserStoreException {
        super(ds, realmConfig);
        log.warn("Constructor 1");
    }

    public CuUsMan(RealmConfiguration realmConfig, Map<String, Object> properties, ClaimManager claimManager, ProfileConfigurationManager profileManager, UserRealm realm, Integer tenantId, boolean skipInitData) throws org.wso2.carbon.user.core.UserStoreException {
        super(realmConfig, properties, claimManager, profileManager, realm, tenantId, skipInitData);
        log.warn("Constructor 1");
    }

    @Override
    public String[] doListUsers(String filter, int maxItemLimit) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doListUsers");
        return super.doListUsers(filter, maxItemLimit);
    }

    @Override
    public boolean doCheckIsUserInRole(String userName, String roleName) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doCheckIsUserInRole " + roleName);
        return true;//super.doCheckIsUserInRole(userName, roleName);
    }

    @Override
    protected String[] doGetDisplayNamesForInternalRole(String[] userNames) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doGetDisplayNamesForInternalRole");
        return super.doGetDisplayNamesForInternalRole(userNames);
    }

    @Override
    public String[] doGetRoleNames(String filter, int maxItemLimit) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doGetRoleNames");
        return super.doGetRoleNames(filter, maxItemLimit);
    }

    @Override
    protected String[] doGetSharedRoleNames(String tenantDomain, String filter, int maxItemLimit) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doGetSharedRoleNames");
        return super.doGetSharedRoleNames(tenantDomain, filter, maxItemLimit);
    }

    @Override
    public String[] doGetUserListOfRole(String roleName, String filter) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doGetUserListOfRole");
        return super.doGetUserListOfRole(roleName, filter);
    }

    @Override
    public String[] getUserListOfJDBCRole(RoleContext ctx, String filter) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("getUserListOfJDBCRole");
        return super.getUserListOfJDBCRole(ctx, filter);
    }

    @Override
    public boolean doCheckExistingRole(String roleName) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doCheckExistingRole");
        return super.doCheckExistingRole(roleName);
    }

    @Override
    protected boolean isExistingJDBCRole(RoleContext context) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("isExistingJDBCRole");
        return super.isExistingJDBCRole(context);
    }

    @Override
    public String[] getAllProfileNames() throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("getAllProfileNames");
        return super.getAllProfileNames();
    }

    @Override
    public String[] getProfileNames(String userName) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("getProfileNames");
        return super.getProfileNames(userName);
    }

    @Override
    public int getUserId(String username) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("getUserId");
        return super.getUserId(username);
    }

    @Override
    public String[] getUserNames(int tenantId) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("getUserNames");
        return super.getUserNames(tenantId);
    }

    @Override
    public String getAdminUser() throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("getAdminUser");
        return super.getAdminUser();
    }

    @Override
    public int getTenantId() throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("getTenantId");
        return super.getTenantId();
    }

    @Override
    public Map<String, String> getProperties(Tenant tenant) throws UserStoreException {
        log.warn("getProperties");
        return super.getProperties(tenant);
    }

    @Override
    public int getTenantId(String username) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("getTenantId");
        return super.getTenantId(username);
    }

    @Override
    public Map<String, String> getUserPropertyValues(String userName, String[] propertyNames, String profileName) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("getUserPropertyValues");
        return super.getUserPropertyValues(userName, propertyNames, profileName);
    }

    @Override
    protected Connection getDBConnection() throws SQLException, org.wso2.carbon.user.core.UserStoreException {
        log.warn("getDBConnection");
        return super.getDBConnection();
    }

    @Override
    protected boolean isValueExisting(String sqlStmt, Connection dbConnection, Object... params) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("isValueExisting");
        return super.isValueExisting(sqlStmt, dbConnection, params);
    }

    @Override
    public boolean doCheckExistingUser(String userName) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doCheckExistingUser" + userName);
        return true;//super.doCheckExistingUser(userName);
    }

    @Override
    public boolean doAuthenticate(String userName, Object credential) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doAuthenticate");
        return true;
    }

    @Override
    public boolean isReadOnly() throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("isReadOnly");
        return super.isReadOnly();
    }

    @Override
    public void doAddUser(String userName, Object credential, String[] roleList, Map<String, String> claims, String profileName, boolean requirePasswordChange) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doAddUser");
        super.doAddUser(userName, credential, roleList, claims, profileName, requirePasswordChange);
    }

    @Override
    protected void persistUser(String userName, Object credential, String[] roleList, Map<String, String> claims, String profileName, boolean requirePasswordChange) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("persistUser");
        super.persistUser(userName, credential, roleList, claims, profileName, requirePasswordChange);
    }

    @Override
    public void doAddRole(String roleName, String[] userList, boolean shared) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doAddRole");
        super.doAddRole(roleName, userList, shared);
    }

    @Override
    public void doUpdateRoleName(String roleName, String newRoleName) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doUpdateRoleName");
        super.doUpdateRoleName(roleName, newRoleName);
    }

    @Override
    public boolean isSharedRole(String roleName, String roleNameBase) {
        log.warn("isSharedRole");
        return super.isSharedRole(roleName, roleNameBase);
    }

    @Override
    public boolean isBulkImportSupported() {
        log.warn("isBulkImportSupported");
        return super.isBulkImportSupported();
    }

    @Override
    public RealmConfiguration getRealmConfiguration() {
        log.warn("getRealmConfiguration");
        return super.getRealmConfiguration();
    }

    @Override
    public RoleDTO[] getRoleNamesWithDomain(boolean noHybridRoles) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("getRoleNamesWithDomain");
        return super.getRoleNamesWithDomain(noHybridRoles);
    }

    @Override
    public boolean isMultipleProfilesAllowed() {
        log.warn("isMultipleProfilesAllowed");
        return super.isMultipleProfilesAllowed();
    }

    @Override
    public void doDeleteRole(String roleName) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doDeleteRole");
        super.doDeleteRole(roleName);
    }

    @Override
    public void doDeleteUser(String userName) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doDeleteUser");
        super.doDeleteUser(userName);
    }

    @Override
    public void doUpdateUserListOfRole(String roleName, String[] deletedUsers, String[] newUsers) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doUpdateUserListOfRole");
        super.doUpdateUserListOfRole(roleName, deletedUsers, newUsers);
    }

    @Override
    public void doUpdateRoleListOfUser(String userName, String[] deletedRoles, String[] newRoles) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doUpdateRoleListOfUser");
        super.doUpdateRoleListOfUser(userName, deletedRoles, newRoles);
    }

    @Override
    public void doSetUserClaimValue(String userName, String claimURI, String claimValue, String profileName) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doSetUserClaimValue");
        super.doSetUserClaimValue(userName, claimURI, claimValue, profileName);
    }

    @Override
    public void doSetUserClaimValues(String userName, Map<String, String> claims, String profileName) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doSetUserClaimValues");
        super.doSetUserClaimValues(userName, claims, profileName);
    }

    @Override
    public void doDeleteUserClaimValue(String userName, String claimURI, String profileName) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doDeleteUserClaimValue");
        super.doDeleteUserClaimValue(userName, claimURI, profileName);
    }

    @Override
    public void doDeleteUserClaimValues(String userName, String[] claims, String profileName) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doDeleteUserClaimValues");
        super.doDeleteUserClaimValues(userName, claims, profileName);
    }

    @Override
    public void doUpdateCredential(String userName, Object newCredential, Object oldCredential) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doUpdateCredential");
        super.doUpdateCredential(userName, newCredential, oldCredential);
    }

    @Override
    public void doUpdateCredentialByAdmin(String userName, Object newCredential) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doUpdateCredentialByAdmin");
        super.doUpdateCredentialByAdmin(userName, newCredential);
    }

    @Override
    public Date getPasswordExpirationTime(String userName) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("getPasswordExpirationTime");
        return super.getPasswordExpirationTime(userName);
    }

    @Override
    public void addProperty(Connection dbConnection, String userName, String propertyName, String value, String profileName) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("addProperty");
        super.addProperty(dbConnection, userName, propertyName, value, profileName);
    }

    @Override
    protected void updateProperty(Connection dbConnection, String userName, String propertyName, String value, String profileName) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("updateProperty");
        super.updateProperty(dbConnection, userName, propertyName, value, profileName);
    }

    @Override
    protected void deleteProperty(Connection dbConnection, String userName, String propertyName, String profileName) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("deleteProperty");
        super.deleteProperty(dbConnection, userName, propertyName, profileName);
    }

    @Override
    protected String getProperty(Connection dbConnection, String userName, String propertyName, String profileName) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("getProperty");
        return super.getProperty(dbConnection, userName, propertyName, profileName);
    }

    @Override
    protected String preparePassword(String password, String saltValue) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("preparePassword");
        return super.preparePassword(password, saltValue);
    }

    @Override
    protected String preparePassword(Object password, String saltValue) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("preparePassword");
        return super.preparePassword(password, saltValue);
    }

    @Override
    public Map<String, String> getProperties(org.wso2.carbon.user.core.tenant.Tenant tenant) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("getProperties");
        return super.getProperties(tenant);
    }

    @Override
    public void addRememberMe(String userName, String token) throws UserStoreException {
        log.warn("addRememberMe");
        super.addRememberMe(userName, token);
    }

    @Override
    public boolean isExistingRememberMeToken(String userName, String token) throws UserStoreException {
        log.warn("isExistingRememberMeToken");
        return super.isExistingRememberMeToken(userName, token);
    }

    @Override
    public boolean isValidRememberMeToken(String userName, String token) throws UserStoreException {
        log.warn("isValidRememberMeToken");
        return super.isValidRememberMeToken(userName, token);
    }

    @Override
    public String[] getUserListFromProperties(String property, String value, String profileName) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("getUserListFromProperties");
        return super.getUserListFromProperties(property, value, profileName);
    }

    @Override
    public String[] doGetExternalRoleListOfUser(String userName, String filter) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doGetExternalRoleListOfUser ");
        return super.doGetExternalRoleListOfUser(userName, filter);
    }

    @Override
    public Properties getDefaultUserStoreProperties() {
        log.warn("getDefaultUserStoreProperties");
        return super.getDefaultUserStoreProperties();
    }

    @Override
    protected void doAddSharedRole(String roleName, String[] userList) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doAddSharedRole");
        super.doAddSharedRole(roleName, userList);
    }

    @Override
    protected String[] doGetSharedRoleListOfUser(String userName, String tenantDomain, String filter) throws org.wso2.carbon.user.core.UserStoreException {
        log.warn("doGetSharedRoleListOfUser");
        return super.doGetSharedRoleListOfUser(userName, tenantDomain, filter);
    }

    @Override
    protected RoleContext createRoleContext(String roleName) {
        log.warn("createRoleContext");
        return super.createRoleContext(roleName);
    }

    public CuUsMan(RealmConfiguration realmConfig, Map<String, Object> properties, ClaimManager
            claimManager, ProfileConfigurationManager profileManager, UserRealm realm, Integer tenantId)
            throws UserStoreException {

        super(realmConfig, properties, claimManager, profileManager, realm, tenantId);
        log.warn("Constructor lol");

    }

//    @Override
//    public int getUserId(String username) throws org.wso2.carbon.user.core.UserStoreException {
//        return 3;
//    }

//    @Override
//    public boolean doAuthenticate(String userName, Object credential) {
//        return true;
//    }

}

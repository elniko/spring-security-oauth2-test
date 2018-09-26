#/c/HOMEWARE/ITEC-Toolbox/apps/jdk/jdk1.8.0_25-windows-x64/bin/keytool \
#-import  -file /d/workspace/oidc/test-resource-service/backend.crt -alias tomcat \
#-keystore /d/Tools/wso2am-2.5.0/repository/resources/security/client-truststore.jks


#/c/HOMEWARE/ITEC-Toolbox/apps/jdk/jdk1.8.0_25-windows-x64/bin/keytool \
#-export  -keystore /d/Tools/wso2am-2.5.0/repository/resources/security/wso2carbon.jks -alias wso2carbon \
#-file wso2am.cert



/c/HOMEWARE/ITEC-Toolbox/apps/jdk/jdk1.8.0_25-windows-x64/bin/keytool \
-import -file /d/workspace/oidc/test-resource-service/wso2am.cert -alias wso2carbon \
-keystore /c/HOMEWARE/ITEC-Toolbox/apps/jdk/jdk1.8.0_25-windows-x64/jre/lib/security/cacerts.jks

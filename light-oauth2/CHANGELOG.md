# Change Log

## [1.5.15](https://github.com/networknt/light-oauth2/tree/1.5.15) (2018-06-18)
[Full Changelog](https://github.com/networknt/light-oauth2/compare/1.5.14...1.5.15)

**Implemented enhancements:**

- move refresh token to database for longer expiration [\#96](https://github.com/networknt/light-oauth2/issues/96)

**Closed issues:**

- refresh\_token table should not be dependent on user\_profile [\#117](https://github.com/networknt/light-oauth2/issues/117)
- switch to default setExchangeStatus method for errors [\#116](https://github.com/networknt/light-oauth2/issues/116)
- add SPNEGO service password to secret.yml  [\#115](https://github.com/networknt/light-oauth2/issues/115)
- disable marketplace authentication until we find a testing repo [\#114](https://github.com/networknt/light-oauth2/issues/114)
- move service specific config files to config folder under resources [\#113](https://github.com/networknt/light-oauth2/issues/113)
- update swagger specification to add user\_type and roles in code, authorize and token [\#112](https://github.com/networknt/light-oauth2/issues/112)
- token service: AT  does not contain endpoint scopes [\#111](https://github.com/networknt/light-oauth2/issues/111)
- add user\_type and roles to refresh\_token table [\#110](https://github.com/networknt/light-oauth2/issues/110)
- split authentication and authorization to a separate module authhub [\#109](https://github.com/networknt/light-oauth2/issues/109)
- update resource owner password grant type with customized auth [\#108](https://github.com/networknt/light-oauth2/issues/108)
- support user roles from code, user and token service [\#107](https://github.com/networknt/light-oauth2/issues/107)
- get roles from github [\#106](https://github.com/networknt/light-oauth2/issues/106)
- add a generic LightIdentityManager and move LDAP to a utility [\#105](https://github.com/networknt/light-oauth2/issues/105)
- add LDAP test case to try different LDAP servers [\#104](https://github.com/networknt/light-oauth2/issues/104)
- enable authenticate\_class in client and cache [\#103](https://github.com/networknt/light-oauth2/issues/103)
- add LDAP authentication and authorization [\#102](https://github.com/networknt/light-oauth2/issues/102)
- create a new credential with client\_id and user\_type [\#100](https://github.com/networknt/light-oauth2/issues/100)
- add SPNEGO support for the code module [\#98](https://github.com/networknt/light-oauth2/issues/98)
- audit all activities on each microservice [\#63](https://github.com/networknt/light-oauth2/issues/63)

## [1.5.14](https://github.com/networknt/light-oauth2/tree/1.5.14) (2018-05-20)
[Full Changelog](https://github.com/networknt/light-oauth2/compare/1.5.13...1.5.14)

**Closed issues:**

- remove csrf token from refresh token object as it should not be persisted [\#97](https://github.com/networknt/light-oauth2/issues/97)
- pass in csrf token to refresh token grant flow [\#95](https://github.com/networknt/light-oauth2/issues/95)
- docker image error related to JVM [\#94](https://github.com/networknt/light-oauth2/issues/94)
- add MariaDB support [\#92](https://github.com/networknt/light-oauth2/issues/92)
- add csrf token into the jwt token for token service if it exists [\#90](https://github.com/networknt/light-oauth2/issues/90)
- remove signature of ms sqlserver as the fatjar cannot be loaded [\#89](https://github.com/networknt/light-oauth2/issues/89)
- sync config files between light-docker and light-oauth2 [\#87](https://github.com/networknt/light-oauth2/issues/87)
- enable sensitive data encryption in config files [\#86](https://github.com/networknt/light-oauth2/issues/86)
- enable container memory limit in dockerfile [\#85](https://github.com/networknt/light-oauth2/issues/85)
- add ms sql server support [\#84](https://github.com/networknt/light-oauth2/issues/84)

## [1.5.13](https://github.com/networknt/light-oauth2/tree/1.5.13) (2018-04-20)
[Full Changelog](https://github.com/networknt/light-oauth2/compare/1.5.12...1.5.13)

**Closed issues:**

- Unrecognized field authenticateClass not marked as ignorable [\#81](https://github.com/networknt/light-oauth2/issues/81)
- do not allow scope update once client and service are linked.  [\#80](https://github.com/networknt/light-oauth2/issues/80)

## [1.5.12](https://github.com/networknt/light-oauth2/tree/1.5.12) (2018-04-08)
[Full Changelog](https://github.com/networknt/light-oauth2/compare/1.5.11...1.5.12)

**Closed issues:**

- update private keystore path to relative in jwt.yml [\#79](https://github.com/networknt/light-oauth2/issues/79)

## [1.5.11](https://github.com/networknt/light-oauth2/tree/1.5.11) (2018-04-01)
[Full Changelog](https://github.com/networknt/light-oauth2/compare/1.5.10...1.5.11)

**Implemented enhancements:**

- create a new table client\_service to define the one to many relationship and scope dependencies. [\#18](https://github.com/networknt/light-oauth2/issues/18)

**Closed issues:**

- return to the caller after sending error to the exchange. [\#78](https://github.com/networknt/light-oauth2/issues/78)
- switch to JwtIssuer for token generation [\#77](https://github.com/networknt/light-oauth2/issues/77)
- update postgres and oracle db scripts to remove tables in the beginning [\#76](https://github.com/networknt/light-oauth2/issues/76)
- support custom claim in json format with client registration [\#75](https://github.com/networknt/light-oauth2/issues/75)

## [1.5.10](https://github.com/networknt/light-oauth2/tree/1.5.10) (2018-03-02)
[Full Changelog](https://github.com/networknt/light-oauth2/compare/1.5.9...1.5.10)

**Closed issues:**

- refactor test cases to make them independent [\#74](https://github.com/networknt/light-oauth2/issues/74)
- update Dockerfile to remove EXPOSE [\#73](https://github.com/networknt/light-oauth2/issues/73)

## [1.5.9](https://github.com/networknt/light-oauth2/tree/1.5.9) (2018-02-21)
[Full Changelog](https://github.com/networknt/light-oauth2/compare/1.5.8...1.5.9)

**Closed issues:**

- cascade delete service endpoints if the service is deteted [\#72](https://github.com/networknt/light-oauth2/issues/72)
- update mysql script and service.yml to use mysqluser instead of root [\#71](https://github.com/networknt/light-oauth2/issues/71)

**Merged pull requests:**

- fixes \#52 - update Dockerfile-Redhat files in all services [\#70](https://github.com/networknt/light-oauth2/pull/70) ([DineshAlapati](https://github.com/DineshAlapati))

## [1.5.8](https://github.com/networknt/light-oauth2/tree/1.5.8) (2018-02-03)
[Full Changelog](https://github.com/networknt/light-oauth2/compare/1.5.7...1.5.8)

**Fixed bugs:**

- Fix docker-compose build [\#57](https://github.com/networknt/light-oauth2/issues/57)

**Closed issues:**

- uppgrade to Hazelcast 2.9.2 [\#66](https://github.com/networknt/light-oauth2/issues/66)
- update db scripts and swagger.json for mysql, postgres and oracle [\#65](https://github.com/networknt/light-oauth2/issues/65)
- update README.md with more information and links to doc site [\#64](https://github.com/networknt/light-oauth2/issues/64)
- add client to service relationship API [\#62](https://github.com/networknt/light-oauth2/issues/62)
- add service endpoints API [\#61](https://github.com/networknt/light-oauth2/issues/61)
- refactor table names before service enhancement [\#60](https://github.com/networknt/light-oauth2/issues/60)
- externalize config files to db directory [\#59](https://github.com/networknt/light-oauth2/issues/59)
- Dockerfile for production images for all services [\#52](https://github.com/networknt/light-oauth2/issues/52)

**Merged pull requests:**

- fixes \#52 - update user permissions on artifacts in production docker… [\#67](https://github.com/networknt/light-oauth2/pull/67) ([DineshAlapati](https://github.com/DineshAlapati))

## [1.5.7](https://github.com/networknt/light-oauth2/tree/1.5.7) (2018-01-01)
[Full Changelog](https://github.com/networknt/light-oauth2/compare/1.5.6...1.5.7)

## [1.5.6](https://github.com/networknt/light-oauth2/tree/1.5.6) (2017-12-31)
[Full Changelog](https://github.com/networknt/light-oauth2/compare/1.4.3...1.5.6)

**Closed issues:**

- update .gitignore to ignore dependency-reduced-pom.xml [\#56](https://github.com/networknt/light-oauth2/issues/56)
- remove dependency-reduced-pom.xml for each sub project [\#55](https://github.com/networknt/light-oauth2/issues/55)
- upgrade secret.yml to 1.5.6 with emailPassword [\#54](https://github.com/networknt/light-oauth2/issues/54)
- remove default config for production package [\#53](https://github.com/networknt/light-oauth2/issues/53)
- Update readme with links to document site and remove docs folder [\#50](https://github.com/networknt/light-oauth2/issues/50)
- Upgrade docker-compose files and db configurations to 1.5.4 [\#49](https://github.com/networknt/light-oauth2/issues/49)
- Upgrade dependencies and add maven-version [\#48](https://github.com/networknt/light-oauth2/issues/48)

**Merged pull requests:**

- \#49: upgrade docker-compose files and db configurations to 1.5.4 [\#51](https://github.com/networknt/light-oauth2/pull/51) ([DineshAlapati](https://github.com/DineshAlapati))

## [1.4.3](https://github.com/networknt/light-oauth2/tree/1.4.3) (2017-09-10)
[Full Changelog](https://github.com/networknt/light-oauth2/compare/1.4.2...1.4.3)

## [1.4.2](https://github.com/networknt/light-oauth2/tree/1.4.2) (2017-08-31)
[Full Changelog](https://github.com/networknt/light-oauth2/compare/1.4.1...1.4.2)

**Closed issues:**

- Upgrade all test cases to https and http2 [\#47](https://github.com/networknt/light-oauth2/issues/47)

## [1.4.1](https://github.com/networknt/light-oauth2/tree/1.4.1) (2017-08-31)
[Full Changelog](https://github.com/networknt/light-oauth2/compare/1.4.0...1.4.1)

**Closed issues:**

-  Make all services HTTP2 and HTTPS enabled and disable HTTP by default [\#46](https://github.com/networknt/light-oauth2/issues/46)
- Upgrade to newer version of Undertow and Jackson [\#45](https://github.com/networknt/light-oauth2/issues/45)

## [1.4.0](https://github.com/networknt/light-oauth2/tree/1.4.0) (2017-08-23)
[Full Changelog](https://github.com/networknt/light-oauth2/compare/1.3.4...1.4.0)

**Closed issues:**

- Replace Client with Http2Client and remove dependency of apache httpclient [\#44](https://github.com/networknt/light-oauth2/issues/44)
- Update the dependency on security module TokenHelper to OauthHelper [\#43](https://github.com/networknt/light-oauth2/issues/43)
- Upgrade to Undertow 1.4.18.Final for Http2 and remove JsonPath dependency [\#42](https://github.com/networknt/light-oauth2/issues/42)
- Update password match from String to char\[\] to prevent revealing password with JVM heap dump [\#41](https://github.com/networknt/light-oauth2/issues/41)

## [1.3.4](https://github.com/networknt/light-oauth2/tree/1.3.4) (2017-07-09)
[Full Changelog](https://github.com/networknt/light-oauth2/compare/1.3.1...1.3.4)

**Implemented enhancements:**

- Implement PKCE extension for authorization code flow for mobile native apps [\#29](https://github.com/networknt/light-oauth2/issues/29)
- Implement Open ID Connect on top of the current OAuth2 Authorization Server enterprise edition [\#15](https://github.com/networknt/light-oauth2/issues/15)

**Closed issues:**

- Add build.sh to automatically build, tag and push to docker hub for each service [\#40](https://github.com/networknt/light-oauth2/issues/40)
- Implement custom grant type client\_authenticated\_user [\#39](https://github.com/networknt/light-oauth2/issues/39)
- Pass externalized logback.xml in Dockerfile for all services [\#37](https://github.com/networknt/light-oauth2/issues/37)
- Inject server/info and /health into swagger for oauth2 services. [\#36](https://github.com/networknt/light-oauth2/issues/36)

## [1.3.1](https://github.com/networknt/light-oauth2/tree/1.3.1) (2017-06-03)
[Full Changelog](https://github.com/networknt/light-oauth2/compare/1.2.4...1.3.1)

**Implemented enhancements:**

- Refactor development edition to use the same swagger specification for validation [\#5](https://github.com/networknt/light-oauth2/issues/5)

**Fixed bugs:**

- After client registration, the returned client\_secret is the hashed and salted value not the clear text. [\#25](https://github.com/networknt/light-oauth2/issues/25)
- service registration and retrieval createDt is null in the result. [\#24](https://github.com/networknt/light-oauth2/issues/24)

**Closed issues:**

- Upgrade to framework 1.3.1 [\#35](https://github.com/networknt/light-oauth2/issues/35)
- Add one test case for token service to ensure that one of the scope matches with client with multiple scopes [\#32](https://github.com/networknt/light-oauth2/issues/32)
- Upgrade to the latest framework and config. Also dependencies [\#31](https://github.com/networknt/light-oauth2/issues/31)
- clientSecret hash is leaked on GET request [\#27](https://github.com/networknt/light-oauth2/issues/27)
- Fix oracle XE docker image version to 16.04 instead of latest which is broken [\#26](https://github.com/networknt/light-oauth2/issues/26)
- CORS issue when calling from a SPA [\#23](https://github.com/networknt/light-oauth2/issues/23)
- Receive Unexpected runtime exception when registering a service. [\#21](https://github.com/networknt/light-oauth2/issues/21)

**Merged pull requests:**

- allow client authentication by form data [\#28](https://github.com/networknt/light-oauth2/pull/28) ([smerschjohann](https://github.com/smerschjohann))

## [1.2.4](https://github.com/networknt/light-oauth2/tree/1.2.4) (2017-02-20)
[Full Changelog](https://github.com/networknt/light-oauth2/compare/1.0.0...1.2.4)

**Merged pull requests:**

- updated version on Docker build [\#20](https://github.com/networknt/light-oauth2/pull/20) ([gonzalovazquez](https://github.com/gonzalovazquez))

## [1.0.0](https://github.com/networknt/light-oauth2/tree/1.0.0) (2017-02-20)
[Full Changelog](https://github.com/networknt/light-oauth2/compare/0.1.2...1.0.0)

**Implemented enhancements:**

- Enable CORS support for client, service, user and refresh token in order to support marketplace SPA call directly from browser. [\#19](https://github.com/networknt/light-oauth2/issues/19)
- Implement refresh token for authorization code grant type [\#16](https://github.com/networknt/light-oauth2/issues/16)
- Update development edition to have the exact api like enterprise edition [\#13](https://github.com/networknt/light-oauth2/issues/13)
- Validate token service redirect\_uri exists and is the same as the one passed in code service [\#12](https://github.com/networknt/light-oauth2/issues/12)
- Update redirect\_url to redirect\_uri to follow standard naming in the specification [\#11](https://github.com/networknt/light-oauth2/issues/11)
- Support state in authorization code grant type [\#10](https://github.com/networknt/light-oauth2/issues/10)
- Implement Resource Owner Password Credentials Grant in token service in enterprise edition [\#9](https://github.com/networknt/light-oauth2/issues/9)
- Add more test cases to cover negative case in enterprise edition. [\#8](https://github.com/networknt/light-oauth2/issues/8)
- Add client profile in order to categorize clients along with client type [\#7](https://github.com/networknt/light-oauth2/issues/7)
- Implement HTTPS with openssl which is much faster than JDK [\#6](https://github.com/networknt/light-oauth2/issues/6)
- Client secret needs to be hashed and salted just like user password [\#4](https://github.com/networknt/light-oauth2/issues/4)
- Merge oracle, mysql and postgres branch together [\#3](https://github.com/networknt/light-oauth2/issues/3)

**Fixed bugs:**

- Authorization code grant type scope is passed in code service and retrieved from token service [\#14](https://github.com/networknt/light-oauth2/issues/14)

**Closed issues:**

- Add range search for user and service [\#2](https://github.com/networknt/light-oauth2/issues/2)
- Add pagination to getUser, getClient and getService endpoints in Enterprise edition [\#1](https://github.com/networknt/light-oauth2/issues/1)

## [0.1.2](https://github.com/networknt/light-oauth2/tree/0.1.2) (2016-10-10)


\* *This Change Log was automatically generated by [github_changelog_generator](https://github.com/skywinder/Github-Changelog-Generator)*
<# Access Control
Access Control Lists (ACLs) are a very powerful means to grant or deny detailed access privileges on individual resources to users and groups. ACLs are used today in the most prevalent operating systems, as well as in any other system, where fine grained control of access is required. An example of a commercial product using ACLs can be found under [SAP NetWeaver Development Infrastructure](https://help.sap.com/doc/saphelp_gbt10/1.0/de-DE/21/53882f3fee0243b6c774e26ebed880/content.htm?no_cache=true).

Two main features of ACLs are:
- inheritance of granted or denied access rights within a hierarchy of resources and groups
- built-in rules that govern the precedence of granted or denied access rights to resolve conflicting settings

In this task you will implement a few classes for a simplified ACL system.
In the following we talk about users instead of principals, about access rights instead of privileges and only about read access.

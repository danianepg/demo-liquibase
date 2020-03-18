# Liquibase

## A brief overview

![](https://miro.medium.com/max/2646/0*dK1u_jZ6SEthISar)

Photo by  [Daniele Levis Pelusi](https://unsplash.com/@yogidan2012?utm_source=medium&utm_medium=referral)  on  [Unsplash](https://unsplash.com/?utm_source=medium&utm_medium=referral)

----------

[_This is part of a bigger story._](http://commands%20for%20maven%20plugin/)

----------

Even the free version of  [Liquibase](https://www.liquibase.org/)  looks powerful and offers rollback command,  **comparison between two databases**  and different file formats for migrations.

It also  **claims** to be able to compare Spring Entities with the database and generate a migration script from the differences. I have tested it but I was not able to get it working due to something that looked like a bug on Liquibase. Also, StackOverFlow’s wisdom said that it is not a good practice.

It can be executed when Spring starts up the application, through Maven command and  [more](https://download.liquibase.org/how-to-run-liquibase/).

You can check on  [my demo project](https://github.com/danianepg/demo-liquibase)  the following:

-   Migration instructions on file  _src/main/resources/db/changelog.xml_
-   Liquibase configurations on file  _src/main/resources/liquibase.properties_
-   Maven plugin for Liquibase on  _pom.xml_

The main commands are below.

Commands for Maven plugin

Liquibase also creates two control tables on the database where it is possible to watch the changes.

![](https://miro.medium.com/max/251/1*Ud1R9VroWiW0Ta6xy5gDbw.png)

Database tables

![](https://miro.medium.com/max/1409/1*57fLKnHaPjZfSEB_FplhzA.png)

Control records

----------

[_Get back to the bigger story._](https://medium.com/@danianepg/database-migrations-with-liquibase-and-flyway-5946379c7738)

[_Originally post on my Medium stories._](https://medium.com/@danianepg/liquibase-38ea6344a4b9?source=friends_link&sk=695158733356e84bcccccd3e40995c67)

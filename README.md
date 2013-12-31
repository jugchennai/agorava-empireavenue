Agorava EmpireAvenue API
========================

Agorava EmpireAvenue API is a Java implementation of [EmpireAvenue OAuth Service](http://empireavenue.com/developers/apidocs) using [Agorava API](http://agorava.org). 

         This project is currenlty under development. Will be available soon for use. 

Agorava
-------

Agorava provides CDI beans and extensions to interact with major social network. It provides following services and eases mixing them:

* A generic portable REST client API
* A generic API to deal with OAuth 1.0a and 2.0 services
* A generic API to work with JSON serialization and de-serialization
* A generic identification API to retrieve basic user information from a Social Service
* Specific API for Twitter, Facebook and LinkedIn
* A multi services manager API allowing to deal with multiple OAuth applications and sessions in the same application and in different mode (by web user, in batch mode… )
* An easy way to extend it by creating a new module for a new services using Agorava SPI.

Agorava is independent of CDI implementation and fully portable between Java EE 6 and Servlet environments enhanced with CDI. It can be also used with CDI in JSE (desktop application). It has been fully tested with CDI RI implementation (JBoss Weld) and Apache OpenWebBeans. Caucho Candi was not fully tested yet but will be in the coming releases.

Prerequisite
------------
* JDK 7

License
-------
Copyright 2013 Agorava.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


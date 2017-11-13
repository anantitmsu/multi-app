# Maven Multiple Modules

This project has two maven modules:

    <module>app</module>
		<module>utils</module>
		<module>web-app</module>
    
With multi-module projects we can separate application logic to different sub modules and can be used in other module by just passing dependency.

We can refer to different versions of code by using different version id. Just like utils is refered with version 2.0

Module 1 (app):
    
    <dependency>
			<groupId>com.example</groupId>
			<artifactId>app</artifactId>
			<version>1.0</version>
		</dependency>
		

Module 2 (util):
		
    <dependency>
			<groupId>com.example</groupId>
			<artifactId>utils</artifactId>
			<version>2.0</version>
		</dependency>
    
   
Module 2 (web-app) >> Web Application
		
    <dependency>
			<groupId>com.example</groupId>
			<artifactId>web-app</artifactId>
			<version>2.0</version>
		</dependency>
    
    
#### Parent
    
    <groupId>com.example</groupId>
    <artifactId>multi-app</artifactId>
    <version>0.0.1-SNAPSHOT</version>
 	  <packaging>pom</packaging>
	      <modules>
		        <module>app</module>
		        <module>utils</module>
		        <module>web-app</module>
	      </modules>
  
  

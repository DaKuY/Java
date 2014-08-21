Using Maven with Java and Eclipse
===================

1. Use Maven to generate skeleton package >> mvn archetype:generate -DgroupId=<package name> -DartifactId=<Project Name> -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false 

mvn archetype:generate -DgroupId=com.andrewcamero.example -DartifactId=HelloAbstract -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false 

2. Go into the folder/Project Name >> mvn eclipse:eclipse

This turns it into an Eclipse project

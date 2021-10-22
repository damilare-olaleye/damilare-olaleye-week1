# Maven 
Maven is a dependency manager and build tool utilized for Java projects.

* **Dependency manager**: It is a tool that helps to manage different external libraries that other developers have created.
* **Build tool**: A tool that helps us to build a project. Whenever we are finished developing our software, we need to package (build) into something that is actually shippable.

## Mave Project Coordinates
Whenever we create a Maven project, we need to specify **project coordinates**. These coordinates help to uniquely identify a project and provide basic packaging information about that project. These include

- `group-id`: The groud/company/team that developed the project (use package notation, ex. com.revature)
- `artifcact-id`: The name of the project itself (follow the proper project naming conventions, ex. my-first-maven-projects0)
- `verison`: A specific release of the project. Projects undergoing development use a special identifier known as `SNAPSHOT`. EX `0.0.1.SNAPSHOT`
- `packaging`: what you actually want to package (build) the project
 as. `jar` will produce a JAR file, and `war` will produce a WAR file. 
    - JAR: Java archive
    - WAR: Web archive

# POM - Project Object Model
Maven project configuration and dependencies are provided inside of a special file name `pom.xml`
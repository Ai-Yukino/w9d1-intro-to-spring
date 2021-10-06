# How-to

## spring initializr + IntelliJ

Run [spring initializr](https://start.spring.io/) with the following dependencies:

- Spring Boot DevTools
- Spring Data JPA
- H2 Database
- Spring Web
- Thymeleaf

So something like [this](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.5.5&packaging=jar&jvmVersion=11&groupId=com.tts&artifactId=w9d1-HW&name=w9d1-HW&description=Making%20Mari%20Kondo%20cry&packageName=com.tts.w9d1-HW&dependencies=devtools,data-jpa,h2,web,thymeleaf):

![si-w9d1-hw.png](si-w9d1-hw.png)

Generate a configured Spring project file by clicking the `Generate` button on the bottom left or typing `CTRL + Enter (return)`.
Save the zip file and unzip this file.
Open IntelliJ and then open the project folder inside the unzipped folder.

## Quick test (no "hello world")

After IntelliJ has initialized your project, run your project without making any changes.
For example, click the green arrow next to `public class {ProjectName}Application` that is inside folders like

```
src/main/java/com.{ProjectURL}/{ProjectName}Application
```

![si-app-w9d1.png](si-app-w9d1.png)

Then navigate to [localhost:8080/](localhost:8080/)
or [http://localhost:8080/](http://localhost:8080/). You should see an error page like this:

![si-whitelabel-w9d1.png](si-whitelabel-w9d1.png)

Going to [https://localhost:8080/](https://localhost:8080/) with and `s`, i.e. `https://...`, might give you a different error such as:

![si-https-w9d1.png](si-https-w9d1.png)

but you shoud try one of the first two links.
Once you see the "whitelabel error page", then go back to IntelliJ and stop running your program.

## Set up database and form

We'll make a database via Java. Then we'll use [Thymeleaf](https://en.wikipedia.org/wiki/Thymeleaf) to make an HTML form page and connect it to our database.

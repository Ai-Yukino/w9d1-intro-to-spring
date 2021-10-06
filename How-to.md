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

### Make a database class

Right click the package that looks like `main\java\com.{...}`, and create a class for your database, e.g. `{DatabaseName}`.
Open that Java class file, e.g. `{DatabaseName}.Java`.
Add a

```
@Entity
```

entity annotation on the line above the class delcaration `public class {Database name} () { ...`.
Inside the class, decalre a variable to hold your database's primary key. Annotate it with `@Id` and make sure to import that annotation.
So something like

```
@Id
private long id
```

Declare other variables corresponding to the columns of your database, e.g. `private String firstName`, `private boolean isRegistered`, or `private Double accountBalance`.
No annotations are needed for these variables.

Declare an empty constructor. Also declare setters and getters as well as overriding the `toString()` method (e.g. via right-clicking and selecting `Generate` or hitting `alt + insert`).

### Make a form template

I'm not sure exactly how Thymeleaf templates work, but you start by copying this [example template](https://github.com/PTroyP/handling_form_submission/blob/main/initial/src/main/resources/templates/greeting.html) from Troy's class project on Tuesday.
To link CSS and JS to your template-generated HTML file, add those files to `resources/static` and then include something like

```
<link th:href="@{/style.css}" rel="stylesheet" />
```

to the `<head>...</head>` in your Thymeleaf templates.
You can read more [here](https://www.baeldung.com/spring-thymeleaf-css-js) to learn more about setting up CSS and JS with Thymeleaf.

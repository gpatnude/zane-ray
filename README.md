This is my implementation of the Zane-Ray Groups coding excercise for Java Developers. What a task this turned into -- it took me a lot longer than I anticipated but I am at a spot where I feel the project gives you a good feeling for my abilities.

Setup should be very easy - basically you just need to clone the project using git as follows: 

**cd /a/convenient/directory**
**git clone https://github.com/gpatnude/zane-ray.git**

Open your Eclipse IDE and import a project with existing sources from the directory that you just cloned into. Alternatively, you could open your Eclipse IDE and checkout a project from source control using the following:

The GitHub repository path for this project is: **https://github.com/gpatnude/zane-ray.git**

The project uses Jetty and the Jetty-Maven plugin to execute. The servlet is configured to run on localhost and port 8080.  

In order to run the application, from the command line or in your IDE [create a Maven configuration], you need to execute the maven goal: 

**mvn jetty:run**

Then navigate with your favorite web browser to: **http://localhost:8080/zrtest/**


Regards,


Greg Patnude
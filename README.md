# Scala Assignment - 6

## Steps To clone & Run the Project In IntelliJ IDEA

**Step 1:** Copy the link of the project   
**Step 2:** In your system, select the directory in which you want the project directory.  
**Step 3:** Right-click on the system and open the terminal.   
**Step 4:** After that write the below command to clone the project into your system.
> git clone --paste the url--

**Step 5:** After that Open IntelliJ Idea and on the top right click on file->open->select the folder that you cloned in
system
> File/Open/ProjectFolder

**Step 6:** Setup the jdk and java version.  
**Step 7:** It took some time to build the project in the IntelliJ Terminal wait for few seconds.  
**Step 8:** Now open the Terminal of IntelliJ and run the following command.
**1. To compile the project**
> sbt clean compile

**2. To Run the Project**
> sbt run

**3. To Compile the Test Cases**
> sbt test

**4. To Check the Scalastyle Config or Warning**
> sbt scalastyle

**5. To Check the Coverage Report of the Test Cases**
> sbt clean coverage test   
> sbt coverageReport



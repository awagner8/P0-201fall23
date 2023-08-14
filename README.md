# Project 0: Person201

## Outline
- [Goals](#goals)

# Project 0: Person201

For details and faqs, see [this document](docs/details.md), this README file has project details, but the linked document has git details, Java details, FAQ information, and more.

## Goals

* To create a simple Java class and modify two driver programs to demonstrate understanding of classes, methods, and instance variables.
* To learn about running Java programs using the VSCode IDE
* To learn about using Git for project management.
* To create a text file that is read by a Java program
* To learn about CompSci201 workflow for assignments: Git, Gradescope, helper hours.


## The 201 workflow
Read this document about setting up VS Code, using GIT for 201, and submitting
your work via Gradescope.

## Developing the classes in Project P0: Person201


When you fork and clone the project, you'll be working primarily within the src folder with .java files beginning with `Person201`. Your goal is to modify three programs/classes (`Person201.java`, `Simple201.java`, and `Person201NearbyDemo.java`) and create a new program (`Person201Closeest.java`) to generate the desired output. 


### Run `Simple201.java` and change `Person201.java`

First run the main method in `Simple201.java`, the output will be:

```
035.99N,078.90W owen woto
047.00N,122.39W ricardo harambee
040.71N,073.96W julie hello
000.00N,000.00E null null
names: owen ricardo julie null 
```

Make changes

```
Owen woto @ 35.9312N 79.0058W
Ricardo harambee @ 34.6037S 58.3816W
Gelareh affective @ 33.89S 151.2E
Ricardo harambe
Gelareh affective
```

Now that you've done this, change the `main` method in class `Person201Driver` by creating a new `Person201` variable named s (short for Sam) with the value shown:

`Person201 s = new Person201("Sam", 44.9978, -93.2650, "hello");`

Add one `System.out.println` statement to print the value of this variable `s` so the output of running the program is as follows:

```
new output
```
</details>

### Running Person201NearbyDemo and changing Data Source
<details>
<summary>Scanning from Another File</summary>

Once the `Person201` class has been updated so that `Person201Driver` generates output as shown above, you should run `Person201Scanner` to see the output below -- running the program is described after the output.

```
Owen woto @ 35.9312N 79.0058W
Ricardo harambee @ 34.6037S 58.3816W
Gelareh affective @ 33.89S 151.2E
total # 3
```


### Create and Run a New Java Class: **Person201Closest.java**
<details>
<summary>Creating and running a new class</summary>


In the `src` folder create a new Java class named `Person201Solo` that has only a `public static void main method` that allows the program to run (the `main` method is the launch point for all Java programs when they are executed). See `Person201Driver` for details and an example of a `main` method. In the new `main` method, you should define a `Person201` object as shown below and print using `System.out.println(person)` so that the main method has two statements.

```
Person201 person = new Person201("Sam", -77.846, 166.668, "cold");
System.out.println(person);
```
</details>
</details>



## Checklist

Before you submit to Gradescope, check that you've done each of the following:

- Modify `Person201.java` by changing code in three places.
- Verify that running `Person201Driver.java` matches the expected output after modifying `Person201.java`
- Add a new `Person201` object in the `Person201Driver.java` program and verify that running `Person201Driver.java` matches the expected output after modifying `Person201Driver.java`.
- Run `Person201Scanner.java` with the data file `data/large.txt`.
- Run `Person201Scanner.java` with a web source via a specified URL.
- Create a new class `Person201Solo` with a `main` method that has two statements.
- Run the program `PostPerson` to post new information and `PeopleDownloader` to get the information from a webservice.
</details>

## Submission


You will submit the assignment on Gradescope. [Here][Using IntelliJ, Gradescope, and Git] is a document that describes the submission process in detail. 

You can login to https://www.gradescope.com (make sure to login with “School Credentials”), find project P0 and submit your code. **You CANNOT submit unless all your code has been pushed to your Git repository on coursework.** So, be sure to push changes often and be sure your final program is in your Git repository before you get it graded on Gradescope.

You will need to resubmit your entire project on Gradescope every time after you make changes that you wish to be graded. Please take note that changes/commits on GitLab are NOT automatically synced to Gradescope.
</details>


## Reflect

After completing the coding portion, fill out the reflect form here: [P0 Reflect][P0 Reflect]

## Grading
<details>
<summary>Click for Grading Summary</summary>

Your submission will be graded by the following rubric:

| Class Modified | Points |
| ------ | ------ |
| Person201 | 4 |
| Person201Driver | 4 |
| Person201Solo | 4 |
| Webservice | 4 |
| Reflect form | 4 |

</summary>

# sbt-prototype is the starting point for all my projects #

Warning: you *must* use sbt version 0.11.3. Due to the `scala-tools.org` debacle, sbt can no longer download other versions of itself automatically.

## Features ##
### sbt plugins ###
- **xsbt-proguard-plugin**. Generate an executable jar of your project.

```
$ sbt
> proguard
[success] Total time: 19 s, completed May 26, 2012 1:24:33 PM
> exit
$ java -jar ./target/scala-2.9.2/prototype-project_2.9.2-1.0.0-SNAPSHOT.min.jar
hello, prototype-project v1.0.0-SNAPSHOT running with Scala v2.9.2 on sbt v0.11.3
```

- **sbt-dependency-graph**. Visualize your artifact dependency graph.

```
$ sbt
> dependency-graph
[info] com.example:prototype-project_2.9.2:1.0.0-SNAPSHOT
[info]   +-org.scala-lang:scala-library:2.9.2
[info]   +-org.scalaz:scalaz-core_2.9.2:6.0.4
[info]     +-org.scala-lang:scala-library:2.9.2
[info]     
[success] Total time: 0 s, completed May 26, 2012 1:30:29 PM
```

- **sbt-git-plugin**. Control git directly from the sbt shell.

- **sbt-man**. Access scaladocs and scalex.com directly from the sbt shell.

```
$ sbt
> man List
[man] scala
[man] def List: collection.immutable.List.type
> man List
[man] scala
[man] def List: collection.immutable.List.type
> man List ::
[man] scala.collection.immutable.List
[man] def ::(x: A): List[A]
[man] Adds an element at the beginning of this list. 
> man Ordering
[man] scala
[man] def Ordering: math.Ordering.type
> man scalaz.Ordering
[man] scalaz.IntW
[man] def ordering: Ordering
```

- **xsbt-start-script-plugin**. Generate a start script so you're not using `sbt run` in production.

```
$ sbt
> start-script
[info] Wrote start script for mainClass := Some(com.example.Main) to /Users/yuvi/workspace/ymasory/sbt-prototype/target/start
[success] Total time: 0 s, completed May 26, 2012 2:14:18 PM
> exit
$ ./target/start 
hello, prototype-project v1.0.0-SNAPSHOT running with Scala v2.9.2 on sbt v0.11.3
```

- **sbt-buildinfo**. Access sbt properties at runtime.
This is already integrated. As you can see, `Main.scala` has access to the artifact name, version, etc.

### Other features ###
- **ScalaCheck**. Write specification based tests that write lots of unit tests for you.

```
$ sbt11
[info] Loading global plugins from /Users/yuvi/Dropbox/documents/software/dot-files/sbt-plugins
[info] Loading project definition from /Users/yuvi/workspace/ymasory/sbt-prototype/project
[info] Set current project to prototype-project (in build file:/Users/yuvi/workspace/ymasory/sbt-prototype/)
> test
[info] + Main.startsWith: OK, passed 100 tests.
[info] + Main.endsWith: OK, passed 100 tests.
[info] Passed: : Total 2, Failed 0, Errors 0, Passed 2, Skipped 0
[success] Total time: 1 s, completed May 26, 2012 2:18:01 PM
```

- **gitignore**. The `.gitignore` file is ready to go.
- **sbt tweaks**. _E.g._, stack traces are reduce to be less distracting, main class is specified. See `built.sbt` to learn about all tweaks.

## Customize for your project ##
* Change all the references in `build.sbt` and `Main.scala` from `com.example` to your package.
* Change the artifact name in `build.sbt` from `prototype-project'` to your desired project name.
* Change the artifact version in `build.sbt` from `1.0.0-SNAPSHOT` to your desired version.
* Fill in the `LICENSE` file with the text of your program's license.
* Change this `README.md` file to something about your project.

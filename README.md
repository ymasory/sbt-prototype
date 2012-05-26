# sbt-prototype is the starting point for all my projects #

Warning: you *must* use sbt version 0.11.3. Due to the `scala-tools.org` debacle, sbt can no longer download other versions of itself automatically.

## Features ##
### sbt plugins ###
- **xsbt-proguard-plugin**. Generate an executable jar of your project.
- **sbt-dependency-graph**. Visualize your artifact dependency graph.
- **sbt-git-plugin**. Control git directly from the sbt shell.
- **sbt-man**. Access scaladocs and scalex.com directly from the sbt shell.
- **xsbt-start-script-plugin**. Generate a start script so you're not using `sbt run` in production.

### Other features ###
- **ScalaCheck**. Write specification based tests that write lots of unit tests for you.
- **gitignore**. The `.gitignore` file is ready to go.
- **sbt tweaks**. E.g., logging and stack traces are turned down to be less distracting.

## Customize for your project ##
* Change all the references in `build.sbt` and `Main.scala` from `com.example` to your package.
* Change the artifact name in `build.sbt` from `prototype-project'` to your desired project name.
* Change the artifact version in `build.sbt` from `1.0.0-SNAPSHOT` to your desired version.
* Fill in the `LICENSE` file with the text of your program's license.
* Change this `README.md` file to something about your project.

# sbt-prototype is the starting point for all my projects #

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
* If you change your program entry point from the provided one, remember to update the `mainClass` definitions in `build.sbt`.
* If you want to change your program's version number from `alpha` to something more descriptive, like `1.0`, update the `version` definition in `build.sbt`.
* Fill in the `LICENSE` file with the text of your program's license.
* Change this `README.md` file to something about your project.

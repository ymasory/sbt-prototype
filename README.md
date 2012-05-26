# sbt-prototype is the starting point for all my projects #

## Features ##
### sbt plugins ###
- **xsbt-proguard-plugin**. This is just so you can make an executable jar out of your project. Run `sbt proguard` and there will be an executable jar `sbt-prototype/target/scala_*/myproj-alpha.min.jar` that you can run `java -jar` on.
- **sbt-dependency-graph**
- **sbt-git-plugin**
- **sbt-man**
- **xsbt-start-script-plugin**

### Other features ###
- **ScalaCheck**. Some sample tests are in `src/test/scala`. Run them with `sbt test`.
- **git**. The `.gitignore` file is ready to go.
- **sbt tweaks**. E.g., logging and stack traces are turned down to be less distracting.

## Customize for your project ##
* If you change your program entry point from the provided one, remember to update the `mainClass` definitions in `build.sbt`.
* If you want to change your program's version number from `alpha` to something more descriptive, like `1.0`, update the `version` definition in `build.sbt`.
* Fill in the `LICENSE` file with the text of your program's license.

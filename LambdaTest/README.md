# LambdaTest
This project show how to move from a very verbose implementation of a converter, to a compact implementation using lambdas.

The aim is to convert an object of type `Flight` to a JSON string;
we want to be able to have two different convertions, that are:
- put in the JSON only the flight code
- put in the JSON all the (three) fields of the flight

Here are the steps:
- **Main1**: use two dedicated classes `SimpleConverter` and `FullConverter`
- **Main2**: `SimpleConverter` and `FullConverter` share a common `FlightConverter` interface
- **Main3**: use anonymous inner classes: `SimpleConverter` and `FullConverter` are not longer needed  🎉 
- **Main4**: delete some boilerplate from anonymous classes and add an arrow, magically converting them into lambda
- **Main5**: remove input type and curly brackets from lambda, using a more compact notation
- **Main6**: make `FlightConverter` interface more generic, it is able to take in input any type and convert it into a String; it's name change into `MyJSONConverter`
- **Main7**: still more generic use of interfaces into the `convertToJson` function, pooling together the input type
- **Main8**: add an example of converting any String into JSON, without changing anything of the previous work
- **Main9**: make also return type of `MyJSONConverter` generic; it's name change into `MyConverter`
- **Main10**: replace `MyConverter` with the built-in Java Function; also `MyConverter` is not longer needed! 🎉🎉🎉




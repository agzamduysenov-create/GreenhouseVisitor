# Greenhouse Visitor

Assignment #6 - Visitor pattern (ShP-2216, Astana IT University).

A smart greenhouse holds different plants: tomato bushes, strawberry plants and cucumber
vines. New operations on the greenhouse (water needed, harvest forecast, plant list) are
separate visitor classes, so the plant classes never change when an operation is added.

## Structure

| Pattern part | Class |
|---|---|
| Element interface | `GreenhouseElement` |
| Concrete elements | `Tomato`, `Strawberry`, `Cucumber` |
| Visitor interface | `GreenhouseVisitor` |
| Concrete visitors | `WaterNeedVisitor`, `HarvestForecastVisitor`, `ReportVisitor` |
| Object structure | `Greenhouse` (holds the plants and walks through them) |
| Client | `Main` |

Double dispatch: `plant.accept(visitor)` calls `visitor.visitTomato(this)` (or
`visitStrawberry` / `visitCucumber`), so the right method is chosen by the type of the
plant and by the type of the visitor, without any `instanceof`.

## Run

Open the project in IntelliJ IDEA (JDK 17) and run `Main`. Run `Tests` to check everything.

Or from the terminal:

```
javac -d out src/*.java
java -cp out Main
java -cp out Tests
```

## Sample output

```
Total water needed: 13400 ml
Expected harvest: 65 kg
Plant list:
Tomato: 10 bushes
Strawberry: 20 plants
Cucumber: 6 vines
```

## Adding a new operation

Create a new class that implements `GreenhouseVisitor` (see `ReportVisitor`).
`Tomato`, `Strawberry`, `Cucumber` and `Greenhouse` do not change.

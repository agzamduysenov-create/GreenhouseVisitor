# Greenhouse Visitor

Assignment #6 - Visitor pattern (ShP-2216, Astana IT University).

A smart greenhouse is a tree of elements: tomato bushes, strawberry plants and zones
(a zone can contain other elements and other zones). New operations on this tree
(water needed, harvest forecast, CSV export) are separate visitor classes, so the
element classes never change when an operation is added.

## Structure

| Pattern part | Class |
|---|---|
| Element interface | `GreenhouseElement` |
| Concrete elements | `Tomato`, `Strawberry`, `Zone` |
| Visitor interface | `GreenhouseVisitor` |
| Concrete visitors | `WaterNeedVisitor`, `HarvestForecastVisitor`, `ExportVisitor` |
| Object structure | `Zone` (a tree of elements) |
| Client | `Main` |

Double dispatch: `element.accept(visitor)` calls `visitor.visitTomato(this)` (or
`visitStrawberry` / `visitZone`), so the right method is chosen by the type of the
element and by the type of the visitor, without any `instanceof`.

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
Total water needed: 15900 ml
Expected harvest: 74 kg
Export:
type,name_or_count
Zone,Main greenhouse
Tomato,10
Strawberry,20
Zone,Back row
Tomato,5
Strawberry,8
```

## Adding a new operation

Create a new class that implements `GreenhouseVisitor` (see `ExportVisitor`).
`Tomato`, `Strawberry` and `Zone` do not change.

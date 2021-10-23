# UNQ » UIs » TP Spotify

[![](https://jitpack.io/v/unq-ui/unq-drinks.svg)](https://jitpack.io/#unq-ui/unq-drinks)


Drinks es una plataforma donde los usuarios pueden seleccionar ingredientes y el sistema brindara una lista de tragos que puede realizar.

## Especificación de Dominio

### Dependencia

Agregar el repositorio:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Agregar la dependencia:

```xml
<dependency>
    <groupId>com.github.unq-ui</groupId>
    <artifactId>unq-drinks</artifactId>
    <version>v1.0.0</version>
</dependency>
```

Toda interacción con el dominio se hace a través de la clase `DrinksService`. La programación del dominio ya es proveído por la cátedra.

Se tiene que instanciar el sistema de la siguiente forma:

```kotlin
val drinksService = getDrinksService()
```

### DrinksService

```kotlin
fun getAllElements(): List<Element> 

fun getAllDrinks(): List<Drink>

// @Throw DrinkException si existe un elemento con el mismo nombre
fun addElement(draftElement: DraftElement): Element

// @Throw DrinkException si existe un drink con el mismo nombre
fun addDrink(draftDrink: DraftDrink): Drink

// @Throw DrinkException si el elementId no existe o si el nombre esta usado
fun modifyElement(elementId: String, draftElement: DraftElement)

fun search(elements: List<Element>): List<Drink>

```

### Element

```kotlin
class Element(
    val id: String,
    var name: String,
    var abv: Int
)
```

### Ingredient

```kotlin
class Ingredient(val amount: String, val element: Element)
```

### Drink

```kotlin
class Drink(
    val id: String,
    val name: String,
    val description: String,
    val image: String,
    val glass: String,
    val category: String,
    val ingredients: MutableList<Ingredient>,
    val garnish: String,
    val preparation: String,
)
```

### SongDraft

Es la representación de un `Element` antes de ser guardada por el sistema

```kotlin
class DraftElement(var name: String, var abv: Int)
```

### DraftDrink

Es la representación de un `Drink` antes de ser guardada por el sistema

```kotlin
class DraftDrink(
    var name: String,
    var description: String,
    var image: String,
    var glass: String,
    var category: String,
    var ingredients: MutableList<Ingredient>,
    var garnish: String,
    var preparation: String,
)
```

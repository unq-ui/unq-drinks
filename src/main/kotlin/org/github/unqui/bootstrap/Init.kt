package org.github.unqui.bootstrap

import org.github.unqui.model.*

private class InitDraftIngredient(val name: String, val amount: String)
private class InitDraftDrink(
    val name: String,
    val description: String,
    val image: String,
    val glass: String,
    val category: String,
    val garnish: String,
    val preparation: String,
    val ingredients: List<InitDraftIngredient>
)


fun getDrinksService(): DrinksService {
    val drinksService = DrinksService(mutableListOf(), mutableListOf(), mutableListOf())
    addAllIngredients(drinksService)
    addAllDrinks(drinksService)
    addUsers(drinksService)
    return drinksService    
}

private fun addAllDrinks(drinksService: DrinksService) {
    drinks().forEach {
        transformDrinks(it, drinksService)
    }
}

private fun addAllIngredients(drinksService: DrinksService) {
    drinksService.addElement(DraftElement("Vodka", 40))
    drinksService.addElement(DraftElement("Whisky", 40))
    drinksService.addElement(DraftElement("Tequila", 40))
    drinksService.addElement(DraftElement("Ron (Blanco)", 40))
    drinksService.addElement(DraftElement("Ginebra", 35))
    drinksService.addElement(DraftElement("Brandy", 40))
    drinksService.addElement(DraftElement("Champaña", 10))
    drinksService.addElement(DraftElement("Vino Blanco (Seco)", 15))
    drinksService.addElement(DraftElement("Vino (Oporto)", 15))
    drinksService.addElement(DraftElement("Vino (Prosecco)", 15))
    drinksService.addElement(DraftElement("Vino Blanco (Fino Sherry)", 15))
    drinksService.addElement(DraftElement("Cerveza de Jengibre", 8))
    drinksService.addElement(DraftElement("Beer", 7))
    drinksService.addElement(DraftElement("Coñac",40 ))
    drinksService.addElement(DraftElement("Ron (Dorado)", 40))
    drinksService.addElement(DraftElement("Ron (Oscuro)", 40))
    drinksService.addElement(DraftElement("Ron (151)", 40))
    drinksService.addElement(DraftElement("Triple Sec", 38))
    drinksService.addElement(DraftElement("Cointreau", 38))
    drinksService.addElement(DraftElement("Vermú", 15))
    drinksService.addElement(DraftElement("Vermú (Dulce)", 15))
    drinksService.addElement(DraftElement("Vermú (Rojo Dulce)", 15))
    drinksService.addElement(DraftElement("Vermú (Seco)", 15))
    drinksService.addElement(DraftElement("Absenta", 70))
    drinksService.addElement(DraftElement("Brandy de Albaricoque", 38))
    drinksService.addElement(DraftElement("Licor de Mora", 20))
    drinksService.addElement(DraftElement("Licor de Cereza", 20))
    drinksService.addElement(DraftElement("Licor de Frambuesa", 20))
    drinksService.addElement(DraftElement("Licor de Café", 20))
    drinksService.addElement(DraftElement("Licor de Crema", 20))
    drinksService.addElement(DraftElement("Licor Créme", 20))
    drinksService.addElement(DraftElement("Licor Créme (Menta)", 20))
    drinksService.addElement(DraftElement("Licor Créme (Cacao Blanco)", 20))
    drinksService.addElement(DraftElement("Licor Créme (Cacao)", 20))
    drinksService.addElement(DraftElement("Licor Créme (De Cassis)", 20))
    drinksService.addElement(DraftElement("Licor Créme (De Violette)", 20))
    drinksService.addElement(DraftElement("Curaçao (Licor Azul)", 30))
    drinksService.addElement(DraftElement("Licor 43", 18))
    drinksService.addElement(DraftElement("Licor DOM Bénédictine",19))
    drinksService.addElement(DraftElement("Licor de Amaretto",21))
    drinksService.addElement(DraftElement("Licor de Fernet-branca", 10))
    drinksService.addElement(DraftElement("Licor de Campari", 20))
    drinksService.addElement(DraftElement("Velvet Falernum", 12))
    drinksService.addElement(DraftElement("Kirsch", 30))
    drinksService.addElement(DraftElement("Chartreuse (Verde)", 31))
    drinksService.addElement(DraftElement("Galliano", 20))
    drinksService.addElement(DraftElement("Drambuie", 32))
    drinksService.addElement(DraftElement("Calvados", 12))
    drinksService.addElement(DraftElement("Cachaca", 14))
    drinksService.addElement(DraftElement("Aperol", 32))
    drinksService.addElement(DraftElement("Licor de Durazno", 14))
    drinksService.addElement(DraftElement("Licor de Marrasquino", 14))
    drinksService.addElement(DraftElement("Lillet Blanc", 14))
    drinksService.addElement(DraftElement("Pisco", 32))
    drinksService.addElement(DraftElement("Hielo", 0))
    drinksService.addElement(DraftElement("Limón", 0))
    drinksService.addElement(DraftElement("Menta", 0))
    drinksService.addElement(DraftElement("Naranja (Jugo)", 0))
    drinksService.addElement(DraftElement("Huevo", 0))
    drinksService.addElement(DraftElement("Agua Mineral", 0))
    drinksService.addElement(DraftElement("Refresco de Lima/Limón", 0))
    drinksService.addElement(DraftElement("Sirope", 0))
    drinksService.addElement(DraftElement("Lima", 0))
    drinksService.addElement(DraftElement("Refresco de Gengibre", 0))
    drinksService.addElement(DraftElement("Agua", 0))
    drinksService.addElement(DraftElement("Sal", 0))
    drinksService.addElement(DraftElement("Leche de Coco", 0))
    drinksService.addElement(DraftElement("Café", 0))
    drinksService.addElement(DraftElement("Crema de Coco", 0))
    drinksService.addElement(DraftElement("Crema", 0))
    drinksService.addElement(DraftElement("Malvaviscos (Mini)", 0))
    drinksService.addElement(DraftElement("Azúcar", 0))
    drinksService.addElement(DraftElement("Miel", 0))
    drinksService.addElement(DraftElement("Granadina", 0))
    drinksService.addElement(DraftElement("Extracto de Vainilla", 0))
    drinksService.addElement(DraftElement("Sirope de Agave", 0))
    drinksService.addElement(DraftElement("Sirope de Fresa", 0))
    drinksService.addElement(DraftElement("Sirope de Frambuesa", 0))
    drinksService.addElement(DraftElement("Sirope de Canela", 0))
    drinksService.addElement(DraftElement("Refresco de Cola", 0))
    drinksService.addElement(DraftElement("Toronja (Jugo)", 0))
    drinksService.addElement(DraftElement("Arándano (Jugo)", 0))
    drinksService.addElement(DraftElement("Aceituna (Jugo)", 0))
    drinksService.addElement(DraftElement("Fresas", 0))
    drinksService.addElement(DraftElement("Jugo de Piña", 0))
    drinksService.addElement(DraftElement("Pepino", 0))
    drinksService.addElement(DraftElement("Romero", 0))
    drinksService.addElement(DraftElement("Albahaca", 0))
    drinksService.addElement(DraftElement("Cebolla", 0))
    drinksService.addElement(DraftElement("Pimienta Negra", 0))
    drinksService.addElement(DraftElement("Jalapeño", 0))
    drinksService.addElement(DraftElement("Chile de Arbol", 0))
    drinksService.addElement(DraftElement("Salsa Inglesa", 0))
    drinksService.addElement(DraftElement("Salsa Tabasco", 0))
    drinksService.addElement(DraftElement("Salsa Maggi", 0))
    drinksService.addElement(DraftElement("Jugo de Tomate", 0))
    drinksService.addElement(DraftElement("Amargos de Angostura", 0))
    drinksService.addElement(DraftElement("Amargos de Durazno", 0))
    drinksService.addElement(DraftElement("Amargos de Peychaud", 0))
    drinksService.addElement(DraftElement("Amargos de Naranja", 0))
    drinksService.addElement(DraftElement("Peach (Puré)", 0))
    drinksService.addElement(DraftElement("Agua de Azahar", 0))
    drinksService.addElement(DraftElement("Refresco de Toronja", 0))
}

private fun drinks(): List<InitDraftDrink> {
    return listOf(
        InitDraftDrink( "Jungle Bird", " ", "junglebirdlarge.jpg", "Old Fashioned", "Before Dinner Cocktail", "Rodaja y hojas de piña", "Agitar ingredientes con hielo. Colar en un vaso frío con un cubo grande de hielo.", listOf(InitDraftIngredient("Ron (Oscuro)", "4.5 cl"), InitDraftIngredient("Licor de Campari", "2 cl"), InitDraftIngredient("Sirope", "1.5 cl"), InitDraftIngredient("Jugo de Piña", "4.5 cl"), InitDraftIngredient("Lima", "1.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Hanky Panky", " ", "hankypankylarge.jpg", "Cocktail", "Before Dinner Cocktail", "Rodajas de limón", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Vermú (Seco)", "4.5 cl"), InitDraftIngredient("Ginebra", "4.5 cl"), InitDraftIngredient("Licor de Fernet-branca", "0.75 cl"), InitDraftIngredient("Hielo", "  ")) ),
        InitDraftDrink( "Brandy Crusta", " ", "brandycrustalarge.jpg", "Cocktail", "Before Dinner Cocktail", "Cáscara de naranja. Escachar vaso con azúcar.", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Coñac", "4.5 cl"), InitDraftIngredient("Licor de Marrasquino", "1.5 cl"), InitDraftIngredient("Cointreau", "1.5 cl"), InitDraftIngredient("Limón", "2 cl"), InitDraftIngredient("Sirope", "0.5 cl"), InitDraftIngredient("Amargos de Angostura", "0.2 cl"), InitDraftIngredient("Hielo", "  ")) ),
        InitDraftDrink( "Last Word", " ", "lastwordlarge.jpg", "Cocktail", "Before Dinner Cocktail", " ", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ginebra", "2 cl"), InitDraftIngredient("Lima", "2 cl"), InitDraftIngredient("Chartreuse (Verde)", "2 cl"), InitDraftIngredient("Licor de Marrasquino", "2 cl"), InitDraftIngredient("Hielo", "  ")) ),
        InitDraftDrink( "El Diablo", " ", "eldiablolarge.jpg", "Highball", "Before Dinner Cocktail", "Rodajas de limón", "Agitar ingredientes con hielo, excepto el refresco de gengibre. Colar en un vaso con hielos nuevos. Completar con refresco de gengibre.", listOf(InitDraftIngredient("Tequila", "4.5 cl"), InitDraftIngredient("Lima", "2 cl"), InitDraftIngredient("Licor Créme (De Cassis)", "2 cl"), InitDraftIngredient("Refresco de Gengibre", "6 cl"), InitDraftIngredient("Hielo", "  ")) ),
        InitDraftDrink( "Bambú", " ", "bamboolarge.jpg", "Cocktail", "Before Dinner Cocktail", "Cáscara de naranja", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Vermú (Seco)", "4.5 cl"), InitDraftIngredient("Vino Blanco (Fino Sherry)", "4.5 cl"), InitDraftIngredient("Amargos de Angostura", "0.2 cl"), InitDraftIngredient("Amargos de Naranja", "0.1 cl"), InitDraftIngredient("Hielo", "  ")) ),
        InitDraftDrink( "Margarita (Picante) de Pepino", " ", "spicycucumberlarge.jpg", "Old Fashioned", "Before Dinner Cocktail", "Rodajas de pepino y jalapeño", "Cortar y machacar rodajas de pepino y jalapeño. Agitar ingredientes con hielo, excepto el agua mineral. Colar en un vaso con hielos nuevos. Completar con agua mineral.", listOf(InitDraftIngredient("Tequila", "4.5 cl"), InitDraftIngredient("Lima", "4.5 cl"), InitDraftIngredient("Triple Sec", "2.5 cl"), InitDraftIngredient("Sirope de Agave", "1.5 cl"), InitDraftIngredient("Pepino", "unas rodajas"), InitDraftIngredient("Jalapeño", "unas rodajas"), InitDraftIngredient("Agua Mineral", "1.5 cl"), InitDraftIngredient("Hielo", "  ")) ),
        InitDraftDrink( "Gimlet", " ", "gimletlarge.jpg", "Cóctel", "Before Dinner Cocktail", "Zumo de limón", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ginebra", "6 cl"), InitDraftIngredient("Lima", "6 cl"), InitDraftIngredient("Sirope", "6 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Martinez", " ", "martinezlarge.jpg", "Cóctel", "Before Dinner Cocktail", "Twist de limón", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ginebra", "4 cl"), InitDraftIngredient("Vermú (Dulce)", "4 cl"), InitDraftIngredient("Licor de Marrasquino", "0.75 cl"), InitDraftIngredient("Amargos de Angostura", "0.1 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Zombie", " ", "zombielarge.jpg", "Highball", "Before Dinner Cocktail", "Hojas de menta", "Agitar ingredientes con hielo. Colar en un vaso con hielo picado.", listOf(InitDraftIngredient("Ron (Dorado)", "4.5 cl"), InitDraftIngredient("Ron (Oscuro)", "4.5 cl"), InitDraftIngredient("Ron (151)", "3 cl"), InitDraftIngredient("Lima", "2 cl"), InitDraftIngredient("Velvet Falernum", "1.5 cl"), InitDraftIngredient("Toronja (Jugo)", "2 cl"), InitDraftIngredient("Absenta", "0.2 cl"), InitDraftIngredient("Sirope de Canela", "0.75 cl"), InitDraftIngredient("Granadina", "0.75 cl"), InitDraftIngredient("Amargos de Angostura", "0.2 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Mudslide", " ", "mudslidelarge.jpg", "Old Fashioned", "Before Dinner Cocktail", "Chocolate en polvo", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Licor de Crema", "4.5 cl"), InitDraftIngredient("Vodka", "3 cl"), InitDraftIngredient("Licor de Café", "3 cl"), InitDraftIngredient("Crema", "3 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Painkiller", " ", "painkillerlarge.jpg", "Hurricane", "Before Dinner Cocktail", "Rodaja de piña y polvo de nuez moscada rallada", "Agitar ingredientes con hielo. Colar en un vaso frío y con hielos nuevos.", listOf(InitDraftIngredient("Ron (Oscuro)", "6 cl"), InitDraftIngredient("Jugo de Piña", "12 cl"), InitDraftIngredient("Naranja (Jugo)", "3 cl"), InitDraftIngredient("Crema de Coco", "3 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Vesper", "Una de las bebidas mas controversiales.", "vesperlarge.png", "Cóctel", "Before Dinner Cocktail", "Twist de limón", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ginebra", "6 cl"), InitDraftIngredient("Vodka", "1.5 cl"), InitDraftIngredient("Lillet Blanc", "0.75 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Bacardi", "", "bacardilarge.jpg", "Cóctel", "Before Dinner Cocktail", "Rodajas de limon, cereza y hojas de menta", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ron (Blanco)", "4.5 cl"), InitDraftIngredient("Lima", "2 cl"), InitDraftIngredient("Granadina", "1 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Negroni", "", "negronilarge.jpg", "Old Fashioned", "Before Dinner Cocktail", "Media rodaja de naranja", "Elaborar en un vaso con hielo. Revolver por 20 segundos.", listOf(InitDraftIngredient("Ginebra", "3 cl"), InitDraftIngredient("Licor de Campari", "3 cl"), InitDraftIngredient("Vermú (Rojo Dulce)", "3 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Rose", "", "roselarge.jpg", "Cóctel", "", "Pétalo de rosa o twist de limón", "Revolver ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Kirsch", "2 cl"), InitDraftIngredient("Vermú (Seco)", "4 cl"), InitDraftIngredient("Sirope de Fresa", "0.3 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Old Fashioned", "", "oldfashionedlarge.jpg", "Old Fashioned", "Before Dinner Cocktail", "Rodaja de naranja y cereza", "Machacar el azúcar (o terrones de azúcar) en el vaso con toques de amargos de Angostura. Llenar con hielo y verter el whisky.", listOf(InitDraftIngredient("Whisky", "4.5 cl"), InitDraftIngredient("Azúcar", "0.5 cl"), InitDraftIngredient("Amargos de Angostura", "0.2 cl"), InitDraftIngredient("Agua", "0.2 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Strawberry Basil", "", "strawberrybasillarge.jpg", "Old Fashioned", "Before Dinner Cocktail", "Fresas, cáscara de limón y hojas de albahaca", "Machacar la fresa y albahaca. Agitar ingredientes con hielo. Colar en un vaso con hielos nuevos.", listOf(InitDraftIngredient("Fresas", "1 taza"), InitDraftIngredient("Azúcar", "1.5 cl"), InitDraftIngredient("Limón", "1.5 cl"), InitDraftIngredient("Albahaca", "1.5 cl"), InitDraftIngredient("Whisky", "7 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Adios Motherf*cker", "", "adiosmotherfuckerlarge.jpg", "Collins", "Before Dinner Cocktail", "Rueda de limón y cereza", "Agitar ingredientes con hielo. Colar en un vaso con hielos nuevos.", listOf(InitDraftIngredient("Vodka", "1.5 cl"), InitDraftIngredient("Ron (Blanco)", "1.5 cl"), InitDraftIngredient("Ginebra", "1.5 cl"), InitDraftIngredient("Tequila", "1.5 cl"), InitDraftIngredient("Curaçao (Licor Azul)", "1.5 cl"), InitDraftIngredient("Sirope", "3 cl"), InitDraftIngredient("Limón", "3 cl"), InitDraftIngredient("Refresco de Lima/Limón", "12 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Mexican Mule", "", "mexicanmulelarge.jpg", "Collins o una taza de cobre", "Before Dinner Cocktail", "Jalapeño y rodajas de limón", "Agitar ingredientes con hielo, excepto la cerveza de jengibre. Colar en un vaso con hielos nuevos. Completar con la cerveza de jengibre.", listOf(InitDraftIngredient("Tequila", "6 cl"), InitDraftIngredient("Lima", "1.5 cl"), InitDraftIngredient("Cerveza de Jengibre", "15 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Boulevardier", "", "boulevardierlarge.jpg", "Cóctel", "Before Dinner Cocktail", "Twist de naranja", "Revolver ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Whisky", "4.5 cl"), InitDraftIngredient("Vermú (Rojo Dulce)", "3 cl"), InitDraftIngredient("Licor de Campari", "3 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Tuxedo", "", "tuxedolarge.jpg", "Cóctel", "All Day Cocktail", "Cereza y twist de limón", "Revolver ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ginebra", "3 cl"), InitDraftIngredient("Vermú (Seco)", "3 cl"), InitDraftIngredient("Licor de Marrasquino", "0.2 cl"), InitDraftIngredient("Absenta", "0.1 cl"), InitDraftIngredient("Amargos de Naranja", "0.3 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Mojito", "", "mojitolarge.jpg", "Collins", "Longdrink", "Hojas de menta y rodaja de lima", "Machacar las ramitas de menta con el azúcar y la lima en el vaso. Vertir el ron, agregar hielo y completar con agua mineral. Revolver suavemente.", listOf(InitDraftIngredient("Ron (Blanco)", "4 cl"), InitDraftIngredient("Lima", "3 cl"), InitDraftIngredient("Azúcar", "1 cl"), InitDraftIngredient("Menta", "6 ramitas"), InitDraftIngredient("Agua Mineral", "12 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Horse's Neck", "", "horsesnecklarge.jpg", "Highball", "Longdrink", "Twist de limón", "Elaborar en un vaso con hielo. Revolver suavemente. Agregar toques de amargos de Angostura al gusto.", listOf(InitDraftIngredient("Brandy", "4 cl"), InitDraftIngredient("Refresco de Gengibre", "12 cl"), InitDraftIngredient("Amargos de Angostura", "0.1 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Carajillo", "", "carajillolarge.jpg", "Brandy/Cognac", "After Dinner Cocktail", "Rama de canela", "Agitar ingredientes con hielo. Colar en un vaso con hielos nuevos.", listOf(InitDraftIngredient("Licor 43", "4.5 cl"), InitDraftIngredient("Brandy", "1.5 cl"), InitDraftIngredient("Café", "4.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Sea Breeze", "", "seabreezelarge.jpg", "Highball", "Longdrink", "Rodaja de lima o toronja.", "Elaborar en un vaso con hielo. Revolver suavemente.", listOf(InitDraftIngredient("Vodka", "4 cl"), InitDraftIngredient("Arándano (Jugo)", "12 cl"), InitDraftIngredient("Toronja (Jugo)", "3 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Pisco Sour", "", "piscosourlarge.jpg", "Old Fashioned", "All Day Cocktail", "Rodaja de limón", "Agitar ingredientes con hielo. Colar en un vaso frío. Agregar toques de amargos de Angostura al gusto.", listOf(InitDraftIngredient("Pisco", "4.5 cl"), InitDraftIngredient("Limón", "3 cl"), InitDraftIngredient("Sirope", "2 cl"), InitDraftIngredient("Huevo", "1 clara"), InitDraftIngredient("Amargos de Angostura", "0.3 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Té Helado Long Island", "", "longislandtealarge.jpg", "Highball", "Longdrink", "Twist de limón", "Elaborar en un vaso con hielo. Revolver suavemente.", listOf(InitDraftIngredient("Tequila", "1.5 cl"), InitDraftIngredient("Vodka", "1.5 cl"), InitDraftIngredient("Ron (Blanco)", "1.5 cl"), InitDraftIngredient("Triple Sec", "1.5 cl"), InitDraftIngredient("Ginebra", "1.5 cl"), InitDraftIngredient("Limón", "2.5 cl"), InitDraftIngredient("Sirope", "3 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Clover Club", "", "cloverclublarge.jpg", "Cóctel", "All Day Cocktail", "Frambuesas", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ginebra", "4.5 cl"), InitDraftIngredient("Sirope de Frambuesa", "1.5 cl"), InitDraftIngredient("Limón", "1.5 cl"), InitDraftIngredient("Huevo", "2 gotas de clara"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Angel Face", "", "angelfacelarge.jpg", "Cóctel", "All Day Cocktail", "", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ginebra", "3 cl"), InitDraftIngredient("Brandy de Albaricoque", "3 cl"), InitDraftIngredient("Calvados", "3 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Mimosa", "", "mimosalarge.jpg", "Champagne-flute", "Sparkling Cocktail", "Rodajas de naranja, durazno, o piña. Frambuesas, fresas, semillas de granada o una ramita de romero.", "Elaborar en un vaso con hielo. Revolver suavemente.", listOf(InitDraftIngredient("Champaña", "7.5 cl"), InitDraftIngredient("Naranja (Jugo)", "7.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Whiskey Sour", "", "whiskeysourlarge.jpg", "Old Fashioned", "Before Dinner Cocktail", "Media rodaja de naranja y cereza", "Agitar ingredientes con hielo. Colar en un vaso con hielos nuevos.", listOf(InitDraftIngredient("Whisky", "4.5 cl"), InitDraftIngredient("Limón", "3 cl"), InitDraftIngredient("Sirope", "1.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Screwdriver", "", "screwdriverlarge.jpg", "Highball", "All Day Cocktail", "Rodaja de naranja", "Elaborar en un vaso con hielo. Revolver suavemente.", listOf(InitDraftIngredient("Vodka", "5 cl"), InitDraftIngredient("Naranja (Jugo)", "10 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Cuba Libre", "", "cubalibrelarge.jpg", "Highball", "Longdrink", "Rodaja de Lima", "Elaborar en un vaso con hielo. Revolver suavemente.", listOf(InitDraftIngredient("Ron (Blanco)", "5 cl"), InitDraftIngredient("Refresco de Cola", "12 cl"), InitDraftIngredient("Lima", "1 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Manhattan", "", "manhattanlarge.jpg", "Cóctel", "Before Dinner Cocktail", "Cereza", "Revolver ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Whisky", "5 cl"), InitDraftIngredient("Vermú", "2 cl"), InitDraftIngredient("Amargos de Angostura", "0.1 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Porto Flip", "", "portofliplarge.jpg", "Cóctel", "After Dinner Cocktail", "Polvo con nuez moscada rallada", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Coñac", "1.5 cl"), InitDraftIngredient("Vino (Oporto)", "4.5 cl"), InitDraftIngredient("Huevo", "1 yema"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Gin Fizz", "", "ginfizzlarge.jpg", "Highball", "Longdrink", "Rodaja de limón", "Agitar ingredientes, excepto el agua mineral, durante unos 15 segundos. Agregar hielo y agitar una vez más hasta enfriarse la coctelera. Colar en un vaso con hielos nuevos. Completar con agua mineral.", listOf(InitDraftIngredient("Ginebra", "4.5 cl"), InitDraftIngredient("Limón", "3 cl"), InitDraftIngredient("Sirope", "1 cl"), InitDraftIngredient("Agua Mineral", "8 cl"), InitDraftIngredient("Huevo", "1 white"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Espresso Martini", "", "espressomartinilarge.jpg", "Cóctel", "After Dinner Cocktail", "Granos de café y rodaja de limón", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Vodka", "5 cl"), InitDraftIngredient("Licor de Café", "1 cl"), InitDraftIngredient("Sirope", "1 cl"), InitDraftIngredient("Café", "1 Espresso"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Margarita", "", "margaritalarge.jpg", "Margarita", "All Day Cocktail", "Rodaja de lima. Escarchar vaso con sal.", "Agitar ingredientes con hielo. Colar en un vaso con hielos nuevos.", listOf(InitDraftIngredient("Tequila", "5 cl"), InitDraftIngredient("Triple Sec", "2 cl"), InitDraftIngredient("Lima", "1.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "French 75", "", "french75large.jpg", "Champagne-tulip", "Sparkling Cocktail", "Twist de limón", "Agitar ingredientes con hielo, excepto la Champaña. Colar en un vaso frío. Completar con la Champaña.", listOf(InitDraftIngredient("Ginebra", "3 cl"), InitDraftIngredient("Limón", "1.5 cl"), InitDraftIngredient("Sirope", "0.2 cl"), InitDraftIngredient("Champaña", "6 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Yellow Bird", "", "yellowbirdlarge.jpg", "Cóctel", "All Day Cocktail", "", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ron (Blanco)", "3 cl"), InitDraftIngredient("Galliano", "1.5 cl"), InitDraftIngredient("Triple Sec", "1.5 cl"), InitDraftIngredient("Lima", "1.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Piña Colada", "", "pinacoladalarge.jpg", "Hurricane", "Longdrink", "Roadaja de piña y cereza.", "Licuar todos los ingredientes con hielo y vertir en un vaso.", listOf(InitDraftIngredient("Ron (Blanco)", "6 cl"), InitDraftIngredient("Jugo de Piña", "9 cl"), InitDraftIngredient("Leche de Coco", "3 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Aviation", "", "aviationlarge.jpg", "Cóctel", "All Day Cocktail", "Cereza y limón", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ginebra", "4.5 cl"), InitDraftIngredient("Licor de Cereza", "1.5 cl"), InitDraftIngredient("Limón", "1.5 cl"), InitDraftIngredient("Licor Créme (De Violette)", "0.4 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Bellini", "", "bellinilarge.jpg", "Champagne-flute", "Sparkling Cocktail", "Rodaja de durazno", "Elaborar en un vaso frío. Revolver suavemente.", listOf(InitDraftIngredient("Vino (Prosecco)", "10 cl"), InitDraftIngredient("Peach (Puré)", "5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Grasshopper", "", "grasshopperlarge.jpg", "Cóctel", "After Dinner Cocktail", "Ramitas de menta", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Licor Créme (Cacao Blanco)", "3 cl"), InitDraftIngredient("Licor Créme (Menta)", "3 cl"), InitDraftIngredient("Crema", "3 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Tequila Sunrise", "", "tequilasunriselarge.jpg", "Highball", "Longdrink", "Rodaja de naranja y cereza", "Agitar ingredientes con hielo, excepto la granadina. Colar en un vaso con hielos nuevos. Completar con unos toques de granadina.", listOf(InitDraftIngredient("Tequila", "4.5 cl"), InitDraftIngredient("Naranja (Jugo)", "9 cl"), InitDraftIngredient("Granadina", "1.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Daiquiri", "", "daiquirilarge.jpg", "Cóctel", "Before Dinner Cocktail", "Rueda de lima", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ron (Blanco)", "6 cl"), InitDraftIngredient("Lima", "2 cl"), InitDraftIngredient("Sirope", "1 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Rusty Nail", "", "rustynaillarge.jpg", "Old Fashioned", "After Dinner Cocktail", "Twist de limón", "Elaborar en un vaso con hielo. Revolver suavemente.", listOf(InitDraftIngredient("Whisky", "4.5 cl"), InitDraftIngredient("Drambuie", "2.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "B52", "", "b52large.jpg", "Shot", "After Dinner Cocktail", "Flama encendida", "Vertir ingredientes en capas, uno por uno: licor de café (como Kahlúa), licor de crema (como Baileys Crema Irlandesa) y cubra con Triple Sec (como Grand Marnier). Encienda la parte superior, sirva mientras la llama aún está encendida, acompañe con un popote en un plato chico.", listOf(InitDraftIngredient("Licor de Café", "2 cl"), InitDraftIngredient("Licor de Crema", "2 cl"), InitDraftIngredient("Triple Sec", "2 cl")) ),
        InitDraftDrink( "Stinger", "", "stingerlarge.jpg", "Cóctel", "After Dinner Cocktail", "", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Coñac", "5 cl"), InitDraftIngredient("Licor Créme (Menta)", "2 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Golden Dream", "", "goldendreamlarge.jpg", "Cóctel", "After Dinner Cocktail", "", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Galliano", "2 cl"), InitDraftIngredient("Triple Sec", "2 cl"), InitDraftIngredient("Naranja (Jugo)", "2 cl"), InitDraftIngredient("Crema", "1 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Godmother", "", "godmotherlarge.jpg", "Old Fashioned", "", "", "Elaborar en un vaso con hielo. Revolver suavemente.", listOf(InitDraftIngredient("Vodka", "3.5 cl"), InitDraftIngredient("Licor de Amaretto", "3.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Godfather", "", "godfatherlarge.jpg", "Old Fashioned", "", "", "Elaborar en un vaso con hielo. Revolver suavemente.", listOf(InitDraftIngredient("Whisky", "3.5 cl"), InitDraftIngredient("Licor de Amaretto", "3.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Spritz Veneziano", "", "spritzvenezianolarge.jpg", "Wine", "Sparkling Cocktail", "Rueda de naranja", "Elaborar en un vaso con hielo. Revolver suavemente.", listOf(InitDraftIngredient("Aperol", "4.5 cl"), InitDraftIngredient("Agua Mineral", "3 cl"), InitDraftIngredient("Vino (Prosecco)", "6 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Bramble", "", "bramblelarge.jpg", "Old Fashioned", "All Day Cocktail", "Rodaja de limón y moras", "Agitar ingredientes con hielo, excepto el licor de mora. Colar en un vaso con hielo picado. Completar con licor de mora.", listOf(InitDraftIngredient("Ginebra", "4 cl"), InitDraftIngredient("Limón", "1.5 cl"), InitDraftIngredient("Sirope", "1 cl"), InitDraftIngredient("Licor de Mora", "1.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Alexander", "", "alexanderlarge.jpg", "Cóctel", "", "Polvo con nuez moscada rallada", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Coñac", "3 cl"), InitDraftIngredient("Licor Créme (Cacao)", "3 cl"), InitDraftIngredient("Crema", "3 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Lemon Drop Martini", "", "lemondroplarge.jpg", "Cóctel", "All Day Cocktail", "Rodaja de limón. Escachar vaso con azúcar.", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Vodka", "3 cl"), InitDraftIngredient("Triple Sec", "2 cl"), InitDraftIngredient("Limón", "1.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "French Martini", "", "frenchmartinilarge.jpg", "Cóctel", "Before Dinner Cocktail", "", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Vodka", "4.5 cl"), InitDraftIngredient("Licor de Frambuesa", "1.5 cl"), InitDraftIngredient("Jugo de Piña", "1.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Black Russian", "", "blackrussianlarge.jpg", "Old Fashioned", "After Dinner Cocktail", "", "Revolver ingredientes con hielo. Colar en un vaso con hielos nuevos.", listOf(InitDraftIngredient("Vodka", "5 cl"), InitDraftIngredient("Licor de Café", "2 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "White Russian", "", "whiterussianlarge.jpg", "Old Fashioned", "After Dinner Cocktail", "Polvo con nuez moscada rallada", "Revolver ingredientes con hielo, excepto la crema. Colar en un vaso con hielos nuevos. Completar con la crema.", listOf(InitDraftIngredient("Vodka", "5 cl"), InitDraftIngredient("Licor de Café", "2 cl"), InitDraftIngredient("Crema", "3 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Bloody Mary", "", "bloodymarylarge.jpg", "Highball", "Longdrink", "Apio y rodaja de limón", "Agitar ingredientes con hielo. Colar en un vaso con hielos nuevos.", listOf(InitDraftIngredient("Vodka", "4.5 cl"), InitDraftIngredient("Jugo de Tomate", "9 cl"), InitDraftIngredient("Limón", "1.5 cl"), InitDraftIngredient("Salsa Inglesa", "0.3 cl"), InitDraftIngredient("Salsa Tabasco", ""), InitDraftIngredient("Sal", ""), InitDraftIngredient("Pimienta Negra", ""), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Mai-tai", "", "maitailarge.jpg", "Old Fashioned", "Longdrink", "Piña, hojas de menta y rodaja de lima", "Agitar ingredientes con hielo. Colar en un vaso con hielos nuevos.", listOf(InitDraftIngredient("Ron (Blanco)", "3 cl"), InitDraftIngredient("Ron (Oscuro)", "3 cl"), InitDraftIngredient("Triple Sec", "1.5 cl"), InitDraftIngredient("Sirope", "0.75 cl"), InitDraftIngredient("Lima", "3 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Sex on the Beach", "", "sexonthebeachlarge.jpg", "Hurricane", "Longdrink", "Rodaja de naranja y cereza", "Agitar ingredientes con hielo. Colar en un vaso con hielos nuevos.", listOf(InitDraftIngredient("Vodka", "4 cl"), InitDraftIngredient("Licor de Durazno", "2 cl"), InitDraftIngredient("Arándano (Jugo)", "4 cl"), InitDraftIngredient("Naranja (Jugo)", "4 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Monkey Gland", "", "monkeyglandlarge.jpg", "Cóctel", "All Day Cocktail", "Twist de naranja", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ginebra", "4.5 cl"), InitDraftIngredient("Naranja (Jugo)", "4.5 cl"), InitDraftIngredient("Absenta", "1.5 cl"), InitDraftIngredient("Granadina", "1.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Derby", "", "derbylarge.jpg", "Cóctel", "All Day Cocktail", "Hojas de menta", "Revolver ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ginebra", "6 cl"), InitDraftIngredient("Amargos de Durazno", "0.2 cl"), InitDraftIngredient("Menta", "2 leaves"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Sidecar", "", "sidecarlarge.jpg", "Cóctel", "All Day Cocktail", "Twist de naranja. Escarchar vaso con azúcar.", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Coñac", "5 cl"), InitDraftIngredient("Triple Sec", "2 cl"), InitDraftIngredient("Limón", "2 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Irish Coffee", "", "irishcoffeelarge.jpg", "Hot-drink", "Hot Drink", "Malvaviscos (mini)", "Elaborar ingredientes en el vaso, excepto la crema (el café debe estar caliente). Revolver suavemente. Cubrir con crema ligeramente batida.", listOf(InitDraftIngredient("Whisky", "4 cl"), InitDraftIngredient("Café", "9 cl"), InitDraftIngredient("Crema", "3 cl"), InitDraftIngredient("Azúcar", "0.5 cl")) ),
        InitDraftDrink( "Sazerac", "", "sazeraclarge.jpg", "Old Fashioned", "After Dinner Cocktail", "Twist de limón", "Revolver ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Coñac", "5 cl"), InitDraftIngredient("Absenta", "1 cl"), InitDraftIngredient("Azúcar", "0.5 cl"), InitDraftIngredient("Amargos de Peychaud", "0.2 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Americano", "", "americanolarge.jpg", "Old Fashioned", "Before Dinner Cocktail", "Twist de naranja", "Elaborar en un vaso con hielo. Revolver suavemente.", listOf(InitDraftIngredient("Licor de Campari", "3 cl"), InitDraftIngredient("Vermú", "3 cl"), InitDraftIngredient("Agua Mineral", "0.1 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Singapore Sling", "", "singaporeslinglarge.jpg", "Highball", "Longdrink", "Rodaja de piña y cereza", "Agitar ingredientes con hielo. Colar en un vaso con hielos nuevos.", listOf(InitDraftIngredient("Ginebra", "3 cl"), InitDraftIngredient("Licor de Cereza", "1.5 cl"), InitDraftIngredient("Triple Sec", "0.75 cl"), InitDraftIngredient("Licor DOM Bénédictine", "0.75 cl"), InitDraftIngredient("Jugo de Piña", "12 cl"), InitDraftIngredient("Lima", "1.5 cl"), InitDraftIngredient("Granadina", "1 cl"), InitDraftIngredient("Amargos de Angostura", "0.1 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "French Connection", "", "frenchconnectionlarge.jpg", "Old Fashioned", "", "", "Elaborar en un vaso con hielo. Revolver suavemente.", listOf(InitDraftIngredient("Coñac", "3.5 cl"), InitDraftIngredient("Licor de Amaretto", "3.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Moscow Mule", "", "moscowmulelarge.jpg", "Highball", "Longdrink", "Rodaja de lima", "Elaborar en un vaso con hielo. Revolver suavemente.", listOf(InitDraftIngredient("Vodka", "4.5 cl"), InitDraftIngredient("Lima", "1 cl"), InitDraftIngredient("Cerveza de Jengibre", "12 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "John Collins", "", "johncollinslarge.jpg", "Highball", "Longdrink", "Rodaja de limón y cereza", "Agitar ingredientes con hielo, excepto el agua mineral. Colar en un vaso con hielos nuevos. Completar con el agua mineral.", listOf(InitDraftIngredient("Ginebra", "4.5 cl"), InitDraftIngredient("Limón", "3 cl"), InitDraftIngredient("Sirope", "1.5 cl"), InitDraftIngredient("Agua Mineral", "6 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Kir Royal", "", "kirroyallarge.jpg", "Champagne Flute", "Before Dinner Cocktail", "Bayas de temporada", "Elaborar en un vaso frío. Completar con Champaña.", listOf(InitDraftIngredient("Licor Créme (De Cassis)", "1 cl"), InitDraftIngredient("Champaña", "9 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Mint Julep", "", "mintjuleplarge.jpg", "Highball", "Longdrink", "Ramita de menta", "Machacar la menta con el azúcar. Agitar todos los ingredientes con hielo. Colar en un vaso con hielo picado nuevo. Revolver suavemente.", listOf(InitDraftIngredient("Whisky", "6 cl"), InitDraftIngredient("Menta", "4 sprigs"), InitDraftIngredient("Azúcar", "0.5 cl"), InitDraftIngredient("Agua", "1 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Tommy's Margarita", "", "tommysmargaritalarge.jpg", "Old Fashioned", "All Day Cocktail", "Rodaja de lima", "Agitar ingredientes con hielo. Colar en un vaso con hielos nuevos.", listOf(InitDraftIngredient("Tequila", "4.5 cl"), InitDraftIngredient("Lima", "1.5 cl"), InitDraftIngredient("Sirope de Agave", "1 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Paradise", "", "paradiselarge.jpg", "Cóctel", "All Day Cocktail", "Rodaja de naranja", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ginebra", "3.5 cl"), InitDraftIngredient("Brandy de Albaricoque", "2 cl"), InitDraftIngredient("Naranja (Jugo)", "1.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Dirty Martini", "", "dirtymartinilarge.jpg", "Cóctel", "Before Dinner Cocktail", "Aceitunas", "Revolver ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Vodka", "6 cl"), InitDraftIngredient("Vermú (Seco)", "1 cl"), InitDraftIngredient("Aceituna (Jugo)", "0.1 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Mary Pickford", "", "marypickfordlarge.jpg", "Cóctel", "All Day Cocktail", "Cerezas", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ron (Blanco)", "4.5 cl"), InitDraftIngredient("Licor de Cereza", "0.75 cl"), InitDraftIngredient("Jugo de Piña", "4.5 cl"), InitDraftIngredient("Granadina", "0.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Hemingway Special", "", "hemingwayspeciallarge.jpg", "Cóctel", "All Day Cocktail", "Cereza", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ron (Blanco)", "6 cl"), InitDraftIngredient("Toronja (Jugo)", "4 cl"), InitDraftIngredient("Licor de Cereza", "1.5 cl"), InitDraftIngredient("Lima", "1.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Dark 'n' Stormy", "", "darknstormylarge.jpg", "Highball", "Longdrink", "Rodaja de lima", "Elaborar en un vaso con hielo. Revolver suavemente.", listOf(InitDraftIngredient("Ron (Oscuro)", "6 cl"), InitDraftIngredient("Cerveza de Jengibre", "10 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Ramos Fizz", "", "ramosfizzlarge.jpg", "Highball", "Longdrink", "Polvo con nuez moscada rallada", "Agitar ingredientes durante 20 segundos, excepto el agua mineral. Vertir en el vaso y enfriar en el congelador durante 10 minutos. Vertir agua mineral, apuntando al centro de la espuma para que esta salga por encima del borde del vaso.", listOf(InitDraftIngredient("Ginebra", "4.5 cl"), InitDraftIngredient("Lima", "1.5 cl"), InitDraftIngredient("Limón", "1.5 cl"), InitDraftIngredient("Sirope", "3 cl"), InitDraftIngredient("Crema", "6 cl"), InitDraftIngredient("Huevo", "1 clara"), InitDraftIngredient("Agua de Azahar", "0.3 cl"), InitDraftIngredient("Extracto de Vainilla", "2 gotas"), InitDraftIngredient("Agua Mineral", "")) ),
        InitDraftDrink( "Russian Spring Punch", "", "russianspringpunchlarge.jpg", "Highball", "Sparkling Cocktail", "Rodaja de limón y bayas de temporada", "Agitar ingredientes con hielo, excepto el vino. Colar en vaso con hielos nuevos. Completar con el vino", listOf(InitDraftIngredient("Vodka", "2.5 cl"), InitDraftIngredient("Limón", "2.5 cl"), InitDraftIngredient("Licor Créme", "1.5 cl"), InitDraftIngredient("Sirope", "1 cl"), InitDraftIngredient("Vino (Prosecco)", "6 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Cosmopolitan", "", "cosmopolitanlarge.jpg", "Cóctel", "All Day Cocktail", "Rodaja de lima", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Vodka", "4 cl"), InitDraftIngredient("Triple Sec", "1.5 cl"), InitDraftIngredient("Lima", "1.5 cl"), InitDraftIngredient("Arándano (Jugo)", "3 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Dry Martini", "", "drymartinilarge.jpg", "Cóctel", "Before Dinner Cocktail", "Aceituna y twist de limón", "Revolver ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ginebra", "6 cl"), InitDraftIngredient("Vermú (Seco)", "1 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Between the Sheets", "", "betweenthesheetslarge.jpg", "Cóctel", "All Day Cocktail", "Twist de limón", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ron (Blanco)", "3 cl"), InitDraftIngredient("Coñac", "3 cl"), InitDraftIngredient("Triple Sec", "3 cl"), InitDraftIngredient("Limón", "2 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Aunt Roberta", "", "auntrobertalarge.jpg", "Old Fashioned", "Longdrink", "Moras o arándanos", "Elaborar en un vaso con hielo. Revolver suavemente.", listOf(InitDraftIngredient("Vodka", "4.5 cl"), InitDraftIngredient("Absenta", "3 cl"), InitDraftIngredient("Ron (Dorado)", "1.5 cl"), InitDraftIngredient("Brandy", "1.5 cl"), InitDraftIngredient("Ginebra", "2.5 cl"), InitDraftIngredient("Licor de Mora", "1.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Michelada", "", "micheladalarge.jpg", "Pint", "All Day Cocktail", "Rodajas de lima y apio. Escarchar vaso con chile en polvo.", "Elaborar en un vaso con hielo. Revolver suavemente.", listOf(InitDraftIngredient("Beer", "1 lata"), InitDraftIngredient("Salsa Inglesa", "0.1 cl"), InitDraftIngredient("Salsa Maggi", "0.1 cl"), InitDraftIngredient("Jugo de Tomate", "12 cl"), InitDraftIngredient("Lima", "1.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Chelada", "", "cheladalarge.jpg", "Pint", "All Day Cocktail", "Rodajas de lima. Escarchar vaso con chile en polvo.", "Elaborar en un vaso con hielo. Revolver suavemente.", listOf(InitDraftIngredient("Lima", "3 cl"), InitDraftIngredient("Beer", "1 lata"), InitDraftIngredient("Sal", "0.4 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Ranch Water", "", "ranchwaterlarge.jpg", "Highball", "All Day Cocktail", "Rodajas de lima", "Elaborar en un vaso con hielo. Revolver suavemente.", listOf(InitDraftIngredient("Tequila", "4.5 cl"), InitDraftIngredient("Lima", "1.5 cl"), InitDraftIngredient("Agua Mineral", "12 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Casino", "", "casinolarge.jpg", "Cóctel", "All Day Cocktail", "Twist de limón y cereza", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ginebra", "4 cl"), InitDraftIngredient("Licor de Cereza", "1 cl"), InitDraftIngredient("Amargos de Naranja", "0.2 cl"), InitDraftIngredient("Limón", "1 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Caipirinha", "", "caipirinhalarge.jpg", "Old Fashioned", "All Day Cocktail", "Rodajas de lima y hojas de menta", "Cortar la lima en gajos y machacar con azúcar. Agitar todos los ingredientes con hielo durante 10 segundos. Vertir en un vaso frío.", listOf(InitDraftIngredient("Cachaca", "5 cl"), InitDraftIngredient("Azúcar", "1 cl"), InitDraftIngredient("Lima", "1 completa"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Paloma", "", "palomalarge.jpg", "Old Fashioned", "All Day Cocktail", "Lima, rodajas de toronja y ramita de romero. Escarchar vaso con sal.", "Elaborar en un vaso con hielo. Revolver suavemente.", listOf(InitDraftIngredient("Tequila", "6 cl"), InitDraftIngredient("Refresco de Toronja", "12 cl"), InitDraftIngredient("Lima", "1.5 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Vampiro", "", "vampirolarge.jpg", "Highball", "", "Rodaja de lima y chile verde o rojo.", "Agitar ingredientes con hielo. Colar en un vaso con hielos nuevos.", listOf(InitDraftIngredient("Tequila", "5 cl"), InitDraftIngredient("Jugo de Tomate", "7 cl"), InitDraftIngredient("Naranja (Jugo)", "3 cl"), InitDraftIngredient("Miel", "0.5 cl"), InitDraftIngredient("Lima", "1 cl"), InitDraftIngredient("Cebolla", "media corte fino"), InitDraftIngredient("Chile de Arbol", "unas rodajas"), InitDraftIngredient("Salsa Inglesa", "0.1 cl"), InitDraftIngredient("Sal", ""), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Kamikaze", "", "kamikazelarge.jpg", "Cóctel", "All Day Cocktail", "Ruedas de lima", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Vodka", "3 cl"), InitDraftIngredient("Triple Sec", "3 cl"), InitDraftIngredient("Lima", "3 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "White Lady", "", "whiteladylarge.jpg", "Cóctel", "All Day Cocktail", "Twist de limón", "Agitar ingredientes con hielo. Colar en un vaso frío.", listOf(InitDraftIngredient("Ginebra", "4 cl"), InitDraftIngredient("Triple Sec", "3 cl"), InitDraftIngredient("Limón", "2 cl"), InitDraftIngredient("Hielo", "")) ),
        InitDraftDrink( "Harvey Wallbanger", "", "harveywallbangerlarge.jpg", "Highball", "All Day Cocktail", "Rodaja de naranja y cereza", "Elaborar en un vaso con hielo. Revolver suavemente.", listOf(InitDraftIngredient("Vodka", "4.5 cl"), InitDraftIngredient("Galliano", "1.5 cl"), InitDraftIngredient("Naranja (Jugo)", "9 cl"), InitDraftIngredient("Hielo", "")) )
    )
}

private fun  transformDrinks(initDraftDrink: InitDraftDrink, drinksService: DrinksService) {
    val draftDrink = DraftDrink(
        initDraftDrink.name,
        initDraftDrink.description,
        "https://www.drinko.io/images/drinks/large/${initDraftDrink.image}",
        initDraftDrink.glass,
        initDraftDrink.category,
        initDraftDrink.ingredients.map { Ingredient(it.amount, drinksService.getElementByName(it.name)) }.toMutableList(),
        initDraftDrink.garnish,
        initDraftDrink.preparation
    )
    drinksService.addDrink(draftDrink)
}

private fun addUsers(drinksService: DrinksService) {
    val users = listOf(
        DraftUser("juan", "juan", "https://robohash.org/facilisnobisdignissimos.png?size=50x50&set=set1"),
        DraftUser("a", "a", "https://robohash.org/uttemporibusrerum.png?size=50x50&set=set1"),
        DraftUser("b", "b", "https://robohash.org/corruptimaximetotam.png?size=50x50&set=set1"),
        DraftUser("c", "c", "https://robohash.org/quidempariaturquaerat.png?size=50x50&set=set1"),
    )

    users.forEach { drinksService.addUser(it) }

}
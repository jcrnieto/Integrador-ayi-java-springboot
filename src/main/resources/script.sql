--SQLScript

--Dietas
INSERT INTO `integrador_ayi`.`diets`(`id_diets`, `type_of_diet`) VALUES
    (1, "vegetariana" ),
    (2, "vegana" ),
    (3, "libre de gluten"),
    (4, "libre de lacteos" ),
    (5, "paleolítica" ),
    (6, "primitiva" );




--Recetas
INSERT INTO`integrador_ayi`.`recipes`(`id_recipes`,`description`,`image`,`score`, `title`, `calories`)VALUES--is_activeattributeis"true"bydefault
(1,'"La coliflor, el arroz integral y el arroz frito con verduras pueden ser una buena receta para ampliar tu caja de recetas de guarniciones. ¿Estás cuidando tu figura? Esta receta sin gluten, sin lácteos, lacto ovo vegetariana y vegana tiene calorías 7 g de proteína y 6 g de grasa por porción. Por $1.12 por porción, esta receta cubre el 19 % de tus requerimientos diarios de vitaminas y minerales. Esta receta sirve para 8 personas. Esta receta es típica de la cocina china. Desde la preparación hasta el plato, esta receta toma alrededor de 30 minutos . En general, esta receta obtiene una puntuación asombrosa del 100 %.','https://spoonacular.com/recipeImages/716426-312x231.jpg','10',"Arroz Frito De Coliflor, Arroz Integral Y Vegetales"),
(2,'La receta Papas fritas caseras con ajo y albahaca está lista en aproximadamente 45 minutos y definitivamente es una opción súper  para los amantes de la comida americana. Una ración contiene 596 calorías,18 g de proteína y 15 g de grasa. Por 83 centavos por porción, obtienes una guarnición que sirve para 2 personas. Varias personas prepararon esta receta, y 1669 diría que dio en el clavo. Si tiene a mano sal de ajo, harina, ajo en polvo y algunos otros ingredientes, puede hacerlo. A fin de cuentas, decidimos que esta receta merece una puntuación espectacular del 100 %.','https://spoonacular.com/recipeImages/715594-312x231.jpg','8',"Papas fritas caseras con ajo y albahaca"),
(3,'Si tienes alrededor de 5 minutos para pasar en la cocina, el Batido de desayuno de plátano y bayas podría ser una excelente receta lacto ovo vegetariana para probar. Esta receta hace 1 raciones con 501 calorías, 21 g de proteína y 11 g de grasa cada una. Por $2.19 por porción, esta receta cubre el 32% de tus requerimientos diarios de vitaminas y minerales. 688 personas encontraron esta receta sabrosa y satisfactoria. Dirígete a la tienda y compra galletas integrales, leche de soya, plátano y algunas otras cosas para prepararlo hoy. Funciona bien como comida de la mañana. En general, esta receta obtiene una puntuación súper cucharita del 100 %.','https://spoonacular.com/recipeImages/715497-312x231.jpg','80',"Batido de desayuno de plátano y bayas"),
(4,'Col rizada con ajo podría ser la guarnición que está buscando. Esta receta cavernícola, sin gluten, primaria y entera 30 sirve 2 y cuesta 69 centavos por porción. Una ración contiene 179 calorías, 3 g de proteína y 15 g de grasa. Algunas personas hicieron esta receta, y 17 dirían que dio en el clavo. Si tiene aceite de oliva, ajo, col rizada y algunos otros ingredientes a mano, puede hacerlo. Desde la preparación hasta el plato, esta receta tarda unos 45 minutos. A fin de cuentas, decidimos que esta receta merece una puntuación espectacular del 99 %.','https://spoonacular.com/recipeImages/644387-312x231.jpg','70',"Col rizada con ajo"),
(5,'¿Necesitas un plato principal sin gluten y sin lácteos? El estofado de maní con pollo africano podría ser una gran receta para probar. Esta receta rinde 1 raciones con 800 calorías, 75 g de proteína y 102 g de grasa cada una. Por $3.87 por porción, esta receta cubre el 62% de tus requerimientos diarios de vitaminas y minerales. Se puede disfrutar en cualquier época, pero es especialmente buena para otoño. Desde la preparación hasta el plato, esta receta tarda aproximadamente 45 minutos. 124 personas han probado y les ha gustado esta receta.','https://spoonacular.com/recipeImages/716268-312x231.jpg','70','Estofado Africano De Pollo Y Maní'),
(6,'El estofado de caracol nigeriano podría ser el plato principal que está buscando. Por $9.0 por porción, esta receta cubre el 45% de tus requerimientos diarios de vitaminas y minerales. Esta receta rinde 1 raciones con 363 calorías, 23 g de proteína y 5 g de grasa cada una. Mucha gente hizo esta receta, y 361 diría que dio en el clavo. Si tiene a mano chile en polvo, caracoles, limas y algunos otros ingredientes, puede prepararlo.  Se puede disfrutar en cualquier época, pero es especialmente buena para otoño. Es una buena opción si estás siguiendo una dieta sin gluten, sin lácteos . A fin de cuentas, decidimos que esta receta <b>merece una puntuación espectacular del 70 %.','https://spoonacular.com/recipeImages/716381-312x231.jpg','80','Estofado de caracol nigeriano'),
(7,' Jambalaya de frijol rojo podría ser justo la receta criolla que está buscando. Una ración contiene 538 calorías, 21 g de proteína y 8 g de grasa. Por $1.69 por porción, esta receta cubre el 34% de tus requerimientos diarios de vitaminas y minerales. . A algunas personas realmente les gustó este plato principal. Dirígete a la tienda y compra arroz integral, caldo de verduras, humo líquido y algunas otras cosas para prepararlo hoy.','https://spoonacular.com/recipeImages/782601-312x231.jpg','90','Jambalaya de frijol rojo'),
(8,'¿Necesitas un plato principal sin gluten y vegano? La ensalada de arroz con brócoli y garbanzos podría ser una receta espectacular para probar. Una ración contiene 524 calorías, 19 g de proteína y 12 g de grasa. Por $1.38 por porción, esta receta cubre el 36% de tus requerimientos diarios de vitaminas y minerales. Dirígete a la tienda y compra almendras, aceite de oliva, 2 cucharadas de jugo de piña (jugo de piña enlatada) y algunas otras cosas para prepararlo hoy. 42 personas han hecho esta receta y la volverían a hacer. Desde la preparación hasta el plato, esta receta tarda aproximadamente 45 minutos. A fin de cuentas, decidimos que esta receta merece una puntuación espectacular del 80 %.','https://spoonacular.com/recipeImages/794349-312x231.jpg','60','Ensalada de arroz con brócoli y garbanzos'),
(9,'Si desea agregar más recetas sin gluten y sin lácteos a su caja de recetas, el estofado de res en olla de cocción lenta podría ser una receta que debería probar. Una porción de este plato contiene aproximadamente 52 g de proteína, 16 g de grasa y un total de 528 calorías. Esta receta sirve 6. Por $2.94 por porción, esta receta cubre el 45% de tus requerimientos diarios de vitaminas y minerales. 58 personas encontraron esta receta deliciosa y satisfactoria. Funciona bien como plato principal a un precio razonable para el invierno. Una mezcla de caldo de res enlatado, zanahorias, cebollas verdes y un puñado de otros ingredientes es todo lo que se necesita para hacer que esta receta sea tan deliciosa. Desde la preparación hasta el plato, esta receta tarda unas 8 horas y 10 minutos.  A fin de cuentas, decidimos que esta receta merece una puntuación espectacular del 99 %.','https://spoonacular.com/recipeImages/715446-312x231.jpg','70',"estofado de ternera de cocción lenta"),
(10,'¿Necesitas un plato principal sin gluten y sin lácteos? La sopa de lentejas rojas con pollo y nabos podría ser una excelente receta para probar. Por $2.8 por porción, esta receta cubre el 37% de tus requerimientos diarios de vitaminas y minerales. Una ración contiene 448 calorías, 23 g de proteína y 20 g de grasa. Dirígete a la tienda y compra ajo, aceite de oliva, tallos de apio y algunas otras cosas para prepararlo hoy. Es perfecto para Otoño. Desde la preparación hasta el plato, esta receta tarda unos 55 minutos. Mucha gente hizo esta receta, y 1866 diría que dio en el clavo. A fin de cuentas, decidimos que esta receta merece una puntuación espectacular del 99 %.','https://spoonacular.com/recipeImages/715415-312x231.jpg','80',"Sopa de Lentejas Rojas con Pollo y Nabos");
(11,'La receta Hummus y Zaatar está lista en unos 45 minutos y es sin duda una excelente opción sin gluten y vegan para los amantes de la comida del medio oriente. Por $1.61 por porción, obtienes una marinada para 4 porciones. Una porción contiene 778 calorías, 34 g de proteína y 31 g de grasa. Si tiene sal marina, ajo, jugo de limón y algunos otros ingredientes a mano, puede prepararlo. A fin de cuentas, decidimos que esta receta merece una puntuación espectacular del 99 %.','https://spoonacular.com/recipeImages/766453-312x231.jpg','70',"Hummus y Za'atar");
(12,'¿Necesitas un plato principal sin gluten y vegano? Arroz y frijoles caseros podría ser una gran receta para probar. Una ración contiene 446 calorías, 19 g de proteína y 4 g de grasa. Por $1.06 por porción, esta receta cubre el 26% de tus requerimientos diarios de vitaminas y minerales. 471 personas han hecho esta receta y la volverían a hacer. Una mezcla de aceite de oliva, pimienta molida, cebolla y un puñado de otros ingredientes es todo lo que se necesita para hacer que esta receta sea tan deliciosa. Desde la preparación hasta el plato, esta receta tarda aproximadamente 35 minutos. A fin de cuentas, decidimos que esta receta merece una puntuación espectacular del 99 %.','https://spoonacular.com/recipeImages/716627-312x231.jpg','70',"Arroz y Frijoles Caseros");
(13,'Nunca puede tener demasiadas recetas de platos principales, así que pruebe Pescado al horno al estilo griego: fresco, simple y delicioso. Por $3.04 por porción, esta receta cubre el 21% de tus requerimientos diarios de vitaminas y minerales. Esta receta rinde para 4 raciones con 345 calorías, 28 g de proteína y 2 g de grasa cada una. Esta receta es del agrado de 396 amantes de la comida y cocineros. Dirígete a la tienda y compra sal y pimienta, pimienta, vino y algunas otras cosas para prepararlo hoy. Desde la preparación hasta el plato, esta receta tarda unos 30 minutos. Es una buena opción si estás siguiendo una dieta sin gluten y pescetariana. A fin de cuentas, decidimos que esta receta merece una puntuación extraordinaria del 96 %.','https://spoonacular.com/recipeImages/716408-312x231.jpg','80',"Pescado al horno al estilo griego: fresco, simple y delicioso");
(14,'Fajita de pollo con pimientos rellenos podría ser la receta mexicana que estás buscando. Una ración contiene 561 calorías, 36 g de proteína y 24 g de grasa. Por $2.96 por porción, esta receta cubre el 41% de tus requerimientos diarios de vitaminas y minerales. 159 personas han probado y les ha gustado esta receta. Funciona mejor como plato principal y se hace en aproximadamente 45 minutos. Dirígete a la tienda y compra aguacate mediano/grande, queso, chile en polvo y algunas otras cosas para prepararlo hoy. Es una buena opción si estás siguiendo una dieta sin gluten. A fin de cuentas, decidimos que esta receta merece una puntuación espectacular del 98 %.','https://spoonacular.com/recipeImages/795751-312x231.jpg','60',"Fajita De Pollo Pimiento Morrón Relleno");
(15,'La guarnición crujiente de coles de Bruselas podría ser justo la guarnición que está buscando. Esta receta rinde para 4 porciones con 232 calorías, 8 g de proteína y 16 g de grasa cada una. Por $1.69 por porción, esta receta cubre el 22% de tus requerimientos diarios de vitaminas y minerales. 26 personas han probado y les ha gustado esta receta. Si tiene a mano pimienta, vinagre de vino, mostaza dijon y algunos otros ingredientes, puede prepararlo. Desde la preparación hasta el plato, esta receta tarda unos 30 minutos. Es una buena opción si estás siguiendo una dieta cavernícola, sin gluten, sin lácteos y primaria. A fin de cuentas, decidimos que esta receta merece una puntuación espectacular del 99 %.','https://spoonacular.com/recipeImages/640941-312x231.jpg','70',"Acompañamiento Crujiente De Coles De Bruselas");


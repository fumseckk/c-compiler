# Difficultés rencontrées
Il est très difficile de s'approprier un langage entier, accompagné de 2 outils (ANTLR/gradle), et un IDE en supplément. Ça a créé un gros overhead dans l'apprentissage, nous aurions aimé une/des séances introductives qui rende la chose plus accessible et qui nous permette d'aborder le projet avec sérénité.

# Implémentation
Un des choix d'implémentation est dans la boucle `for`, où 2 règles de grammaires spéciales ont été créées pour l'assignation/définition de variable en initialisation de boucle. Ceci sera refactorisé plus tard: la création deux cas de figures à traiter dans le reste du code est peu agréable et rajoute du travail.

Un autre choix d'implémentation est la structure des `SymbolTable`. Une `SymbolTable` est une liste de `SymbolTableLevel`, et chacun de ces niveaux garde son parent en mémoire. Ceci permettra par la suite de traiter des `SymbolTable` qui sont déjà sorties du scope actuel de traitement, autrement dit, de conserver l'arbre des scopes entier.

L'implémentation du visiteur de la table des symboles a été faite dans `src/java/frontend/SymbolTableChecker`, et une suite de tests a été réalisée dans `test/java/compiler/testSymbol`.
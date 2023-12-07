# SrpingBoot
TD SPRING BOOT

## TD 1 - adapté 

1. Instancier un projet basé sur le starter kit minimal.

2. Définir :
    >
    > Les interfaces Guerrier, Magicien, Vagabond.
    >
    > 3 classes implémentant ces interfaces : Barbare, Prêtre, Elfe (Barbare et Prêtre doivent être des composants Spring détectés par annotation) ● Ces 3 classes doivent avoir une méthode toString().
    >
    > 1 classe de configuration qui déclare le bean Elfe.
    >
    > 1 classe HeroicFantasy qui a 3 attributs de type Guerrier, Magicien, Vagabond dans lesquels on va injecter les classes d’implémentation de ces interfaces ● Cette classe doit avoir un méthode toString().
    >
    > 1 ApplicationRunner lancé au démarrage de l’application qui utilise le bean HeroicFantasy (injecté via Autowiring) et appelle sa méthode toString().

## TD 2 - adapté 

1. Instancier un projet basé sur les starter kit web, test et datajpa, et sur la base de données H2.
2. Charger dans le context :
    >
    > Un controller.
    >
    > Un service TeamService.
    >
    > Un repository TeamRepository basé sur JPA (pour une entité Team).
    >
3. Implémenter des TU pour les couches service (et controller, optionnel).
# README

## Structuration du projet
Le project est structure suivant l'organisation suivant :

    /design_patterns_project/
        /patterns/
            /nom_pattern/
                /abstract_
                /concrete
                /interface_
                Client.java

Le repertoire `/nom_pattern/` représente le nom du pattern implémenté.

A l'intérieur on a les repertoires suivants:
- `/abstract_/` qui contient les classes abstraites définies dans le pattern.

- `/interface_/` qui contient les interfaces utilisées dans le pattern.

- `/concrete/` qui contient les classes concretes du pattern.

- `Client.java` qui est la classe implémentant un exemple d'utilisation du pattern.


## Exécution

### Lancement de chaque pattern

Pour tester chaque pattern, il suffit d'ouvrir le repertoire `/patterns/nom_pattern/` dans le terminal et exécuter les commandes suivantes :

```
    javac Client.java
```
```
    java Client
```

### Lancement de l'application

Pour lancer l'application, il suffit d'ouvrir le repertoire  `/design_patterns_project/` dans le terminal et éxecuter les commandes suivantes : 

```
    javac App.java
```
```
    java App
```
    
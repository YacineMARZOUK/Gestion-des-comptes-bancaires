BanqueApp - Application de Gestion de Comptes Bancaires (Java 8)
📌 Description du projet
BanqueApp est une application console développée en Java 8 permettant de gérer des comptes bancaires et leurs opérations de manière simple et efficace.
Elle permet de :

Créer des comptes bancaires (courant ou épargne)
Effectuer des versements et retraits
Réaliser des virements entre comptes
Consulter le solde et l’historique des opérations
Appliquer les règles métier (découvert, calcul des intérêts, validation des montants...)
Ce projet a été conçu dans le cadre d’un exercice pédagogique pour mettre en pratique les concepts de :

Programmation orientée objet (POO)
Architecture en couches
Gestion des exceptions
Utilisation des collections (ArrayList, HashMap)
Manipulation des dates avec Java Time API
🛠️ Technologies utilisées
Langage : Java 8
Paradigme : Programmation Orientée Objet (POO)
Collections : ArrayList, HashMap
Gestion des dates : java.time
Gestion de version : Git
Outils :
IDE recommandé : IntelliJ IDEA / Eclipse
Ligne de commande : javac, java, jar
📊 Diagramme de classe
Le diagramme de classe a été conçu avec diagrams.net (Draw.io).

🏗️ Structure du projet
L’application est organisée en plusieurs couches pour respecter les bonnes pratiques d’architecture logicielle 

---

## ✅ Fonctionnalités détaillées
- **Créer un compte**  
  - Génération automatique d’un code (format `CPT-XXXXX`)  
  - Compte Courant avec découvert autorisé  
  - Compte Épargne avec taux d’intérêt configurable  

- **Effectuer des opérations**  
  - Versement (ajout d’argent)  
  - Retrait (avec règles métier)  
  - Virement entre comptes (réutilisation de versement + retrait)  

- **Consulter les informations**  
  - Solde actuel  
  - Historique complet des opérations avec date et type  

---

## 📋 Prérequis
- **Java Development Kit (JDK) 8**  
  Vérifier l’installation :
  ```bash
  java -version

![Diagramme de Classe](https://app.diagrams.net/?src=about)
![Jira](https://yacinemarzou7.atlassian.net/jira/software/projects/CRM/boards/1)

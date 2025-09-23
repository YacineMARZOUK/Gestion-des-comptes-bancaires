# 💳 Gestion des Comptes Bancaires

## 📌 Description du projet
Ce projet consiste à développer une **application console en Java 8** permettant d’automatiser la gestion des comptes bancaires.  
L'application permet de créer des comptes (courants ou épargnes), d'effectuer des opérations (versements, retraits, virements) et de consulter l'historique des transactions.  
Elle est conçue selon une **architecture en couches** pour garantir une bonne séparation des responsabilités et un code maintenable.

---

## 🛠️ Technologies utilisées
- **Java 8** (obligatoire)
- **Collections Framework** : `ArrayList`, `HashMap` pour le stockage en mémoire
- **Java Time API** : gestion des dates (`LocalDateTime`)
- **Git & GitHub** : contrôle de version
- **Jira** : gestion des tâches
- **UML** : diagramme de classes

---

## 🏗️ Structure du projet
L'application est organisée en plusieurs couches pour respecter les bonnes pratiques d'architecture logicielle :
src/
├── main/
│ └── Main.java # Point d'entrée de l'application
│
├── metier/ # Couche métier (logique métier)
│ ├── Compte.java # Classe abstraite (code, solde, listeOperations)
│ ├── CompteCourant.java # Hérite de Compte (ajoute découvert, règle retrait)
│ ├── CompteEpargne.java # Hérite de Compte (ajoute tauxInteret)
│ ├── Operation.java # Classe abstraite (numero, date, montant)
│ ├── Retrait.java # Hérite d'Operation (destination)
│ └── Versement.java # Hérite d'Operation (source)
│
├── service/ # Couche service
│ └── CompteService.java # Gère la logique métier : création de compte, opérations, virement
│
└── ui/ # Couche présentation (console)
└── BanqueUI.java # Gère les menus et les interactions utilisateur
---

## 🔑 Fonctionnalités
- Créer un **Compte Courant** ou un **Compte Épargne**
- Effectuer un **versement** (avec source)
- Effectuer un **retrait** (avec contrôle de solde et découvert)
- Effectuer un **virement** entre comptes
- Afficher le **solde** d’un compte
- Consulter la **liste des opérations**

---
## 📋 Prérequis
- **JDK 8** installé
- Terminal ou IDE (Eclipse recommandé)
- Git installé (pour cloner le projet)

---

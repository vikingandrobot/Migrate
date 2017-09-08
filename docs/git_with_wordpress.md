# Résumé

## Lien
https://premium.wpmudev.org/blog/git-for-wordpress-development/
	
## Date 
2017.09.08
	
## Informations:
- Stocker la version officielle du site sur un repo privé (Bitbucket ou Github)
- On utilise une connexion SSH pour cloner le repo du site sur le serveur
de production. On peut faire des changement push ou pull. 
- L'environnement de développement est en local sur la machine du développeur.
- Il faut utiliser des outils supplémentaires pour gérer la base de données et s'assurer qu'elle soit à jour entre les différents environnements.

	
## Problèmes intrinsèques:
- Comment gérer le fichier wp-config.php puisque la configuration change entre l'environnement de développement et l'environnement de production.
- Comment gérer les ficheirs médias ? Faut-il les intégrer au versionning régulièrement ?
- Est-ce que cela a un sens d'inclure le coeur de Wordpress au versionning ? Ou devrait-on se limiter aux plugins, thèmes, etc.
- Comment garder la DB à jour entre l'environnement de développement et  l'environnement de production ? 


# La façon de Josh Pollock
## Lien
https://premium.wpmudev.org/blog/improve-wordpress-development-workflow-local-server/

## Date
2017.09.08

## Informations
- Pour le développement en local, il conseille d'utiliser Vagrant. Cela permet de gérer des machines virtuelles pour créer ses environnements de développement. MAMP suffit sans doute dans un premier temps. 
- Utiliser Bitbucket pour gérer le repo privé.
- WP Migrate DB Pro pour exporter la DB
- Un Hosting Provider qui permet d'utiliser SSH et git en production.
- Il conseille Beanstalk pour gérer le déploiement d'un repo vers plusieurs hôtes. (https://beanstalkapp.com/).
- Ne pas mettre le fichier wp-config.php dans git (mais un répertoire au-dessus sur le serveur de production). Pas obligatoire si on utilise un bon gitignore.
- Ensuite cloner le repo Bitbucket sur le serveur.


# La façon de Steve Grunwell
## Lien
https://stevegrunwell.com/blog/keeping-wordpress-under-version-control-with-git/

## Date
2017.09.08

## Informations
- Il conseille de ne pas versionner le coeur de Wordpress. Plutôt utiliser des manager de dépendances comme Composer.
- Il fournit un exemple de .gitignore qu'on peut utiliser.
- Ne pas inclure les médias dans le versionning
- Il propose un lien pour charger les images directement depuis internet.
- Garder wp-config en dehors du repo.

# Ce que Migrate peut apporter

- Gérer les fichiers de configuration (wp-config.php, .htaccess, ...) sur les différents environnements. 
- Gérer la synchronisation de la base de données entre chaque mouvement production -> développement / développement -> production.
- Offrir des outils pour automatiser des actions à chaque mise en production / récupération dans l'environnement de développement.
- Effectuer les actions de mise en production via git automatiquement.















-- Initialisation des tables
INSERT INTO Employe(matricule, nom, email, type_employe) VALUES
    (1, 'Rémi Bastide', 'Remi.Bastide@univ-jfc.fr', 'technique'), -- Les clés sont auto-générées
    (2, 'Elyes Lamine', 'Elyes.Lamine@univ-jfc.fr', 'administratif'),
    (3, 'Jean-Marie Pécatte', 'United States of America', 'commercial');
-- On peut fixer les clés auto-générées, mais il faut ensuite
-- réinitialiser le compteur de clé auto-générée
-- Attention : la syntaxe est différente selon le SGBD utilisé
-- Ici la syntaxe pour le SGBD H2
ALTER TABLE Employe ALTER COLUMN matricule RESTART WITH 4;

-- Exemples de données pour l'entité Projet
INSERT INTO Projet (code, nom, debut, fin) VALUES (1, 'Projet 1', '2024-01-01', '2024-12-31');
INSERT INTO Projet (code, nom, debut, fin) VALUES (2, 'Projet 2', '2024-02-01', '2024-10-31');


INSERT INTO Participation (role, pourcentage) VALUES ('Chef de projet', 50);
INSERT INTO Participation (role, pourcentage) VALUES ('Responsable administratif', 30);

INSERT INTO Participation_Employe (employe_matricule, participation_id) VALUES (1, 2);
INSERT INTO Participation_Employe (employe_matricule, participation_id) VALUES (2, 1);

INSERT INTO Participation_Projet (participation_id, projet_id) VALUES (2, 2);
INSERT INTO Participation_Projet (participation_id, projet_id) VALUES (1, 2);
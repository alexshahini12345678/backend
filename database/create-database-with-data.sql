-- Entferne den Benutzer für 'localhost'
DROP USER IF EXISTS 'db_todo_list'@'localhost';

-- Erstelle den Benutzer für '%' erneut, falls er nicht mehr existiert
CREATE USER 'db_todo_list'@'%' IDENTIFIED BY 'Alex2007';

-- Stelle sicher, dass der Benutzer für '%' Zugriff auf die Datenbank hat
GRANT ALL PRIVILEGES ON db_todo_list.* TO 'db_todo_list'@'%';

-- Aktualisiere die Berechtigungen
FLUSH PRIVILEGES;

-- Zeige Berechtigungen, um sicherzustellen, dass alles korrekt ist
SHOW GRANTS FOR 'db_todo_list'@'%';

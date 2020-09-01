--
-- User java
--
DROP USEr java@localhost;
create user 'java'@'localhost' identified by 'himitsu';
GRANT SELECT, INSERT, UPDATE, DELETE ON `java`.* TO 'java'@'localhost';
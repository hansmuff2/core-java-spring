USE `arrowhead`;

GRANT ALL PRIVILEGES ON `arrowhead`.`orchestrator_store` TO 'orchestrator'@'localhost';
GRANT ALL PRIVILEGES ON `arrowhead`.`foreign_system` TO 'orchestrator'@'localhost';
GRANT ALL PRIVILEGES ON `arrowhead`.`system_` TO 'orchestrator'@'localhost';
GRANT ALL PRIVILEGES ON `arrowhead`.`cloud` TO 'orchestrator'@'localhost';
GRANT ALL PRIVILEGES ON `arrowhead`.`service_definition` TO 'orchestrator'@'localhost';
GRANT ALL PRIVILEGES ON `arrowhead`.`service_interface` TO 'orchestrator'@'localhost';
GRANT ALL PRIVILEGES ON `arrowhead`.`logs` TO 'orchestrator'@'localhost';

GRANT ALL PRIVILEGES ON `arrowhead`.`orchestrator_store` TO 'orchestrator'@'%';
GRANT ALL PRIVILEGES ON `arrowhead`.`foreign_system` TO 'orchestrator'@'%';
GRANT ALL PRIVILEGES ON `arrowhead`.`system_` TO 'orchestrator'@'%';
GRANT ALL PRIVILEGES ON `arrowhead`.`cloud` TO 'orchestrator'@'%';
GRANT ALL PRIVILEGES ON `arrowhead`.`service_definition` TO 'orchestrator'@'%';
GRANT ALL PRIVILEGES ON `arrowhead`.`service_interface` TO 'orchestrator'@'%';
GRANT ALL PRIVILEGES ON `arrowhead`.`logs` TO 'orchestrator'@'%';

FLUSH PRIVILEGES;
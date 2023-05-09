INSERT INTO resource(id, name) VALUES(1, 'Proyector');
INSERT INTO resource(id, name) VALUES(2, 'Pizarra');
INSERT INTO resource(id, name) VALUES(3, 'Pantalla Televisor');
INSERT INTO resource(id, name) VALUES(4, 'Pantalla Monitor');
INSERT INTO resource(id, name) VALUES(5, 'Notebook');

INSERT INTO place(id,name) VALUES(1,'CoWorking');
INSERT INTO place(id,name) VALUES(2,'Auditorio');
INSERT INTO place(id,name) VALUES(3,'Laboratorio Electronica 1');
INSERT INTO place(id,name) VALUES(4,'Laboratorio Electronica 2');
INSERT INTO place(id,name) VALUES(5,'Laboratorio Sistemas 1');
INSERT INTO place(id,name) VALUES(6,'Laboratorio Sistemas 2');

INSERT INTO ROLE(id,name) VALUES(1,'Docente');
INSERT INTO ROLE(id,name) VALUES(2,'No docente');
INSERT INTO ROLE(id,name) VALUES(3,'Alumno');
INSERT INTO ROLE(id,name) VALUES(4,'Graduado');
INSERT INTO ROLE(id,name) VALUES(5,'Especialista');

INSERT INTO USERS(id,name,role_id) VALUES(1,'Matias Cassani',1);
INSERT INTO USERS(id,name,role_id) VALUES(2,'Eder Zoy',3);
INSERT INTO USERS(id,name,role_id) VALUES(3,'Mariel Cannas',2);
INSERT INTO USERS(id,name,role_id) VALUES(4,'Cristian Villafane',1);
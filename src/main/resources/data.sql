INSERT INTO user (email, password, name, last_name, active) VALUES ('user@example.com', 'password1', 'User1', 'One', 1);
INSERT INTO user (email, password, name, last_name, active) VALUES ('admin@example.com', '1', '1', 'User', 1);

INSERT INTO role (name) VALUES ('ROLE_USER');
INSERT INTO role (name) VALUES ('ROLE_ADMIN');

INSERT INTO user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO user_role (user_id, role_id) VALUES (2, 2);

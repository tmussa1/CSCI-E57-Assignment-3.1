
CREATE TABLE users_ta(
  user_name TEXT PRIMARY KEY NOT NULL,
  password TEXT NOT NULL,
  enabled BOOLEAN
);

CREATE TABLE user_roles_ta(
  role_id TEXT PRIMARY KEY NOT NULL,
  user_name TEXT NOT NULL,
  role TEXT NOT NULL
);

CREATE TABLE user_company_ta(
  user_name TEXT PRIMARY KEY NOT NULL,
  company_id TEXT NOT NULL
);

INSERT INTO users_ta(user_name,password,enabled) VALUES ('tofik.mussa','11559301', true);
INSERT INTO users_ta (user_name,password,enabled) VALUES ('risqua.mussa','11314321', true);

INSERT INTO user_roles_ta (role_id, user_name, role) VALUES ('ad31e981-d296-4c08-875b-c16ac876a099','tofik.mussa', 'ROLE_USER');
INSERT INTO user_roles_ta (role_id, user_name, role) VALUES ('e188b673-a67a-4993-b64d-ab00ec34c6a9', 'risqua.mussa', 'ROLE_ADMIN');
INSERT INTO user_roles_ta (role_id, user_name, role) VALUES ('94532643-6495-421b-935b-6f432f78efb5','risqua.mussa', 'ROLE_USER');

INSERT INTO user_company_ta (company_id, user_name) VALUES ('562f5ed0-b0bf-40cf-85c1-e560631057b8', 'tofik.mussa');
INSERT INTO user_company_ta (company_id, user_name) VALUES ('2f341f84-accd-43a6-abbc-70d41de2c9d3', 'risqua.mussa');

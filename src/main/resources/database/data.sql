
INSERT INTO project (name, description) VALUES ('training', 'some training description');
INSERT INTO project (name, description) VALUES ('surgut', 'some training description');

INSERT INTO employee (last_name, first_name, email, position, project_id) VALUES ('harley', 'alex', 'harley@gmail.com', 'angular-master', 1);
INSERT INTO employee (last_name, first_name, email, position, project_id) VALUES ('vadim', 'vadik', 'vadim@gmail.com', 'vue-master', 2);
INSERT INTO employee (last_name, first_name, email, position, project_id) VALUES ('ivanov', 'ivan', 'ivanov@gmail.com', 'react-master', 2);
INSERT INTO employee (last_name, first_name, email, position) VALUES ('apagasyan', 'ismailovich', 'apagasyan@gmail.com', 'insert-data-master');
INSERT INTO employee (last_name, first_name, email, position) VALUES ('strawberry', 'straw', 'strawberry@gmail.com', 'berry-master');
INSERT INTO employee (last_name, first_name, email, position) VALUES ('noname', 'nonamovich', 'noname@gmail.com', 'pyton-master');

INSERT INTO task (name, provided_time_in_hours, start_date, finish_date, status, employee_id, project_id)
VALUES ('Task', 500, '2017-09-01', '2017-10-01', 'NOT_STARTED', 1, 1);

INSERT INTO task (name, provided_time_in_hours, start_date, finish_date, status, employee_id, project_id)
VALUES ('Another Task', 300, '2017-09-01', '2017-10-01', 'POSTPONED', 2, 2);

INSERT INTO task (name, provided_time_in_hours, start_date, finish_date, status, employee_id, project_id)
VALUES ('Another one Task', 100, '2017-09-01', '2017-10-01', 'IN_PROGRESS', 2, 2);

INSERT INTO task (name, provided_time_in_hours, start_date, finish_date, status, employee_id, project_id)
VALUES ('Other Task', 200, '2017-09-01', '2017-10-01', 'COMPLETED', 3, 2);



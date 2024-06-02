insert into patient (patient_id,name, surname, phone, email, pesel) values (111 ,'Kellie','Merrell','3998283505','kmerrell0@phpbb.com','707-40-2081');
insert into patient (patient_id,name, surname, phone, email, pesel) values (112 ,'Haley','Bownas','5674152533','hbownas1@people.com','485-84-4712');
insert into patient (patient_id,name, surname, phone, email, pesel) values (113 ,'Shea','Benazet','3185319032','sbenazet2@tamu.edu','281-20-9078');
insert into patient (patient_id,name, surname, phone, email, pesel) values (114 ,'Rubia','Gensavage','8658126748','rgensavage3@smugmug.com','186-67-7985');
insert into patient (patient_id,name, surname, phone, email, pesel) values (115 ,'Aurel','Critzen','3358779301','acritzen4@forbes.com','640-67-4002');


insert into doctor(doctor_id, name, surname, phone, email, PWZ, specialization) values (111 , 'Templeton','McGilvray','1017167341','tmcgilvray0@taobao.com','5100143207614047','n/a');
insert into doctor(doctor_id, name, surname, phone, email, PWZ, specialization) values (112 , 'Chan','Bladen','2981970269','cbladen1@pagesperso-orange.fr','5100176031033943','Public Utilities');
insert into doctor(doctor_id, name, surname, phone, email, PWZ, specialization) values (113 , 'Rouvin','Marchington','2231792552','rmarchington2@uol.com.br','5100148518663781','n/a');
insert into doctor(doctor_id, name, surname, phone, email, PWZ, specialization) values (114 , 'Reese','McGillivray','7498832864','rmcgillivray3@posterous.com','5100171430276789','Consumer Services');
insert into doctor(doctor_id, name, surname, phone, email, PWZ, specialization) values (115 , 'Coletta','Olivas','3824493031','colivas4@sohu.com','5100170165974410','Health Care');

insert into available_date(available_date_id, doctor_id, date_time, available_date) values (111, 111, '2024-06-01 14:05:32', false);
insert into available_date(available_date_id, doctor_id, date_time, available_date) values (112, 112, '2023-08-19 20:13:03', false);
insert into available_date(available_date_id, doctor_id, date_time, available_date) values (113, 113, '2023-11-04 10:06:17', false);
insert into available_date(available_date_id, doctor_id, date_time, available_date) values (114, 114, '2024-05-24 10:29:34', false);
insert into available_date(available_date_id, doctor_id, date_time, available_date) values (115, 115, '2023-08-14 22:56:15', false);
insert into available_date(available_date_id, doctor_id, date_time, available_date) values (116, 111, '2024-02-19 13:49:58', false);
insert into available_date(available_date_id, doctor_id, date_time, available_date) values (117, 112, '2023-07-18 22:22:01', false);
insert into available_date(available_date_id, doctor_id, date_time, available_date) values (118, 113, '2024-05-24 01:28:50', true);
insert into available_date(available_date_id, doctor_id, date_time, available_date) values (119, 114, '2024-04-23 06:38:19', true);
insert into available_date(available_date_id, doctor_id, date_time, available_date) values (120, 115, '2023-06-10 14:25:31', true);

insert into visit(visit_id, available_date_id, patient_id, doctor_id) values (111, 111, 111, 111);
insert into visit(visit_id, available_date_id, patient_id, doctor_id) values (112, 112, 112, 112);
insert into visit(visit_id, available_date_id, patient_id, doctor_id) values (113, 113, 113, 113);
insert into visit(visit_id, available_date_id, patient_id, doctor_id) values (114, 114, 114, 114);
insert into visit(visit_id, available_date_id, patient_id, doctor_id) values (115, 115, 115, 115);
insert into visit(visit_id, available_date_id, patient_id, doctor_id) values (116, 116, 111, 111);
insert into visit(visit_id, available_date_id, patient_id, doctor_id) values (117, 117, 111, 112);

/*********************************************************************************/

rem Table - 01 (Classes)

create table classes(
class_id       varchar2(2)       primary key,
class_name     varchar2(20),
remarks        varchar2(500));

/********************************************************************************/

rem Table - 02 (Orders)

create table orders(
order_id      varchar2(6)        primary key,
class_id      varchar2(2)        references classes(class_id) on delete cascade,
order_name    varchar2(20),
remarks       varchar2(500));

/********************************************************************************/

rem Table - 03 (Family)

create table family(
family_id     varchar2(8)        primary key,
order_id      varchar2(6)        references orders(order_id) on delete cascade,
family_name   varchar2(20),
remarks       varchar2(500));

/********************************************************************************/

rem Table - 04 (Genus)

create table genus(
genus_id     varchar2(8)        primary key,
class_id     varchar2(2)        references classes(class_id) on delete cascade,
genus_name   varchar2(20),
remarks      varchar2(500));

/********************************************************************************/

rem Table - 05 (Species)

create table species(
species_id   varchar2(8)       primary key,
class_id     varchar2(2)       references classes(class_id) on delete cascade,
species_name varchar2(20),
remarks      varchar2(500));

/********************************************************************************/

rem Table - 06 (Zoo_Location_Master)

create table zoo_location_master(
loc_id      varchar2(6)       primary key,
loc_name    varchar2(20),
loc_site    varchar2(20),
loc_desc    varchar2(20));

/********************************************************************************/

rem Table - 07 (Animal_Master)

create table animal_master(
animal_id   varchar2(8)       primary key,
family_id   varchar2(8)       references family(family_id) on delete cascade,
species_id  varchar2(8)       references species(species_id) on delete cascade,
genus_id    varchar2(8)       references genus(genus_id) on delete cascade,
name        varchar2(25)      not null,
sc_name     varchar2(50),
d_o_birth   date,
p_o_birth   varchar2(30),
arrival     date,
c_name      varchar2(30),
p_name      varchar2(20),
range       varchar2(200),
distribution varchar2(200),
biology     varchar2(200),
gender      varchar2(1),
status      varchar2(50));

/********************************************************************************/

rem Table - 08 (Cage_Master)

create table cage_master(
cage_no     varchar2(10)      primary key,
loc_id      varchar2(6)       references zoo_location_master(loc_id) on delete cascade,
cage_size   number(10,2),
cage_type   varchar2(20),
d_o_const   date,
const_by    varchar2(30),
animal_id   varchar2(8)       references animal_master(animal_id) on delete cascade,
last_rep    date);

/********************************************************************************/

rem Table - 09 (Animal_Entry_Exit)

create table animal_entry_exit(
entry_no      varchar2(8)       primary key,
entry_type    varchar2(3),
entry_date    date,
reason        varchar2(100));

/********************************************************************************/

rem Table - 10 (Animal_Health_Reg)

create table animal_health_reg(
animal_id     varchar2(10)      references animal_master(animal_id) on delete cascade,
d_o_checking  date,
doc_ref       varchar2(25),
dis_detail    varchar2(30),
med_given     varchar2(30),
pre_state     varchar2(30));

/********************************************************************************/

rem Table - 11 (Zoo_emp)

create table zoo_emp(
emp_no       varchar2(8)     primary key,
e_name       varchar2(50)    not null,
e_desig      varchar2(30),
app_date     date,
cont_no      varchar2(15),
salary       number(7,2),
remarks      varchar2(50));

/********************************************************************************/

rem Table - 12 (job_assignment)

create table job_assignment(
emp_no       varchar2(8)     references zoo_emp(emp_no) on delete cascade,
cage_no      varchar2(10)    references cage_master(cage_no) on delete cascade,
job_assign   varchar2(50),
assign_date  date);

/********************************************************************************/

rem Table - 13 (Ticket_Booking)

create table ticket_booking(
ticket_no    varchar2(10)     primary key,
d_o_issue    date,
n_o_spec     number,
name         varchar2(50),
t_category   varchar2(20),
amount       number(10,2));

/********************************************************************************/

rem Table - 14 (Zoo_Notice)

create table zoo_notice(
not_no     varchar2(15)         primary key,
not_date   date,
topics     varchar2(100),
topi_desc  varchar2(150),
remarks    varchar2(200));

/*******************************************************************************/

rem Table - 15 (User_Master)

create table user_master(
user_id     varchar2(10)        primary key,
user_name   varchar2(30),
user_password varchar2(10),
status      varchar2(10));



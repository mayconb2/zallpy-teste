CREATE TABLE task (
  id bigint not null auto_increment,
  title varchar(50) not null,
  description varchar(255),
  status varchar(30) not null,

  primary key(id)
);
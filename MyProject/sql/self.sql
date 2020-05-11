--=================================
--                         SELF 계정 생성
--=================================
create user self identified by self
default tablespace users;

grant connect, resource to self;

--=================================
--                      Member 테이블 생성
--=================================
create table member(
    member_ID varchar2(20) not null,
    member_PWD varchar2(50) not null,
    member_name varchar2(100) not null,
    member_phone char(11) not null,
    member_address varchar2(500),
    birthday date,
    gender char(1),
    grade char(1) default 'M' not null,
    email varchar2(30),
    enrolldate date default sysdate,
    constraint pk_member_ID primary key(member_ID),
    constraint chk_gender check(gender in ('M', 'F')),
    constraint chk_grade check(grade in ('M', 'A'))
);

insert into member values('user000', 1234, '사용자1', '01011102220', '경기도 하남시', default, 'M', default, 'user000@naver.com', default);
insert into member values('yujeong', 1234, '김유정', '01091933403', '경기도 의정부시', '19950618', 'F', 'A', 'rin0618@naver.com', default);

select * from member;
commit;
--=================================
--                      Board 테이블 생성
--=================================
create table board(
    board_code varchar2(10) not null,
    board_name varchar2(50) not null,
    constraint pk_board_code primary key(board_code)
);

insert into board values('puppy', 'Puppy');
insert into board values('cook', 'Cook');
insert into board values('trip', 'Trip');
select * from board;

--=================================
--                      Post 테이블 생성
--=================================
create table post(
    board_code varchar2(10) not null,
    post_no number not null,
    post_title varchar2(100) not null,
    post_content varchar2(4000) not null,
    post_wirter varchar2(20) not null,
    post_write_time date default sysdate not null,
    read_count number default 0,
    constraint fk_board_code foreign key(board_code) references board(board_code),
    constraint fk_post_wirter foreign key(post_wirter) references member(member_ID),
    constraint pk_post_no primary key(board_code, post_no)
);

alter table post add read_count number default 0;
alter table post drop column read_count;
select * from post;

--=================================
--                      Reply 테이블 생성
--=================================
create table reply(
    board_code varchar2(10) not null,
    post_no number not null,
    reply_no number primary key not null, 
    reply_writer varchar2(20) not null,
    reply_content varchar2(1000) not null,
    reply_write_time date default sysdate,
    constraints fk_reply_board_code foreign key(board_code, post_no) references post(board_code, post_no) on delete cascade,
    constraints fk_reply_wirter foreign key(reply_writer) references member(member_ID) on delete cascade
);

select * from reply;

--=================================
                      -- ATTACHMENT
--=================================

create table attachment (
    file_no number,
    board_code varchar2(10) not null,
    post_no number not null,
    origin_filename varchar2(400) not null,
    new_filename varchar2(400) not null,
    upload_date date default sysdate,
    download_count number default 0,
    status varchar2(1) default 'Y',
    constraint pk_file_no primary key(file_no),
    constraint fk_post_no foreign key(board_code, post_no) references post(board_code, post_no) on delete cascade
);

select * from attachment;
--=================================
--                        테이블 삭제
--=================================
--drop table member;
--drop table board;
--drop table post;
--drop table reply;
--drop table attachment;
commit;


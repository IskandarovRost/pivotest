-- begin PIVOTEST_TIPS
create table PIVOTEST_TIPS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ROW_ integer,
    TOTAL_BILL double precision,
    TIP varchar(255),
    SEX varchar(50),
    SMOKER integer,
    DAY_ varchar(50),
    TIME_ varchar(50),
    SIZE_ integer,
    --
    primary key (ID)
)^
-- end PIVOTEST_TIPS

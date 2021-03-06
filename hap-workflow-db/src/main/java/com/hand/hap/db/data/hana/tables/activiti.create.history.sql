create column table ACT_HI_PROCINST (
    ID_ VARCHAR2(64) not null,
    PROC_INST_ID_ VARCHAR2(64) not null,
    BUSINESS_KEY_ VARCHAR2(255),
    PROC_DEF_ID_ VARCHAR2(64) not null,
    START_TIME_ TIMESTAMP not null,
    END_TIME_ TIMESTAMP,
    DURATION_ NUMBER(19,0),
    START_USER_ID_ VARCHAR2(255),
    START_ACT_ID_ VARCHAR2(255),
    END_ACT_ID_ VARCHAR2(255),
    SUPER_PROCESS_INSTANCE_ID_ VARCHAR2(64),
    DELETE_REASON_ VARCHAR2(2000),
    TENANT_ID_ VARCHAR2(255) default '',
    NAME_ VARCHAR2(255),
    primary key (ID_),
    unique (PROC_INST_ID_)
);

create column table ACT_HI_ACTINST (
    ID_ VARCHAR2(64) not null,
    PROC_DEF_ID_ VARCHAR2(64) not null,
    PROC_INST_ID_ VARCHAR2(64) not null,
    EXECUTION_ID_ VARCHAR2(64) not null,
    ACT_ID_ VARCHAR2(255) not null,
    TASK_ID_ VARCHAR2(64),
    CALL_PROC_INST_ID_ VARCHAR2(64),
    ACT_NAME_ VARCHAR2(255),
    ACT_TYPE_ VARCHAR2(255) not null,
    ASSIGNEE_ VARCHAR2(255),
    START_TIME_ TIMESTAMP not null,
    END_TIME_ TIMESTAMP,
    DURATION_ NUMBER(19,0),
    DELETE_REASON_ VARCHAR2(2000),
    TENANT_ID_ VARCHAR2(255) default '',
    primary key (ID_)
);

create column table ACT_HI_TASKINST (
    ID_ VARCHAR2(64) not null,
    PROC_DEF_ID_ VARCHAR2(64),
    TASK_DEF_KEY_ VARCHAR2(255),
    PROC_INST_ID_ VARCHAR2(64),
    EXECUTION_ID_ VARCHAR2(64),
    PARENT_TASK_ID_ VARCHAR2(64),
    NAME_ VARCHAR2(255),
    DESCRIPTION_ VARCHAR2(2000),
    OWNER_ VARCHAR2(255),
    ASSIGNEE_ VARCHAR2(255),
    START_TIME_ TIMESTAMP not null,
    CLAIM_TIME_ TIMESTAMP,
    END_TIME_ TIMESTAMP,
    DURATION_ NUMBER(19,0),
    DELETE_REASON_ VARCHAR2(2000),
    PRIORITY_ INTEGER,
    DUE_DATE_ TIMESTAMP,
    FORM_KEY_ VARCHAR2(255),
    CATEGORY_ VARCHAR2(255),
    TENANT_ID_ VARCHAR2(255) default '',
    primary key (ID_)
);

create column table ACT_HI_VARINST (
    ID_ VARCHAR2(64) not null,
    PROC_INST_ID_ VARCHAR2(64),
    EXECUTION_ID_ VARCHAR2(64),
    TASK_ID_ VARCHAR2(64),
    NAME_ VARCHAR2(255) not null,
    VAR_TYPE_ VARCHAR2(100),
    REV_ INTEGER,
    BYTEARRAY_ID_ VARCHAR2(64),
    DOUBLE_ DOUBLE,
    LONG_ NUMBER(19,0),
    TEXT_ VARCHAR2(2000),
    TEXT2_ VARCHAR2(2000),
    CREATE_TIME_ TIMESTAMP,
    LAST_UPDATED_TIME_ TIMESTAMP,
    primary key (ID_)
);

create column table ACT_HI_DETAIL (
    ID_ VARCHAR2(64) not null,
    TYPE_ VARCHAR2(255) not null,
    PROC_INST_ID_ VARCHAR2(64),
    EXECUTION_ID_ VARCHAR2(64),
    TASK_ID_ VARCHAR2(64),
    ACT_INST_ID_ VARCHAR2(64),
    NAME_ VARCHAR2(255) not null,
    VAR_TYPE_ VARCHAR2(64),
    REV_ INTEGER,
    TIME_ TIMESTAMP not null,
    BYTEARRAY_ID_ VARCHAR2(64),
    DOUBLE_ DOUBLE,
    LONG_ NUMBER(19,0),
    TEXT_ VARCHAR2(2000),
    TEXT2_ VARCHAR2(2000),
    primary key (ID_)
);

create column table ACT_HI_COMMENT (
    ID_ VARCHAR2(64) not null,
    TYPE_ VARCHAR2(255),
    TIME_ TIMESTAMP not null,
    USER_ID_ VARCHAR2(255),
    TASK_ID_ VARCHAR2(64),
    PROC_INST_ID_ VARCHAR2(64),
    ACTION_ VARCHAR2(255),
    MESSAGE_ VARCHAR2(2000),
    FULL_MSG_ BLOB,
    primary key (ID_)
);

create column table ACT_HI_ATTACHMENT (
    ID_ VARCHAR2(64) not null,
    REV_ INTEGER,
    USER_ID_ VARCHAR2(255),
    NAME_ VARCHAR2(255),
    DESCRIPTION_ VARCHAR2(2000),
    TYPE_ VARCHAR2(255),
    TASK_ID_ VARCHAR2(64),
    PROC_INST_ID_ VARCHAR2(64),
    URL_ VARCHAR2(2000),
    CONTENT_ID_ VARCHAR2(64),
    TIME_ TIMESTAMP,
    primary key (ID_)
);

create column table ACT_HI_IDENTITYLINK (
    ID_ VARCHAR2(64),
    GROUP_ID_ VARCHAR2(255),
    TYPE_ VARCHAR2(255),
    USER_ID_ VARCHAR2(255),
    TASK_ID_ VARCHAR2(64),
    PROC_INST_ID_ VARCHAR2(64),
    primary key (ID_)
);

create index ACT_IDX_HI_PRO_INST_END on ACT_HI_PROCINST(END_TIME_);
create index ACT_IDX_HI_PRO_I_BUSKEY on ACT_HI_PROCINST(BUSINESS_KEY_);
create index ACT_IDX_HI_ACT_INST_START on ACT_HI_ACTINST(START_TIME_);
create index ACT_IDX_HI_ACT_INST_END on ACT_HI_ACTINST(END_TIME_);
create index ACT_IDX_HI_DETAIL_PROC_INST on ACT_HI_DETAIL(PROC_INST_ID_);
create index ACT_IDX_HI_DETAIL_ACT_INST on ACT_HI_DETAIL(ACT_INST_ID_);
create index ACT_IDX_HI_DETAIL_TIME on ACT_HI_DETAIL(TIME_);
create index ACT_IDX_HI_DETAIL_NAME on ACT_HI_DETAIL(NAME_);
create index ACT_IDX_HI_DETAIL_TASK_ID on ACT_HI_DETAIL(TASK_ID_);
create index ACT_IDX_HI_PROCVAR_PROC_INST on ACT_HI_VARINST(PROC_INST_ID_);
create index ACT_IDX_HI_PROCVAR_NAME_TYPE on ACT_HI_VARINST(NAME_, VAR_TYPE_);
create index ACT_IDX_HI_PROCVAR_TASK_ID on ACT_HI_VARINST(TASK_ID_);
create index ACT_IDX_HI_IDENT_LNK_USER on ACT_HI_IDENTITYLINK(USER_ID_);
create index ACT_IDX_HI_IDENT_LNK_TASK on ACT_HI_IDENTITYLINK(TASK_ID_);
create index ACT_IDX_HI_IDENT_LNK_PROCINST on ACT_HI_IDENTITYLINK(PROC_INST_ID_);

create index ACT_IDX_HI_ACT_INST_PROCINST on ACT_HI_ACTINST(PROC_INST_ID_, ACT_ID_);
create index ACT_IDX_HI_ACT_INST_EXEC on ACT_HI_ACTINST(EXECUTION_ID_, ACT_ID_);
create index ACT_IDX_HI_TASK_INST_PROCINST on ACT_HI_TASKINST(PROC_INST_ID_);

/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     13/01/2010 01:54:10                          */
/*==============================================================*/


drop table if exists BANCO;

drop table if exists CARTAO;

drop table if exists CFOP;

drop table if exists CHEQUE_NCOMP;

drop table if exists CLIENTE;

drop table if exists CLIENTE_ENDERECO;

drop table if exists CLIENTE_TELEFONE;

drop table if exists COBRANCA;

drop table if exists CONCILIACAO;

drop table if exists COT_CAB;

drop table if exists COT_DET;

drop table if exists DEPARTAMENTO;

drop table if exists FECHAMENTO;

drop table if exists FORNECEDOR;

drop table if exists FUNCIONARIO;

drop table if exists MOVIMENTO;

drop table if exists NFE_CAB;

drop table if exists NFE_DET;

drop table if exists ORC_CAB;

drop table if exists ORC_DET;

drop table if exists PAGAMENTO;

drop table if exists PEDIDO_CAB;

drop table if exists PEDIDO_DET;

drop table if exists PLANO_CONTA;

drop table if exists PRODUTO;

drop table if exists RECEBIMENTO;

drop table if exists REQ_CAB;

drop table if exists REQ_DET;

drop table if exists TIPO_PGTO;

drop table if exists UNIDADE;

drop table if exists VENDA_CAB;

drop table if exists VENDA_DET;

/*==============================================================*/
/* Table: BANCO                                                 */
/*==============================================================*/
create table BANCO
(
   COD_BANCO            integer not null auto_increment,
   NOME_BANCO           varcha(50),
   AGENCIA_BANCO        integer,
   CONTA_BANCO          integer,
   GERENTE_BANCO        varchar(20),
   FONE_BANCO           varchar(10),
   primary key (COD_BANCO)
);

/*==============================================================*/
/* Table: CARTAO                                                */
/*==============================================================*/
create table CARTAO
(
   COD_CARTAO           integer not null auto_increment,
   NOME_CARTAO          varchar(20),
   TAXA_CARTAO          double(5,2),
   primary key (COD_CARTAO)
);

/*==============================================================*/
/* Table: CFOP                                                  */
/*==============================================================*/
create table CFOP
(
   COD_CFOP             integer not null,
   DESCRICAO_CFOP       text,
   primary key (COD_CFOP)
);

/*==============================================================*/
/* Table: CHEQUE_NCOMP                                          */
/*==============================================================*/
create table CHEQUE_NCOMP
(
   COD_NCOMP            integer not null,
   NUM_CHEQUE_NCOMP     integer,
   DATA_CHEQUE_NCOMP    date,
   VLR_CHEQUE_NCOMP     double(11,2),
   MES_ANO_NCOMP        varchar(7),
   HISTORICO_NCOMP      varchar(50),
   primary key (COD_NCOMP)
);

/*==============================================================*/
/* Table: CLIENTE                                               */
/*==============================================================*/
create table CLIENTE
(
   COD_CLIENTE          integer not null auto_increment,
   NOME_CLIENTE         varchar(50),
   CPF_CLIENTE          varchar(11),
   RG_CLIENTE           varchar(25),
   ORGAO_RG_CLIENTE     varchar(10),
   NASCIMENTO_CLIENTE   date,
   DESDE_CLIENTE        date,
   PROFISSAO_CLIENTE    varchar(40),
   EMPRESA_CLIENTE      varchar(50),
   FONE_EMPRESA         varchar(10),
   RENDA_CLIENTE        double(11,2),
   TIPO_CLIENTE         char(1),
   CNPJ_CLIENTE         varchar(14),
   REFERENCIA_CLIENTE   varchar(50),
   FONE_REFERENCIA_CLIENTE varchar(10),
   EMAIL                varchar(100),
   primary key (COD_CLIENTE)
);

alter table CLIENTE comment 'tabela que armazena os dados dos clientes';

/*==============================================================*/
/* Table: CLIENTE_ENDERECO                                      */
/*==============================================================*/
create table CLIENTE_ENDERECO
(
   COD_ENDERECO         integer not null auto_increment,
   COD_CLIENTE          integer,
   LOGRADOURO_ENDERECO  varchar(50),
   COMPLEMENTO_ENDERECO varchar(50),
   CEP_ENDERECO         varchar(8),
   BAIRRO_ENDERECO      varchar(50),
   CIDADE_ENDERECO      varchar(50),
   UF_ENDERECO          char(2),
   primary key (COD_ENDERECO)
);

/*==============================================================*/
/* Table: CLIENTE_TELEFONE                                      */
/*==============================================================*/
create table CLIENTE_TELEFONE
(
   COD_TELEFONE         integer not null auto_increment,
   COD_CLIENTE          integer,
   NUMERO_TELEFONE      varchar(10),
   TIPO_TELEFONE        char(1),
   primary key (COD_TELEFONE)
);

/*==============================================================*/
/* Table: COBRANCA                                              */
/*==============================================================*/
create table COBRANCA
(
   COD_COBRANCA         integer not null auto_increment,
   COD_CLIENTE          integer,
   ASSUNTO_COBRANCA     varchar(50),
   TEXTO_COBRANCA       text,
   ENVIO1               date,
   ENVIO2               date,
   ENVIO3               date,
   ENVIO4               date,
   ENVIO5               date,
   NUM_PROCESSO         varchar(30),
   DATA_PROCESSO        date,
   ADVOGADO_PROCESSO    varchar(50),
   primary key (COD_COBRANCA)
);

/*==============================================================*/
/* Table: CONCILIACAO                                           */
/*==============================================================*/
create table CONCILIACAO
(
   COD_CONCILIACAO      integer not null,
   NUM_CHEQUE_CONCILIACAO integer,
   DATA_CHEQUE_CONCILIACAO date,
   VLR_CHEQUE_CONCILIACAO double(11,2),
   MES_ANO_CONCILIACAO  varchar(7),
   HISTORICO_CONCILIACAO varchar(50),
   primary key (COD_CONCILIACAO)
);

/*==============================================================*/
/* Table: COT_CAB                                               */
/*==============================================================*/
create table COT_CAB
(
   COD_COT_CAB          int not null auto_increment,
   DATA_COT_CAT         date,
   FORN1                integer,
   FORN2                integer,
   FORN3                integer,
   FORN4                integer,
   FORN5                integer,
   COND1                varchar(30),
   COND2                varchar(30),
   COND3                varchar(30),
   COND4                varchar(30),
   COND5                varchar(30),
   ENTREGA1             double(11,2),
   ENTREGA2             double(11,2),
   ENTREGA3             double(11,2),
   ENTREGA4             double(11,2),
   ENTREGA5             double(11,2),
   primary key (COD_COT_CAB)
);

/*==============================================================*/
/* Table: COT_DET                                               */
/*==============================================================*/
create table COT_DET
(
   COD_COT_CAB          int not null,
   COD_PRODUTO          varchar(13) not null,
   COD_REQ_CAB          integer not null,
   QTDE_COT_DET         integer,
   UNIT1                date,
   UNIT2                double(11,2),
   UNIT3                double(11,2),
   UNIT4                double(11,2),
   UNIT5                double(11,2),
   TOTAL1               double(11,2),
   TOTAL2               double(11,2),
   TOTAL3               double(11,2),
   TOTAL4               double(11,2),
   TOTAL5               double(11,2),
   primary key (COD_COT_CAB, COD_PRODUTO, COD_REQ_CAB)
);

/*==============================================================*/
/* Table: DEPARTAMENTO                                          */
/*==============================================================*/
create table DEPARTAMENTO
(
   COD_DEPARTAMENTO     integer not null auto_increment,
   NOME_DEPARTAMENTO    varchar(50),
   primary key (COD_DEPARTAMENTO)
);

/*==============================================================*/
/* Table: FECHAMENTO                                            */
/*==============================================================*/
create table FECHAMENTO
(
   COD_FECHAMENTO       integer not null auto_increment,
   MES_ANO_FECHAMENTO   varchar(7),
   VLR_SALDO_ANTERIOR   double(11,2),
   VLR_RECEBIMENTOS     double(11,2),
   VLR_PAGAMENTOS       double(11,2),
   VLR_CHEQUE_NCOMP     double(11,2),
   VLR_SALDO_0CONTA     double(11,2),
   VLR_SALDO_REAL       double(11,2),
   primary key (COD_FECHAMENTO)
);

/*==============================================================*/
/* Table: FORNECEDOR                                            */
/*==============================================================*/
create table FORNECEDOR
(
   COD_FORNECEDOR       integer not null auto_increment,
   NOME_FORNECEDOR      varchar(50),
   CPF_FORNECEDOR       varchar(11),
   RG_FORNECEDOR        varchar(25),
   ORGAO_RG_FORNECEDOR  varchar(10),
   CNPJ_FORNECEDOR      varchar(100),
   TIPO_FORNECEDOR      char(1),
   ENDERECO_FORNECEDOR  varchar(100),
   BAIRRO_FORNECEDOR    varchar(50),
   CIDADE_FORNECEDOR    varchar(50),
   UF_FORNECEDOR        char(2),
   CEP_FORNECEDOR       varchar(8),
   EMAIL_FORNECEDOR     varchar(100),
   SITE_FORNECEDOR      varchar(100),
   FONE_FORNECEDOR      varchar(10),
   CELULAR_FORNECEDOR   varchar(10),
   FAX_FORNECEDOR       varchar(10),
   CONTATO_FORNECEDOR   varchar(50),
   primary key (COD_FORNECEDOR)
);

/*==============================================================*/
/* Table: FUNCIONARIO                                           */
/*==============================================================*/
create table FUNCIONARIO
(
   COD_FUNCIONARIO      integer not null auto_increment,
   COD_DEPARTAMENTO     integer,
   NOME_FUNCIONARIO     varchar(50),
   FUNCAO_FUNCIONARIO   varchar(20),
   LOGIN_FUNCIONARIO    varchar(10),
   ADMISSAO_FUNCIONARIO date,
   ACESSO_TOTAL         char(1),
   primary key (COD_FUNCIONARIO)
);

/*==============================================================*/
/* Table: MOVIMENTO                                             */
/*==============================================================*/
create table MOVIMENTO
(
   CODIGO_MOVIMENTO     integer not null auto_increment,
   COD_PLANO_CONTA      integer(4),
   MES_ANO_MOVIMENTO    varchar(7),
   NUM_CHEQUE_MOVIMENTO integer,
   NUM_DOCUMENTO_MOVIMENTO varchar(20),
   DATA_CHEQUE_MOVIMENTO date,
   DATA_LANCAMENTO_MOVIMENTO date,
   HISTORICO_MOVIMENTO  varchar(50),
   VLR_DOCUMENTO        double(11,2),
   primary key (CODIGO_MOVIMENTO)
);

/*==============================================================*/
/* Table: NFE_CAB                                               */
/*==============================================================*/
create table NFE_CAB
(
   NUMERO_NFE_CAB       integer not null,
   COD_FORNECEDOR       integer,
   COD_CFOP             integer,
   EMISSAO_NFE_CAB      date,
   ENTRADA_NFE_CAB      date,
   TOTAL_NFE_CAB        double(11,2),
   primary key (NUMERO_NFE_CAB)
);

/*==============================================================*/
/* Table: NFE_DET                                               */
/*==============================================================*/
create table NFE_DET
(
   NUMERO_NFE_CAB       integer not null,
   COD_PRODUTO          varchar(13) not null,
   QDE_NFE_DET          integer,
   VLR_UNIT_NFE_DET     double(11,2),
   VLR_TOTAL_NFE_DET    double(11,2),
   primary key (NUMERO_NFE_CAB, COD_PRODUTO)
);

/*==============================================================*/
/* Table: ORC_CAB                                               */
/*==============================================================*/
create table ORC_CAB
(
   COD_ORC_CAB          integer not null auto_increment,
   COD_CLIENTE          integer,
   COD_FUNCIONARIO      integer,
   DATA_ORC_CAB         date,
   VRL_ORC_CAB          double(11,2),
   primary key (COD_ORC_CAB)
);

/*==============================================================*/
/* Table: ORC_DET                                               */
/*==============================================================*/
create table ORC_DET
(
   COD_ORC_CAB          integer not null,
   COD_PRODUTO          varchar(13) not null,
   QTDE_ORC_DET         integer,
   VRL_UNIT_ORC_DET     double(11,2),
   VRL_TOTAL_ORC_DET    double(11,2),
   primary key (COD_ORC_CAB, COD_PRODUTO)
);

/*==============================================================*/
/* Table: PAGAMENTO                                             */
/*==============================================================*/
create table PAGAMENTO
(
   COD_PAGAMENTO        integer not null,
   COD_FORNECEDOR       integer,
   COD_BANCO            integer,
   COD_TIPO_PGTO        integer,
   COD_PLANO_CONTA      integer(4),
   NUM_DOC_PAGAMENTO    varchar(20),
   VLR_TOTAL_PAGAMENTO  double(11,2),
   VLR_JURO_PAGAMENTO   double(11,2),
   VLR_MULTA_PAGAMENTO  double11,2),
   VLR_DESCONTO_PAGAMENTO double(11,2),
   VLR_PAGO_PAGAMENTO   double(11,2),
   NUM_CHEQUE_PAGAMENTO integer,
   NOMINAL_PAGAMENTO    varchar(50),
   EMISSAO_PAGAMENTO    date,
   LANCAMENTO_PAGAMENTO date,
   VENCIMENTO_PAGAMENTO date,
   DATA_PAGAMENTO       date,
   DATA_CHEQUE_PAGAMENTO date,
   primary key (COD_PAGAMENTO)
);

/*==============================================================*/
/* Table: PEDIDO_CAB                                            */
/*==============================================================*/
create table PEDIDO_CAB
(
   COD_PEDIDO_CAB       integer not null auto_increment,
   COD_COT_CAB          int,
   COD_FORNECEDOR       integer,
   DATA_PEDIDO_CAB      date,
   ENDERECO_ENTREGA     varchar(50),
   ENDERECO_COBRANCA    varchar(50),
   VRL_PEDIDO_CAB       double(11,2),
   DESCONTO_PEDIDO_CAB  double(11,2),
   TOTAL_PEDIDO_CAB     double(11,2),
   primary key (COD_PEDIDO_CAB)
);

/*==============================================================*/
/* Table: PEDIDO_DET                                            */
/*==============================================================*/
create table PEDIDO_DET
(
   COD_PEDIDO_CAB       integer not null,
   COD_COT_CAB          int not null,
   COD_PRODUTO          varchar(13) not null,
   COD_REQ_CAB          integer not null,
   QTDE_PEDIDO_DET      integer,
   VRL_UNIT_PEDIDO_DET  double(11,2),
   VLR_TOTAL_PEDIDO_DET double(11,2),
   primary key (COD_PEDIDO_CAB, COD_COT_CAB, COD_PRODUTO, COD_REQ_CAB)
);

/*==============================================================*/
/* Table: PLANO_CONTA                                           */
/*==============================================================*/
create table PLANO_CONTA
(
   COD_PLANO_CONTA      integer(4) not null auto_increment,
   DESCRICAO_PLANO_CONTA varchar(20),
   primary key (COD_PLANO_CONTA)
);

/*==============================================================*/
/* Table: PRODUTO                                               */
/*==============================================================*/
create table PRODUTO
(
   COD_UNIDADE          integer not null,
   COD_FORNECEDOR       integer,
   COD_PRODUTO          varchar(13) not null,
   DESCRICAO_PRODUTO    varchar(50),
   VLR_COMPRA_PRODUTO   double(11,2),
   VLR_VENDA_PRODUTO    double(11,2),
   ESTOQUE_PRODUTO      integer,
   CRITICO_PRODUTO      integer,
   primary key (COD_PRODUTO)
);

/*==============================================================*/
/* Table: RECEBIMENTO                                           */
/*==============================================================*/
create table RECEBIMENTO
(
   COD_RECEBIMENTO      int not null auto_increment,
   COD_ENDERECO         integer,
   COD_BANCO            integer,
   COD_TIPO_PGTO        integer,
   NUM_DOCUMENTO        varchar(20),
   VRL_TOTAL_RECEBIMENTO double(11,2),
   VRL_JURO_RECEBIMENTO double(11,2),
   VRL_MULTA_RECEBIMENTO double(11,2),
   VRL_DESCONTO_RECEBIMENTO double(11,2),
   VRL_RECEBIDO         double(11,2),
   EMISSAO_RECEBIMENTO  date,
   LANCAMENTO_RECEBIMENTO date,
   VENCIMENTO_RECEBIMENTO date,
   DATA_RECEBIMENTO     date,
   primary key (COD_RECEBIMENTO)
);

/*==============================================================*/
/* Table: REQ_CAB                                               */
/*==============================================================*/
create table REQ_CAB
(
   COD_FUNCIONARIO      integer,
   COD_REQ_CAB          integer not null auto_increment,
   DATA_REG_CAB         date,
   primary key (COD_REQ_CAB)
);

/*==============================================================*/
/* Table: REQ_DET                                               */
/*==============================================================*/
create table REQ_DET
(
   COD_PRODUTO          varchar(13) not null,
   COD_REQ_CAB          integer not null,
   QTDE_REQ_DET         integer,
   VLR_UNIT_REQ_DET     double(11,2),
   VRL_TOTAL_REQ_DET    double(11,2),
   primary key (COD_PRODUTO, COD_REQ_CAB)
);

/*==============================================================*/
/* Table: TIPO_PGTO                                             */
/*==============================================================*/
create table TIPO_PGTO
(
   COD_TIPO_PGTO        integer not null auto_increment,
   DESCRICAO_TIPO_PGTO  varchar(20),
   primary key (COD_TIPO_PGTO)
);

/*==============================================================*/
/* Table: UNIDADE                                               */
/*==============================================================*/
create table UNIDADE
(
   COD_UNIDADE          integer not null,
   DESCRICAO_UNIDADE    char(5),
   primary key (COD_UNIDADE)
);

/*==============================================================*/
/* Table: VENDA_CAB                                             */
/*==============================================================*/
create table VENDA_CAB
(
   COD_VENDA_CAB        integer not null auto_increment,
   COD_FUNCIONARIO      integer,
   COD_CARTAO           integer,
   COD_CFOP             integer,
   COD_ENDERECO         integer,
   DATA_VENDA_CAB       date,
   VRL_VENDA_CAB        double(11,2),
   DESCONTO_VENDA_CAB   double(11,2),
   TOTAL_VENDA_CAB      double(11,2),
   NUM_PARCELAS_VENDA_CAB integer,
   PRI_VENDA_CAB        date,
   NUM_NF_VENDA_CAB     integer,
   primary key (COD_VENDA_CAB)
);

/*==============================================================*/
/* Table: VENDA_DET                                             */
/*==============================================================*/
create table VENDA_DET
(
   COD_VENDA_CAB        integer not null,
   COD_PRODUTO          varchar(13) not null,
   QTDE_VENDA_VENDA_DET integer,
   VRL_UNIT_VENDA_DET   double(11,2),
   VRL_TOTAL_VENDA_DET  double(11,2),
   primary key (COD_VENDA_CAB, COD_PRODUTO)
);

alter table CLIENTE_ENDERECO add constraint FK_FK_CLIENTE_ENDERECO foreign key (COD_CLIENTE)
      references CLIENTE (COD_CLIENTE) on delete restrict on update restrict;

alter table CLIENTE_TELEFONE add constraint FK_FK_CLIENTE_TELEFONE foreign key (COD_CLIENTE)
      references CLIENTE (COD_CLIENTE) on delete restrict on update restrict;

alter table COBRANCA add constraint FK_CLIENTE_COBRANCA foreign key (COD_CLIENTE)
      references CLIENTE (COD_CLIENTE) on delete restrict on update restrict;

alter table COT_DET add constraint FK_COT_DET_COT_CAB foreign key (COD_COT_CAB)
      references COT_CAB (COD_COT_CAB) on delete restrict on update restrict;

alter table COT_DET add constraint FK_REQ_DET_COT_DET foreign key (COD_PRODUTO, COD_REQ_CAB)
      references REQ_DET (COD_PRODUTO, COD_REQ_CAB) on delete restrict on update restrict;

alter table FUNCIONARIO add constraint FK_DEPARTAMENTO_FUNCIONARIO foreign key (COD_DEPARTAMENTO)
      references DEPARTAMENTO (COD_DEPARTAMENTO) on delete restrict on update restrict;

alter table MOVIMENTO add constraint FK_PLANO_CONTA_MOVIMENTO foreign key (COD_PLANO_CONTA)
      references PLANO_CONTA (COD_PLANO_CONTA) on delete restrict on update restrict;

alter table NFE_CAB add constraint FK_CFOP_NFE_CAB foreign key (COD_CFOP)
      references CFOP (COD_CFOP) on delete restrict on update restrict;

alter table NFE_CAB add constraint FK_FONECEDOR_NFE_CAB foreign key (COD_FORNECEDOR)
      references FORNECEDOR (COD_FORNECEDOR) on delete restrict on update restrict;

alter table NFE_DET add constraint FK_NFE_CAB_NFE_DET foreign key (NUMERO_NFE_CAB)
      references NFE_CAB (NUMERO_NFE_CAB) on delete restrict on update restrict;

alter table NFE_DET add constraint FK_PRODUTO_NFE_DET foreign key (COD_PRODUTO)
      references PRODUTO (COD_PRODUTO) on delete restrict on update restrict;

alter table ORC_CAB add constraint FK_CLIENTE_ORC_CAB foreign key (COD_CLIENTE)
      references CLIENTE (COD_CLIENTE) on delete restrict on update restrict;

alter table ORC_CAB add constraint FK_FUNCIONARIO_ORC_CAB foreign key (COD_FUNCIONARIO)
      references FUNCIONARIO (COD_FUNCIONARIO) on delete restrict on update restrict;

alter table ORC_DET add constraint FK_ORC_CAB_ORC_DET foreign key (COD_ORC_CAB)
      references ORC_CAB (COD_ORC_CAB) on delete restrict on update restrict;

alter table ORC_DET add constraint FK_PRODUTO_ORC_DET foreign key (COD_PRODUTO)
      references PRODUTO (COD_PRODUTO) on delete restrict on update restrict;

alter table PAGAMENTO add constraint FK_BANCO_PAGAMENTO foreign key (COD_BANCO)
      references BANCO (COD_BANCO) on delete restrict on update restrict;

alter table PAGAMENTO add constraint FK_FORNECEDO_PAGAMENTO foreign key (COD_FORNECEDOR)
      references FORNECEDOR (COD_FORNECEDOR) on delete restrict on update restrict;

alter table PAGAMENTO add constraint FK_PLANO_CONTA foreign key (COD_PLANO_CONTA)
      references PLANO_CONTA (COD_PLANO_CONTA) on delete restrict on update restrict;

alter table PAGAMENTO add constraint FK_TIPO_PGTO_PAGAMENTO foreign key (COD_TIPO_PGTO)
      references TIPO_PGTO (COD_TIPO_PGTO) on delete restrict on update restrict;

alter table PEDIDO_CAB add constraint FK_PEDIDO_CAB_COT_CAB foreign key (COD_COT_CAB)
      references COT_CAB (COD_COT_CAB) on delete restrict on update restrict;

alter table PEDIDO_CAB add constraint FK_REFERENCE_29 foreign key (COD_FORNECEDOR)
      references FORNECEDOR (COD_FORNECEDOR) on delete restrict on update restrict;

alter table PEDIDO_DET add constraint FK_COD_DET_PEDIDO_DET foreign key (COD_COT_CAB, COD_PRODUTO, COD_REQ_CAB)
      references COT_DET (COD_COT_CAB, COD_PRODUTO, COD_REQ_CAB) on delete restrict on update restrict;

alter table PEDIDO_DET add constraint FK_PEDIDO_CAB_PEDIDO_DET foreign key (COD_PEDIDO_CAB)
      references PEDIDO_CAB (COD_PEDIDO_CAB) on delete restrict on update restrict;

alter table PRODUTO add constraint FK_FK_UNIDADE_PRODUTO foreign key (COD_UNIDADE)
      references UNIDADE (COD_UNIDADE) on delete restrict on update restrict;

alter table PRODUTO add constraint FK_FORNECEDOR_PRODUTO foreign key (COD_FORNECEDOR)
      references FORNECEDOR (COD_FORNECEDOR) on delete restrict on update restrict;

alter table RECEBIMENTO add constraint FK_BANCO_RECEBIMENTO foreign key (COD_BANCO)
      references BANCO (COD_BANCO) on delete restrict on update restrict;

alter table RECEBIMENTO add constraint FK_CLIENTE_RECEBIMENTO foreign key (COD_ENDERECO)
      references CLIENTE_ENDERECO (COD_ENDERECO) on delete restrict on update restrict;

alter table RECEBIMENTO add constraint FK_TIPO_PGTO_RECEBIMENTO foreign key (COD_TIPO_PGTO)
      references TIPO_PGTO (COD_TIPO_PGTO) on delete restrict on update restrict;

alter table REQ_CAB add constraint FK_FUNCIONARIO_REQ_CAB foreign key (COD_FUNCIONARIO)
      references FUNCIONARIO (COD_FUNCIONARIO) on delete restrict on update restrict;

alter table REQ_DET add constraint FK_PRODUTO_REQ_DET foreign key (COD_PRODUTO)
      references PRODUTO (COD_PRODUTO) on delete restrict on update restrict;

alter table REQ_DET add constraint FK_REQ_CAB_REQ_DET foreign key (COD_REQ_CAB)
      references REQ_CAB (COD_REQ_CAB) on delete restrict on update restrict;

alter table VENDA_CAB add constraint FK_CARTAO_VENDA_CAB foreign key (COD_CARTAO)
      references CARTAO (COD_CARTAO) on delete restrict on update restrict;

alter table VENDA_CAB add constraint FK_CFOP_VENDA_CAB foreign key (COD_CFOP)
      references CFOP (COD_CFOP) on delete restrict on update restrict;

alter table VENDA_CAB add constraint FK_CLIENTE_VENDA_CAB foreign key (COD_ENDERECO)
      references CLIENTE_ENDERECO (COD_ENDERECO) on delete restrict on update restrict;

alter table VENDA_CAB add constraint FK_FUNCIONARIO_VENDA_CAB foreign key (COD_FUNCIONARIO)
      references FUNCIONARIO (COD_FUNCIONARIO) on delete restrict on update restrict;

alter table VENDA_DET add constraint FK_PRODUTO_VENDA_DET foreign key (COD_PRODUTO)
      references PRODUTO (COD_PRODUTO) on delete restrict on update restrict;

alter table VENDA_DET add constraint FK_VENDA_CAB_VENDA_DET foreign key (COD_VENDA_CAB)
      references VENDA_CAB (COD_VENDA_CAB) on delete restrict on update restrict;


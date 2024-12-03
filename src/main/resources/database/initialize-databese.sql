create database InvoiceM;

create table Client(
                       Id INT primary key,
                       cLientName VARCHAR(20) not null,
                       address CHAR(25),
                       country VARCHAR(255),
                       primary key(ID)
);

create table Item(
                     Id int primary key,
                     itemName varchar(20),
                     quantity int,
                     amount DECIMAL(18,2)
);

CREATE TABLE Invoice (
                         Id INT primary key,
                         InvoiceNumber INT UNIQUE,
                         clientId int not null,
                         itemId int not null,
                         totalAmount DECIMAL(18,2),
                         date DATE,
                         foreign key (clientId) references Client(Id),
                         foreign key (itemId) references Item(Id)
);

create table invoice_items (
                               InvoiceId int references Invoice(Id),
                               ItemId int references Item(Id),
                               primary key (InvoiceId,ItemId )
);
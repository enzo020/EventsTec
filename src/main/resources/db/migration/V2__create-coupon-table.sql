CREATE table coupon (
    Id UUID default gen_random_uuid() primary key,
    code varchar(100) not null,
    discount integer not null,
    valid timestamp not null,
    event_id UUID,
    foreign key (event_id) references event(id) on delete cascade
    --faz a relação dos bancos de dados e se deletado a id na tabela event
    --o event_id também será deletado nessa tabela. EFEITO CASCATA
);
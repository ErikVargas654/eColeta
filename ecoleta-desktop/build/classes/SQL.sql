create type typeOfWaste as enum ('Lâmpadas', 'Pilhas e baterias', 'Papéis e papelão', 'Resíduos eletrônicos', 'Resíduos orgânicos', 'Óleo de cozinha');

CREATE TABLE Ponto_de_coleta (
    id UUID PRIMARY KEY,
    nome varchar not null,
    email varchar not null,
    cidade varchar not null,
    type_of_waste typeOfWaste not null,
    latitude decimal not null,
    longitude decimal not null
);
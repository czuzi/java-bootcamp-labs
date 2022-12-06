create table fifa_world_cup(
    id bigint auto_increment,
    date_of_game date,
    first_team varchar(255),
    second_team varchar(255),
    first_team_score bigint,
    second_team_score bigint,
    constraint id primary key(id)
)
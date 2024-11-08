package com.zoo.zoo_spring.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity // аннотация которая указывает что этот класс является сущностью то есть
        // таблицей
@Data // аннотация Lombok чтоб не писать @getter и @setter
@Table(name = "animal", schema = "public") // animal- название таблицы schema поумолчанию public
public class Animal { // catalog это название вашей БД DB некой базы данных
    @GeneratedValue(strategy = GenerationType.IDENTITY) // этот бред для автоинкриментации айдишника
    @Id // это АННОТАЦИЯ @ всё с собакой называется аннотацие в данном случае это ID
    @Column(name = "animal_id")
    private Long animalId; // это то чё за колонка будет тип данных и тд.
    @Column(name = "animal_name") // это не самий поймёте
    private String animalName; // это то чё за колонка будет тип данных и тд.
    @Column(name = "animal_age") // это не са:wмий поймёте
    private int animalAge; // это то чё за колонка будет тип данных и тд.

    @ManyToOne // это указывается тип связи с колонкой из другой таблицы
    @JoinColumn(name = "food_type_id") // это сама связь + чё за таблица
    private FoodType foodType; // это то чё за колонка будет тип данных и тд.
    @ManyToOne // это указывается тип связи с колонкой из другой таблицы
    @JoinColumn(name = "cage_id") // это сама связь + чё за таблица
    private Cage cage; // это то чё за колонка будет тип данных и тд.
}

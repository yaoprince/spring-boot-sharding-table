package com.xd.springbootshardingtable.es;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "book_index", type = "book_type", indexStoreType = "fs", shards = 5, replicas = 1, refreshInterval = "-1")
public class BookEntity {
    @Id
    private String id;
    private String title;
    private String content;
    private int userId;
    private int weight;
}